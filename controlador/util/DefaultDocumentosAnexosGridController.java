package controlador.util;

import modelo.interfaces.Documentable;
import controlador.PictureCapture.PictureCaptureDialogController;
import controlador.General;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.Documento;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.personas.maestra.Persona;
import modelo.util.bean.BeanVO;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.client.OptionPane;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

/**
 * @author orlando bc
 * @version 1.0
 */
public class DefaultDocumentosAnexosGridController extends GridController implements GridDataLocator, ActionListener {

    protected GridControl miGrid = null;
    protected String modulo;
    protected String server = General.empresa.getRutaDocDigitales();
    protected String path;
    protected BeanVO beanVO;
    protected Method getMethod;

    public DefaultDocumentosAnexosGridController(Class c, GridControl grid) {
        try {
            getMethod = c.getMethod("getDocumentos", new Class[0]);
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "new", ex);
        }
        this.miGrid = grid;
        if (!new File(server + "/" + c.getSimpleName()).exists()) {
            new File(server + "/" + c.getSimpleName()).mkdirs();
        }
        this.modulo = c.getSimpleName() + "/";
    }

    public Set getSet() {
        if (beanVO != null) {
            try {
                return (Set) getMethod.invoke(beanVO);
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "getSet", ex);
            }
        }
        return null;
    }

    public void setBeanVO(BeanVO beanVO, Long id) {
        this.beanVO = beanVO;
        if (id != null) {
            if (!new File(server + "/" + modulo + String.valueOf(id)).exists()) {
                new File(server + "/" + modulo + String.valueOf(id)).mkdirs();
            }
            path = server + "/" + modulo + String.valueOf(id) + "/";
        }
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {
        Session s = null;
        if (getSet() != null) {
            ValueObject o = (ValueObject) newValueObjects.get(0);
            try {
                s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                AuditoriaBasica ab = new AuditoriaBasica(new Date(), General.usuario.getUserName(), true);
                if (o instanceof Auditable) {
                    ((Auditable) o).setAuditoria(ab);
                }
                Documentable vo = (Documentable) o;
                if (PictureCaptureDialogController.DEFAULT_FILE_NAME.equals(vo.getFileName())) {
                    vo.setFileName(new Date().getTime() / 1000 + ".jpg");
                }
                vo.setFileLength(vo.getFile().length);
                FileOutputStream out = new FileOutputStream(path + vo.getFileName());
                byte[] bb = vo.getFile();
                out.write(bb);
                out.close();
                getSet().add(o);
//                if (beanVO instanceof Recibo) {
//                    Recibo r = (Recibo) beanVO;
//                    if (r.getFinanciamiento()!=null && r.getFinanciamiento().getId() == null) {
//                        r.setFinanciamiento(null);
//                    }
//                }
                s.update(beanVO);
                t.commit();
                return new VOListResponse(newValueObjects, false, newValueObjects.size());
            } catch (Exception ex) {
                getSet().remove(o);
                return new ErrorResponse(LoggerUtil.isInvalidStateException(this.getClass(), "insertRecords", ex));
            } finally {
                s.close();
            }
        } else {
            return new ErrorResponse("Primero Tiene que guardar el Registro Principal");
        }
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {
        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            for (Object o : persistentObjects) {
                if (o instanceof Auditable) {
                    AuditoriaBasica ab = ((Auditable) o).getAuditoria();
                    ab.setFechaUpdate(new Date());
                    ab.setUsuarioUpdate(General.usuario.getUserName());
                }
                s.update(o);
            }
            t.commit();
            return new VOListResponse(persistentObjects, false, persistentObjects.size());
        } catch (Exception ex) {
            return new ErrorResponse(LoggerUtil.isInvalidStateException(this.getClass(), "updateRecords", ex));
        } finally {
            s.close();
        }
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {
        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            for (Object o : persistentObjects) {
                if (getSet() != null) {
                    getSet().remove(o);
                    if (path != null) {
                        Documentable vo = (Documentable) o;
                        s.delete(vo);
                        new File(path + vo.getFileName()).delete();
                    }
                }
            }
            s.update(beanVO);
            t.commit();
            return new VOResponse(true);
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "deleteRecords", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
    }

    @Override
    public Response loadData(int action,
            int startIndex,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Class valueObjectType,
            Map otherGridParams) {
        ArrayList al;
        Set s = getSet();
        if (s != null) {
            al = new ArrayList(s);
            for (Object object : al) {
                Documentable vo = (Documentable) object;
                try {
                    BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(path + vo.getFileName())));
                    byte[] bb = new byte[vo.getFileLength()];
                    in.read(bb);
                    in.close();
                    vo.setFile(bb);
                } catch (Exception ex) {
                    vo.setFileName("ERROR");
                    LoggerUtil.error(this.getClass(), "loadData", ex);
                }
            }
        } else {
            al = new ArrayList(0);
        }
        return new VOListResponse(al, false, al.size());

    }

    public void showDocument() {
        //Ver el documento
        String fileName = (String) miGrid.getVOListTableModel().getField(miGrid.getSelectedRow(), "fileName");
        String filePath = new File(path + fileName).getAbsolutePath();
        boolean sw = false;
        try {
            java.awt.Desktop.getDesktop().open(new File(filePath));
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "showDocument", ex);
            sw = true;
        }
        if (sw) {
            try {
                //TODO windows only
                if (System.getProperty("os.name").startsWith("Windows")) {
                    Runtime.getRuntime().exec("cmd /C " + filePath);
                } else {
                    OptionPane.showMessageDialog(
                            MDIFrame.getInstance(),
                            "Disponible solo para Windows. \n"
                            + "Contacte con el proveedor.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "showDocument", ex);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        showDocument();
        miGrid.requestFocus();
    }

    @Override
    public void doubleClick(int rowNumber, ValueObject persistentObject) {
        showDocument();
    }

    private void reloadData() {
        miGrid.getReloadButton().doClick();
    }
}
