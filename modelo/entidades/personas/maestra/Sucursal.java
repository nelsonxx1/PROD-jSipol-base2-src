package modelo.entidades.personas.maestra;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.personas.transac.DireccionPersona;
import modelo.entidades.personas.transac.TelefonoPersona;
import modelo.interfaces.GridConSubGrids;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 * @author Orlando Becerra
 * @author Enrique Becerra
 */
@Entity
public class Sucursal extends BeanVO implements Serializable, Auditable, GridConSubGrids {

    /**
     * Pk autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Nombre completo de la sucursal
     * Autogenerado si es persona natural
     */
    @Column
    @Size(min = 2, max = 120)
    @BusinessKey
    private String nombre;
    /**
     *  Observacion del numero telefonico
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     *  Coleccion de telefonos de sucursales
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<TelefonoPersona> telefonos = new HashSet<TelefonoPersona>(0);
    /**
     * Coleccion de direcciones de sucursales
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<DireccionPersona> direcciones = new HashSet<DireccionPersona>(0);
    /**
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;
    /**
     */
    @Version
    @Column
    private Integer optLock;

    public Sucursal() {
    }

    public Sucursal(String nombre, String observacion, AuditoriaBasica auditoria) {
        this.nombre = nombre;
        this.observacion = observacion;
        this.auditoria = auditoria;
    }

    public Sucursal(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<TelefonoPersona> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Set<TelefonoPersona> telefonos) {
        this.telefonos = telefonos;
    }

    public Set<DireccionPersona> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Set<DireccionPersona> direcciones) {
        this.direcciones = direcciones;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }
}
