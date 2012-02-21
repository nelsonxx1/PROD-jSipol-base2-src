package modelo.entidades;

import modelo.interfaces.Documentable;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.Version;
import javax.swing.Icon;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.entidades.auditoria.Auditable;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *  Clase Asociativa entre la persona y el tipo de
 *  Documento Anexo
 *  @version 1.0 22/05/2009
 *  @since JDK 1.5
 *  @see Persona
 *  @see TipoDocumentoAnexo
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Documento extends BeanVO implements Serializable, Auditable, Documentable {

    /**
     *  PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     *  Observacion del documento
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     * Tipo de documento que posse el documento
     */
    @ManyToOne
    @NotNull
    //@BusinessKey(include = Method.TO_STRING)
    private TipoDocumento tipoDocumento;
    /**
     *
     */
    @Column
    @NotEmpty
    //@BusinessKey(exclude=Method.ALL,include=Method.TO_STRING)
    private String fileName;
    /**
     *
     */
    @Column
    @NotNull
    //@BusinessKey
    private Integer fileLength;
    /**
     *
     */
    transient private byte[] file;
    /**
     *
     */
    private transient Icon button;
        /**
     *
     */
    @Column
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fechaVencimiento;
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

    public Documento() {
    }

    public Documento(String observacion, TipoDocumento tipoDocumento, AuditoriaBasica auditoria) {
        this.observacion = observacion;
        this.tipoDocumento = tipoDocumento;
        this.auditoria = auditoria;
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

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    public Icon getButton() {
        return button;
    }

    public void setButton(Icon button) {
        this.button = button;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileLength() {
        return fileLength;
    }

    public void setFileLength(Integer fileLength) {
        this.fileLength = fileLength;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
