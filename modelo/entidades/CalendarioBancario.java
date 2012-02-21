package modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Version;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 *
 * @author bc
 */
@Entity
public class CalendarioBancario extends BeanVO implements Serializable {

    /**
     * Pk autogenerado
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
    @Size(min = 4, max = 120)
    @BusinessKey
    private String nombre;
    /**
     *
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     * 
     */
    @Column
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fecha;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean bancario;
    /**
     * 
     */
    @Column
    @BusinessKey
    private Boolean nacional;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean regional;
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

    public CalendarioBancario() {
    }

    public CalendarioBancario(String nombre, String observacion, Date fecha, Boolean bancario, Boolean nacional, Boolean regional, AuditoriaBasica auditoria) {
        this.nombre = nombre;
        this.observacion = observacion;
        this.fecha = fecha;
        this.bancario = bancario;
        this.nacional = nacional;
        this.regional = regional;
        this.auditoria = auditoria;
    }


    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    public Boolean isBancario() {
        return bancario;
    }

    public void setBancario(Boolean bancario) {
        this.bancario = bancario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Boolean isRegional() {
        return regional;
    }

    public void setRegional(Boolean regional) {
        this.regional = regional;
    }
}
