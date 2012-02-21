package modelo.entidades.personas.dominio;

import modelo.entidades.personas.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.auditoria.Auditable;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 * Clase Dominio para los tipos de personas
 * @version 1.0 22/05/2009
 * @since JDK 1.5
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
public class TipoPersona extends BeanVO implements Serializable, Auditable {

    /**
     * Pk autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * UK propio de la aplicacion para el control y ubicacion del tipo de cliente
     */
    @Column(updatable = false, unique = true)
    @Size(max = 10)
    @BusinessKey
    private String idPropio;
    /**
     * Tipo de persona
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String nombre;
    /**
     * El registro esta bloqueado y no puede ser modificado
     * xq es propio del sistema
     */
    @Column
    @BusinessKey
    private Boolean bloqueado;
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

    public TipoPersona() {
        this.bloqueado = false;
    }

    public TipoPersona(String idPropio, String nombre, Boolean bloqueado, AuditoriaBasica auditoria) {
        this.idPropio = idPropio;
        this.nombre = nombre;
        this.bloqueado = bloqueado;
        this.auditoria = auditoria;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
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

    public String getIdPropio() {
        return idPropio;
    }

    public void setIdPropio(String idPropio) {
        this.idPropio = idPropio;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public Boolean isBloqueado() {
        return bloqueado;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
}
