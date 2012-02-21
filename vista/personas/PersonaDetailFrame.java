package vista.personas;

import controlador.General;
import controlador.personas.TipoPersonaLookupController;
import controlador.util.DefaultLookupController;
import controlador.personas.PersonaLookupController;
import controlador.personas.CodigoAreaLookupController;
import controlador.personas.DireccionesGridInternalController;
import controlador.personas.TelefonoGridIneternalController;
import controlador.documentosAnexos.TipoDocumentoLookupController;
import controlador.helpcenter.CorreoDetailFrameController;
import controlador.util.DefaultDocumentosAnexosGridController;
import controlador.util.DefaultGridInternalController;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Dominios;
import modelo.Dominios.TipoRifEnum;
import modelo.entidades.Documento;
import modelo.entidades.Observacion;
import modelo.entidades.personas.dominio.TipoActividadEconomica;
import modelo.entidades.personas.dominio.TipoCapacidadEconomica;
import modelo.entidades.personas.dominio.TipoCodigoArea;
import modelo.entidades.personas.dominio.TipoCuentaBancaria;
import modelo.entidades.personas.dominio.TipoDireccion;
import modelo.entidades.personas.dominio.TipoPersona;
import modelo.entidades.personas.dominio.TipoTelefono2;
import modelo.entidades.personas.maestra.Persona;
import modelo.entidades.personas.maestra.PersonaJuridica;
import modelo.entidades.personas.maestra.PersonaNatural;
import modelo.entidades.personas.maestra.Sucursal;
import modelo.entidades.personas.transac.CuentaBancariaPersona;
import modelo.entidades.personas.transac.DireccionPersona;
import modelo.entidades.personas.transac.TelefonoPersona;
import modelo.util.bean.BeanVO;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.util.java.Consts;
import vista.util.DefaultDetailFrame;

/**
 *
 * @author Orlando Becerra
 */
public class PersonaDetailFrame extends DefaultDetailFrame {

    private TipoRifEnum tipoPersonaEnum;
    private DefaultGridInternalController controllerCuentasBancarias;
    private DefaultDocumentosAnexosGridController controllerDocumentosAnexosX;
    private DefaultGridInternalController controllerObservaciones;
    private DefaultGridInternalController controllerDirecciones;
    private DefaultGridInternalController controllerTelefonos;
    private DefaultGridInternalController controllerTipoPersona;
    private DefaultGridInternalController controllerSucursales;
    private DefaultGridInternalController controllerDireccionesSucursal;
    private DefaultGridInternalController controllerTelefonosSucursal;

    public PersonaDetailFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        datosNatural = new javax.swing.JPanel();
        formNatu = new org.openswing.swing.form.client.Form();
        jPanel2 = new javax.swing.JPanel();
        id_perNat_lab = new org.openswing.swing.client.LabelControl();
        id_perNat = new org.openswing.swing.client.NumericControl();
        labelControl5 = new org.openswing.swing.client.LabelControl();
        textControl2 = new org.openswing.swing.client.TextControl();
        labelControl4 = new org.openswing.swing.client.LabelControl();
        textControl10 = new org.openswing.swing.client.TextControl();
        labelControl14 = new org.openswing.swing.client.LabelControl();
        comboBoxControl4 = new org.openswing.swing.client.ComboBoxControl();
        labelControl11 = new org.openswing.swing.client.LabelControl();
        textControl5 = new org.openswing.swing.client.TextControl();
        labelControl12 = new org.openswing.swing.client.LabelControl();
        textControl6 = new org.openswing.swing.client.TextControl();
        labelControl15 = new org.openswing.swing.client.LabelControl();
        textControl8 = new org.openswing.swing.client.TextControl();
        labelControl16 = new org.openswing.swing.client.LabelControl();
        textControl9 = new org.openswing.swing.client.TextControl();
        labelControl18 = new org.openswing.swing.client.LabelControl();
        comboBoxControl5 = new org.openswing.swing.client.ComboBoxControl();
        labelControl19 = new org.openswing.swing.client.LabelControl();
        comboBoxControl6 = new org.openswing.swing.client.ComboBoxControl();
        jButton1 = new javax.swing.JButton();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        textControl21 = new org.openswing.swing.client.TextControl();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        textControl22 = new org.openswing.swing.client.TextControl();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        labelControl41 = new org.openswing.swing.client.LabelControl();
        textControl26 = new org.openswing.swing.client.TextControl();
        jPanel32 = new javax.swing.JPanel();
        labelControl22 = new org.openswing.swing.client.LabelControl();
        textControl12 = new org.openswing.swing.client.TextControl();
        labelControl21 = new org.openswing.swing.client.LabelControl();
        textControl11 = new org.openswing.swing.client.TextControl();
        labelControl20 = new org.openswing.swing.client.LabelControl();
        dateControl2 = new org.openswing.swing.client.DateControl();
        labelControl9 = new org.openswing.swing.client.LabelControl();
        dateControl1 = new org.openswing.swing.client.DateControl();
        labelControl10 = new org.openswing.swing.client.LabelControl();
        codLookupControl1 = new org.openswing.swing.client.CodLookupControl();
        labelControl13 = new org.openswing.swing.client.LabelControl();
        codLookupControl2 = new org.openswing.swing.client.CodLookupControl();
        labelControl23 = new org.openswing.swing.client.LabelControl();
        textControl13 = new org.openswing.swing.client.TextControl();
        labelControl24 = new org.openswing.swing.client.LabelControl();
        textControl14 = new org.openswing.swing.client.TextControl();
        labelControl8 = new org.openswing.swing.client.LabelControl();
        comboBoxControl3 = new org.openswing.swing.client.ComboBoxControl();
        checkBoxControl2 = new org.openswing.swing.client.CheckBoxControl();
        textControl4 = new org.openswing.swing.client.TextControl();
        textControl7 = new org.openswing.swing.client.TextControl();
        labelControl7 = new org.openswing.swing.client.LabelControl();
        comboBoxControl2 = new org.openswing.swing.client.ComboBoxControl();
        checkBoxControl5 = new org.openswing.swing.client.CheckBoxControl();
        labelControl42 = new org.openswing.swing.client.LabelControl();
        numericControl1 = new org.openswing.swing.client.NumericControl();
        labelControl43 = new org.openswing.swing.client.LabelControl();
        numericControl2 = new org.openswing.swing.client.NumericControl();
        barraNatural = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        insertButton39 = new org.openswing.swing.client.InsertButton();
        deleteButton39 = new org.openswing.swing.client.DeleteButton();
        gridControl7 = new org.openswing.swing.client.GridControl();
        textColumn12 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn11 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel29 = new javax.swing.JPanel();
        labelControl44 = new org.openswing.swing.client.LabelControl();
        textControl27 = new org.openswing.swing.client.TextControl();
        labelControl45 = new org.openswing.swing.client.LabelControl();
        textControl28 = new org.openswing.swing.client.TextControl();
        labelControl46 = new org.openswing.swing.client.LabelControl();
        labelControl47 = new org.openswing.swing.client.LabelControl();
        dateControl5 = new org.openswing.swing.client.DateControl();
        dateControl6 = new org.openswing.swing.client.DateControl();
        datosJuridica = new javax.swing.JPanel();
        barraJuridica = new javax.swing.JPanel();
        editButton2 = new org.openswing.swing.client.EditButton();
        saveButton2 = new org.openswing.swing.client.SaveButton();
        reloadButton2 = new org.openswing.swing.client.ReloadButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        formJuri = new org.openswing.swing.form.client.Form();
        jPanel30 = new javax.swing.JPanel();
        labelControl25 = new org.openswing.swing.client.LabelControl();
        numericControl4 = new org.openswing.swing.client.NumericControl();
        labelControl26 = new org.openswing.swing.client.LabelControl();
        textControl3 = new org.openswing.swing.client.TextControl();
        labelControl27 = new org.openswing.swing.client.LabelControl();
        textControl20 = new org.openswing.swing.client.TextControl();
        labelControl28 = new org.openswing.swing.client.LabelControl();
        textControl15 = new org.openswing.swing.client.TextControl();
        labelControl29 = new org.openswing.swing.client.LabelControl();
        textControl16 = new org.openswing.swing.client.TextControl();
        labelControl31 = new org.openswing.swing.client.LabelControl();
        comboBoxControl9 = new org.openswing.swing.client.ComboBoxControl();
        labelControl32 = new org.openswing.swing.client.LabelControl();
        dateControl3 = new org.openswing.swing.client.DateControl();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        dateControl4 = new org.openswing.swing.client.DateControl();
        jButton2 = new javax.swing.JButton();
        labelControl6 = new org.openswing.swing.client.LabelControl();
        textControl23 = new org.openswing.swing.client.TextControl();
        labelControl17 = new org.openswing.swing.client.LabelControl();
        textControl24 = new org.openswing.swing.client.TextControl();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        labelControl35 = new org.openswing.swing.client.LabelControl();
        textControl19 = new org.openswing.swing.client.TextControl();
        labelControl36 = new org.openswing.swing.client.LabelControl();
        textControl18 = new org.openswing.swing.client.TextControl();
        labelControl33 = new org.openswing.swing.client.LabelControl();
        codLookupControl3 = new org.openswing.swing.client.CodLookupControl();
        labelControl34 = new org.openswing.swing.client.LabelControl();
        codLookupControl5 = new org.openswing.swing.client.CodLookupControl();
        labelControl37 = new org.openswing.swing.client.LabelControl();
        currencyControl3 = new org.openswing.swing.client.CurrencyControl();
        labelControl38 = new org.openswing.swing.client.LabelControl();
        currencyControl1 = new org.openswing.swing.client.CurrencyControl();
        labelControl39 = new org.openswing.swing.client.LabelControl();
        currencyControl2 = new org.openswing.swing.client.CurrencyControl();
        checkBoxControl3 = new org.openswing.swing.client.CheckBoxControl();
        checkBoxControl4 = new org.openswing.swing.client.CheckBoxControl();
        textControl1 = new org.openswing.swing.client.TextControl();
        textControl17 = new org.openswing.swing.client.TextControl();
        labelControl30 = new org.openswing.swing.client.LabelControl();
        comboBoxControl8 = new org.openswing.swing.client.ComboBoxControl();
        labelControl40 = new org.openswing.swing.client.LabelControl();
        textControl25 = new org.openswing.swing.client.TextControl();
        jPanel3 = new javax.swing.JPanel();
        datosGenerales = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        gridControl1 = new org.openswing.swing.client.GridControl();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        codLookupColumn1 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        codLookupColumn3 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel6 = new javax.swing.JPanel();
        insertButton3 = new org.openswing.swing.client.InsertButton();
        editButton3 = new org.openswing.swing.client.EditButton();
        deleteButton3 = new org.openswing.swing.client.DeleteButton();
        saveButton3 = new org.openswing.swing.client.SaveButton();
        reloadButton3 = new org.openswing.swing.client.ReloadButton();
        filterButton3 = new org.openswing.swing.client.FilterButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        gridControl3 = new org.openswing.swing.client.GridControl();
        buttonColumn1 = new org.openswing.swing.table.columns.client.ButtonColumn();
        integerColumn1 = new org.openswing.swing.table.columns.client.IntegerColumn();
        codLookupColumn2 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn1 = new org.openswing.swing.table.columns.client.DateColumn();
        jPanel11 = new javax.swing.JPanel();
        insertButton5 = new org.openswing.swing.client.InsertButton();
        editButton5 = new org.openswing.swing.client.EditButton();
        deleteButton5 = new org.openswing.swing.client.DeleteButton();
        saveButton5 = new org.openswing.swing.client.SaveButton();
        reloadButton5 = new org.openswing.swing.client.ReloadButton();
        filterButton5 = new org.openswing.swing.client.FilterButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel12 = new javax.swing.JPanel();
        gridControl4 = new org.openswing.swing.client.GridControl();
        decimalColumn4 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel13 = new javax.swing.JPanel();
        insertButton6 = new org.openswing.swing.client.InsertButton();
        editButton6 = new org.openswing.swing.client.EditButton();
        deleteButton6 = new org.openswing.swing.client.DeleteButton();
        saveButton6 = new org.openswing.swing.client.SaveButton();
        reloadButton6 = new org.openswing.swing.client.ReloadButton();
        filterButton6 = new org.openswing.swing.client.FilterButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        datosUbicacion = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        gridControl2 = new org.openswing.swing.client.GridControl();
        decimalColumn2 = new org.openswing.swing.table.columns.client.DecimalColumn();
        codLookupColumn5 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel15 = new javax.swing.JPanel();
        insertButton4 = new org.openswing.swing.client.InsertButton();
        editButton4 = new org.openswing.swing.client.EditButton();
        deleteButton4 = new org.openswing.swing.client.DeleteButton();
        saveButton4 = new org.openswing.swing.client.SaveButton();
        reloadButton4 = new org.openswing.swing.client.ReloadButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel16 = new javax.swing.JPanel();
        gridControl5 = new org.openswing.swing.client.GridControl();
        decimalColumn5 = new org.openswing.swing.table.columns.client.DecimalColumn();
        codLookupColumn6 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        codLookupColumn4 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn9 = new org.openswing.swing.table.columns.client.TextColumn();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        jPanel17 = new javax.swing.JPanel();
        insertButton7 = new org.openswing.swing.client.InsertButton();
        editButton7 = new org.openswing.swing.client.EditButton();
        deleteButton7 = new org.openswing.swing.client.DeleteButton();
        saveButton7 = new org.openswing.swing.client.SaveButton();
        reloadButton7 = new org.openswing.swing.client.ReloadButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        datosSucursal = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        gridControl10 = new org.openswing.swing.client.GridControl();
        decimalColumn9 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn17 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn18 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel28 = new javax.swing.JPanel();
        insertButton11 = new org.openswing.swing.client.InsertButton();
        editButton11 = new org.openswing.swing.client.EditButton();
        deleteButton11 = new org.openswing.swing.client.DeleteButton();
        saveButton11 = new org.openswing.swing.client.SaveButton();
        reloadButton11 = new org.openswing.swing.client.ReloadButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jPanel23 = new javax.swing.JPanel();
        gridControl8 = new org.openswing.swing.client.GridControl();
        decimalColumn7 = new org.openswing.swing.table.columns.client.DecimalColumn();
        codLookupColumn7 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumn13 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn14 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel24 = new javax.swing.JPanel();
        insertButton9 = new org.openswing.swing.client.InsertButton();
        editButton9 = new org.openswing.swing.client.EditButton();
        deleteButton9 = new org.openswing.swing.client.DeleteButton();
        saveButton9 = new org.openswing.swing.client.SaveButton();
        reloadButton9 = new org.openswing.swing.client.ReloadButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jPanel25 = new javax.swing.JPanel();
        gridControl9 = new org.openswing.swing.client.GridControl();
        decimalColumn8 = new org.openswing.swing.table.columns.client.DecimalColumn();
        codLookupColumn8 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        codLookupColumn9 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        decimalColumn10 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn16 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel26 = new javax.swing.JPanel();
        insertButton10 = new org.openswing.swing.client.InsertButton();
        editButton10 = new org.openswing.swing.client.EditButton();
        deleteButton10 = new org.openswing.swing.client.DeleteButton();
        saveButton10 = new org.openswing.swing.client.SaveButton();
        reloadButton10 = new org.openswing.swing.client.ReloadButton();
        jToggleButton8 = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Persona");
        setMinimumSize(new java.awt.Dimension(700, 661));
        setPreferredSize(new java.awt.Dimension(700, 661));

        formNatu.setVOClassName(PersonaNatural.class.getName());
        formNatu.setEditButton(editButton1);
        formNatu.setReloadButton(reloadButton1);
        formNatu.setSaveButton(saveButton1);
        formNatu.setLayout(new java.awt.GridLayout(1, 2));

        id_perNat_lab.setLabel("id");

        id_perNat.setAttributeName("id");
        id_perNat.setCanCopy(false);
        id_perNat.setEnabledOnEdit(false);
        id_perNat.setEnabledOnInsert(false);
        id_perNat.setLinkLabel(id_perNat_lab);
        id_perNat.setToolTipText("Codigo generado por el sistema");

        labelControl5.setLabel("codigoArchivo");

        textControl2.setAttributeName("codigoArchivo");
        textControl2.setToolTipText("Codigo del Archivo Fisico de la persona");

        labelControl4.setLabel("cedula");

        textControl10.setAttributeName("rif.rif");
        textControl10.setEnabledOnEdit(false);
        textControl10.setEnabledOnInsert(false);
        textControl10.setToolTipText("Cedula de la persona");

        labelControl14.setLabel("tipoNombre");

        comboBoxControl4.setAttributeName("tipoNombre");
        comboBoxControl4.setDomainId(Dominios.TipoNombre().getDomainId());
        comboBoxControl4.setToolTipText("Identifica que tipo de persona es, Sr., Sra, Ing, Lic");

        labelControl11.setLabel("primerApellido");

        textControl5.setAttributeName("primerApellido");
        textControl5.setLinkLabel(labelControl11);
        textControl5.setMaxCharacters(40);
        textControl5.setRequired(true);
        textControl5.setToolTipText("Primer Apellido de la persona");
        textControl5.setTrimText(true);
        textControl5.setUpperCase(true);

        labelControl12.setLabel("segundoApellido");

        textControl6.setAttributeName("segundoApellido");
        textControl6.setMaxCharacters(40);
        textControl6.setToolTipText("Segundo apellido de la persona (Si tiene mas de dos apellidos, colocarlos en este campo)");
        textControl6.setTrimText(true);
        textControl6.setUpperCase(true);

        labelControl15.setLabel("primerNombre");

        textControl8.setAttributeName("primerNombre");
        textControl8.setLinkLabel(labelControl15);
        textControl8.setMaxCharacters(40);
        textControl8.setRequired(true);
        textControl8.setToolTipText("Primer nombre de la persona");
        textControl8.setTrimText(true);
        textControl8.setUpperCase(true);

        labelControl16.setLabel("segundoNombre");

        textControl9.setAttributeName("segundoNombre");
        textControl9.setMaxCharacters(40);
        textControl9.setToolTipText("Segundo nombre de la persona (Si contiene mas de dos nombres la persona, colocarlos en este campo)");
        textControl9.setTrimText(true);
        textControl9.setUpperCase(true);

        labelControl18.setLabel("sexo");

        comboBoxControl5.setAttributeName("sexo");
        comboBoxControl5.setDomainId(Dominios.Sexo().getDomainId());
        comboBoxControl5.setLinkLabel(labelControl18);
        comboBoxControl5.setToolTipText("Sexo de la persona");

        labelControl19.setLabel("estadoCivil");

        comboBoxControl6.setAttributeName("estadoCivil");
        comboBoxControl6.setDomainId(Dominios.EstadoCivil().getDomainId());
        comboBoxControl6.setToolTipText("Estado Civil de la persona");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelControl2.setLabel("email");

        textControl21.setAttributeName("email");
        textControl21.setToolTipText("Email de la persona");

        labelControl3.setLabel("web");

        textControl22.setAttributeName("web");
        textControl22.setToolTipText("Direccion de la pagina web de la persona");

        jButton3.setText("...");
        jButton3.setToolTipText("Abre la pagina web de la persona");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("...");
        jButton4.setToolTipText("Abre una ventana para enviar un email a la persona");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        labelControl41.setLabel("alias");

        textControl26.setAttributeName("alias2");
        textControl26.setToolTipText("Nombre corto por medio del cual se identifica la persona");
        textControl26.setUpperCase(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_perNat_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textControl6, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(id_perNat, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(textControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(comboBoxControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(textControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(textControl8, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(textControl10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl9, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl26, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(comboBoxControl6, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textControl21, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textControl22, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {id_perNat_lab, labelControl11, labelControl12, labelControl14, labelControl15, labelControl16, labelControl18, labelControl19, labelControl2, labelControl3, labelControl4, labelControl41, labelControl5});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_perNat_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_perNat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelControl19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxControl4, comboBoxControl5, comboBoxControl6, id_perNat, id_perNat_lab, jButton1, labelControl11, labelControl12, labelControl14, labelControl15, labelControl16, labelControl18, labelControl19, labelControl2, labelControl3, labelControl4, labelControl41, labelControl5, textControl10, textControl2, textControl21, textControl22, textControl26, textControl5, textControl6, textControl8, textControl9});

        formNatu.add(jPanel2);

        labelControl22.setLabel("estadoNacimiento");

        textControl12.setAttributeName("estadoNacimiento");
        textControl12.setToolTipText("Estado en el cual nacio la persona (Táchira, Merida,...)");
        textControl12.setUpperCase(true);

        labelControl21.setLabel("ciudadNacimiento");

        textControl11.setAttributeName("ciudadNacimiento");
        textControl11.setToolTipText("Ciudad en la cual nacio la persona");
        textControl11.setUpperCase(true);

        labelControl20.setLabel("fechaNacimiento");

        dateControl2.setAttributeName("fechaNacimiento");

        labelControl9.setLabel("fechaUltimoBalance");

        dateControl1.setAttributeName("fechaUltimoBalance");

        labelControl10.setLabel("capacidadEconomica");

        codLookupControl1.setAllowOnlyNumbers(true);
        codLookupControl1.setAttributeName("capacidadEconomica.id");
        codLookupControl1.setCodBoxVisible(false);
        codLookupControl1.setControllerMethodName("getTipoCapacidadEconomica");
        codLookupControl1.setMaxCharacters(2);

        labelControl13.setLabel("actividadEconomica");

        codLookupControl2.setAllowOnlyNumbers(true);
        codLookupControl2.setAttributeName("actividadEconomica.id");
        codLookupControl2.setCodBoxVisible(false);
        codLookupControl2.setControllerMethodName("getTipoActividadEconomica");
        codLookupControl2.setMaxCharacters(2);

        labelControl23.setLabel("profecion");

        textControl13.setAttributeName("profecion");
        textControl13.setUpperCase(true);

        labelControl24.setLabel("ocupacion");

        textControl14.setAttributeName("ocupacion");
        textControl14.setUpperCase(true);

        labelControl8.setLabel("tipoContribuyente");

        comboBoxControl3.setAttributeName("tipoContribuyente");
        comboBoxControl3.setDomainId(Dominios.TipoContribuyente().getDomainId());

        checkBoxControl2.setText("gobierno");
        checkBoxControl2.setAttributeName("gobierno");

        textControl4.setAttributeName("capacidadEconomica.nombre");
        textControl4.setEnabledOnEdit(false);
        textControl4.setEnabledOnInsert(false);
        textControl4.setLinkLabel(labelControl10);

        textControl7.setAttributeName("actividadEconomica.nombre");
        textControl7.setEnabledOnEdit(false);
        textControl7.setEnabledOnInsert(false);

        labelControl7.setLabel("ranking");

        comboBoxControl2.setAttributeName("ranking");
        comboBoxControl2.setDomainId(Dominios.Ranking().getDomainId());

        checkBoxControl5.setSelected(true);
        checkBoxControl5.setText("activo");
        checkBoxControl5.setAttributeName("auditoria.activo");

        labelControl42.setLabel("peso");

        numericControl1.setAttributeName("peso");

        labelControl43.setLabel("altura");

        numericControl2.setAttributeName("altura");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(textControl11, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(textControl12, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(textControl13, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(textControl14, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(codLookupControl2, javax.swing.GroupLayout.Alignment.LEADING, 0, 47, Short.MAX_VALUE)
                                    .addComponent(codLookupControl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textControl7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(textControl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(labelControl7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(labelControl43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(checkBoxControl5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelControl8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(comboBoxControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(numericControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(numericControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel32Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelControl10, labelControl13, labelControl20, labelControl21, labelControl22, labelControl23, labelControl24, labelControl42, labelControl43, labelControl7, labelControl8, labelControl9});

        jPanel32Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {codLookupControl1, codLookupControl2});

        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textControl12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelControl22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dateControl1, 0, 22, Short.MAX_VALUE)
                    .addComponent(labelControl9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxControl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel32Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {codLookupControl1, codLookupControl2, comboBoxControl2, dateControl1, dateControl2, labelControl10, labelControl13, labelControl20, labelControl21, labelControl22, labelControl23, labelControl24, labelControl7, labelControl9, textControl11, textControl12, textControl13, textControl14, textControl4, textControl7});

        jPanel32Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkBoxControl2, comboBoxControl3, labelControl8});

        formNatu.add(jPanel32);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/36.png"))); // NOI18N
        jButton7.setToolTipText("Enviar SMS a esta Persona");
        jButton7.setPreferredSize(new java.awt.Dimension(33, 33));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.png"))); // NOI18N
        jButton9.setToolTipText("Enviar Email al Contratante");
        jButton9.setPreferredSize(new java.awt.Dimension(33, 33));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraNaturalLayout = new javax.swing.GroupLayout(barraNatural);
        barraNatural.setLayout(barraNaturalLayout);
        barraNaturalLayout.setHorizontalGroup(
            barraNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraNaturalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        barraNaturalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editButton1, reloadButton1, saveButton1});

        barraNaturalLayout.setVerticalGroup(
            barraNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraNaturalLayout.createSequentialGroup()
                .addGroup(barraNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        barraNaturalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editButton1, reloadButton1, saveButton1});

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Persona"));

        jPanel21.setLayout(new java.awt.GridLayout(2, 1, 1, 2));

        insertButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton39ActionPerformed(evt);
            }
        });
        jPanel21.add(insertButton39);
        jPanel21.add(deleteButton39);

        gridControl7.setDeleteButton(deleteButton39);
        gridControl7.setFunctionId("FunIdTPAdd");
        gridControl7.setValueObjectClassName(TipoPersona.class.getName());
        gridControl7.setVisibleStatusPanel(false);

        textColumn12.setColumnName("idPropio");
        textColumn12.setPreferredWidth(55);
        gridControl7.getColumnContainer().add(textColumn12);

        textColumn11.setColumnName("nombre");
        textColumn11.setPreferredWidth(150);
        gridControl7.getColumnContainer().add(textColumn11);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl7, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(gridControl7, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel20);

        labelControl44.setLabel("auditoria.usuarioInsert.nombre");

        textControl27.setAttributeName("auditoria.usuarioInsert");
        textControl27.setEnabled(false);
        textControl27.setEnabledOnEdit(false);
        textControl27.setEnabledOnInsert(false);
        textControl27.setToolTipText("");

        labelControl45.setLabel("auditoria.usuarioInsert.nombre");

        textControl28.setAttributeName("auditoria.usuarioUpdate");
        textControl28.setEnabled(false);
        textControl28.setEnabledOnEdit(false);
        textControl28.setEnabledOnInsert(false);
        textControl28.setToolTipText("");

        labelControl46.setLabel("auditoria.fechaInsert");

        labelControl47.setLabel("auditoria.fechaUpdate");

        dateControl5.setAttributeName("auditoria.fechaInsert");
        dateControl5.setEnabled(false);
        dateControl5.setEnabledOnEdit(false);
        dateControl5.setEnabledOnInsert(false);

        dateControl6.setAttributeName("auditoria.fechaUpdate");
        dateControl6.setEnabled(false);
        dateControl6.setEnabledOnEdit(false);
        dateControl6.setEnabledOnInsert(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(labelControl44, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl27, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(labelControl46, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(labelControl45, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl28, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(labelControl47, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl6, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textControl27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelControl44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textControl28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelControl45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel29);

        javax.swing.GroupLayout datosNaturalLayout = new javax.swing.GroupLayout(datosNatural);
        datosNatural.setLayout(datosNaturalLayout);
        datosNaturalLayout.setHorizontalGroup(
            datosNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosNaturalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(formNatu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(barraNatural, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        datosNaturalLayout.setVerticalGroup(
            datosNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosNaturalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formNatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Personales", datosNatural);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/36.png"))); // NOI18N
        jButton8.setToolTipText("Enviar SMS a esta Persona");
        jButton8.setPreferredSize(new java.awt.Dimension(33, 33));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.png"))); // NOI18N
        jButton10.setToolTipText("Enviar Email al Contratante");
        jButton10.setPreferredSize(new java.awt.Dimension(33, 33));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraJuridicaLayout = new javax.swing.GroupLayout(barraJuridica);
        barraJuridica.setLayout(barraJuridicaLayout);
        barraJuridicaLayout.setHorizontalGroup(
            barraJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        barraJuridicaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editButton2, reloadButton2, saveButton2});

        barraJuridicaLayout.setVerticalGroup(
            barraJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraJuridicaLayout.createSequentialGroup()
                .addGroup(barraJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reloadButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        barraJuridicaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editButton2, reloadButton2, saveButton2});

        formJuri.setVOClassName(PersonaJuridica.class.getName());
        formJuri.setEditButton(editButton2);
        formJuri.setReloadButton(reloadButton2);
        formJuri.setSaveButton(saveButton2);
        formJuri.setLayout(new java.awt.GridLayout(1, 2));

        labelControl25.setLabel("id");

        numericControl4.setAttributeName("id");
        numericControl4.setCanCopy(false);
        numericControl4.setEnabledOnEdit(false);
        numericControl4.setEnabledOnInsert(false);
        numericControl4.setLinkLabel(id_perNat_lab);

        labelControl26.setLabel("codigoArchivo");

        textControl3.setAttributeName("codigoArchivo");

        labelControl27.setLabel("cedula");

        textControl20.setAttributeName("rif.cedulaCompleta");
        textControl20.setEnabledOnEdit(false);
        textControl20.setEnabledOnInsert(false);
        textControl20.setRequired(true);

        labelControl28.setLabel("nombreLargo");

        textControl15.setAttributeName("nombreLargo");
        textControl15.setRequired(true);
        textControl15.setTrimText(true);
        textControl15.setUpperCase(true);

        labelControl29.setLabel("nombreCorto");

        textControl16.setAttributeName("nombreCorto");
        textControl16.setRequired(true);
        textControl16.setTrimText(true);
        textControl16.setUpperCase(true);

        labelControl31.setLabel("tipoContribuyente");

        comboBoxControl9.setAttributeName("tipoContribuyente");
        comboBoxControl9.setDomainId(Dominios.TipoContribuyente().getDomainId());

        labelControl32.setLabel("fechaUltimoBalance");

        dateControl3.setAttributeName("fechaUltimoBalance");

        labelControl1.setLabel("fechaRegistro");

        dateControl4.setAttributeName("fechaRegistro");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelControl6.setLabel("email");

        textControl23.setAttributeName("email");

        labelControl17.setLabel("web");

        textControl24.setAttributeName("web");

        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("...");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(numericControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(textControl15, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(textControl16, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                                .addComponent(textControl20, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(labelControl32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textControl24, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(textControl23, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboBoxControl9, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel30Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelControl1, labelControl17, labelControl25, labelControl26, labelControl27, labelControl28, labelControl29, labelControl31, labelControl32, labelControl6});

        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboBoxControl9, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(labelControl31, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textControl23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelControl17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textControl24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel30Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateControl3, dateControl4, jButton2, labelControl1, labelControl17, labelControl25, labelControl26, labelControl27, labelControl28, labelControl29, labelControl31, labelControl32, labelControl6, numericControl4, textControl15, textControl16, textControl20, textControl23, textControl24, textControl3});

        formJuri.add(jPanel30);

        labelControl35.setLabel("numeroRegistro");

        textControl19.setAttributeName("numeroRegistro");

        labelControl36.setLabel("numeroTomo");

        textControl18.setAttributeName("numeroTomo");

        labelControl33.setLabel("capacidadEconomica");

        codLookupControl3.setAllowOnlyNumbers(true);
        codLookupControl3.setAttributeName("capacidadEconomica.id");
        codLookupControl3.setCodBoxVisible(false);
        codLookupControl3.setControllerMethodName("getTipoCapacidadEconomica");

        labelControl34.setLabel("actividadEconomica");

        codLookupControl5.setAllowOnlyNumbers(true);
        codLookupControl5.setAttributeName("actividadEconomica.id");
        codLookupControl5.setCodBoxVisible(false);
        codLookupControl5.setControllerMethodName("getTipoActividadEconomica");

        labelControl37.setLabel("montoCapitalSuscrito");

        currencyControl3.setAttributeName("montoCapitalSuscrito");
        currencyControl3.setDecimals(2);

        labelControl38.setLabel("montoCapitalPagado");

        currencyControl1.setAttributeName("montoCapitalPagado");
        currencyControl1.setDecimals(2);

        labelControl39.setLabel("montoPatrimonioNeto");

        currencyControl2.setAttributeName("montoPatrimonioNeto");
        currencyControl2.setDecimals(2);

        checkBoxControl3.setText("gobierno");
        checkBoxControl3.setAttributeName("gobierno");

        checkBoxControl4.setSelected(true);
        checkBoxControl4.setText("activo");
        checkBoxControl4.setAttributeName("auditoria.activo");

        textControl1.setAttributeName("capacidadEconomica.nombre");
        textControl1.setEnabledOnEdit(false);
        textControl1.setEnabledOnInsert(false);

        textControl17.setAttributeName("actividadEconomica.nombre");
        textControl17.setEnabledOnEdit(false);
        textControl17.setEnabledOnInsert(false);

        labelControl30.setLabel("ranking");

        comboBoxControl8.setAttributeName("ranking");
        comboBoxControl8.setDomainId(Dominios.Ranking().getDomainId());

        labelControl40.setLabel("numeroGaceta");

        textControl25.setAttributeName("numeroGaceta");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textControl18, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(textControl19, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(textControl25, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currencyControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(currencyControl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(currencyControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(codLookupControl5, javax.swing.GroupLayout.Alignment.LEADING, 0, 47, Short.MAX_VALUE)
                                    .addComponent(codLookupControl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textControl17, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(textControl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(labelControl30, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxControl8, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .addComponent(checkBoxControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(checkBoxControl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel33Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelControl30, labelControl33, labelControl34, labelControl35, labelControl36, labelControl37, labelControl38, labelControl39, labelControl40});

        jPanel33Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {codLookupControl3, codLookupControl5});

        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textControl19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelControl35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel33Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkBoxControl3, checkBoxControl4, codLookupControl3, codLookupControl5, comboBoxControl8, currencyControl1, currencyControl2, currencyControl3, labelControl30, labelControl33, labelControl34, labelControl35, labelControl36, labelControl37, labelControl38, labelControl39, labelControl40, textControl1, textControl17, textControl18, textControl19, textControl25});

        formJuri.add(jPanel33);

        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout datosJuridicaLayout = new javax.swing.GroupLayout(datosJuridica);
        datosJuridica.setLayout(datosJuridicaLayout);
        datosJuridicaLayout.setHorizontalGroup(
            datosJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formJuri, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(barraJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                .addContainerGap())
        );
        datosJuridicaLayout.setVerticalGroup(
            datosJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formJuri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Personales", datosJuridica);

        jPanel7.setLayout(new java.awt.GridLayout(3, 1, 0, 7));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Bancarias"));

        gridControl1.setDeleteButton(deleteButton3);
        gridControl1.setEditButton(editButton3);
        gridControl1.setInsertButton(insertButton3);
        gridControl1.setMaxNumberOfRowsOnInsert(4);
        gridControl1.setReloadButton(reloadButton3);
        gridControl1.setSaveButton(saveButton3);
        gridControl1.setValueObjectClassName(CuentaBancariaPersona.class.getName());
        gridControl1.setVisibleStatusPanel(false);

        decimalColumn1.setColumnName("id");
        decimalColumn1.setColumnRequired(false);
        decimalColumn1.setPreferredWidth(40);
        gridControl1.getColumnContainer().add(decimalColumn1);

        codLookupColumn1.setColumnName("banco.nombreLargo");
        codLookupColumn1.setControllerMethodName("getPersonaNueva");
        codLookupColumn1.setEditableOnEdit(true);
        codLookupColumn1.setEditableOnInsert(true);
        gridControl1.getColumnContainer().add(codLookupColumn1);

        codLookupColumn3.setColumnName("tipoCuenta.nombre");
        codLookupColumn3.setControllerMethodName("getTipoCuentaBancaria");
        codLookupColumn3.setEditableOnEdit(true);
        codLookupColumn3.setEditableOnInsert(true);
        gridControl1.getColumnContainer().add(codLookupColumn3);

        textColumn4.setColumnName("numero");
        textColumn4.setEditableOnEdit(true);
        textColumn4.setEditableOnInsert(true);
        textColumn4.setPreferredWidth(170);
        gridControl1.getColumnContainer().add(textColumn4);

        textColumn5.setColumnName("observacion");
        textColumn5.setColumnRequired(false);
        textColumn5.setEditableOnEdit(true);
        textColumn5.setEditableOnInsert(true);
        gridControl1.getColumnContainer().add(textColumn5);

        jPanel6.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel6.add(insertButton3);
        jPanel6.add(editButton3);
        jPanel6.add(deleteButton3);
        jPanel6.add(saveButton3);
        jPanel6.add(reloadButton3);
        jPanel6.add(filterButton3);

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gridControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel5);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentos Anexos"));

        gridControl3.setDeleteButton(deleteButton5);
        gridControl3.setEditButton(editButton5);
        gridControl3.setInsertButton(insertButton5);
        gridControl3.setMaxNumberOfRowsOnInsert(4);
        gridControl3.setReloadButton(reloadButton5);
        gridControl3.setSaveButton(saveButton5);
        gridControl3.setValueObjectClassName(Documento.class.getName());
        gridControl3.setVisibleStatusPanel(false);

        buttonColumn1.setColumnName("button");
        buttonColumn1.setEditableOnEdit(true);
        buttonColumn1.setEnableInReadOnlyMode(true);
        buttonColumn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        buttonColumn1.setPreferredWidth(20);
        buttonColumn1.setText("");
        gridControl3.getColumnContainer().add(buttonColumn1);

        integerColumn1.setColumnName("id");
        integerColumn1.setColumnRequired(false);
        integerColumn1.setPreferredWidth(40);
        gridControl3.getColumnContainer().add(integerColumn1);

        codLookupColumn2.setColumnName("tipoDocumento.nombre");
        codLookupColumn2.setControllerMethodName("getTipoDocAnex");
        codLookupColumn2.setEditableOnEdit(true);
        codLookupColumn2.setEditableOnInsert(true);
        gridControl3.getColumnContainer().add(codLookupColumn2);

        textColumn3.setColumnName("observacion");
        textColumn3.setColumnRequired(false);
        textColumn3.setEditableOnEdit(true);
        textColumn3.setEditableOnInsert(true);
        gridControl3.getColumnContainer().add(textColumn3);

        dateColumn1.setColumnName("fechaVencimiento");
        dateColumn1.setColumnRequired(false);
        dateColumn1.setEditableOnEdit(true);
        dateColumn1.setEditableOnInsert(true);
        gridControl3.getColumnContainer().add(dateColumn1);

        jPanel11.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel11.add(insertButton5);
        jPanel11.add(editButton5);
        jPanel11.add(deleteButton5);
        jPanel11.add(saveButton5);
        jPanel11.add(reloadButton5);
        jPanel11.add(filterButton5);

        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(gridControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));

        gridControl4.setDeleteButton(deleteButton6);
        gridControl4.setEditButton(editButton6);
        gridControl4.setInsertButton(insertButton6);
        gridControl4.setMaxNumberOfRowsOnInsert(4);
        gridControl4.setReloadButton(reloadButton6);
        gridControl4.setSaveButton(saveButton6);
        gridControl4.setValueObjectClassName(Observacion.class.getName());
        gridControl4.setVisibleStatusPanel(false);

        decimalColumn4.setColumnName("id");
        decimalColumn4.setColumnRequired(false);
        decimalColumn4.setPreferredWidth(40);
        gridControl4.getColumnContainer().add(decimalColumn4);

        textColumn1.setColumnName("observacion");
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setMaxCharacters(1024);
        textColumn1.setPreferredWidth(400);
        gridControl4.getColumnContainer().add(textColumn1);

        textColumn8.setColumnName("auditoria.usuarioInsert");
        textColumn8.setColumnRequired(false);
        gridControl4.getColumnContainer().add(textColumn8);

        dateTimeColumn1.setColumnName("auditoria.fechaInsert");
        dateTimeColumn1.setColumnRequired(false);
        gridControl4.getColumnContainer().add(dateTimeColumn1);

        jPanel13.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel13.add(insertButton6);
        jPanel13.add(editButton6);
        jPanel13.add(deleteButton6);
        jPanel13.add(saveButton6);
        jPanel13.add(reloadButton6);
        jPanel13.add(filterButton6);

        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gridControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel12);

        javax.swing.GroupLayout datosGeneralesLayout = new javax.swing.GroupLayout(datosGenerales);
        datosGenerales.setLayout(datosGeneralesLayout);
        datosGeneralesLayout.setHorizontalGroup(
            datosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        datosGeneralesLayout.setVerticalGroup(
            datosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Generales", datosGenerales);

        jPanel9.setLayout(new java.awt.GridLayout(2, 1, 0, 7));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Direcciones"));

        gridControl2.setDeleteButton(deleteButton4);
        gridControl2.setEditButton(editButton4);
        gridControl2.setInsertButton(insertButton4);
        gridControl2.setInsertRowsOnTop(false);
        gridControl2.setMaxNumberOfRowsOnInsert(4);
        gridControl2.setReloadButton(reloadButton4);
        gridControl2.setSaveButton(saveButton4);
        gridControl2.setValueObjectClassName(DireccionPersona.class.getName());
        gridControl2.setVisibleStatusPanel(false);

        decimalColumn2.setColumnName("id");
        decimalColumn2.setColumnRequired(false);
        decimalColumn2.setPreferredWidth(40);
        gridControl2.getColumnContainer().add(decimalColumn2);

        codLookupColumn5.setColumnName("tipoDireccion.nombre");
        codLookupColumn5.setControllerMethodName("getTipoDireccion");
        codLookupColumn5.setEditableOnEdit(true);
        codLookupColumn5.setEditableOnInsert(true);
        gridControl2.getColumnContainer().add(codLookupColumn5);

        textColumn6.setColumnName("direccion");
        textColumn6.setEditableOnEdit(true);
        textColumn6.setEditableOnInsert(true);
        textColumn6.setPreferredWidth(250);
        gridControl2.getColumnContainer().add(textColumn6);

        textColumn7.setColumnName("observacion");
        textColumn7.setColumnRequired(false);
        textColumn7.setEditableOnEdit(true);
        textColumn7.setEditableOnInsert(true);
        gridControl2.getColumnContainer().add(textColumn7);

        jPanel15.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel15.add(insertButton4);
        jPanel15.add(editButton4);
        jPanel15.add(deleteButton4);
        jPanel15.add(saveButton4);
        jPanel15.add(reloadButton4);

        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gridControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel14);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefonos"));

        gridControl5.setDeleteButton(deleteButton7);
        gridControl5.setEditButton(editButton7);
        gridControl5.setInsertButton(insertButton7);
        gridControl5.setInsertRowsOnTop(false);
        gridControl5.setMaxNumberOfRowsOnInsert(4);
        gridControl5.setReloadButton(reloadButton7);
        gridControl5.setSaveButton(saveButton7);
        gridControl5.setValueObjectClassName(TelefonoPersona.class.getName());
        gridControl5.setVisibleStatusPanel(false);

        decimalColumn5.setColumnName("id");
        decimalColumn5.setColumnRequired(false);
        decimalColumn5.setPreferredWidth(40);
        gridControl5.getColumnContainer().add(decimalColumn5);

        codLookupColumn6.setColumnName("tipoTelefono.nombre");
        codLookupColumn6.setControllerMethodName("getTipoTelefono");
        codLookupColumn6.setEditableOnEdit(true);
        codLookupColumn6.setEditableOnInsert(true);
        gridControl5.getColumnContainer().add(codLookupColumn6);

        codLookupColumn4.setColumnName("codigoArea.nombre");
        codLookupColumn4.setControllerMethodName("getCodigoArea");
        codLookupColumn4.setEditableOnEdit(true);
        codLookupColumn4.setEditableOnInsert(true);
        gridControl5.getColumnContainer().add(codLookupColumn4);

        textColumn2.setColumnName("numeroS");
        textColumn2.setEditableOnEdit(true);
        textColumn2.setEditableOnInsert(true);
        textColumn2.setHeaderColumnName("numero");
        textColumn2.setMaxCharacters(7);
        gridControl5.getColumnContainer().add(textColumn2);

        textColumn9.setColumnName("observacion");
        textColumn9.setColumnRequired(false);
        textColumn9.setEditableOnEdit(true);
        textColumn9.setEditableOnInsert(true);
        gridControl5.getColumnContainer().add(textColumn9);

        checkBoxColumn1.setColumnName("notificar");
        checkBoxColumn1.setColumnRequired(false);
        checkBoxColumn1.setEditableOnEdit(true);
        checkBoxColumn1.setEditableOnInsert(true);
        checkBoxColumn1.setHeaderColumnName("sms");
        checkBoxColumn1.setPreferredWidth(30);
        gridControl5.getColumnContainer().add(checkBoxColumn1);

        jPanel17.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel17.add(insertButton7);
        jPanel17.add(editButton7);
        jPanel17.add(deleteButton7);
        jPanel17.add(saveButton7);
        jPanel17.add(reloadButton7);

        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
            .addComponent(gridControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel16);

        javax.swing.GroupLayout datosUbicacionLayout = new javax.swing.GroupLayout(datosUbicacion);
        datosUbicacion.setLayout(datosUbicacionLayout);
        datosUbicacionLayout.setHorizontalGroup(
            datosUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        datosUbicacionLayout.setVerticalGroup(
            datosUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos de Ubicacion", datosUbicacion);

        jPanel22.setLayout(new java.awt.GridLayout(3, 1, 0, 7));

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Sucursales"));

        gridControl10.setDeleteButton(deleteButton11);
        gridControl10.setEditButton(editButton11);
        gridControl10.setInsertButton(insertButton11);
        gridControl10.setMaxNumberOfRowsOnInsert(4);
        gridControl10.setReloadButton(reloadButton11);
        gridControl10.setSaveButton(saveButton11);
        gridControl10.setValueObjectClassName(Sucursal.class.getName());
        gridControl10.setVisibleStatusPanel(false);

        decimalColumn9.setColumnName("id");
        decimalColumn9.setColumnRequired(false);
        decimalColumn9.setPreferredWidth(40);
        gridControl10.getColumnContainer().add(decimalColumn9);

        textColumn17.setColumnName("nombre");
        textColumn17.setEditableOnEdit(true);
        textColumn17.setEditableOnInsert(true);
        gridControl10.getColumnContainer().add(textColumn17);

        textColumn18.setColumnName("observacion");
        textColumn18.setColumnRequired(false);
        textColumn18.setEditableOnEdit(true);
        textColumn18.setEditableOnInsert(true);
        gridControl10.getColumnContainer().add(textColumn18);

        jPanel28.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel28.add(insertButton11);
        jPanel28.add(editButton11);
        jPanel28.add(deleteButton11);
        jPanel28.add(saveButton11);
        jPanel28.add(reloadButton11);

        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl10, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(gridControl10, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel27);

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Direcciones Sucursal"));

        gridControl8.setDeleteButton(deleteButton9);
        gridControl8.setEditButton(editButton9);
        gridControl8.setInsertButton(insertButton9);
        gridControl8.setMaxNumberOfRowsOnInsert(4);
        gridControl8.setReloadButton(reloadButton9);
        gridControl8.setSaveButton(saveButton9);
        gridControl8.setValueObjectClassName(DireccionPersona.class.getName());
        gridControl8.setVisibleStatusPanel(false);

        decimalColumn7.setColumnName("id");
        decimalColumn7.setColumnRequired(false);
        decimalColumn7.setPreferredWidth(40);
        gridControl8.getColumnContainer().add(decimalColumn7);

        codLookupColumn7.setColumnName("tipoDireccion.nombre");
        codLookupColumn7.setControllerMethodName("getTipoDireccion");
        codLookupColumn7.setEditableOnEdit(true);
        codLookupColumn7.setEditableOnInsert(true);
        gridControl8.getColumnContainer().add(codLookupColumn7);

        textColumn13.setColumnName("direccion");
        textColumn13.setEditableOnEdit(true);
        textColumn13.setEditableOnInsert(true);
        gridControl8.getColumnContainer().add(textColumn13);

        textColumn14.setColumnName("observacion");
        textColumn14.setColumnRequired(false);
        textColumn14.setEditableOnEdit(true);
        textColumn14.setEditableOnInsert(true);
        gridControl8.getColumnContainer().add(textColumn14);

        jPanel24.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel24.add(insertButton9);
        jPanel24.add(editButton9);
        jPanel24.add(deleteButton9);
        jPanel24.add(saveButton9);
        jPanel24.add(reloadButton9);

        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl8, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gridControl8, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel23);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefonos Sucursal"));

        gridControl9.setDeleteButton(deleteButton10);
        gridControl9.setEditButton(editButton10);
        gridControl9.setInsertButton(insertButton10);
        gridControl9.setMaxNumberOfRowsOnInsert(4);
        gridControl9.setReloadButton(reloadButton10);
        gridControl9.setSaveButton(saveButton10);
        gridControl9.setValueObjectClassName(TelefonoPersona.class.getName());
        gridControl9.setVisibleStatusPanel(false);

        decimalColumn8.setColumnName("id");
        decimalColumn8.setColumnRequired(false);
        decimalColumn8.setPreferredWidth(40);
        gridControl9.getColumnContainer().add(decimalColumn8);

        codLookupColumn8.setColumnName("tipoTelefono.nombre");
        codLookupColumn8.setControllerMethodName("getTipoTelefono");
        codLookupColumn8.setEditableOnEdit(true);
        codLookupColumn8.setEditableOnInsert(true);
        gridControl9.getColumnContainer().add(codLookupColumn8);

        codLookupColumn9.setColumnName("codigoArea.nombre");
        codLookupColumn9.setControllerMethodName("getCodigoArea");
        codLookupColumn9.setEditableOnEdit(true);
        codLookupColumn9.setEditableOnInsert(true);
        gridControl9.getColumnContainer().add(codLookupColumn9);

        decimalColumn10.setColumnName("numero");
        decimalColumn10.setEditableOnEdit(true);
        decimalColumn10.setEditableOnInsert(true);
        gridControl9.getColumnContainer().add(decimalColumn10);

        textColumn16.setColumnName("observacion");
        textColumn16.setColumnRequired(false);
        textColumn16.setEditableOnEdit(true);
        textColumn16.setEditableOnInsert(true);
        gridControl9.getColumnContainer().add(textColumn16);

        jPanel26.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel26.add(insertButton10);
        jPanel26.add(editButton10);
        jPanel26.add(deleteButton10);
        jPanel26.add(saveButton10);
        jPanel26.add(reloadButton10);

        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl9, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(gridControl9, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel25);

        javax.swing.GroupLayout datosSucursalLayout = new javax.swing.GroupLayout(datosSucursal);
        datosSucursal.setLayout(datosSucursalLayout);
        datosSucursalLayout.setHorizontalGroup(
            datosSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        datosSucursalLayout.setVerticalGroup(
            datosSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sucursales", datosSucursal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        jPanel6.setVisible(!jPanel6.isVisible());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        jPanel11.setVisible(!jPanel11.isVisible());
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        jPanel13.setVisible(!jPanel13.isVisible());
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        jPanel15.setVisible(!jPanel15.isVisible());
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        jPanel17.setVisible(!jPanel17.isVisible());
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        jPanel24.setVisible(!jPanel24.isVisible());
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        jPanel26.setVisible(!jPanel26.isVisible());
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        jPanel28.setVisible(!jPanel28.isVisible());
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void insertButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton39ActionPerformed
        TipoPersonaLookupController tplc = new TipoPersonaLookupController(this);
        if (tplc.getTipoPersona() != null) {
            controllerTipoPersona.insertRecord(tplc.getTipoPersona());
        }
    }//GEN-LAST:event_insertButton39ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showRifDialog();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showRifDialog();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (textControl22.getText().length() > 0) {
            try {
                java.awt.Desktop.getDesktop().browse(new URI(textControl22.getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (textControl24.getText().length() > 0) {
            try {
                java.awt.Desktop.getDesktop().browse(new URI(textControl24.getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (textControl21.getText() != null && !textControl21.getText().isEmpty()) {
            new CorreoDetailFrameController(textControl21.getText() + "," + General.empresa.getEmail(), General.empresa.getEmail(), "Email", null, false);
        } else {
            JOptionPane.showMessageDialog(MDIFrame.getInstance(), "No tiene registrado correo electronico...", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (textControl23.getText() != null && !textControl23.getText().isEmpty()) {
            new CorreoDetailFrameController(textControl23.getText() + "," + General.empresa.getEmail(), General.empresa.getEmail(), "Email", null, false);
        } else {
            JOptionPane.showMessageDialog(MDIFrame.getInstance(), "No tiene registrado correo electronico...", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (textControl21.getText() != null && !textControl21.getText().isEmpty()) {
            new CorreoDetailFrameController(textControl21.getText() + "," + General.empresa.getEmail(), General.empresa.getEmail(), "Email", null, false);
        } else {
            JOptionPane.showMessageDialog(MDIFrame.getInstance(), "No tiene registrado correo electronico...", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (textControl23.getText() != null && !textControl23.getText().isEmpty()) {
            new CorreoDetailFrameController(textControl23.getText() + "," + General.empresa.getEmail(), General.empresa.getEmail(), "Email", null, false);
        } else {
            JOptionPane.showMessageDialog(MDIFrame.getInstance(), "No tiene registrado correo electronico...", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void showRifDialog() {
        Persona p = ((Persona) getMainPanel().getVOModel().getValueObject());
        RifDialog rifDialog = new RifDialog(p.getRif(), p.getId());
        //rifDialog.setVisible(true);
        if (rifDialog.isOk()) {
            getMainPanel().getVOModel().setValue("rif", rifDialog.getRif());
            getMainPanel().pull("rif");
        }
    }

    @Override
    public void inicializar(FormController formController, boolean addToMDIFrame) {
        System.out.println("init");
        initComponents();

        formNatu.addLinkedPanel(jPanel29);
        formJuri.addLinkedPanel(jPanel29);

        //reloadButton1.setVisible(false);
        jToggleButton1.setVisible(false);
        jToggleButton2.setVisible(false);
        jToggleButton3.setVisible(false);
        jToggleButton4.setVisible(false);
        jToggleButton5.setVisible(false);
        jToggleButton7.setVisible(false);
        jToggleButton8.setVisible(false);
        jToggleButton9.setVisible(false);
        this.pack();

        DefaultLookupController lookupCapacidadEconomica = new DefaultLookupController(
                TipoCapacidadEconomica.class.getName());
        lookupCapacidadEconomica.addLookup2ParentLink("capacidadEconomica");
        codLookupControl1.setLookupController(lookupCapacidadEconomica);

        DefaultLookupController lookupCapacidadEconomicaJuri = new DefaultLookupController(
                TipoCapacidadEconomica.class.getName());
        lookupCapacidadEconomicaJuri.addLookup2ParentLink("capacidadEconomica");
        codLookupControl3.setLookupController(lookupCapacidadEconomicaJuri);

        DefaultLookupController lookupActividadEconomica = new DefaultLookupController(
                TipoActividadEconomica.class.getName());
        lookupActividadEconomica.addLookup2ParentLink("actividadEconomica");
        codLookupControl2.setLookupController(lookupActividadEconomica);

        DefaultLookupController lookupActividadEconomicaJuri = new DefaultLookupController(
                TipoActividadEconomica.class.getName());
        lookupActividadEconomicaJuri.addLookup2ParentLink("actividadEconomica");
        codLookupControl5.setLookupController(lookupActividadEconomicaJuri);

        //controladores grid internos
        controllerCuentasBancarias =
                new DefaultGridInternalController(Persona.class.getName(), "getCuentasBancarias", gridControl1, null);
        gridControl1.setGridDataLocator(controllerCuentasBancarias);
        gridControl1.setController(controllerCuentasBancarias);

        /*controllerDocumentosAnexos =
        new DefaultGridInternalController(Persona.class.getName(), "getDocumentos", null, null);
        gridControl3.setGridDataLocator(controllerDocumentosAnexos);
        gridControl3.setController(controllerDocumentosAnexos);*/

        org.openswing.swing.table.columns.client.PictureCaptureColumn pcc = new org.openswing.swing.table.columns.client.PictureCaptureColumn();
        pcc.setColumnName("file");
        pcc.setEditableOnInsert(true);
        pcc.setEditableOnEdit(false);
        pcc.setFileNameAttributeName("fileName");
        pcc.setPreferredWidth(220);
        gridControl3.getColumnContainer().add(pcc);
        controllerDocumentosAnexosX = new DefaultDocumentosAnexosGridController(Persona.class, gridControl3);
        buttonColumn1.addActionListener(controllerDocumentosAnexosX);
        gridControl3.setController(controllerDocumentosAnexosX);
        gridControl3.setGridDataLocator(controllerDocumentosAnexosX);

        controllerObservaciones =
                new DefaultGridInternalController(Persona.class.getName(), "getObservaciones", gridControl4, null);
        gridControl4.setGridDataLocator(controllerObservaciones);
        gridControl4.setController(controllerObservaciones);

        controllerDirecciones =
                new DireccionesGridInternalController(Persona.class.getName(), "getDirecciones", gridControl2, null);
        gridControl2.setGridDataLocator(controllerDirecciones);
        gridControl2.setController(controllerDirecciones);

        controllerTelefonos =
                new TelefonoGridIneternalController(Persona.class.getName(), "getTelefonos", gridControl5, null);
        gridControl5.setGridDataLocator(controllerTelefonos);
        gridControl5.setController(controllerTelefonos);

        controllerTipoPersona =
                new DefaultGridInternalController(Persona.class.getName(), "getTiposPersona", gridControl7, null);
        gridControl7.setGridDataLocator(controllerTipoPersona);
        gridControl7.setController(controllerTipoPersona);

        //de sucursal
        controllerDireccionesSucursal =
                new DefaultGridInternalController(Sucursal.class.getName(), "getDirecciones", gridControl8, null);
        gridControl8.setGridDataLocator(controllerDireccionesSucursal);
        gridControl8.setController(controllerDireccionesSucursal);

        controllerTelefonosSucursal =
                new DefaultGridInternalController(Sucursal.class.getName(), "getTelefonos", gridControl9, null);
        gridControl9.setGridDataLocator(controllerTelefonosSucursal);
        gridControl9.setController(controllerTelefonosSucursal);

        ArrayList<DefaultGridInternalController> gridSucursalDependiente = new ArrayList<DefaultGridInternalController>(0);
        gridSucursalDependiente.add(controllerDireccionesSucursal);
        gridSucursalDependiente.add(controllerTelefonosSucursal);
        controllerSucursales =
                new DefaultGridInternalController(Persona.class.getName(), "getSucursales", gridControl10, gridSucursalDependiente);
        gridControl10.setGridDataLocator(controllerSucursales);
        gridControl10.setController(controllerSucursales);

        PersonaLookupController lookupBanco = new PersonaLookupController("BAN");
        lookupBanco.addLookup2ParentLink("banco");
        codLookupColumn1.setLookupController(lookupBanco);

        DefaultLookupController lookupTipoCuentaBancaria = new DefaultLookupController(
                TipoCuentaBancaria.class.getName());
        lookupTipoCuentaBancaria.addLookup2ParentLink("tipoCuenta");
        codLookupColumn3.setLookupController(lookupTipoCuentaBancaria);

        controlador.documentosAnexos.TipoDocumentoLookupController lookupDocumentoAnexo2 =
                new TipoDocumentoLookupController(Dominios.Modulos.PERSONAS);
        lookupDocumentoAnexo2.addLookup2ParentLink("tipoDocumento");
        codLookupColumn2.setLookupController(lookupDocumentoAnexo2);

        DefaultLookupController lookupTipoTelefono2 = new DefaultLookupController(
                TipoTelefono2.class.getName());
        lookupTipoTelefono2.addLookup2ParentLink("tipoTelefono");
        codLookupColumn6.setLookupController(lookupTipoTelefono2);

        DefaultLookupController lookupCodigoArea = new CodigoAreaLookupController(
                TipoCodigoArea.class.getName());
        lookupCodigoArea.addLookup2ParentLink("codigoArea");
        codLookupColumn4.setLookupController(lookupCodigoArea);

        DefaultLookupController lookupTipoDireccion2 = new DefaultLookupController(
                TipoDireccion.class.getName());
        lookupTipoDireccion2.addLookup2ParentLink("tipoDireccion");
        codLookupColumn5.setLookupController(lookupTipoDireccion2);

        //de sucursal
        DefaultLookupController lookupTipoTelefono = new DefaultLookupController(
                TipoTelefono2.class.getName());
        lookupTipoTelefono.addLookup2ParentLink("tipoTelefono");
        codLookupColumn8.setLookupController(lookupTipoTelefono);

        DefaultLookupController lookupCodigoArea2 = new CodigoAreaLookupController(
                TipoCodigoArea.class.getName());
        lookupCodigoArea2.addLookup2ParentLink("codigoArea");
        codLookupColumn9.setLookupController(lookupCodigoArea2);

        DefaultLookupController lookupTipoDireccion = new DefaultLookupController(
                TipoDireccion.class.getName());
        lookupTipoDireccion.addLookup2ParentLink("tipoDireccion");
        codLookupColumn7.setLookupController(lookupTipoDireccion);

        jButton8.addActionListener((ActionListener) formController);
        jButton7.addActionListener((ActionListener) formController);

//        comboBoxVOControl1.setComboDataLocator(new DefaultItemsDataLocator(.class.getName(), null));
//        comboBoxVOControl1.setComboValueObjectClassName(Encabezado.class.getName());
//        comboBoxVOControl1.setAllColumnVisible(false);
//        comboBoxVOControl1.setVisibleColumn("nombre", true);
//        comboBoxVOControl1.setPreferredWidthColumn("nombre", 120);

        formJuri.setFormController(formController);
        formNatu.setFormController(formController);
        formJuri.setCreateInnerVO(false);
        formNatu.setCreateInnerVO(false);
        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }
        //this.setVisible(true);
        MDIFrame.add(this);
    }

    public ArrayList getTelefonos() {
        ArrayList<TelefonoPersona> l = new ArrayList<TelefonoPersona>(((Persona) getMainPanel().getVOModel().getValueObject()).getTelefonos());
        return l;
    }

    @Override
    public void saveGridsData() {
        gridControl1.getSaveButton().doClick();
        gridControl3.getSaveButton().doClick();
        gridControl4.getSaveButton().doClick();
        gridControl2.getSaveButton().doClick();
        gridControl5.getSaveButton().doClick();
        gridControl10.getSaveButton().doClick();
        gridControl8.getSaveButton().doClick();
        gridControl9.getSaveButton().doClick();
    }

    @Override
    public void reloadGridsData() {
        gridControl4.reloadData();
        gridControl1.reloadData();
        gridControl3.reloadData();
        gridControl2.reloadData();
        gridControl5.reloadData();
        gridControl7.reloadData();
        gridControl10.reloadData();
        gridControl8.reloadData();
        gridControl9.reloadData();
    }

    @Override
    public void clearGridsData() {
        gridControl1.clearData();
        gridControl3.clearData();
        gridControl4.clearData();
        gridControl2.clearData();
        gridControl5.clearData();
        gridControl7.clearData();
        gridControl10.clearData();
        gridControl8.clearData();
        gridControl9.clearData();
    }

    @Override
    public void setOwnerVO(BeanVO beanVO) {
        controllerCuentasBancarias.setBeanVO(beanVO);
        Long id = null;
        if (beanVO != null) {
            id = ((Persona) beanVO).getId();
        }
        controllerDocumentosAnexosX.setBeanVO(beanVO, id);
        controllerObservaciones.setBeanVO(beanVO);
        controllerTelefonos.setBeanVO(beanVO);
        controllerDirecciones.setBeanVO(beanVO);
        controllerTipoPersona.setBeanVO(beanVO);
        controllerSucursales.setBeanVO(beanVO);
        reloadGridsData();
    }

    @Override
    public Form getMainPanel() {
        if (tipoPersonaEnum == TipoRifEnum.JURIDICO) {
            return formJuri;
        } else if (tipoPersonaEnum == TipoRifEnum.NATURAL) {
            return formNatu;
        }
        return null;
    }

    public void setTipoPersonas(TipoRifEnum tipoPersonaEnum) {
        this.tipoPersonaEnum = tipoPersonaEnum;
        if (tipoPersonaEnum == TipoRifEnum.JURIDICO) {
            jTabbedPane1.remove(datosNatural);
            jPanel3.add(jPanel1);
        } else if (tipoPersonaEnum == TipoRifEnum.NATURAL) {
            jTabbedPane1.remove(datosJuridica);
            jTabbedPane1.remove(datosSucursal);
        }
    }

    @Override
    public void modeChanged(int currentMode) {
        if (currentMode == Consts.INSERT) {
            clearGridsData();
        }
        if (currentMode == Consts.INSERT) {
            setEnableGridInternalButtons(false);
        } else {
            setEnableGridInternalButtons(true);
        }
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
    }

    private void setEnableGridInternalButtons(boolean enabled) {
        jPanel6.setVisible(enabled);
        jPanel11.setVisible(enabled);
        jPanel13.setVisible(enabled);
        jPanel15.setVisible(enabled);
        jPanel17.setVisible(enabled);
        jPanel21.setVisible(enabled);
        jPanel28.setVisible(enabled);
        jPanel24.setVisible(enabled);
        jPanel26.setVisible(enabled);
    }

    public Object getBienvenidaButton() {
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraJuridica;
    private javax.swing.JPanel barraNatural;
    private org.openswing.swing.table.columns.client.ButtonColumn buttonColumn1;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl2;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl3;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl4;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl5;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn1;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn2;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn3;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn4;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn5;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn6;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn7;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn8;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn9;
    private org.openswing.swing.client.CodLookupControl codLookupControl1;
    private org.openswing.swing.client.CodLookupControl codLookupControl2;
    private org.openswing.swing.client.CodLookupControl codLookupControl3;
    private org.openswing.swing.client.CodLookupControl codLookupControl5;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl2;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl3;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl4;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl5;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl6;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl8;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl9;
    private org.openswing.swing.client.CurrencyControl currencyControl1;
    private org.openswing.swing.client.CurrencyControl currencyControl2;
    private org.openswing.swing.client.CurrencyControl currencyControl3;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn1;
    private org.openswing.swing.client.DateControl dateControl1;
    private org.openswing.swing.client.DateControl dateControl2;
    private org.openswing.swing.client.DateControl dateControl3;
    private org.openswing.swing.client.DateControl dateControl4;
    private org.openswing.swing.client.DateControl dateControl5;
    private org.openswing.swing.client.DateControl dateControl6;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private javax.swing.JPanel datosGenerales;
    private javax.swing.JPanel datosJuridica;
    private javax.swing.JPanel datosNatural;
    private javax.swing.JPanel datosSucursal;
    private javax.swing.JPanel datosUbicacion;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn10;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn2;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn4;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn5;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn7;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn8;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn9;
    private org.openswing.swing.client.DeleteButton deleteButton10;
    private org.openswing.swing.client.DeleteButton deleteButton11;
    private org.openswing.swing.client.DeleteButton deleteButton3;
    private org.openswing.swing.client.DeleteButton deleteButton39;
    private org.openswing.swing.client.DeleteButton deleteButton4;
    private org.openswing.swing.client.DeleteButton deleteButton5;
    private org.openswing.swing.client.DeleteButton deleteButton6;
    private org.openswing.swing.client.DeleteButton deleteButton7;
    private org.openswing.swing.client.DeleteButton deleteButton9;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.EditButton editButton10;
    private org.openswing.swing.client.EditButton editButton11;
    private org.openswing.swing.client.EditButton editButton2;
    private org.openswing.swing.client.EditButton editButton3;
    private org.openswing.swing.client.EditButton editButton4;
    private org.openswing.swing.client.EditButton editButton5;
    private org.openswing.swing.client.EditButton editButton6;
    private org.openswing.swing.client.EditButton editButton7;
    private org.openswing.swing.client.EditButton editButton9;
    private org.openswing.swing.client.FilterButton filterButton3;
    private org.openswing.swing.client.FilterButton filterButton5;
    private org.openswing.swing.client.FilterButton filterButton6;
    private org.openswing.swing.form.client.Form formJuri;
    private org.openswing.swing.form.client.Form formNatu;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.GridControl gridControl10;
    private org.openswing.swing.client.GridControl gridControl2;
    private org.openswing.swing.client.GridControl gridControl3;
    private org.openswing.swing.client.GridControl gridControl4;
    private org.openswing.swing.client.GridControl gridControl5;
    private org.openswing.swing.client.GridControl gridControl7;
    private org.openswing.swing.client.GridControl gridControl8;
    private org.openswing.swing.client.GridControl gridControl9;
    private org.openswing.swing.client.NumericControl id_perNat;
    private org.openswing.swing.client.LabelControl id_perNat_lab;
    private org.openswing.swing.client.InsertButton insertButton10;
    private org.openswing.swing.client.InsertButton insertButton11;
    private org.openswing.swing.client.InsertButton insertButton3;
    private org.openswing.swing.client.InsertButton insertButton39;
    private org.openswing.swing.client.InsertButton insertButton4;
    private org.openswing.swing.client.InsertButton insertButton5;
    private org.openswing.swing.client.InsertButton insertButton6;
    private org.openswing.swing.client.InsertButton insertButton7;
    private org.openswing.swing.client.InsertButton insertButton9;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl10;
    private org.openswing.swing.client.LabelControl labelControl11;
    private org.openswing.swing.client.LabelControl labelControl12;
    private org.openswing.swing.client.LabelControl labelControl13;
    private org.openswing.swing.client.LabelControl labelControl14;
    private org.openswing.swing.client.LabelControl labelControl15;
    private org.openswing.swing.client.LabelControl labelControl16;
    private org.openswing.swing.client.LabelControl labelControl17;
    private org.openswing.swing.client.LabelControl labelControl18;
    private org.openswing.swing.client.LabelControl labelControl19;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl20;
    private org.openswing.swing.client.LabelControl labelControl21;
    private org.openswing.swing.client.LabelControl labelControl22;
    private org.openswing.swing.client.LabelControl labelControl23;
    private org.openswing.swing.client.LabelControl labelControl24;
    private org.openswing.swing.client.LabelControl labelControl25;
    private org.openswing.swing.client.LabelControl labelControl26;
    private org.openswing.swing.client.LabelControl labelControl27;
    private org.openswing.swing.client.LabelControl labelControl28;
    private org.openswing.swing.client.LabelControl labelControl29;
    private org.openswing.swing.client.LabelControl labelControl3;
    private org.openswing.swing.client.LabelControl labelControl30;
    private org.openswing.swing.client.LabelControl labelControl31;
    private org.openswing.swing.client.LabelControl labelControl32;
    private org.openswing.swing.client.LabelControl labelControl33;
    private org.openswing.swing.client.LabelControl labelControl34;
    private org.openswing.swing.client.LabelControl labelControl35;
    private org.openswing.swing.client.LabelControl labelControl36;
    private org.openswing.swing.client.LabelControl labelControl37;
    private org.openswing.swing.client.LabelControl labelControl38;
    private org.openswing.swing.client.LabelControl labelControl39;
    private org.openswing.swing.client.LabelControl labelControl4;
    private org.openswing.swing.client.LabelControl labelControl40;
    private org.openswing.swing.client.LabelControl labelControl41;
    private org.openswing.swing.client.LabelControl labelControl42;
    private org.openswing.swing.client.LabelControl labelControl43;
    private org.openswing.swing.client.LabelControl labelControl44;
    private org.openswing.swing.client.LabelControl labelControl45;
    private org.openswing.swing.client.LabelControl labelControl46;
    private org.openswing.swing.client.LabelControl labelControl47;
    private org.openswing.swing.client.LabelControl labelControl5;
    private org.openswing.swing.client.LabelControl labelControl6;
    private org.openswing.swing.client.LabelControl labelControl7;
    private org.openswing.swing.client.LabelControl labelControl8;
    private org.openswing.swing.client.LabelControl labelControl9;
    private org.openswing.swing.client.NumericControl numericControl1;
    private org.openswing.swing.client.NumericControl numericControl2;
    private org.openswing.swing.client.NumericControl numericControl4;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.ReloadButton reloadButton10;
    private org.openswing.swing.client.ReloadButton reloadButton11;
    private org.openswing.swing.client.ReloadButton reloadButton2;
    private org.openswing.swing.client.ReloadButton reloadButton3;
    private org.openswing.swing.client.ReloadButton reloadButton4;
    private org.openswing.swing.client.ReloadButton reloadButton5;
    private org.openswing.swing.client.ReloadButton reloadButton6;
    private org.openswing.swing.client.ReloadButton reloadButton7;
    private org.openswing.swing.client.ReloadButton reloadButton9;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.SaveButton saveButton10;
    private org.openswing.swing.client.SaveButton saveButton11;
    private org.openswing.swing.client.SaveButton saveButton2;
    private org.openswing.swing.client.SaveButton saveButton3;
    private org.openswing.swing.client.SaveButton saveButton4;
    private org.openswing.swing.client.SaveButton saveButton5;
    private org.openswing.swing.client.SaveButton saveButton6;
    private org.openswing.swing.client.SaveButton saveButton7;
    private org.openswing.swing.client.SaveButton saveButton9;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn11;
    private org.openswing.swing.table.columns.client.TextColumn textColumn12;
    private org.openswing.swing.table.columns.client.TextColumn textColumn13;
    private org.openswing.swing.table.columns.client.TextColumn textColumn14;
    private org.openswing.swing.table.columns.client.TextColumn textColumn16;
    private org.openswing.swing.table.columns.client.TextColumn textColumn17;
    private org.openswing.swing.table.columns.client.TextColumn textColumn18;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    private org.openswing.swing.table.columns.client.TextColumn textColumn9;
    private org.openswing.swing.client.TextControl textControl1;
    private org.openswing.swing.client.TextControl textControl10;
    private org.openswing.swing.client.TextControl textControl11;
    private org.openswing.swing.client.TextControl textControl12;
    private org.openswing.swing.client.TextControl textControl13;
    private org.openswing.swing.client.TextControl textControl14;
    private org.openswing.swing.client.TextControl textControl15;
    private org.openswing.swing.client.TextControl textControl16;
    private org.openswing.swing.client.TextControl textControl17;
    private org.openswing.swing.client.TextControl textControl18;
    private org.openswing.swing.client.TextControl textControl19;
    private org.openswing.swing.client.TextControl textControl2;
    private org.openswing.swing.client.TextControl textControl20;
    private org.openswing.swing.client.TextControl textControl21;
    private org.openswing.swing.client.TextControl textControl22;
    private org.openswing.swing.client.TextControl textControl23;
    private org.openswing.swing.client.TextControl textControl24;
    private org.openswing.swing.client.TextControl textControl25;
    private org.openswing.swing.client.TextControl textControl26;
    private org.openswing.swing.client.TextControl textControl27;
    private org.openswing.swing.client.TextControl textControl28;
    private org.openswing.swing.client.TextControl textControl3;
    private org.openswing.swing.client.TextControl textControl4;
    private org.openswing.swing.client.TextControl textControl5;
    private org.openswing.swing.client.TextControl textControl6;
    private org.openswing.swing.client.TextControl textControl7;
    private org.openswing.swing.client.TextControl textControl8;
    private org.openswing.swing.client.TextControl textControl9;
    // End of variables declaration//GEN-END:variables
}
