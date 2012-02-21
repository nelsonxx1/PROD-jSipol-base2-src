package modelo.entidades.menu;

import modelo.util.bean.BeanVO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 * 
 * @author Luis Adrian Gonzalez Benavides
 */
@Entity
public class Rol extends BeanVO implements Serializable, Auditable {

    public Rol() {
    }

    public Rol(String nombre) {
        this.nombre= nombre;
    }
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     *
     */
    @Column
    @Size(min = 4, max = 100)
    @BusinessKey
    private String nombre;
    /**
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;
    /**
     *
     */
    @Version
    @Column
    private Integer optLock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
