package controlador.personas;

import controlador.General;
import controlador.util.DefaultDetailFrameController;
import modelo.HibernateUtil;
import modelo.entidades.personas.dominio.TipoPersona;
import modelo.entidades.personas.maestra.LNPersonaNatural;
import modelo.entidades.personas.maestra.Persona;
import modelo.entidades.personas.maestra.PersonaNatural;
import modelo.entidades.personas.maestra.Rif;
import modelo.util.bean.BeanVO;
import org.hibernate.Hibernate;
import org.hibernate.classic.Session;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.java.Consts;
import vista.personas.PersonaDetailFrame;

/**
 *
 * @author Orlando Becerra
 */
public class PersonasDetailController extends DefaultDetailFrameController {

    public PersonasDetailController(Form linkForm, String attributeName, Object[] adicional, GridControl gridControl,
            BeanVO beanVO,
            Rif rif) {
        this(gridControl, beanVO, rif);
        this.linkForm = linkForm;
        this.attributeName = attributeName;
        this.adicional = adicional;
    }

    public PersonasDetailController(
            GridControl gridControl,
            BeanVO beanVO,
            Rif rif) {
        this.gridControl = gridControl;
        this.beanVO = beanVO;
        this.aplicarLogicaNegocio = true;
        vista = new PersonaDetailFrame();
        vista.inicializar(this, true);
        vista.setTitle("Persona: ");
        if (beanVO != null) {
            if (((Persona) beanVO).getNombreLargo() != null) {
                vista.setTitle(vista.getTitle() + ((Persona) beanVO).getNombreLargo());
            }
        }
        if (beanVO != null) {
            rif = ((Persona) beanVO).getRif();
            ((PersonaDetailFrame) vista).setTipoPersonas(rif.getTipoCedula().getTipoPersona());
            vista.getMainPanel().reload();
            vista.getMainPanel().setMode(Consts.READONLY);
        } else {
            ((PersonaDetailFrame) vista).setTipoPersonas(rif.getTipoCedula().getTipoPersona());
            vista.getMainPanel().setMode(Consts.INSERT);
        }
        if (rif != null) {
            vista.getMainPanel().getVOModel().setValue("rif", rif);
            vista.getMainPanel().getVOModel().setValue("capacidadEconomica", General.defaultPersona.getCapacidadEconomica());
            vista.getMainPanel().getVOModel().setValue("actividadEconomica", General.defaultPersona.getActividadEconomica());
            vista.getMainPanel().pull("rif");
            vista.getMainPanel().pull("capacidadEconomica");
            vista.getMainPanel().pull("actividadEconomica");
        }
    }

    @Override
    public Response loadData(Class valueObjectClass) {
        Session s = HibernateUtil.getSessionFactory().openSession();
//        Persona p=(Persona)s.createQuery("FROM " + Persona.class.getName() + " P WHERE P.id=:id" +
//                "").setLong("id", ((Persona) beanVO).getId()).uniqueResult();
        Persona p = (Persona) s.get(Persona.class, ((Persona) beanVO).getId());
        Hibernate.initialize(p.getTiposPersona());
        Hibernate.initialize(p.getObservaciones());
        Hibernate.initialize(p.getTelefonos());
        Hibernate.initialize(p.getDirecciones());
        Hibernate.initialize(p.getDocumentos());
        Hibernate.initialize(p.getSucursales());
        Hibernate.initialize(p.getCuentasBancarias());
        s.close();
        beanVO = p;
        return new VOResponse(beanVO);
    }

    @Override
    public Response logicaNegocio(ValueObject persistentObject) {
        if (persistentObject instanceof PersonaNatural) {
            PersonaNatural persona = (PersonaNatural) persistentObject;
            LNPersonaNatural.generarNombres(persona);
            persistentObject = persona;
        }
        if (adicional != null && adicional.length > 0) {
            Session s = null;
            try {
                s = HibernateUtil.getSessionFactory().openSession();
                //Transaction t = s.beginTransaction();
                for (Object object : adicional) {
                    TipoPersona tp = (TipoPersona) s.createQuery("FROM " + TipoPersona.class.getName() + " T WHERE T.idPropio=:idP").
                            setString("idP", (String) object).
                            uniqueResult();
                    ((Persona) persistentObject).getTiposPersona().add(tp);
                }
                //s.update(s)
                //t.commit();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                s.close();
            }
        }
        return new VOResponse(persistentObject);

    }
}
