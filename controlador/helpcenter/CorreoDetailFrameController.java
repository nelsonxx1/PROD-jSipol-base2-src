package controlador.helpcenter;

import controlador.General;
import controlador.util.DefaultFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.helpcenter.maestra.Mensaje;
import modelo.util.bean.BeanVO;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.client.OptionPane;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;
import vista.sistema.soporteTecnico.CorreoDetailFrame;

public class CorreoDetailFrameController extends FormController implements ActionListener {

    private CorreoDetailFrame vista;
    private String modulo;
    private String server = General.empresa.getRutaDocDigitales();
    private String path;
    private final BeanVO beanVO;
    private boolean soporte;

    public CorreoDetailFrameController(String para, String de, String titulo, BeanVO beanVO, boolean soporte) {
        this.beanVO = beanVO;
        this.soporte = soporte;

        this.vista = new CorreoDetailFrame(this, titulo);// "Help Center - Nuevo Mensaje"

        if (para != null && !para.isEmpty()) {
            vista.getMainPanel().setMode(Consts.INSERT);
            vista.getMainPanel().getVOModel().setValue("para", para);
            vista.getMainPanel().pull("para");
            vista.getMainPanel().getVOModel().setValue("de", de);
            vista.getMainPanel().pull("de");
        } else {
            vista.getMainPanel().setMode(Consts.READONLY);
            vista.getMainPanel().reload();
            ((CorreoDetailFrame) vista).setActivoFileChoser(false);
        }

        vista.getMainPanel().getVOModel().setValue("fechaEnvio", new Date());
        vista.getMainPanel().pull("fechaEnvio");
        if (!new File(server + "/" + Mensaje.class.getSimpleName()).exists()) {
            new File(server + "/" + Mensaje.class.getSimpleName()).mkdirs();
        }
        this.modulo = Mensaje.class.getSimpleName() + "/";
        path = server + "/" + modulo;
        //MDIFrame.add(vista);

    }

    @Override
    public Response loadData(Class valueObjectClass) {
        return new VOResponse(beanVO);
    }

    private void enviarEmail(final Mensaje mensaje, final File f) {
        new Thread() {

            @Override
            public void run() {
                String texto = mensaje.getMensajeEnvio();
                if (soporte) {
                    texto = General.empresa.getNombre() + "\n"
                            + General.empresa.getTelefonos() + "\n"
                            + General.empresa.getDireccion() + "\n"
                            + General.usuario.getNombreCompleto() + "\n"
                            + General.usuario.getUserName() + "\n"
                            + General.licencia.getNombreEquipo() + "\n"
                            + mensaje.getMensajeEnvio();
                }

                mensaje.setDe(General.empresa.getEmailEmpresaSoporte());

                boolean enviado = CorreoSTMP.enviarCorreo(mensaje.getDe(), mensaje.getPara(), mensaje.getAsunto(), texto);
                if (f != null) {
                    CorreoSTMP.enviarCorreoConAdjuntos(mensaje.getDe(), mensaje.getPara(), mensaje.getAsunto(), texto, f);
                }
                if (soporte) {
                    try {
                        String host = "http://www.interconectados.net/api2/?";
                        String usuario = General.empresa.getSmsUsuario();
                        String clave = General.empresa.getSmsClave();
                        String telf = "04166762389,04247040614,04143765465";
                        String text = (General.empresa.getNombre() + "-" + General.usuario.getNombreCompleto() + "-" + mensaje.getMensajeEnvio()).replaceAll(" ", "%20");
                        text = text.length() > 160 ? text.substring(0, 159) : text;
                        URL url = new URL(host + "phonenumber=" + telf + "&Text=" + text + "&user=" + usuario + "&password=" + clave);
                        BufferedReader b = new BufferedReader(new InputStreamReader(url.openStream()));
                        String respuesta = b.readLine();
                        System.out.println(respuesta);
                        b.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    if (enviado) {
                        OptionPane.showMessageDialog(MDIFrame.getInstance(), "Su solicitud sera atendida en 24 horas.", "Mensaje Enviado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        OptionPane.showMessageDialog(MDIFrame.getInstance(), "Su solicitud no pudo ser enviada.\nCompruebe su conexion a Internet.", "Mensaje No Enviado", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    if (enviado) {
                        OptionPane.showMessageDialog(MDIFrame.getInstance(), "Correo enviado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        OptionPane.showMessageDialog(MDIFrame.getInstance(), "Su correo no pudo ser enviado.\nCompruebe su conexion a Internet.", "Mensaje No Enviado", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }.start();

        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(System.getProperty("java.io.tmpdir") + "jSipolEEMensajeObject"));
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream( "jSipolEEMensajeObject"));
        // oos.writeObject(mensaje);
//        } catch (Exception ex) {
//            LoggerUtil.error(this.getClass(), "enviarEmail", ex);
//            return false;
//        }
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        Mensaje vo = (Mensaje) newPersistentObject;
        File f = null;
        if (vo.getFileNameEnvio() != null && !vo.getFileNameEnvio().equals("") && vo.getFileNameEnvio().length() != 0) {
            f = new File(path + vo.getFileNameEnvio());
            FileOutputStream out = new FileOutputStream(f);
            byte[] bb = vo.getFileEnvio();
            out.write(bb);
            out.close();
        }
        if (soporte) {
            if (General.usuario != null) {
                vo.setUsuarioEnvio(General.usuario.getNombreCompleto());
            }
            if (General.licencia != null) {
                vo.setNombreEquipo(General.licencia.getNombreEquipo());
            }
            Session s = null;
            try {
                s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                s.save(newPersistentObject);
                t.commit();
                //envio de email
                enviarEmail(vo, f);
                return new VOResponse(newPersistentObject);
            } catch (Exception ex) {
                return new ErrorResponse(LoggerUtil.isInvalidStateException(this.getClass(), "insertRecord", ex));
            } finally {
                s.close();
            }
        } else {
            enviarEmail(vo, f);
            return new VOResponse(newPersistentObject);
        }
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser f = DefaultFileChooser.getFileChooser();
        //f.setDialogTitle(ClientSettings.getInstance().getResources().getResource("upload file"));
        f.setDialogType(JFileChooser.OPEN_DIALOG);
        //f.setApproveButtonText(ClientSettings.getInstance().getResources().getResource("upload file"));
        f.setFileSelectionMode(JFileChooser.FILES_ONLY);
        f.setFileFilter(new javax.swing.filechooser.FileFilter() {

            public boolean accept(java.io.File f) {
                return f.isFile()
                        || f.isDirectory();
            }

            public String getDescription() {
                return "All file formats (*.*)";
            }
        });
        int res = f.showOpenDialog(ClientUtils.getParentFrame(vista.getMainPanel()));
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(f.getSelectedFile()));
                byte[] bytes = new byte[(int) f.getSelectedFile().length()];
                in.read(bytes);
                in.close();
                vista.getMainPanel().getVOModel().setValue("fileEnvio", bytes);
                vista.getMainPanel().getVOModel().setValue("fileLengthEnvio", bytes.length);
                vista.getMainPanel().getVOModel().setValue("fileNameEnvio", f.getSelectedFile().getName());
                vista.getMainPanel().pull("fileNameEnvio");
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "actionPerformed", ex);
                OptionPane.showMessageDialog(
                        MDIFrame.getInstance(),
                        "Error",
                        ex.getMessage(),
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            vista.getMainPanel().getVOModel().setValue("fileEnvio", null);
            vista.getMainPanel().getVOModel().setValue("fileLengthEnvio", null);
            vista.getMainPanel().getVOModel().setValue("fileNameEnvio", null);
            vista.getMainPanel().pull("fileNameEnvio");
        }
    }
}
