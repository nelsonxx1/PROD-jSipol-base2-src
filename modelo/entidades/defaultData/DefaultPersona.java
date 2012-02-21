package modelo.entidades.defaultData;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.personas.dominio.TipoActividadEconomica;
import modelo.entidades.personas.dominio.TipoCapacidadEconomica;
import modelo.entidades.personas.dominio.TipoDireccion;
import modelo.entidades.personas.dominio.TipoTelefono2;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;

/**
 *
 * @author bc
 */
@Entity
public class DefaultPersona extends BeanVO implements Serializable, Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    @ManyToOne()
    @BusinessKey
    private TipoCapacidadEconomica capacidadEconomica;
    @ManyToOne()
    @BusinessKey
    private TipoActividadEconomica actividadEconomica;
    @ManyToOne()
    @BusinessKey
    private TipoDireccion direccion;
    @ManyToOne()
    @BusinessKey
    private TipoTelefono2 telefono;
    /**
     */
    @Version
    @Column
    private Integer optLock;
    /**
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;

    public TipoActividadEconomica getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(TipoActividadEconomica actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    public TipoCapacidadEconomica getCapacidadEconomica() {
        return capacidadEconomica;
    }

    public void setCapacidadEconomica(TipoCapacidadEconomica capacidadEconomica) {
        this.capacidadEconomica = capacidadEconomica;
    }

    public TipoDireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(TipoDireccion direccion) {
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public TipoTelefono2 getTelefono() {
        return telefono;
    }

    public void setTelefono(TipoTelefono2 telefono) {
        this.telefono = telefono;
    }
}
