package controlador.personas;

import controlador.util.DefaultLookupController;
import controlador.util.DefaultLookupDataLocator;
import controlador.util.DefaultLookupGridController;
import java.util.List;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;

/**
 *
 * @author bc
 */
public class CodigoAreaLookupController extends DefaultLookupController {

    public CodigoAreaLookupController(String classFullName) {
        this.setLookupDataLocator(new CodigoAreaLookupDataLocator(classFullName));
        this.setLookupGridController(new DefaultLookupGridController());
        setLookupValueObjectClassName(classFullName);
        addLookup2ParentLink("tipoTelefono");
        defaultModel();

    }

    class CodigoAreaLookupDataLocator extends DefaultLookupDataLocator {

        public CodigoAreaLookupDataLocator(String classFullName) {
            super(classFullName);
        }

        @Override
        public Response validateCode(String code) {
            Session s = null;
            try {
                Integer codeNumeric = new Integer(-1);
                try {
                    codeNumeric = Integer.parseInt(code);
                } catch (Exception e) {
                }
                String sql = "FROM " + classFullName + " C " + "" +
                        "WHERE C.auditoria.activo=? AND C.numero=?";
                s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                List list = s.createQuery(sql).
                        setBoolean(0, true).
                        setLong(1, codeNumeric).list();
                t.commit();
                return new VOListResponse(list, false, list.size());
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "DefaultLookupController.validateCode", ex);
                return new ErrorResponse(ex.getMessage());
            } finally {
                s.close();
            }
        }
    }
}
