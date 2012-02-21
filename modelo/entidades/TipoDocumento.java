package modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import modelo.Dominios.Modulos;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.auditoria.Auditable;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 * Clase Dominio para los tipos de documentos
 * anexos que podria tener una persona
 * @version 1.0 22/05/2009
 * @since JDK 1.5
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
public class TipoDocumento extends BeanVO implements Serializable, Auditable {

    /**
     * Pk autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Tipo de documento
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String nombre;
    /**
     */
    @Column
    @Enumerated(EnumType.STRING)
    @BusinessKey
    private Modulos modulo;
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

    public TipoDocumento() {
    }

    public TipoDocumento(String nombre, Modulos modulo, AuditoriaBasica auditoria) {
        this.nombre = nombre;
        this.modulo = modulo;
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

    public Modulos getModulo() {
        return modulo;
    }

    public void setModulo(Modulos modulo) {
        this.modulo = modulo;
    }
}
