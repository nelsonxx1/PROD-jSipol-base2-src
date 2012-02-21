/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.util;

import java.util.Calendar;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.tree.client.TreeController;
import vista.util.DefaultTreeGridFrame;
import org.openswing.swing.tree.client.TreeDataLocator;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author NELSON
 */
public class DefaultTreeGridFrameController extends TreeDataLocator implements TreeController{

    protected String claseModeloFullPath;
    protected String atribute;
    protected String detailFramePath;
    protected DefaultTreeGridFrame treeGridFrame;

    public DefaultTreeGridFrameController() {
    }
    
    public DefaultTreeGridFrameController(String treeGridFramePath,String claseModeloFullPath, 
            String atribute, String detailFramePath, DefaultTreeGridFrame treeGridFrame, String titulo) {
        this.claseModeloFullPath = claseModeloFullPath;
        this.detailFramePath = detailFramePath;
        this.treeGridFrame = treeGridFrame;
        this.atribute=atribute;
        
        if (titulo == null) {
            titulo = claseModeloFullPath;
        }
        try {
            Class<DefaultTreeGridFrame> t = (Class<vista.util.DefaultTreeGridFrame>) Class.forName(treeGridFramePath);
            treeGridFrame = t.newInstance();
            treeGridFrame.inicializar(this, this, claseModeloFullPath, titulo, true);
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "Error Construyendo ", ex);
        }        
    }    
            
    @Override
    public Response getTreeModel(JTree jtree) {
        throw new UnsupportedOperationException("Debe implementar getTreeModel");
    }

    public void doubleClick(DefaultMutableTreeNode dmtn) {
        throw new UnsupportedOperationException("Debe implementar doubleClick");
    }

    public void leftClick(DefaultMutableTreeNode dmtn) {
        
    }

    public boolean rightClick(DefaultMutableTreeNode dmtn) {
        return false;
    }

   
}
