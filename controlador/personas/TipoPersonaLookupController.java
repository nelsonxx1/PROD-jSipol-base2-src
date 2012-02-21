package controlador.personas;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JDialog;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.personas.dominio.TipoPersona;
import modelo.util.bean.BeanVO;
import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.server.HibernateUtils;
import org.hibernate.type.Type;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.util.client.ClientUtils;
import vista.personas.mant.TipoPersonaGridFrame;

/**
 *
 * @author Orlando Becerra
 */
public class TipoPersonaLookupController extends GridController implements GridDataLocator {

    private BeanVO tipoPersona;
    private final JDialog d;

    public TipoPersonaLookupController(Component owner) {
        TipoPersonaGridFrame t = new TipoPersonaGridFrame();
        t.inicializar2(this, this, TipoPersona.class.getName(), "");
        setTipoPersona(null);
        d = new JDialog(MDIFrame.getInstance(), "Tipo de Persona", true);
        d.getContentPane().add(t.getGridControl2());
        d.setSize(250, 250);
        ClientUtils.centerDialog(MDIFrame.getInstance(), d);
        d.setVisible(true);
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        Session s = null;
        try {
            filteredColumns.put(
                    "auditoria.activo",
                    new FilterWhereClause[]{
                        new FilterWhereClause("auditoria.activo", "=", true),
                        null
                    });
            String sql = "FROM " + TipoPersona.class.getName() + " C ";
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
        setTipoPersona((BeanVO) persistentObject);
        d.dispose();
    }

    public BeanVO getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(BeanVO tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
