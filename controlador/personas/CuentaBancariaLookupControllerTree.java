package controlador.personas;

import controlador.util.DefaultLookupController;
import controlador.util.DefaultLookupDataLocator;
import controlador.util.DefaultLookupGridController;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import modelo.entidades.personas.maestra.Persona;
import modelo.entidades.personas.transac.CuentaBancariaPersona;
import modelo.util.bean.BeanVO;
import org.hibernate.classic.Session;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.tree.java.OpenSwingTreeNode;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author orlandobcrra
 */
public class CuentaBancariaLookupControllerTree extends DefaultLookupController {

    private BeanVO beanVO;

    public CuentaBancariaLookupControllerTree() {
        setLookupGridController(new DefaultLookupGridController());
        setLookupDataLocator(new CuentaBancariaDataLocator(CuentaBancariaPersona.class.getName()));
        setLookupValueObjectClassName(CuentaBancariaPersona.class.getName());
        setCodeSelectionWindow(CuentaBancariaLookupControllerTree.TREE_GRID_FRAME);
        setOnInvalidCode(ON_INVALID_CODE_RESTORE_LAST_VALID_CODE);
        getLookupDataLocator().setNodeNameAttribute("nombreCorto");
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
        public Response loadData(int action,
                int startIndex,
                Map filteredColumns,
                ArrayList currentSortedColumns,
                ArrayList currentSortedVersusColumns,
                Class valueObjectType) {
            try {
                Map map = getLookupFrameParams();
                if (map.get(Consts.TREE_FILTER) != null) {
                    Persona marca = (Persona) map.get(Consts.TREE_FILTER);
                    if (marca.getId() != -1) {
                        Session s = null;
                        try {
                            s = HibernateUtil.getSessionFactory().openSession();
                            Persona per = (Persona) s.load(Persona.class, marca.getId());
                            List list = new ArrayList(per.getCuentasBancarias());
                            for (Object object : list) {
                                ((CuentaBancariaPersona) object).setPersona(per);
                                System.out.println("tome per "+per.getNombreCorto());
                            }
                            return new VOListResponse(list, false, list.size());
                        } catch (Exception ex) {
                            LoggerUtil.error(this.getClass(), "loadData", ex);
                            return new ErrorResponse(ex.getMessage());
                        } finally {
                            s.close();
                        }
                    } else {
                        return new VOListResponse(new ArrayList(0), false, 0);
                    }
                }
                return new VOListResponse(new ArrayList(0), false, 0);
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "loadData", ex);
                return new ErrorResponse(ex.getMessage());
            }
        }

        @Override
        public Response getTreeModel(JTree tree) {
            Session s = null;
            try {
                Persona vo = null;
                vo = new Persona();
                vo.setId(new Long(-1));
                vo.setNombreCorto("Contribuyentes");
                DefaultMutableTreeNode root = new OpenSwingTreeNode(vo);
                s = HibernateUtil.getSessionFactory().openSession();
                List marcas = s.createQuery("SELECT DISTINCT C FROM " + Persona.class.getName() + " C LEFT JOIN C.tiposPersona T WHERE T.idPropio='IVA'").list();
                for (Object marca : marcas) {
                    root.add(new OpenSwingTreeNode(marca));
                }
                return new VOResponse(new DefaultTreeModel(root));
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "getTreeModel", ex);
                return new VOResponse(new DefaultTreeModel(new OpenSwingTreeNode()));
            } finally {
                s.close();
            }
        }
    }

    public void setBeanVO(BeanVO beanVO) {
        this.beanVO = beanVO;
    }
}
