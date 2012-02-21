package controlador.personas;

import controlador.util.DefaultLookupController;
import controlador.util.DefaultLookupDataLocator;
import controlador.util.DefaultLookupGridController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.personas.maestra.Persona;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.type.BooleanType;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.util.java.Consts;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author Orlando Becerra
 */
public class PersonaLookupControllerPorNombre extends DefaultLookupController {

    public PersonaLookupControllerPorNombre(String idPropio) {
        this.setLookupDataLocator(new PersonaLookupDataLocator(Persona.class.getName(), idPropio));
        this.setLookupGridController(new DefaultLookupGridController());
        setLookupValueObjectClassName(Persona.class.getName());
        setAllColumnVisible(false);
        setVisibleColumn("id", true);
        setVisibleColumn("rif.rif", true);
        setVisibleColumn("nombreLargo", true);
        setPreferredWidthColumn("id", 40);
        setPreferredWidthColumn("rif.rif", 100);
        setPreferredWidthColumn("nombreLargo", 200);
        setSortableColumn("id", true);
        setSortedColumn("id", Consts.DESC_SORTED, 0);
        setSortableColumn("rif.rif", true);
        setSortableColumn("nombreLargo", true);
        setFilterableColumn("rif.rif", true);
        setFilterableColumn("nombreLargo", true);
        setFramePreferedSize(new java.awt.Dimension(380, 340));
        setCodeSelectionWindow(GRID_FRAME);
        setOnInvalidCode(ON_INVALID_CODE_RESTORE_FOCUS);

    }

    class PersonaLookupDataLocator extends DefaultLookupDataLocator {

        String idPropio;

        public PersonaLookupDataLocator(String classFullName, String idPropio) {
            super(classFullName);
            this.idPropio = idPropio;
        }

        @Override
        public Response loadData(int action,
                int startIndex,
                Map filteredColumns,
                ArrayList currentSortedColumns,
                ArrayList currentSortedVersusColumns,
                Class valueObjectType) {
            Session s = null;
            try {
                String sql = "SELECT DISTINCT C FROM " + Persona.class.getName()
                        + " C LEFT JOIN C.tiposPersona T "
                        + "WHERE T.idPropio = '" + idPropio + "'";
                sql+=" AND C.auditoria.activo=?";
                SessionFactory sf = HibernateUtil.getSessionFactory();
                s = sf.openSession();
                Response res = HibernateUtils.getAllFromQuery(
                        filteredColumns,
                        currentSortedColumns,
                        currentSortedVersusColumns,
                        valueObjectType,
                        sql,
                        new Object[]{new Boolean(true)},
                        new Type[]{new BooleanType()},
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
                String sql = "SELECT DISTINCT C FROM " + Persona.class.getName()
                        + " C LEFT JOIN C.tiposPersona T "
                        + "WHERE T.idPropio =? AND C.auditoria.activo=? AND upper(C.nombreCorto) like ?";
                s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                List list = s.createQuery(sql).
                        setString(0, idPropio).
                        setBoolean(1, true).
                        setString(2, "%"+code.toUpperCase().trim()+"%").list();
                t.commit();
                return new VOListResponse(list, false, list.size());
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "validateCode", ex);
                return new ErrorResponse(ex.getMessage());
            } finally {
                s.close();
            }
        }
    }
}
