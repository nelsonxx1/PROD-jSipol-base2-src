package controlador.util;

import java.util.List;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.classic.Session;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.ListFilterController;

/**
 * @author bc
 */
public class DefaultColumnsFilter extends ListFilterController {

    String entity;

    public DefaultColumnsFilter(String entity) {
        this.entity = entity;
    }

    public Response getListControlValues(String attributeName) {
        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            List l = s.createQuery("SELECT DISTINCT " + attributeName + " FROM " + entity).list();
            return new VOListResponse(l, false, l.size());
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "insertRecords", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
    }
}
