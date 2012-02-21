package vista.PictureCapture;

import controlador.PictureCapture.PictureCaptureDialogController;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.util.client.ClientUtils;

/**
 *
 * @author bc
 */
public class PictureCaptureDialog extends javax.swing.JDialog {

    public PictureCaptureDialog(Component owner, PictureCaptureDialogController controller) {
        super(MDIFrame.getInstance(), true);
        initComponents();
        ClientUtils.centerDialog(MDIFrame.getInstance(), this);
        jButton1.addActionListener(controller);
        jButton2.addActionListener(controller);
        jButton4.addActionListener(controller);
        jButton3.addActionListener(controller);
        addWindowListener(controller);
    }

    public JPanel getVideoPanel() {
        return jPanel1;
    }

    public JComponent getPicturePanel() {
        return jLabel1;
    }

    public JButton getCaptureButton() {
        return jButton1;
    }

    public JButton getPreviewButton() {
        return jButton2;
    }

    public JButton getCancelButton() {
        return jButton4;
    }

    public JButton getSaveButton() {
        return jButton3;
    }

    public void setPicture(Icon icon) {
        jLabel1.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Captura Automatica");

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setMinimumSize(new java.awt.Dimension(320, 240));
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/camera2.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(33, 33));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video2.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(33, 33));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check1.png"))); // NOI18N
        jButton3.setEnabled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(33, 33));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel2.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(33, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
