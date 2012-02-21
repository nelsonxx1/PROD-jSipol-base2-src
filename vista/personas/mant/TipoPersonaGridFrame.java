package vista.personas.mant;

import modelo.entidades.personas.dominio.TipoPersona;
import modelo.util.bean.BeanVO;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import vista.util.DefaultGridFrame;

/**
 * 
 * @author Orlando Becerra
 */
public class TipoPersonaGridFrame extends DefaultGridFrame {

    public TipoPersonaGridFrame() {
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
        gridData = new org.openswing.swing.client.GridControl();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        checkBoxColumn2 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn2 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();

        setTitle("MantenimientoTipoPersona");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridData.setDeleteButton(deleteButton1);
        gridData.setEditButton(editButton1);
        gridData.setExportButton(exportButton1);
        gridData.setFunctionId("MantenimientoTipoPersona");
        gridData.setInsertButton(insertButton1);
        gridData.setReloadButton(reloadButton1);
        gridData.setSaveButton(saveButton1);
        gridData.setValueObjectClassName(TipoPersona.class.getName());

        decimalColumn1.setColumnFilterable(true);
        decimalColumn1.setColumnName("id");
        decimalColumn1.setColumnRequired(false);
        decimalColumn1.setPreferredWidth(40);
        gridData.getColumnContainer().add(decimalColumn1);

        textColumn1.setColumnFilterable(true);
        textColumn1.setColumnName("nombre");
        textColumn1.setColumnSortable(true);
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setPreferredWidth(170);
        textColumn1.setTrimText(true);
        textColumn1.setUpperCase(true);
        gridData.getColumnContainer().add(textColumn1);

        checkBoxColumn1.setColumnName("auditoria.activo");
        checkBoxColumn1.setEditableOnEdit(true);
        checkBoxColumn1.setEditableOnInsert(true);
        checkBoxColumn1.setPreferredWidth(70);
        gridData.getColumnContainer().add(checkBoxColumn1);

        checkBoxColumn2.setColumnName("bloqueado");
        checkBoxColumn2.setColumnSortable(true);
        checkBoxColumn2.setEditableOnEdit(true);
        checkBoxColumn2.setEditableOnInsert(true);
        checkBoxColumn2.setPreferredWidth(70);
        gridData.getColumnContainer().add(checkBoxColumn2);

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

        gridControl1.setFunctionId("xTiposPersonaPer");
        gridControl1.setValueObjectClassName(TipoPersona.class.getName());
        gridControl1.setVisibleStatusPanel(false);

        textColumn5.setColumnName("idPropio");
        textColumn5.setPreferredWidth(60);
        gridControl1.getColumnContainer().add(textColumn5);

        textColumn6.setColumnFilterable(true);
        textColumn6.setColumnName("nombre");
        textColumn6.setColumnSortable(true);
        textColumn6.setEditableOnEdit(true);
        textColumn6.setEditableOnInsert(true);
        textColumn6.setPreferredWidth(150);
        textColumn6.setTrimText(true);
        textColumn6.setUpperCase(true);
        gridControl1.getColumnContainer().add(textColumn6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gridControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridData, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn2;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn2;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.ExportButton exportButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.GridControl gridData;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void inicializar(GridDataLocator gridDataLocator,
            GridController gridController, String valueObjectClassName, String titulo, boolean addToMDIFrame) {
        initComponents();
        if (titulo != null) {
            this.setTitle(titulo);
        }
        gridData.setValueObjectClassName(valueObjectClassName);
        gridData.setGridDataLocator(gridDataLocator);
        gridData.setController(gridController);
        gridControl1.setGridDataLocator(gridDataLocator);
        gridControl1.setController(gridController);
        gridControl1.setVisible(false);
        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }
        MDIFrame.add(this);
    }

    public void inicializar2(GridDataLocator gridDataLocator,
            GridController gridController, String valueObjectClassName, String titulo) {
        initComponents();
        if (titulo != null) {
            this.setTitle(titulo);
        }
        //gridData.setValueObjectClassName(valueObjectClassName);
        //gridData.setGridDataLocator(gridDataLocator);
        //gridData.setController(gridController);
        gridControl1.setGridDataLocator(gridDataLocator);
        gridControl1.setController(gridController);
    }

    @Override
    public void reloadGridsData() {
        gridData.reloadData();
    }

    @Override
    public void clearGridsData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setOwnerVO(BeanVO beanVO) {
    }

    @Override
    public GridControl getGridControl() {
        return gridData;
    }

    public GridControl getGridControl2() {
        return gridControl1;
    }
}
