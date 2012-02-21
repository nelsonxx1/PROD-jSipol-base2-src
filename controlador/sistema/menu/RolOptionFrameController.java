package controlador.sistema.menu;

import controlador.General;
import controlador.util.DefaultOptionFrameControler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import modelo.entidades.menu.Item;
import modelo.entidades.menu.MenuByRol;
import modelo.entidades.menu.Rol;
import org.openswing.swing.client.CheckBoxControl;
import vista.sistema.menu.RolOptionFrame;

/**
 *
 * @author adrian.and1
 */
public class RolOptionFrameController extends DefaultOptionFrameControler implements ActionListener {

    public RolOptionFrameController(String optionFramePath, String claseModeloFullPath, String titulo) {
        super(optionFramePath, claseModeloFullPath, titulo);
    }

    private void addFuntion(DefaultMutableTreeNode padre, Item funcion) {
        DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(funcion);

        padre.add(hijo);
        for (Item it : funcion.getItems()) {
            addFuntion(hijo, it);
        }
    }

    public DefaultTreeModel getFunctionsModel() {
        Item funcion = null;
        DefaultTreeModel model = null;
        Object object = optenerData(Item.class.getName() + " where nombre='root'").get(0);
        if (object instanceof Item) {
            funcion = (Item) object;
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Menu");
            model = new DefaultTreeModel(root);
            for (Item it : funcion.getItems()) {
                addFuntion(root, it);
            }
        }
        return model;
    }

    Long getRolID(RolOptionFrame oFrame) {

        for (Object object : oFrame.getRoles()) {
            if (((Rol) object).getNombre().compareTo(oFrame.getjComboBox1().getSelectedItem().toString()) == 0) {
                return ((Rol) object).getId();
            }
        }
        return 0L;
    }

    public void onValueChange() {

        RolOptionFrame oFrame = (RolOptionFrame) this.optionFrame;
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) oFrame.getjTree1().getSelectionPaths()[0].getLastPathComponent();
        Item item = (Item) nodo.getUserObject();
        Long lo = getRolID(oFrame);

        String hql =
                MenuByRol.class.getName() + " menu, "
                + Rol.class.getName() + " rol, "
                + Item.class.getName() + " item WHERE "
                + "rol.id = menu.rolId and rol.id=" + lo
                + "and item.id=menu.itemId and item.id=" + item.getId();

        List l = optenerData(hql);
        if (l.size() > 0) {
            Object[] ob = (Object[]) l.get(0);
            m = (MenuByRol) ob[0];


            oFrame.getCheckBoxControl1().setSelected(m.isEnable());
            if (nodo.getLevel() > 1) {
                oFrame.getCheckBoxControl2().setVisible(false);
                oFrame.getCheckBoxControl3().setVisible(false);
                oFrame.getCheckBoxControl4().setVisible(false);
                oFrame.getCheckBoxControl5().setVisible(false);

            } else {
                oFrame.getCheckBoxControl2().setVisible(true);
                oFrame.getCheckBoxControl3().setVisible(true);
                oFrame.getCheckBoxControl4().setVisible(true);
                oFrame.getCheckBoxControl5().setVisible(true);
                oFrame.getCheckBoxControl2().setSelected(m.isInsertable());
                oFrame.getCheckBoxControl3().setSelected(m.isEditable());
                oFrame.getCheckBoxControl4().setSelected(m.isDeletable());
                oFrame.getCheckBoxControl5().setSelected(m.isSearchable());
            }







        }

    }

    public void stateChanged(CheckBoxControl chk) {
        RolOptionFrame oFrame = (RolOptionFrame) this.optionFrame;
  

        if (m != null) {
            if (m.isEnable() != oFrame.getCheckBoxControl1().isSelected()) {
                String hql = MenuByRol.class.getName() + " set enable="
                        + (!m.isEnable()) + " where id=" + m.getId();
                actualizarData(hql);
                m.setEnable(!m.isEnable());
            }
            if (m.isInsertable() != oFrame.getCheckBoxControl2().isSelected()) {
                String hql = MenuByRol.class.getName() + " set insertable="
                        + (!m.isInsertable()) + " where id=" + m.getId();
                actualizarData(hql);
                m.setInsertable(!m.isInsertable());
            }
            if (m.isEditable() != oFrame.getCheckBoxControl3().isSelected()) {
                String hql = MenuByRol.class.getName() + " set editable="
                        + (!m.isEditable()) + " where id=" + m.getId();
                actualizarData(hql);
                m.setEditable(!m.isEditable());
            }
            if (m.isDeletable() != oFrame.getCheckBoxControl4().isSelected()) {
                String hql = MenuByRol.class.getName() + " set deletable="
                        + (!m.isDeletable()) + " where id=" + m.getId();
                actualizarData(hql);
                m.setDeletable(!m.isDeletable());
            }
            if (m.isSearchable() != oFrame.getCheckBoxControl5().isSelected()) {
                String hql = MenuByRol.class.getName() + " set searchable="
                        + (!m.isSearchable()) + " where id=" + m.getId();
                actualizarData(hql);
                m.setSearchable(!m.isSearchable());
            }
            // save(m);
        }
    }
    private MenuByRol m = null;

    public void actionPerformed(ActionEvent e) {

        stateChanged((CheckBoxControl) e.getSource());

    }
}
