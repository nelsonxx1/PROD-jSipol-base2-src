package controlador.sistema.usuarios;

import controlador.licencia.Equipo;
import controlador.util.DefaultDetailFrameController;
import java.util.List;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.Usuario;
import modelo.util.bean.BeanVO;
import org.hibernate.classic.Session;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;

/**
 *
 * @author bc
 */
public class UsuarioDetailController extends DefaultDetailFrameController {

    public UsuarioDetailController(String detailFramePath, GridControl gridControl, BeanVO beanVO, boolean aplicarLogicaNegocio) {
        super(detailFramePath, gridControl, beanVO, aplicarLogicaNegocio);
    }

    @Override
    public Response insertRecord(ValueObject newPersistentObject) throws Exception {
        Usuario unew = (Usuario) newPersistentObject;
        Response r = userNameRepetido(unew);
        if (r != null) {
            return r;
        }
        unew.setPassword2(Equipo.encodeText(unew.getPassword()));
        return super.insertRecord(unew);
    }

    @Override
    public Response updateRecord(ValueObject oldPersistentObject, ValueObject persistentObject) throws Exception {
        Usuario uold = (Usuario) oldPersistentObject;
        Usuario unew = (Usuario) persistentObject;
        if (!uold.getUserName().equals(unew.getUserName())) {
            Response r = userNameRepetido(unew);
            if (r != null) {
                return r;
            }
        }
        unew.setPassword2(Equipo.encodeText(unew.getPassword()));
        return super.updateRecord(oldPersistentObject, unew);
    }

    private Response userNameRepetido(Usuario unew) {
        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            List l = s.createQuery("FROM " + modelo.entidades.Usuario.class.getName()).list();
            for (Object o : l) {
                Usuario u2 = (Usuario) o;
                if (u2.getUserName().equals(unew.getUserName())) {
                    return new ErrorResponse("Nombre de Usuario ya existe");
                }
            }
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "updateRecord", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
        return null;
    }
}
