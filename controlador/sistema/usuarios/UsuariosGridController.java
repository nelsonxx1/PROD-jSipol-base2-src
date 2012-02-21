package controlador.sistema.usuarios;

import controlador.util.DefaultDetailFrameController;
import controlador.util.DefaultGridFrameController;
import java.util.ArrayList;
import java.util.Map;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.util.bean.BeanVO;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author admin
 */
public class UsuariosGridController extends DefaultGridFrameController {

    public UsuariosGridController(String gridFramePath, String detailFramePath, String claseModeloFullPath, String titulo) {
        super(gridFramePath, detailFramePath, claseModeloFullPath, titulo);
    }

    @Override
    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        Session s = null;
        try {
            String sql = "FROM " + claseModeloFullPath + " C ";
            filteredColumns.put(
                    "visible",
                    new FilterWhereClause[]{
                        new FilterWhereClause("visible", "=", true),
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
    public void doubleClick(int rowNumber, ValueObject persistentObject) {
            new UsuarioDetailController(detailFramePath, gridFrame.getGridControl(), (BeanVO) persistentObject, false);
    }
}
