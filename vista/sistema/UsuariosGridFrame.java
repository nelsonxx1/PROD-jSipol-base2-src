package vista.sistema;

import controlador.sistema.usuarios.UsuarioDetailController;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import vista.util.DefaultGridFrame;

/**
 * 
 * @author Orlando Becerra
 */
public class UsuariosGridFrame extends DefaultGridFrame {

    public UsuariosGridFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        exportButton1 = new org.openswing.swing.client.ExportButton();
        jPanel2 = new javax.swing.JPanel();
        gridData = new org.openswing.swing.client.GridControl();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        checkBoxColumn2 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        checkBoxColumn3 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        checkBoxColumn4 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn2 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();

        setTitle("Usuarios");

        insertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridData.setExportButton(exportButton1);
        gridData.setFunctionId("Usuarios");
        gridData.setReloadButton(reloadButton1);
        gridData.setValueObjectClassName(modelo.entidades.Usuario.class.getName());

        decimalColumn1.setColumnFilterable(true);
        decimalColumn1.setColumnName("id");
        decimalColumn1.setColumnRequired(false);
        decimalColumn1.setPreferredWidth(50);
        gridData.getColumnContainer().add(decimalColumn1);

        textColumn1.setColumnFilterable(true);
        textColumn1.setColumnName("nombreCompleto");
        textColumn1.setColumnSortable(true);
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setMaxCharacters(100);
        textColumn1.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn1);

        textColumn4.setColumnFilterable(true);
        textColumn4.setColumnName("userName");
        textColumn4.setColumnSortable(true);
        textColumn4.setEditableOnEdit(true);
        textColumn4.setEditableOnInsert(true);
        textColumn4.setMaxCharacters(20);
        gridData.getColumnContainer().add(textColumn4);

        checkBoxColumn1.setColumnName("auditoria.activo");
        checkBoxColumn1.setEditableOnEdit(true);
        checkBoxColumn1.setEditableOnInsert(true);
        gridData.getColumnContainer().add(checkBoxColumn1);

        checkBoxColumn2.setColumnName("superusuario");
        checkBoxColumn2.setEditableOnEdit(true);
        checkBoxColumn2.setEditableOnInsert(true);
        gridData.getColumnContainer().add(checkBoxColumn2);

        checkBoxColumn3.setColumnName("modificarPermisos");
        checkBoxColumn3.setEditableOnEdit(true);
        checkBoxColumn3.setEditableOnInsert(true);
        gridData.getColumnContainer().add(checkBoxColumn3);

        checkBoxColumn4.setColumnName("administraUsuarios");
        checkBoxColumn4.setEditableOnEdit(true);
        checkBoxColumn4.setEditableOnInsert(true);
        gridData.getColumnContainer().add(checkBoxColumn4);

        dateTimeColumn1.setColumnName("auditoria.fechaInsert");
        dateTimeColumn1.setColumnRequired(false);
        gridData.getColumnContainer().add(dateTimeColumn1);

        textColumn2.setColumnName("auditoria.usuarioInsert");
        textColumn2.setColumnRequired(false);
        gridData.getColumnContainer().add(textColumn2);

        dateTimeColumn2.setColumnName("auditoria.fechaUpdate");
        dateTimeColumn2.setColumnRequired(false);
        gridData.getColumnContainer().add(dateTimeColumn2);

        textColumn3.setColumnName("auditoria.usuarioUpdate");
        textColumn3.setColumnRequired(false);
        gridData.getColumnContainer().add(textColumn3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton1ActionPerformed
        new UsuarioDetailController(vista.sistema.UsuarioDetailFrame.class.getName(), gridData, null, false);
    }//GEN-LAST:event_insertButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn2;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn3;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn4;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn2;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.client.ExportButton exportButton1;
    private org.openswing.swing.client.GridControl gridData;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void inicializar(GridDataLocator gridDataLocator,
            GridController gridController, String valueObjectClassName, String titulo, boolean addToMDIFrame) {
        initComponents();
        gridData.setValueObjectClassName(valueObjectClassName);
        gridData.setGridDataLocator(gridDataLocator);
        gridData.setController(gridController);

        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }
        MDIFrame.add(this);
    }

    @Override
    public GridControl getGridControl() {
        return gridData;
    }
}
