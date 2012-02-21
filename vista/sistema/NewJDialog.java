package vista.sistema;

import org.openswing.swing.client.PropertyGridControl;
import org.openswing.swing.client.TextControl;
import org.openswing.swing.properties.client.PropertyGridController;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author bc
 */
public class NewJDialog extends javax.swing.JDialog {

    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        propertyGridControl1.setMode(Consts.READONLY);


        propertyGridControl1.setController(new PropertyGridController() {

            @Override
            public void loadData(PropertyGridControl grid) {
                grid.clearData();
                grid.addProperty("idEmpresa", new TextControl(), "", null);
                grid.addProperty("nombreEmpresa", new TextControl(), "", null);
            }

            @Override
            public boolean updateRecords(PropertyGridControl grid, int[] changedRowNumbers) {
                System.out.println(grid.getPropertyValue(changedRowNumbers[0]));
                return true;
            }
        });
        propertyGridControl1.reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editButton1 = new org.openswing.swing.client.EditButton();
        propertyGridControl1 = new org.openswing.swing.client.PropertyGridControl();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        propertyGridControl1.setEditButton(editButton1);
        propertyGridControl1.setPropertyNameWidth(150);
        propertyGridControl1.setPropertyValueWidth(150);
        propertyGridControl1.setReloadButton(reloadButton1);
        propertyGridControl1.setSaveButton(saveButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyGridControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propertyGridControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public static void main(String args[]) {
//        Properties props = new Properties();
//        try {
//            InputStream isProps = new FileInputStream("Spanish.properties");
//            props.load(isProps);
//        } catch (IOException ex) {
//        }
//                ClientSettings clientSettings =
//                new ClientSettings(
//                new Spanish("BsF", props, true),
//                Dominios.getDominios());
//        new NewJDialog(null, true).setVisible(true);
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.PropertyGridControl propertyGridControl1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    // End of variables declaration//GEN-END:variables
}
