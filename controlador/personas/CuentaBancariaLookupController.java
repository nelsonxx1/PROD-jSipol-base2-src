package controlador.personas;

import controlador.util.DefaultLookupController;
import controlador.util.DefaultLookupDataLocator;
import controlador.util.DefaultLookupGridController;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.personas.maestra.Persona;
import modelo.entidades.personas.transac.CuentaBancariaPersona;
import modelo.util.bean.BeanVO;
import org.hibernate.classic.Session;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author orlandobcrra
 */
public class CuentaBancariaLookupController extends DefaultLookupController {

    private BeanVO beanVO;

    public CuentaBancariaLookupController() {
        setLookupGridController(new DefaultLookupGridController());
        setLookupDataLocator(new CuentaBancariaDataLocator(CuentaBancariaPersona.class.getName()));
        setLookupValueObjectClassName(CuentaBancariaPersona.class.getName());
        setCodeSelectionWindow(GRID_FRAME);
        setOnInvalidCode(ON_INVALID_CODE_RESTORE_LAST_VALID_CODE);
        setAllColumnVisible(false);
        setVisibleColumn("id", true);
        setVisibleColumn("banco.nombreCorto", true);
        setVisibleColumn("tipoCuenta.nombre", true);
        setVisibleColumn("numero", true);
        setVisibleColumn("observacion", true);
        setPreferredWidthColumn("id", 50);
        setPreferredWidthColumn("numero", 200);
        setFilterableColumn("numero", true);
        setFilterableColumn("banco.nombreCorto", true);
        setFilterableColumn("tipoCuenta.nombre", true);
        setFilterableColumn("observacion", true);
        setSortableColumn("id", true);
        setSortedColumn("id", Consts.DESC_SORTED, 0);
        setSortableColumn("numero", true);
        setSortableColumn("banco.nombreCorto", true);
        setSortableColumn("tipoCuenta.nombre", true);
        setSortableColumn("observacion", true);
        setFramePreferedSize(new Dimension(550, 330));
    }

    class CuentaBancariaDataLocator extends DefaultLookupDataLocator {

        public CuentaBancariaDataLocator(String classFullName) {
            super(classFullName);
        }

        @Override
        public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType) {
            Session s = null;
            try {
                s = HibernateUtil.getSessionFactory().openSession();
                Persona p = (Persona) s.load(Persona.class, ((Persona) beanVO).getId());
                List list = new ArrayList<CuentaBancariaPersona>(p.getCuentasBancarias());
                return new VOListResponse(list, false, list.size());
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "loadData", ex);
                return new ErrorResponse(ex.getMessage());
            } finally {
                s.close();
            }
        }
    }

    public void setBeanVO(BeanVO beanVO) {
        this.beanVO = beanVO;
    }
}
