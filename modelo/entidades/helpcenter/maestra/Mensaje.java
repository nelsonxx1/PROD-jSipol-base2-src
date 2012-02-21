package modelo.entidades.helpcenter.maestra;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Version;
import modelo.Dominios.Prioridad;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;

/**
 *
 * @author bc
 */
@Entity
public class Mensaje extends BeanVO implements Serializable {

    public Mensaje() {
        fechaEnvio = new Date();
    }

    public Mensaje(String de, String para, String nombreEquipo, Prioridad prioridad, String asunto, String usuarioEnvio, Date fechaEnvio, String fileNameEnvio, Integer fileLengthEnvio, String mensajeEnvio, String usuarioRespuesta, Date fechaRespuesta, String fileNameRespuesta, Integer fileLengthRespuesta, String mensajeRespuesta, byte[] fileRespuesta, byte[] fileEnvio) {
        this.nombreEquipo = nombreEquipo;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.usuarioEnvio = usuarioEnvio;
        this.fechaEnvio = fechaEnvio;
        this.fileNameEnvio = fileNameEnvio;
        this.fileLengthEnvio = fileLengthEnvio;
        this.mensajeEnvio = mensajeEnvio;
        this.usuarioRespuesta = usuarioRespuesta;
        this.fechaRespuesta = fechaRespuesta;
        this.fileNameRespuesta = fileNameRespuesta;
        this.fileLengthRespuesta = fileLengthRespuesta;
        this.mensajeRespuesta = mensajeRespuesta;
        this.fileRespuesta = fileRespuesta;
        this.fileEnvio = fileEnvio;
        this.para = para;
        this.de = de;
    }
    /**
     *  PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PK_TPERDOC006")
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     *
     */
    @BusinessKey
    private String para;
    /**
     *
     */
    @BusinessKey
    private String de;
    /**
     *
     */
    @Column(name = "NB_EQUIPO")
    @BusinessKey
    private String nombreEquipo;
    @Column(name = "IN_PRIORI")
    @Enumerated(EnumType.STRING)
    @BusinessKey
    private Prioridad prioridad;
    @Column(name = "NB_ASUNTO")
    @BusinessKey
    private String asunto;
    @Column(name = "NB_USUENV")
    @BusinessKey
    private String usuarioEnvio;
    @Column(name = "FE_ENVIO")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fechaEnvio;
    @Column(name = "NB_FILENV")
    @BusinessKey
    private String fileNameEnvio;
    @Column(name = "NU_LENENV")
    @BusinessKey
    private Integer fileLengthEnvio;
    @Column(name = "TX_MENENV")
    @BusinessKey
    private String mensajeEnvio;
    @Column(name = "NB_USURES")
    @BusinessKey
    private String usuarioRespuesta;
    @Column(name = "FE_RESPUE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @BusinessKey
    private Date fechaRespuesta;
    @Column(name = "NB_FILRES")
    @BusinessKey
    private String fileNameRespuesta;
    @Column(name = "NU_LENRES")
    @BusinessKey
    private Integer fileLengthRespuesta;
    @Column(name = "TX_MENRES")
    @BusinessKey
    private String mensajeRespuesta;
    transient private byte[] fileRespuesta;
    transient private byte[] fileEnvio;
    /**
     * Versioning for optimistic locking.
     * The entity manager will use it to detect conflicting updates,
     * Preventing lost updates you might otherwise see with
     * the last-commit-wins strategy.
     * The application must not alter the version number set
     * up by Hibernate in any way.
     */
    @Version
    @Column(name = "OPTLOCK")
    private Integer optLock;

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public byte[] getFileEnvio() {
        return fileEnvio;
    }

    public void setFileEnvio(byte[] fileEnvio) {
        this.fileEnvio = fileEnvio;
    }

    public Integer getFileLengthEnvio() {
        return fileLengthEnvio;
    }

    public void setFileLengthEnvio(Integer fileLengthEnvio) {
        this.fileLengthEnvio = fileLengthEnvio;
    }

    public Integer getFileLengthRespuesta() {
        return fileLengthRespuesta;
    }

    public void setFileLengthRespuesta(Integer fileLengthRespuesta) {
        this.fileLengthRespuesta = fileLengthRespuesta;
    }

    public String getFileNameEnvio() {
        return fileNameEnvio;
    }

    public void setFileNameEnvio(String fileNameEnvio) {
        this.fileNameEnvio = fileNameEnvio;
    }

    public String getFileNameRespuesta() {
        return fileNameRespuesta;
    }

    public void setFileNameRespuesta(String fileNameRespuesta) {
        this.fileNameRespuesta = fileNameRespuesta;
    }

    public byte[] getFileRespuesta() {
        return fileRespuesta;
    }

    public void setFileRespuesta(byte[] fileRespuesta) {
        this.fileRespuesta = fileRespuesta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensajeEnvio() {
        return mensajeEnvio;
    }

    public void setMensajeEnvio(String mensajeEnvio) {
        this.mensajeEnvio = mensajeEnvio;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getUsuarioEnvio() {
        return usuarioEnvio;
    }

    public void setUsuarioEnvio(String usuarioEnvio) {
        this.usuarioEnvio = usuarioEnvio;
    }

    public String getUsuarioRespuesta() {
        return usuarioRespuesta;
    }

    public void setUsuarioRespuesta(String usuarioRespuesta) {
        this.usuarioRespuesta = usuarioRespuesta;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }
}
