package modelo.entidades.personas.transac;

import modelo.entidades.personas.dominio.TipoDireccion;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.personas.maestra.Persona;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

/**
 *  Clase Asociativa la persona y el tipo de direccion
 *  @version 1.0 22/05/2009
 *  @since JDK 1.5
 *  @see Persona
 *  @see TipoDireccion
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
public class DireccionPersona extends BeanVO implements Serializable, Auditable {

    /**
     *  PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Direccion de la persona
     */
    @Column
    @Size(min = 2, max = 255)
    @BusinessKey
    private String direccion;
    /**
     * Observacion de la direccion
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     * Tipo de direccion que posee esta direccion
     */
    @ManyToOne
    @NotNull
    @BusinessKey(include = Method.TO_STRING)
    private TipoDireccion tipoDireccion;
    /**
     */
    @Version
    @Column(name = "OPTLOCK")
    private Integer optLock;
    /**
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;

    public DireccionPersona() {
    }

    public DireccionPersona(String direccion, String observacion, TipoDireccion tipoDireccion, AuditoriaBasica auditoria) {
        this.direccion = direccion;
        this.observacion = observacion;
        this.tipoDireccion = tipoDireccion;
        this.auditoria = auditoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }
}
