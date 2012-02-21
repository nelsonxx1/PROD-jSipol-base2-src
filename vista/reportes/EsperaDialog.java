package vista.reportes;

import java.awt.Frame;

/**
 *
 * @author bc
 */
public class EsperaDialog extends javax.swing.JDialog {

    public EsperaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public EsperaDialog(String titulo, String mensaje, Frame parent ,boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle(titulo);
        jOptionPane1.setMessage(mensaje);
        jOptionPane1.setMessageType(1);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();

        setTitle("Ejecutando Reporte");

        jOptionPane1.setMessage("Por Favor Espere...");
        jOptionPane1.setMessageType(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane jOptionPane1;
    // End of variables declaration//GEN-END:variables

}
