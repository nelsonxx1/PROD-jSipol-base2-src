package vista.mant;

import modelo.entidades.Encabezado;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import vista.util.DefaultGridFrame;

/**
 * 
 * @author Orlando Becerra
 */
public class EncabezadoGridFrame extends DefaultGridFrame {

    public EncabezadoGridFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        editButton1 = new org.openswing.swing.client.EditButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        exportButton1 = new org.openswing.swing.client.ExportButton();
        jPanel2 = new javax.swing.JPanel();
        gridData = new org.openswing.swing.client.GridControl();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn9 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn10 = new org.openswing.swing.table.columns.client.TextColumn();

        setTitle("Encabezados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridData.setDeleteButton(deleteButton1);
        gridData.setEditButton(editButton1);
        gridData.setExportButton(exportButton1);
        gridData.setFunctionId("Mantenimiento");
        gridData.setInsertButton(insertButton1);
        gridData.setReloadButton(reloadButton1);
        gridData.setSaveButton(saveButton1);
        gridData.setValueObjectClassName(Encabezado.class.getName());

        decimalColumn1.setColumnFilterable(true);
        decimalColumn1.setColumnName("id");
        decimalColumn1.setColumnRequired(false);
        decimalColumn1.setPreferredWidth(50);
        gridData.getColumnContainer().add(decimalColumn1);

        textColumn5.setColumnName("rif2");
        textColumn5.setEditableOnEdit(true);
        textColumn5.setEditableOnInsert(true);
        gridData.getColumnContainer().add(textColumn5);

        textColumn1.setColumnFilterable(true);
        textColumn1.setColumnName("nombre");
        textColumn1.setColumnSortable(true);
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setMaxCharacters(100);
        textColumn1.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn1);

        textColumn4.setColumnName("imagen");
        textColumn4.setEditableOnEdit(true);
        textColumn4.setEditableOnInsert(true);
        gridData.getColumnContainer().add(textColumn4);

        textColumn3.setColumnName("observacion");
        textColumn3.setColumnRequired(false);
        textColumn3.setEditableOnEdit(true);
        textColumn3.setEditableOnInsert(true);
        gridData.getColumnContainer().add(textColumn3);

        textColumn2.setColumnFilterable(true);
        textColumn2.setColumnName("direccion");
        textColumn2.setColumnSortable(true);
        textColumn2.setEditableOnEdit(true);
        textColumn2.setEditableOnInsert(true);
        textColumn2.setMaxCharacters(100);
        textColumn2.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn2);

        textColumn6.setColumnFilterable(true);
        textColumn6.setColumnName("superintendencia");
        textColumn6.setColumnSortable(true);
        textColumn6.setEditableOnEdit(true);
        textColumn6.setEditableOnInsert(true);
        textColumn6.setMaxCharacters(100);
        textColumn6.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn6);

        textColumn7.setColumnFilterable(true);
        textColumn7.setColumnName("telefonos");
        textColumn7.setColumnSortable(true);
        textColumn7.setEditableOnEdit(true);
        textColumn7.setEditableOnInsert(true);
        textColumn7.setMaxCharacters(100);
        textColumn7.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn7);

        textColumn8.setColumnFilterable(true);
        textColumn8.setColumnName("web");
        textColumn8.setColumnSortable(true);
        textColumn8.setEditableOnEdit(true);
        textColumn8.setEditableOnInsert(true);
        textColumn8.setMaxCharacters(100);
        textColumn8.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn8);

        textColumn9.setColumnFilterable(true);
        textColumn9.setColumnName("email");
        textColumn9.setColumnSortable(true);
        textColumn9.setEditableOnEdit(true);
        textColumn9.setEditableOnInsert(true);
        textColumn9.setMaxCharacters(100);
        textColumn9.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn9);

        textColumn10.setColumnFilterable(true);
        textColumn10.setColumnName("codigo");
        textColumn10.setColumnSortable(true);
        textColumn10.setEditableOnEdit(true);
        textColumn10.setEditableOnInsert(true);
        textColumn10.setMaxCharacters(100);
        textColumn10.setPreferredWidth(200);
        gridData.getColumnContainer().add(textColumn10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.ExportButton exportButton1;
    private org.openswing.swing.client.GridControl gridData;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn10;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    private org.openswing.swing.table.columns.client.TextColumn textColumn9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void inicializar(GridDataLocator gridDataLocator,
            GridController gridController, String valueObjectClassName, String titulo, boolean addToMDIFrame) {
        initComponents();
        //this.setTitle(titulo);
        //gridData.setValueObjectClassName(valueObjectClassName);
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
