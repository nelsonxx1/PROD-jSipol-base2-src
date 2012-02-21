package modelo.entidades.personas.dominio;

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
import org.hibernate.validator.constraints.Range;

/**
 * Clase Dominio para los tipos de telefonos
 * que podria tener una persona
 * @version 1.0 22/05/2009
 * @since JDK 1.5
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
public class TipoCodigoArea extends BeanVO implements Serializable, Auditable {

    /**
     * Pk autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Tipo de telefono
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String nombre;
    /**
     *
     */
    @Column
    @Range(min = 99, max = 999)
    @BusinessKey
    private Integer numero;
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

    public TipoCodigoArea() {
    }

    public TipoCodigoArea(String nombre, Integer numero, AuditoriaBasica auditoria) {
        this.numero = numero;
        this.nombre = nombre;
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

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
