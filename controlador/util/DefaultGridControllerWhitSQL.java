package controlador.util;

import controlador.General;
import java.util.ArrayList;
import java.util.Map;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.util.server.HibernateUtils;
import vista.util.DefaultGridFrame;

/**
 *
 * @author orlandobcrra
 */
public class DefaultGridControllerWhitSQL extends DefaultGridFrameController {

    private Object values[];
    private Type valueTypes[];
    private String sql;

    public DefaultGridControllerWhitSQL(String gridFramePath, String detailFramePath, String claseModeloFullPath, String titulo, String sql, Object[] values, Type[] valueType) {
        this.valueTypes = valueType;
        this.values = values;
        this.sql = sql;
        this.detailFramePath = detailFramePath;
        this.claseModeloFullPath = claseModeloFullPath;
        if (titulo == null) {
            titulo = claseModeloFullPath;
        }
        try {
            Class<DefaultGridFrame> t = (Class<vista.util.DefaultGridFrame>) Class.forName(gridFramePath);
            gridFrame = t.newInstance();
            gridFrame.inicializar(this, this, claseModeloFullPath, titulo, true);
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "new", ex);
        }
    }

    @Override
    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        Session s = null;
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            s = sf.openSession();

            Response res = HibernateUtils.getBlockFromQuery(
                    action,
                    startIndex,
                    General.licencia.getBlockSize(),
                    filteredColumns,
                    currentSortedColumns,
                    currentSortedVersusColumns,
                    valueObjectType,
                    sql,
                    values,
                    valueTypes,
                    "P",
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
