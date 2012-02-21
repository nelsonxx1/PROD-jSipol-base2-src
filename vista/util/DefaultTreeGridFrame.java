/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.util;

import modelo.util.bean.BeanVO;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.tree.client.TreeController;
import org.openswing.swing.tree.client.TreeDataLocator;
import org.openswing.swing.tree.client.TreeGridPanel;

/**
 *
 * @author NELSON
 */
public abstract class  DefaultTreeGridFrame extends InternalFrame{

    public DefaultTreeGridFrame() {
    }
    
    public abstract void inicializar(TreeDataLocator treeDataLocator,
            TreeController treeController, String valueObjectClassName, String titulo, boolean addToMDIFrame);  
    
    public void reloadGridsData() {
    }

    public void clearGridsData() {
    }

    public void setOwnerVO(BeanVO beanVO) {
    }

    public abstract TreeGridPanel getTreeGridPanel();    
}
