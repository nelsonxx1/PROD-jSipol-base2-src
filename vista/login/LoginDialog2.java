package vista.login;

import controlador.General;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import javax.swing.*;
import org.openswing.swing.client.OptionPane;
import org.openswing.swing.domains.java.Domain;
import org.openswing.swing.permissions.client.LoginController;
import org.openswing.swing.permissions.java.CryptUtils;
import org.openswing.swing.util.client.ClientSettings;

/**
 *
 * @author Orlando Becerra
 */
public class LoginDialog2 extends javax.swing.JDialog implements ItemListener {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storeAccountCheckBox = new javax.swing.JCheckBox();
        languagesComboBox = new org.openswing.swing.client.ComboBoxControl();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwdTF = new javax.swing.JPasswordField();
        fechaActual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        appNameLine1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fechaActualizacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        storeAccountCheckBox.setText("Recordar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(51, 255, 204));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(470, 197));
        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setText("user");

        passwordLabel.setText("password");

        usernameTF.setToolTipText("Ingrese Nombre de Usuario. (Ejem: USUARIO y usuario son diferentes)");

        passwdTF.setToolTipText("Escriba la Contraseña");

        fechaActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaActual.setText("fecha");

        jLabel1.setText("Look and Feel");

        jComboBox1.setModel(new DefaultComboBoxModel(getLnFs()));
        jComboBox1.setToolTipText("Seleccione un tipo de manejador de ventanas");

        loginButton.setText("accept");

        exitButton.setText("exit");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 145, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(fechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addGap(76, 76, 76)
                        .addComponent(exitButton)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exitButton, loginButton});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, passwordLabel, usernameLabel});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton)
                    .addComponent(loginButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {exitButton, loginButton});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jLabel1, passwdTF, passwordLabel, usernameLabel, usernameTF});

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/companyIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        appNameLine1.setFont(new java.awt.Font("Tahoma", 1, 18));
        appNameLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appNameLine1.setText(General.edition);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appNameLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appNameLine1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telefonos: 0416-6762389; 0414-3765465; 04247040614 - Email: jsipolee@gmail.com");

        fechaActualizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaActualizacion.setText(General.version);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright 2009-2010 Orlando Becerra, Nelson Moncada - Todos los Derechos Reservados");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(fechaActualizacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaActualizacion))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fechaActualizacion, jLabel5, jLabel7});

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(471, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<NombreEmpresa>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<RIFEmpresa>");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLine1;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fechaActual;
    private javax.swing.JLabel fechaActualizacion;
    private javax.swing.JLabel image;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private org.openswing.swing.client.ComboBoxControl languagesComboBox;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwdTF;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox storeAccountCheckBox;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
    /** login controller */
    private LoginController loginController = null;
    /** number of faild login attempts */
    private int attempts = 1;
    /** flag used to indicate that the login dialog is opened inside the application: if user will click on "Exit" button then the application will not be closed */
    private boolean changeLogin;
    /** parent frame; may be null */
    private JFrame parentFrame = null;
    /** flag used in windowClosed method */
    private boolean fromOtherMethod = false;
    /** store account text label */
    private String storeAccount = null;
    /** appId used to identify the application: for each distinct appId it will be stored a specific account */
    private String appId;
    /** optional cipher that can be used to encode and decode the password field; if this argument is null then no password encoding/decoding task is performed */
    private CryptUtils cipher;
    /** supported languages, i.e. collection of pairs <language id,language description>; may be null */
    private Properties supportedLanguageIds = null;
    /** current language identifier; may be null */
    private String currentLanguageIdentifier = null;

    static {
        try {
            UIManager.setLookAndFeel(ClientSettings.LOOK_AND_FEEL_CLASS_NAME);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Constructor: it shows a username + password fields.
     * A "store account" check box is showed only if "appId" and "storeAccount" arguments are not null.
     * A combo-box for language selection is showed, if "supportedLanguageIds" argument is not null.
     * @param parentFrame parent frame to use as parent of dialog window; could be set to null
     * @param changeLogin flag used to indicate that the login dialog is opened inside the application: if user will click on "Exit" button then the application will not be closed
     * @param loginController login controller
     * @param appId used to identify the application: for each distinct appId it will be stored a specific account
     * @param cipher optional cipher that can be used to encode and decode the password field; if this argument is null then no password encoding/decoding task is performed
     * @param supportedLanguageIds supported languages, i.e. collection of pairs <language id,language description>; may be null
     * @param currentLanguageIdentifier current language identifier; may be null
     */
    public LoginDialog2(
            JFrame parentFrame,
            boolean changeLogin,
            LoginController loginController,
            String appId,
            CryptUtils cipher,
            Properties supportedLanguageIds,
            String currentLanguageIdentifier) {
        super(parentFrame == null ? new JFrame("jSipol Express Edition") : parentFrame, true);

        initComponents();
        jLabel2.setText(General.empresa.getNombre());
        jLabel3.setText(General.empresa.getRif2());

        storeAccountCheckBox.setVisible(false);
        this.getRootPane().setDefaultButton(loginButton);
        SimpleDateFormat dateFormatActual = new SimpleDateFormat("EEEEE, dd'/'MM'/'yyyy");
        fechaActual.setText(dateFormatActual.format(new Date()));

        this.parentFrame = parentFrame;
        this.appId = appId;
        this.cipher = cipher;
        this.supportedLanguageIds = supportedLanguageIds;
        this.currentLanguageIdentifier = currentLanguageIdentifier;

//        Dimension dim = new Dimension(
//                (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - 190,
//                (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - 90);
//        if (parentFrame == null) {
//            super.getParent().setVisible(true);
//            super.getParent().setLocation((Toolkit.getDefaultToolkit().getScreenSize().width), (Toolkit.getDefaultToolkit().getScreenSize().height));
//        }
        this.changeLogin = changeLogin;
        this.loginController = loginController;
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (appId != null) {
            loadAccount();
        }
        pack();
        super.getParent().setLocation(-100, -100);
        super.getParent().setVisible(true);
        setVisible(true);
    }

    /**
     * Load stored account, if there exists anyone.
     */
    private void loadAccount() {
        try {
            if (cipher == null) {
                // no cipher is used for password...
                File f = new File(System.getProperty("user.home") + "/" + appId + ".acc");
                Properties p = new Properties();
                FileInputStream in = new FileInputStream(f);
                p.load(in);
                in.close();
                usernameTF.setText(p.getProperty("username"));
                passwdTF.setText(p.getProperty("password"));
                storeAccountCheckBox.setSelected(true);
            } else {
                // a cipher is used to decode password...
                File f = new File(System.getProperty("user.home") + "/" + appId + ".acc");
                FileInputStream in = new FileInputStream(f);
                byte[] bytes = new byte[(int) f.length()];
                in.read(bytes);
                in.close();

                int i = 0;
                for (i = 0; i < bytes.length; i++) {
                    if (bytes[i] == '\n') {
                        break;
                    }
                }
                if (bytes[i] == '\n') {
                    byte[] username = new byte[i];
                    byte[] password = new byte[bytes.length - i - 1];
                    System.arraycopy(bytes, 0, username, 0, username.length);
                    System.arraycopy(bytes, i + 1, password, 0, password.length);
                    usernameTF.setText(new String(username));
                    passwdTF.setText(cipher.decodeText(password));
                    storeAccountCheckBox.setSelected(true);
                }

            }

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Save account, if "store account" check box has been selected.
     */
    private void saveAccount() {
        try {
            File f = new File(System.getProperty("user.home") + "/" + appId + ".acc");
            if (storeAccountCheckBox.isSelected()) {

                if (cipher == null) {
                    // no cipher is used for password...
                    Properties p = new Properties();
                    p.setProperty("username", usernameTF.getText());
                    p.setProperty("password", new String(passwdTF.getPassword()));
                    FileOutputStream out = new FileOutputStream(f);
                    p.store(out, "Stored account for " + appId);
                    out.close();
                } else {
                    // a cipher is used to encode password...
                    byte[] username = usernameTF.getText().getBytes();
                    byte[] password = cipher.encodeText(new String(passwdTF.getPassword()));
                    FileOutputStream out = new FileOutputStream(f);
                    byte[] bytes = new byte[(int) f.length()];
                    out.write(username);
                    out.write('\n');
                    out.write(password);
                    out.close();
                }
            } else {
                f.delete();
            }
        } catch (Throwable ex) {
        }
    }

    private void jbInit() throws Exception {
        usernameTF.setColumns(15);
        usernameTF.setMinimumSize(new Dimension(usernameTF.getFontMetrics(usernameTF.getFont()).stringWidth("               "), usernameTF.getHeight()));
        passwdTF.setColumns(15);
        passwdTF.setMinimumSize(new Dimension(passwdTF.getFontMetrics(passwdTF.getFont()).stringWidth("               "), passwdTF.getHeight()));
        usernameTF.addActionListener(new LoginDialog_usernameTF_actionAdapter(this));
        passwdTF.addActionListener(new LoginDialog_passwdTF_actionAdapter(this));
        exitButton.addActionListener(new LoginDialog_exitButton_actionAdapter(this));
        loginButton.addActionListener(new LoginDialog_loginButton_actionAdapter(this));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new LoginDialog_this_windowAdapter(this));

        if (appId != null) {
            storeAccountCheckBox.setText(storeAccount);
        } else {
            storeAccountCheckBox.setEnabled(false);
        }
        if (supportedLanguageIds != null) {
            Domain domain = new Domain("LanguageSelectionInLoginDialogDomain");
            Enumeration en = supportedLanguageIds.propertyNames();
            String langId = null;
            while (en.hasMoreElements()) {
                langId = en.nextElement().toString();
                domain.addDomainPair(
                        langId,
                        supportedLanguageIds.getProperty(langId));
            }
            languagesComboBox.setDomain(domain);
            if (currentLanguageIdentifier != null) {
                languagesComboBox.setValue(currentLanguageIdentifier);
                updateLanguage(currentLanguageIdentifier);
            }
            languagesComboBox.addItemListener(this);
        } else {
            languagesComboBox.setEnabled(false);
        }
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2);
    }

    private void updateLanguage(String lang) {
        ClientSettings.getInstance().setLanguage(lang);
        //setTitle(ClientSettings.getInstance().getResources().getResource(getTitle()));
        loginButton.setText(ClientSettings.getInstance().getResources().getResource(loginButton.getText()));
        usernameLabel.setText(ClientSettings.getInstance().getResources().getResource(usernameLabel.getText()));
        passwordLabel.setText(ClientSettings.getInstance().getResources().getResource(passwordLabel.getText()));
        exitButton.setText(ClientSettings.getInstance().getResources().getResource(exitButton.getText()));

    }

    /**
     * Method invoked when changing language from combo box.
     */
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            updateLanguage((String) languagesComboBox.getValue());
        }
    }

    void loginButton_actionPerformed(ActionEvent e) {
        boolean ok = false;
        HashMap map = new HashMap();
        try {
            map.put("username", usernameTF.getText());
            if (cipher == null) {
                map.put("password", new String(passwdTF.getPassword()));
            } else {
                map.put("password", cipher.encodeText(new String(passwdTF.getPassword())));
            }

            if (!(ok = loginController.authenticateUser(map))
                    && attempts < loginController.getMaxAttempts()) {
                attempts++;
                passwdTF.requestFocus();
                return;
            }
        } catch (Throwable ex) {
            if (attempts < loginController.getMaxAttempts()) {
                OptionPane.showMessageDialog(
                        parentFrame,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                attempts++;
                passwdTF.requestFocus();
                return;
            } else {
                ok = false;
            }
        }

        if (!ok) {
            // max number of failed attempts reached: the application will be closed
            exitButton_actionPerformed(null);
            return;
        } else if (parentFrame == null) {
            this.getParent().setVisible(false);
            ((JFrame) this.getParent()).dispose();
        } else {
            parentFrame.setVisible(false);
        }

        // logon ok...
        fromOtherMethod = true;
        setVisible(false);

        if (appId != null) {
            saveAccount();
        }

        loginController.loginSuccessful(map);
    }

    void exitButton_actionPerformed(ActionEvent e) {
        fromOtherMethod = true;
        setVisible(false);
        if (!changeLogin) {
            if (parentFrame == null) {
                this.getParent().setVisible(false);
                ((JFrame) this.getParent()).dispose();
            }
            loginController.stopApplication();
        }
    }

    void usernameTF_actionPerformed(ActionEvent e) {
        loginButton_actionPerformed(null);
    }

    void passwdTF_actionPerformed(ActionEvent e) {
        loginButton_actionPerformed(null);
    }

    void this_windowClosed(WindowEvent e) {
        if (!fromOtherMethod && !changeLogin) {
            if (parentFrame == null) {
                this.getParent().setVisible(false);
                ((JFrame) this.getParent()).dispose();
            }
            loginController.stopApplication();
        }
    }

    public String getLnF() {
        return ((LnF) jComboBox1.getSelectedItem()).lnf;
    }

    private LnF[] getLnFs() {
        return new LnF[]{
                    new LnF("Tiny", "de.muntjak.tinylookandfeel.TinyLookAndFeel"),
                    new LnF("Nimbus", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"),
                    new LnF("Lipstik", "com.lipstikLF.LipstikLookAndFeel"),
                    new LnF("Plastic3D", "com.jgoodies.looks.plastic.Plastic3DLookAndFeel"),
                    new LnF("PlasticXP", "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"),
                    new LnF("Oracle", "oracle.bali.ewt.olaf.OracleLookAndFeel"),
                    new LnF("CrossPlatform", javax.swing.UIManager.getCrossPlatformLookAndFeelClassName()),
                    new LnF("System", javax.swing.UIManager.getSystemLookAndFeelClassName())
                };
    }
}

class LnF {

    String nombre;
    String lnf;

    public LnF(String nombre, String lnf) {
        this.nombre = nombre;
        this.lnf = lnf;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

class LoginDialog_loginButton_actionAdapter implements java.awt.event.ActionListener {

    LoginDialog2 adaptee;

    LoginDialog_loginButton_actionAdapter(LoginDialog2 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.loginButton_actionPerformed(e);
    }
}

class LoginDialog_exitButton_actionAdapter implements java.awt.event.ActionListener {

    LoginDialog2 adaptee;

    LoginDialog_exitButton_actionAdapter(LoginDialog2 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.exitButton_actionPerformed(e);
    }
}

class LoginDialog_passwdTF_actionAdapter implements java.awt.event.ActionListener {

    LoginDialog2 adaptee;

    LoginDialog_passwdTF_actionAdapter(LoginDialog2 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.passwdTF_actionPerformed(e);
    }
}

class LoginDialog_this_windowAdapter extends java.awt.event.WindowAdapter {

    LoginDialog2 adaptee;

    LoginDialog_this_windowAdapter(LoginDialog2 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void windowClosed(WindowEvent e) {
        adaptee.this_windowClosed(e);
    }
}

class LoginDialog_usernameTF_actionAdapter implements java.awt.event.ActionListener {

    LoginDialog2 adaptee;

    LoginDialog_usernameTF_actionAdapter(LoginDialog2 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.usernameTF_actionPerformed(e);
    }
}
