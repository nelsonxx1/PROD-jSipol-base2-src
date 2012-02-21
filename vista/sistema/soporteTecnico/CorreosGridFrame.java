package vista.sistema.soporteTecnico;

import controlador.General;
import controlador.helpcenter.CorreoDetailFrameController;
import controlador.helpcenter.CorreosGridFrameController;
import modelo.Dominios;
import modelo.entidades.helpcenter.maestra.Mensaje;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.mdi.client.MDIFrame;

/**
 *
 * @author bc
 */
public class CorreosGridFrame extends InternalFrame {

    public CorreosGridFrame(CorreosGridFrameController controller) {
        initComponents();
        gridData.setGridDataLocator(controller);
        gridData.setController(controller);
        dateTimeColumn2.setColumnVisible(false);
        pack();
        MDIFrame.add(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        exportButton1 = new org.openswing.swing.client.ExportButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        gridData = new org.openswing.swing.client.GridControl();
        integerColumn1 = new org.openswing.swing.table.columns.client.IntegerColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        dateTimeColumn2 = new org.openswing.swing.table.columns.client.DateTimeColumn();

        setTitle("Soporte Técnico");

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        insertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(insertButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(exportButton1);
        jPanel1.add(navigatorBar1);

        gridData.setExportButton(exportButton1);
        gridData.setFunctionId("FunIdHelpCenter");
        gridData.setNavBar(navigatorBar1);
        gridData.setReloadButton(reloadButton1);
        gridData.setValueObjectClassName(Mensaje.class.getName());

        integerColumn1.setColumnName("id");
        integerColumn1.setPreferredWidth(40);
        gridData.getColumnContainer().add(integerColumn1);

        textColumn1.setColumnName("asunto");
        textColumn1.setPreferredWidth(160);
        gridData.getColumnContainer().add(textColumn1);

        textColumn2.setColumnName("usuarioEnvio");
        gridData.getColumnContainer().add(textColumn2);

        dateTimeColumn1.setColumnName("fechaEnvio");
        gridData.getColumnContainer().add(dateTimeColumn1);

        dateTimeColumn2.setColumnName("fechaRespuesta");
        gridData.getColumnContainer().add(dateTimeColumn2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton1ActionPerformed
        new CorreoDetailFrameController(General.empresa.getEmailSistemaSoporte(), General.empresa.getEmailEmpresaSoporte(), "as", null, true);
    }//GEN-LAST:event_insertButton1ActionPerformed

    public GridControl getGridControl() {
        return gridData;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn2;
    private org.openswing.swing.client.ExportButton exportButton1;
    private org.openswing.swing.client.GridControl gridData;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn1;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    // End of variables declaration//GEN-END:variables
}
