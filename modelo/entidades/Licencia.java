package modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Version;
import javax.validation.constraints.Future;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author bc
 */
@Entity
public class Licencia extends BeanVO implements Serializable {

    public Licencia() {
        blockSize=10;
    }

    public Licencia(String nombreEquipo, String descripcionEquipo, byte[] serialEquipo, String codigoCamara, Boolean activo, Date fechaDesde, Date fechaHasta, Boolean activoTipDelDia, Integer blockSize) {
        this.nombreEquipo = nombreEquipo;
        this.descripcionEquipo = descripcionEquipo;
        this.serialEquipo = serialEquipo;
        this.codigoCamara = codigoCamara;
        this.activo = activo;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.activoTipDelDia = activoTipDelDia;
        this.blockSize=blockSize;
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
    @Size(min = 2)
    @BusinessKey
    private String nombreEquipo;
    /**
     *
     */
    @Column
    @Size(min = 2, max = 80)
    @BusinessKey
    private String descripcionEquipo;
    /**
     *
     */
    @Column
    @NotEmpty
    @BusinessKey
    private byte[] serialEquipo;
    /**
     *
     */
    @Column
    @BusinessKey
    private String codigoCamara;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean activo;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean activoTipDelDia;
    /**
     *
     */
    @Column
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fechaDesde;
    /**
     *
     */
    @Column
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Future
    @BusinessKey
    private Date fechaHasta;
    /**
     *
     */
    @Column
    private Integer blockSize;
    /**
     *
     */
    @Version
    @Column
    private Integer optLock;

    public Boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDescripcionEquipo() {
        return descripcionEquipo;
    }

    public void setDescripcionEquipo(String descripcionEquipo) {
        this.descripcionEquipo = descripcionEquipo;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public byte[] getSerialEquipo() {
        return serialEquipo;
    }

    public void setSerialEquipo(byte[] serialEquipo) {
        this.serialEquipo = serialEquipo;
    }

    public String getCodigoCamara() {
        return codigoCamara;
    }

    public void setCodigoCamara(String codigoCamara) {
        this.codigoCamara = codigoCamara;
    }

    public Boolean isActivoTipDelDia() {
        return activoTipDelDia;
    }

    public void setActivoTipDelDia(Boolean activoTipDelDia) {
        this.activoTipDelDia = activoTipDelDia;
    }

    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }
}
