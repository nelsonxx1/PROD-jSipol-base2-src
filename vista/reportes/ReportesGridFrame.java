package vista.reportes;

import controlador.General;
import controlador.util.DefaultItemsDataLocator;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import modelo.Dominios;
import modelo.entidades.Encabezado;
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
public class ReportesGridFrame extends DefaultGridFrame {

    public ReportesGridFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        buttonGroup2 = new javax.swing.ButtonGroup();
        gridData = new org.openswing.swing.client.GridControl();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumn1 = new org.openswing.swing.table.columns.client.ComboColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        comboBoxControl1 = new org.openswing.swing.client.ComboBoxControl();
        jPanel1 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        comboBoxVOControl1 = new org.openswing.swing.client.ComboBoxVOControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        textColumn4.setColumnName("baseSQL");
        textColumn4.setEditableOnEdit(true);
        textColumn4.setEditableOnInsert(true);
        textColumn4.setPreferredWidth(300);

        setTitle("Reportes");

        gridData.setDeleteButton(deleteButton1);
        gridData.setEditButton(editButton1);
        gridData.setFunctionId("Reporte");
        gridData.setInsertButton(insertButton1);
        gridData.setReloadButton(reloadButton1);
        gridData.setSaveButton(saveButton1);
        gridData.setValueObjectClassName(modelo.entidades.Reporte.class.getName());

        decimalColumn1.setColumnFilterable(true);
        decimalColumn1.setColumnName("id");
        decimalColumn1.setColumnRequired(false);
        decimalColumn1.setPreferredWidth(50);
        gridData.getColumnContainer().add(decimalColumn1);

        textColumn3.setColumnFilterable(true);
        textColumn3.setColumnName("file");
        textColumn3.setColumnSortable(true);
        textColumn3.setEditableOnEdit(true);
        textColumn3.setEditableOnInsert(true);
        textColumn3.setMaxCharacters(100);
        gridData.getColumnContainer().add(textColumn3);

        textColumn1.setColumnFilterable(true);
        textColumn1.setColumnName("titulo");
        textColumn1.setColumnSortable(true);
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setHeaderColumnName("titulo");
        textColumn1.setMaxCharacters(100);
        textColumn1.setPreferredWidth(280);
        textColumn1.setRpadding(true);
        gridData.getColumnContainer().add(textColumn1);

        comboColumn1.setColumnName("categoria");
        comboColumn1.setColumnVisible(false);
        comboColumn1.setDomainId(Dominios.CategoriaReporte().getDomainId());
        comboColumn1.setEditableOnEdit(true);
        comboColumn1.setEditableOnInsert(true);
        gridData.getColumnContainer().add(comboColumn1);

        textColumn2.setColumnFilterable(true);
        textColumn2.setColumnName("observacion");
        textColumn2.setColumnSortable(true);
        textColumn2.setEditableOnEdit(true);
        textColumn2.setEditableOnInsert(true);
        textColumn2.setMaxCharacters(100);
        textColumn2.setPreferredWidth(240);
        gridData.getColumnContainer().add(textColumn2);

        textColumn5.setColumnFilterable(true);
        textColumn5.setColumnName("baseSQL");
        textColumn5.setColumnSortable(true);
        textColumn5.setColumnVisible(false);
        textColumn5.setEditableOnEdit(true);
        textColumn5.setEditableOnInsert(true);
        textColumn5.setMaxCharacters(1000);
        textColumn5.setMaxWidth(2000);
        textColumn5.setPreferredWidth(1000);
        gridData.getColumnContainer().add(textColumn5);

        textColumn6.setColumnName("tipoPapel");
        textColumn6.setPreferredWidth(180);
        gridData.getColumnContainer().add(textColumn6);

        labelControl1.setLabel("Categoria:");

        comboBoxControl1.setDomainId(modelo.Dominios.CategoriaReporte().getDomainId());
        comboBoxControl1.setNullAsDefaultValue(true);
        comboBoxControl1.setTranslateItemDescriptions(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setMnemonic('0');
        jRadioButton1.setText("Detalle");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setMnemonic('1');
        jRadioButton2.setText("Resumen");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setMnemonic('2');
        jRadioButton3.setText("Estadistico");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Ejecutando Reporte...");

        jLabel2.setText("Estilo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estilo1", "Estilo2", "Estilo3" }));
        jComboBox1.setSelectedIndex(2);

        labelControl2.setLabel("Encabezado");

        jRadioButton4.setText("Filtrar Datos Sencillo");

        jRadioButton5.setText("Filtrar Datos Avanzado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxControl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxVOControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 153, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, labelControl2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBoxVOControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5))
                .addGap(6, 6, 6)
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxControl1, jRadioButton1, jRadioButton2, jRadioButton3, labelControl1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxVOControl1, jComboBox1, jLabel2, labelControl2});

    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl1;
    private org.openswing.swing.client.ComboBoxVOControl comboBoxVOControl1;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.GridControl gridData;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void inicializar(GridDataLocator gridDataLocator, GridController gridController, String valueObjectClassName, String titulo, boolean addToMDIFrame) {
        initComponents();
        buttonGroup2.add(jRadioButton4);
        buttonGroup2.add(jRadioButton5);
        cambioDataListener listener = new cambioDataListener();
        comboBoxControl1.addActionListener(listener);
        jRadioButton1.addActionListener(listener);
        jRadioButton2.addActionListener(listener);
        jRadioButton3.addActionListener(listener);
        jLabel1.setVisible(false);
        jPanel1.setVisible(General.usuario.getAdministrador());
        gridData.setValueObjectClassName(valueObjectClassName);
        gridData.setGridDataLocator(gridDataLocator);
        gridData.setController(gridController);

        comboBoxVOControl1.setComboDataLocator(new DefaultItemsDataLocator(Encabezado.class.getName(), null));
        comboBoxVOControl1.setComboValueObjectClassName(Encabezado.class.getName());
        comboBoxVOControl1.setAllColumnVisible(false);
        comboBoxVOControl1.setVisibleColumn("nombre", true);
        comboBoxVOControl1.setPreferredWidthColumn("nombre", 120);
        //comboBoxControl1.setSelectedIndex(0);
        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }
        MDIFrame.add(this);
    }

    @Override
    public void reloadGridsData() {
        gridData.reloadData();
    }

    @Override
    public void clearGridsData() {
    }

    @Override
    public void setOwnerVO(BeanVO beanVO) {
    }

    @Override
    public GridControl getGridControl() {
        return gridData;
    }

    public boolean isFiltroSencilloActivo(){
        return jRadioButton4.isSelected();
    }

    public boolean isFiltroAvanzadoActivo()
    {
        return jRadioButton5.isSelected();
    }

    public String getCategoria() {
        if ((Dominios.CategoriaReporte) comboBoxControl1.getValue() != null) {
            return ((Dominios.CategoriaReporte) comboBoxControl1.getValue()).name();
        } else {
            return null;
        }
    }

    public int getTipo() {
        ButtonModel b = buttonGroup1.getSelection();
        if (b != null) {
            return b.getMnemonic() - 48;
        }
        return -1;
    }

    class cambioDataListener implements java.awt.event.ActionListener {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ReportesGridFrame.this.gridData.getReloadButton().doClick();
        }
    }

    public JLabel getMensaje() {
        return jLabel1;
    }

    public String getEstilo() {
        return ((String) jComboBox1.getSelectedItem()) + ".jrtx";
    }

    public Encabezado getEncabezado() {
        return (Encabezado) comboBoxVOControl1.getComboBox().getSelectedItem();
    }
}
