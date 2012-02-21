package vista.util;

import modelo.util.bean.BeanVO;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

/**
 * @author Orlando Becerra
 */
public abstract class DefaultGridFrame extends InternalFrame {

    public abstract void inicializar(GridDataLocator gridDataLocator,
            GridController gridController, String valueObjectClassName, String titulo, boolean addToMDIFrame);

    public void reloadGridsData() {
    }

    public void clearGridsData() {
    }

    public void setOwnerVO(BeanVO beanVO) {
    }

    public abstract GridControl getGridControl();
}
