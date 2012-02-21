package vista.splash;

import controlador.General;
import java.awt.Image;
import java.awt.Toolkit;

public class Splash extends javax.swing.JFrame {

    public static Image splash;

    public Splash() {
        initComponents();
        setSize(410, 220);
        splash = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/splash.png"));
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2, ((Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2)-35);
        setVisible(true);
    }

    public void setValue(String texto, int value) {
        jLabel2.setText(" " + texto);
        jProgressBar1.setValue(value);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        appNameLine3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fechaActualizacion = new javax.swing.JLabel();
        appNameLine1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        appNameLine2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("jSipol Express Edition");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        appNameLine3.setFont(new java.awt.Font("Tahoma", 0, 14));
        appNameLine3.setForeground(new java.awt.Color(51, 51, 51));
        appNameLine3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        appNameLine3.setText(General.edition);
        jPanel1.add(appNameLine3);
        appNameLine3.setBounds(90, 90, 280, 30);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(20, 140, 370, 7);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Estado");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 380, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 160, 390, 10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright 2009-2010 Orlando Becerra, Nelson Moncada- Todos los Derechos Reservados");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 170, 410, 11);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telefonos: 0416-6762389; 0414-3765465; 0424-7040614 - Email: jsipolee@gmail.com");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 185, 410, 11);

        fechaActualizacion.setFont(new java.awt.Font("Tahoma", 0, 9));
        fechaActualizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaActualizacion.setText(General.version);
        jPanel1.add(fechaActualizacion);
        fechaActualizacion.setBounds(0, 200, 410, 11);

        appNameLine1.setFont(new java.awt.Font("Tahoma", 1, 25));
        appNameLine1.setForeground(new java.awt.Color(51, 51, 51));
        appNameLine1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        appNameLine1.setText(General.splashLine2);
        jPanel1.add(appNameLine1);
        appNameLine1.setBounds(90, 50, 280, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/java_logo.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 90, 110);

        appNameLine2.setFont(new java.awt.Font("Tahoma", 1, 22));
        appNameLine2.setForeground(new java.awt.Color(51, 51, 51));
        appNameLine2.setText("Sistema Integrado de");
        jPanel1.add(appNameLine2);
        appNameLine2.setBounds(90, 10, 300, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLine1;
    private javax.swing.JLabel appNameLine2;
    private javax.swing.JLabel appNameLine3;
    private javax.swing.JLabel fechaActualizacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
