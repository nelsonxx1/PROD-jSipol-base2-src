package controlador.documentosAnexos;

import controlador.util.DefaultLookupDataLocator;
import modelo.entidades.TipoDocumento;
import java.util.ArrayList;
import java.util.Map;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author Administrador
 */
public class TipoDocumentoLookupDataLocator extends DefaultLookupDataLocator {

    private Enum modulo;

    public TipoDocumentoLookupDataLocator(Enum modulo) {
        super(TipoDocumento.class.getName());
        this.modulo = modulo;
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
            filteredColumns.put(
                    "modulo",
                    new FilterWhereClause[]{
                        new FilterWhereClause("modulo", "=", modulo),
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
}
