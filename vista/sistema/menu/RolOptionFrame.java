package vista.sistema.menu;

import controlador.General;
import controlador.sistema.menu.RolOptionFrameController;
import controlador.util.DefaultOptionFrameControler;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTree;
import modelo.entidades.menu.Rol;
import org.openswing.swing.client.CheckBoxControl;
import org.openswing.swing.mdi.client.MDIFrame;
import vista.util.DefaultOptionFrame;

/**
 *
 * @author Luis Adrian Gonzalez
 */
public class RolOptionFrame extends DefaultOptionFrame {

    private java.util.List roles;

    public List getRoles() {
        return roles;
    }

    public void setRoles(List roles) {
        this.roles = roles;
    }

    public RolOptionFrame() {
    }

    public JComboBox getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelControl1 = new org.openswing.swing.client.LabelControl();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        checkBoxControl1 = new org.openswing.swing.client.CheckBoxControl();
        checkBoxControl2 = new org.openswing.swing.client.CheckBoxControl();
        checkBoxControl3 = new org.openswing.swing.client.CheckBoxControl();
        checkBoxControl4 = new org.openswing.swing.client.CheckBoxControl();
        checkBoxControl5 = new org.openswing.swing.client.CheckBoxControl();

        labelControl1.setLabel("Roles");

        jTree1.setModel(null);
        jTree1.setDragEnabled(true);
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permisos asosiados a esta opción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        checkBoxControl1.setText("Visible");

        checkBoxControl2.setText("Insertable");

        checkBoxControl3.setText("Editable");

        checkBoxControl4.setText("Borrable");

        checkBoxControl5.setText("Consultable");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {checkBoxControl1, checkBoxControl2, checkBoxControl3, checkBoxControl4, checkBoxControl5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(checkBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkBoxControl1, checkBoxControl2, checkBoxControl3, checkBoxControl4, checkBoxControl5});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged

        optionControl.onValueChange();

    }//GEN-LAST:event_jTree1ValueChanged
    RolOptionFrameController optionControl;

    @Override
    public void inicializar(DefaultOptionFrameControler optionControl1, String valueObjectClassName, String titulo, boolean addToMDIFrame) {
        this.optionControl = (RolOptionFrameController) optionControl1;
        initComponents();
        if ((roles = optionControl.optenerData(valueObjectClassName)) != null) {
            roles.remove(0);
            List<Rol> rs = (List<Rol>) roles;
            String arreglo[] = new String[roles.size()];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = rs.get(i).getNombre();
            }
            jComboBox1.setModel(new DefaultComboBoxModel(arreglo));
        }

        jTree1.setModel(this.optionControl.getFunctionsModel());

        checkBoxControl1.addActionListener(optionControl);
        checkBoxControl2.addActionListener(optionControl);
        checkBoxControl3.addActionListener(optionControl);
        checkBoxControl4.addActionListener(optionControl);
        checkBoxControl5.addActionListener(optionControl);

        if (!General.usuario.getModificarPermisos()) {
            checkBoxControl1.setEnabled(false);
            checkBoxControl2.setEnabled(false);
            checkBoxControl3.setEnabled(false);
            checkBoxControl4.setEnabled(false);
            checkBoxControl5.setEnabled(false);
        }

        if (titulo != null) {
            setTitle(titulo);
        }
        if (addToMDIFrame) {
            pack();
        } else {
            setVisible(false);
        }
        MDIFrame.add(this);
    }

    public JTree getjTree1() {
        return jTree1;
    }

    public void setjTree1(JTree jTree1) {
        this.jTree1 = jTree1;
    }

    public CheckBoxControl getCheckBoxControl1() {
        return checkBoxControl1;
    }

    public void setCheckBoxControl1(CheckBoxControl checkBoxControl1) {
        this.checkBoxControl1 = checkBoxControl1;
    }

    public CheckBoxControl getCheckBoxControl2() {
        return checkBoxControl2;
    }

    public void setCheckBoxControl2(CheckBoxControl checkBoxControl2) {
        this.checkBoxControl2 = checkBoxControl2;
    }

    public CheckBoxControl getCheckBoxControl3() {
        return checkBoxControl3;
    }

    public void setCheckBoxControl3(CheckBoxControl checkBoxControl3) {
        this.checkBoxControl3 = checkBoxControl3;
    }

    public CheckBoxControl getCheckBoxControl4() {
        return checkBoxControl4;
    }

    public void setCheckBoxControl4(CheckBoxControl checkBoxControl4) {
        this.checkBoxControl4 = checkBoxControl4;
    }

    public CheckBoxControl getCheckBoxControl5() {
        return checkBoxControl5;
    }

    public void setCheckBoxControl5(CheckBoxControl checkBoxControl5) {
        this.checkBoxControl5 = checkBoxControl5;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.client.CheckBoxControl checkBoxControl1;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl2;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl3;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl4;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private org.openswing.swing.client.LabelControl labelControl1;
    // End of variables declaration//GEN-END:variables
}
