package modelo.entidades.auditoria;

import modelo.util.bean.BeanVO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import modelo.util.ehts.BusinessKey;

/**
 * Clase Embebible para la auditoria basica
 * No se crea una tabla,
 * forma parte de la clase que la utiliza 
 * @version 1.0 29/05/2009
 * @since JDK 1.5
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Embeddable
public class AuditoriaBasica extends BeanVO implements Serializable {

    /**
     * Fecha y Hora de la insercion del registro
     */
    @Column
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fechaInsert;
    /**
     * Fecha y Hora de la ultima modificacion
     */
    @Column
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fechaUpdate;
    /**
     * Usuario que inserto el registro
     */
    @BusinessKey
    private String usuarioInsert;
    /**
     * Usuario que realizo la ultima modificacion
     */
    @BusinessKey
    private String usuarioUpdate;
    /**
     * Indicador de estado
     */
    @Column
    @BusinessKey
    private Boolean activo;
    /**
     * Indicador de estado
     */
    @Column
    @BusinessKey
    private Boolean editable2;
    /**
     * Indicador de estado
     */
    @Column
    @BusinessKey
    private Boolean borrable;
    /**
     * Indicador de estado
     */
    @Column
    @BusinessKey
    private Boolean visible2;
    /**
     */
    @Column
    @BusinessKey
    private String observacion2;

    public AuditoriaBasica() {
        activo = true;
        editable2 = true;
        visible2 = true;
        borrable = true;
    }

    public AuditoriaBasica(Date fechaInsert, String usuarioInsert, Boolean activo) {
        this.fechaInsert = fechaInsert;
        this.usuarioInsert = usuarioInsert;
        this.activo = activo;
    }

    public AuditoriaBasica(Date fechaInsert, String usuarioInsert, Boolean activo, Boolean editable2, Boolean borrable, Boolean visible2) {
        this.fechaInsert = fechaInsert;
        this.usuarioInsert = usuarioInsert;
        this.activo = activo;
        this.editable2 = editable2;
        this.borrable = borrable;
        this.visible2 = visible2;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaInsert() {
        return fechaInsert;
    }

    public void setFechaInsert(Date fechaInsert) {
        this.fechaInsert = fechaInsert;
    }

    public Date getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

    public String getUsuarioInsert() {
        return usuarioInsert;
    }

    public void setUsuarioInsert(String usuarioInsert) {
        this.usuarioInsert = usuarioInsert;
    }

    public String getUsuarioUpdate() {
        return usuarioUpdate;
    }

    public void setUsuarioUpdate(String usuarioUpdate) {
        this.usuarioUpdate = usuarioUpdate;
    }

    public Boolean getBorrable() {
        return borrable;
    }

    public void setBorrable(Boolean borrable) {
        this.borrable = borrable;
    }

    public Boolean getEditable2() {
        return editable2;
    }

    public void setEditable2(Boolean editable2) {
        this.editable2 = editable2;
    }

    public String getObservacion2() {
        return observacion2;
    }

    public void setObservacion2(String observacion2) {
        this.observacion2 = observacion2;
    }

    public Boolean getVisible2() {
        return visible2;
    }

    public void setVisible2(Boolean visible2) {
        this.visible2 = visible2;
    }
}
