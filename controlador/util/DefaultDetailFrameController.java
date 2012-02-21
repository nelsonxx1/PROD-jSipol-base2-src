package controlador.util;

import controlador.General;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.auditoria.AuditLogInterceptor;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.util.bean.BeanVO;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.client.OptionPane;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientSettings;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;
import vista.util.DefaultDetailFrame;

/**
 *
 * @author Orlando Becerra
 */
public class DefaultDetailFrameController extends FormController implements ActionListener {

    protected DefaultDetailFrame vista;
    protected GridControl gridControl;
    protected BeanVO beanVO;
    protected boolean aplicarLogicaNegocio;
    protected Form linkForm;
    protected String attributeName;
    protected Object[] adicional;

    public DefaultDetailFrameController() {
    }

    public DefaultDetailFrameController(String detailFramePath, GridControl gridControl, BeanVO beanVO, boolean aplicarLogicaNegocio) {
        this.gridControl = gridControl;
        this.beanVO = beanVO;
        this.aplicarLogicaNegocio = aplicarLogicaNegocio;
        try {
            Class<DefaultDetailFrame> t = (Class<vista.util.DefaultDetailFrame>) Class.forName(detailFramePath);
            vista = t.newInstance();
            vista.inicializar(this, true);

        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "new", ex);
        }
        if (beanVO != null) {
            vista.getMainPanel().reload();
            vista.getMainPanel().setMode(Consts.READONLY);
        } else {
            vista.getMainPanel().setMode(Consts.INSERT);
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return new VOResponse(beanVO);
    }

    @Override
    public void loadDataCompleted(boolean error) {
        BeanVO beanVo = (BeanVO) vista.getMainPanel().getVOModel().getValueObject();
        vista.setOwnerVO(beanVo);
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        Session s = null;
        try {
            vista.saveGridsData();
            //s = HibernateUtil.getSessionFactory().openSession(AuditLogInterceptor.INSTANCE2);
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            if (newPersistentObject instanceof Auditable) {
                AuditoriaBasica ab = new AuditoriaBasica(new Date(), General.usuario.getUserName(), true);
                ((Auditable) newPersistentObject).setAuditoria(ab);
            }
            if (aplicarLogicaNegocio) {
                Response response = logicaNegocioConCambioEnVista(newPersistentObject, false);
                if (response.isError()) {
                    return response;
                }
                newPersistentObject = (ValueObject) ((VOResponse) response).getVo();
            }
//            if (newPersistentObject instanceof Auditable) {
//                //((Auditable) newPersistentObject).getAuditoria().setActivo(true);
//                System.out.println(((Auditable) newPersistentObject).getAuditoria().getActivo());
//            }
            s.save(newPersistentObject);

            if (aplicarLogicaNegocio) {
                Response response = logicaNegocioDespuesSave(newPersistentObject);
                if (response.isError()) {
                    return response;
                }
                newPersistentObject = (ValueObject) ((VOResponse) response).getVo();
            }

            t.commit();

            if (linkForm != null && attributeName != null) {
                linkForm.getVOModel().setValue(attributeName, newPersistentObject);
                linkForm.pull(attributeName);
            }

            vista.setOwnerVO((BeanVO) newPersistentObject);
            beanVO = (BeanVO) newPersistentObject;
            if (gridControl != null) {
                gridControl.reloadData();
            }
            return new VOResponse(newPersistentObject);
        } catch (Exception ex) {
            return new ErrorResponse(LoggerUtil.isInvalidStateException(this.getClass(), "insertRecord", ex));
        } finally {
            s.close();
        }
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        Session s = null;
        try {
            vista.saveGridsData();
            //s = HibernateUtil.getSessionFactory().openSession(AuditLogInterceptor.INSTANCE2);
            s = HibernateUtil.getSessionFactory().openSession();
            AuditLogInterceptor.INSTANCE2.setSession(s);
            Transaction t = s.beginTransaction();
            if (persistentObject instanceof Auditable) {
                AuditoriaBasica ab = ((Auditable) persistentObject).getAuditoria();
                ab.setFechaUpdate(new Date());
                ab.setUsuarioUpdate(General.usuario.getUserName());
            }
            if (aplicarLogicaNegocio) {
                Response response = logicaNegocioConCambioEnVista(persistentObject, false);
                if (response.isError()) {
                    return response;
                }
                persistentObject = (ValueObject) ((VOResponse) response).getVo();
            }
            s.update(persistentObject);
            t.commit();
            if (linkForm != null && attributeName != null) {
                linkForm.getVOModel().setValue(attributeName, persistentObject);
                linkForm.pull(attributeName);
            }
            if (gridControl != null) {
                gridControl.reloadData();
            }
            return new VOResponse(persistentObject);
        } catch (Exception ex) {
            return new ErrorResponse(LoggerUtil.isInvalidStateException(this.getClass(), "updateRecord", ex));
        } finally {
            s.close();
        }
    }

    @Override
    public Response deleteRecord(ValueObject persistentObject) throws Exception {
        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            s.delete(persistentObject);
            t.commit();
            if (gridControl != null) {
                gridControl.reloadData();
            }
            return new VOResponse(persistentObject);
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "deleteRecord", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
    }

    @Override
    public void modeChanged(int currentMode) {
        vista.modeChanged(currentMode);
    }

    public void actionPerformed(ActionEvent e) {
        logicaNegocioConCambioEnVista(null, true);
    }

    protected Response logicaNegocioConCambioEnVista(ValueObject persistentObject, boolean mostrarMensajeError) {
        Response response = null;
        if (vista.getMainPanel().getMode() != Consts.READONLY) {
            response = logicaNegocio(persistentObject);
            if (!response.isError()) {
                vista.getMainPanel().getVOModel().setValueObject((ValueObject) ((VOResponse) response).getVo());
                vista.getMainPanel().pull();
            } else if (mostrarMensajeError) {
                OptionPane.showMessageDialog(
                        ClientUtils.getParentFrame(vista.getMainPanel()),
                        ClientSettings.getInstance().getResources().getResource("Error aplicando la logica del negocio:") + "\n"
                        + ClientSettings.getInstance().getResources().getResource(response.getErrorMessage()),
                        ClientSettings.getInstance().getResources().getResource("Error Logica de Negocio"),
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        return response;
    }

    public Response logicaNegocio(ValueObject persistentObject) {
        throw new UnsupportedOperationException("Not yet implemented");
//        String errorMsj = "";
//        if (errorMsj.length() > 0) {
//            return new ErrorResponse(errorMsj);
//        } else {
//            return new VOResponse(persistentObject);
//        }
    }

    public Response logicaNegocioDespuesSave(ValueObject persistentObject) {
        //throw new UnsupportedOperationException("Not yet implemented");
//        String errorMsj = "";
//        if (errorMsj.length() > 0) {
//            return new ErrorResponse(errorMsj);
//        } else {
//            return new VOResponse(persistentObject);
//        }
        return new VOResponse(persistentObject);
    }

    public void reloadGrid() {
        if (gridControl != null) {
            gridControl.reloadData();
        }
    }
}
