package vista.personas;

import controlador.personas.PersonaGridControllerWhitSQL;
import controlador.personas.PersonasDetailController;
import controlador.util.DefaultLookupControllerPorNombre;
import modelo.entidades.personas.maestra.Persona;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.HibernateUtil;
import modelo.entidades.personas.dominio.TipoPersona;
import modelo.utilitario.BuscarPersona;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.hibernate.type.Type;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author bc
 */
public class BuscarPersonaDialog extends InternalFrame {

    private BuscarPersona persona;

    public BuscarPersonaDialog(Component owner) {
        initComponents();

        this.getRootPane().setDefaultButton(jButton1);

        DefaultLookupControllerPorNombre lookupTipoPersona = new DefaultLookupControllerPorNombre(TipoPersona.class.getName());
        lookupTipoPersona.addLookup2ParentLink("tipoPersona");
        codLookupControl1.setLookupController(lookupTipoPersona);

        jButton1.addActionListener(new Buscar());
        form1.setFormController(new Buscar());
        form1.setMode(Consts.INSERT);

        if (owner == null) {
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(((int) d.getWidth() - this.getWidth()) / 2, ((int) d.getHeight() - this.getHeight()) / 2);
        } else {
            owner.getSize();
            setLocation((owner.getWidth() - this.getWidth()) / 2 + (int) owner.getLocationOnScreen().getX(), (owner.getHeight() - this.getHeight()) / 2 + (int) owner.getLocationOnScreen().getY());
        }
        MDIFrame.add(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        form1 = new org.openswing.swing.form.client.Form();
        textControl1 = new org.openswing.swing.client.TextControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        codLookupControl1 = new org.openswing.swing.client.CodLookupControl();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        textControl4 = new org.openswing.swing.client.TextControl();
        labelControl4 = new org.openswing.swing.client.LabelControl();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("Buscar Persona");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel2.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(33, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check1.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(33, 33));

        form1.setVOClassName(BuscarPersona.class.getName());

        textControl1.setAttributeName("rif");
        textControl1.setLinkLabel(labelControl2);
        textControl1.setToolTipText("Cedula de la Persona o RIF");
        textControl1.setTrimText(true);
        textControl1.setUpperCase(true);

        labelControl2.setLabel("persona.rif");

        codLookupControl1.setAttributeName("tipoPersona.nombre");
        codLookupControl1.setAutoCompletitionWaitTime(1000L);
        codLookupControl1.setLinkLabel(labelControl1);
        codLookupControl1.setMaxCharacters(20);
        codLookupControl1.setToolTipText("Tipo de Persona a Buscar");

        labelControl1.setLabel("persona.tipoPersona");

        textControl4.setAttributeName("nombreLargo");
        textControl4.setToolTipText("Nombre de la Persona");
        textControl4.setTrimText(true);
        textControl4.setUpperCase(true);

        labelControl4.setLabel("persona.nombre");

        javax.swing.GroupLayout form1Layout = new javax.swing.GroupLayout(form1);
        form1.setLayout(form1Layout);
        form1Layout.setHorizontalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form1Layout.createSequentialGroup()
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codLookupControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                    .addGroup(form1Layout.createSequentialGroup()
                        .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                    .addGroup(form1Layout.createSequentialGroup()
                        .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );

        form1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelControl1, labelControl2, labelControl4});

        form1Layout.setVerticalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {codLookupControl1, labelControl1, labelControl2, labelControl4, textControl1, textControl4});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(form1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.client.CodLookupControl codLookupControl1;
    private org.openswing.swing.form.client.Form form1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl4;
    private org.openswing.swing.client.TextControl textControl1;
    private org.openswing.swing.client.TextControl textControl4;
    // End of variables declaration//GEN-END:variables

    class Buscar extends FormController implements ActionListener {

        @Override
        public Response loadData(Class valueObjectClass) {
            return new VOResponse(null);
        }

        public void actionPerformed(ActionEvent e) {
            persona = ((BuscarPersona) BuscarPersonaDialog.this.form1.getVOModel().getValueObject());

            if (textControl1.getText() != null && !textControl1.getText().isEmpty()) {
                persona.setRif(textControl1.getText());
            }

            if (textControl4.getText() != null && !textControl4.getText().isEmpty()) {
                persona.setNombreLargo(textControl4.getText());
            }

            Session s = null;
            try {
                String sqlCount = "SELECT count(P) FROM " + Persona.class.getName() + " as P WHERE ";
                String sqlRec = "SELECT DISTINCT P FROM " + Persona.class.getName() + " as P WHERE ";
                String where = "";
                String where2 = "";
                String napa = "";
                Query q = null;
                boolean tp = false, nl = false, rif = false;

                ArrayList<Object> values = new ArrayList<Object>(0);
                ArrayList<Type> valueTypes = new ArrayList<Type>(0);

                s = HibernateUtil.getSessionFactory().openSession();

                if (persona.getTipoPersona() != null && persona.getTipoPersona().getIdPropio() != null) {
                    sqlCount = "SELECT count(P) FROM " + Persona.class.getName() + " as P left join P.tiposPersona as TP WHERE ";
                    sqlRec = "SELECT DISTINCT P FROM " + Persona.class.getName() + " as P left join P.tiposPersona as TP WHERE ";
                    where += " TP.id=:idTP ";
                    where2 += " TP.id=? ";
                    napa = " AND ";
                    tp = true;
                }

                if (persona.getNombreLargo() != null && !persona.getNombreLargo().isEmpty()) {
                    where += napa + " P.nombreLargo like :nombre ";
                    where2 += napa + " P.nombreLargo like ? ";
                    napa = " AND ";
                    nl = true;
                }

                if (persona.getRif() != null && !persona.getRif().isEmpty()) {
                    where += napa + " P.rif.rif like :rif ";
                    where2 += napa + " P.rif.rif like ? ";
                    napa = " AND ";
                    rif = true;
                }

                if (!nl && !rif && !tp) {
                    JOptionPane.showMessageDialog(BuscarPersonaDialog.this, "Faltan Datos!!!", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    return;
                }
//

                q = s.createQuery(sqlCount + where);
                if (tp) {
                    q.setLong("idTP", persona.getTipoPersona().getId());
                }

                if (nl) {
                    q.setString("nombre", "%" + persona.getNombreLargo() + "%");
                }
                if (rif) {
                    q.setString("rif", "%" + persona.getRif() + "%");
                }

                Long cant = (Long) q.list().get(0);
                if (cant == 0) {
                    JOptionPane.showMessageDialog(BuscarPersonaDialog.this, "No existe persona", "Mensaje", JOptionPane.ERROR_MESSAGE);
                } else if (cant == 1) {
                    q = s.createQuery(sqlRec + where);
                    if (tp) {
                        q.setLong("idTP", persona.getTipoPersona().getId());
                    }
                    if (nl) {
                        q.setString("nombre", "%" + persona.getNombreLargo() + "%");
                    }
                    if (rif) {
                        q.setString("rif", "%" + persona.getRif() + "%");
                    }
                    Persona p=(Persona) q.uniqueResult();
                    new PersonasDetailController(null, p, null);
                } else {
                    if (tp) {
                        values.add(persona.getTipoPersona().getId());
                        valueTypes.add(new LongType());
                    }
                    if (nl) {
                        values.add("%" + persona.getNombreLargo() + "%");
                        valueTypes.add(new StringType());
                    }
                    if (rif) {
                        values.add("%" + persona.getRif() + "%");
                        valueTypes.add(new StringType());
                    }
                    Type[] tt = new Type[valueTypes.size()];
                    for (int i = 0; i < valueTypes.size(); i++) {
                        tt[i] = valueTypes.get(i);
                    }
                    new PersonaGridControllerWhitSQL(Personas2GridFrame.class.getName(), PersonaDetailFrame.class.getName(), Persona.class.getName(), null, sqlRec + where2, values.toArray(), tt);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(BuscarPersonaDialog.this, ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            } finally {
                s.close();
            }
        }
    }
}
