package controlador.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.openswing.swing.lookup.client.LookupDataLocator;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.tree.java.OpenSwingTreeNode;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author bc
 */
public class DefaultLookupDataLocatorPorNombre extends LookupDataLocator {

    protected String classFullName;

    public DefaultLookupDataLocatorPorNombre(String classFullName) {
        this.classFullName = classFullName;
    }

    @Override
    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType) {
        Session s = null;
        try {
            String sql = "FROM " + classFullName + " C ";
            filteredColumns.put(
                    "auditoria.activo",
                    new FilterWhereClause[]{
                        new FilterWhereClause("auditoria.activo", "=", true),
                        null
                    });
            SessionFactory sf = HibernateUtil.getSessionFactory();
            s = sf.openSession();
            Response res = HibernateUtils.getAllFromQuery(
                    filteredColumns,
                    currentSortedColumns,
                    currentSortedVersusColumns,
                    valueObjectType,
                    sql,
                    new Object[0],
                    new Type[0],
                    "C",
                    sf,
                    s);
            return res;
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "loadData", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
    }

    @Override
    public Response validateCode(String code) {
        Session s = null;
        try {
            String sql = "FROM " + classFullName + " C " + ""
                    + "WHERE C.auditoria.activo=? AND UPPER(C.nombre) like ?";
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            List list = s.createQuery(sql).
                    setBoolean(0, true).
                    setString(1, "%"+code.toUpperCase().trim()+"%").list();
            t.commit();
            return new VOListResponse(list, false, list.size());
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "validateCode", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
    }

    @Override
    public Response getTreeModel(JTree tree) {
        return new VOResponse(new DefaultTreeModel(new OpenSwingTreeNode()));
    }
}
