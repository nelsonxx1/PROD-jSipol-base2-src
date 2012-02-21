package modelo.entidades;

import modelo.util.bean.BeanVO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;
import modelo.entidades.menu.Rol;

/**
 * 
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
public class Usuario extends BeanVO implements Serializable, Auditable {

    public Usuario() {
        administraUsuarios = false;
        administrador = false;
        visible = true;
        superusuario=false;
    }

    public Usuario(String nombreCompleto, String userName, byte[] password2, AuditoriaBasica auditoria, Boolean visible, Boolean administrador, Boolean administraUsuarios) {
        this.nombreCompleto = nombreCompleto;
        this.userName = userName;
        this.password2 = password2;
        this.auditoria = auditoria;
        this.visible = visible;
        this.administrador = administrador;
        this.administraUsuarios = administraUsuarios;
        this.superusuario=false;
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
    private String nombreCompleto;
    /**
     * 
     */
    @Column(unique = true)
    @Size(min = 4, max = 20)
    @BusinessKey
    private String userName;
    /**
     *
     */
    transient private String password;
    /**
     *
     */
    @Column
    @BusinessKey
    private byte[] password2;
    /**
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean superusuario;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean modificarPermisos;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean visible;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean administrador;
    /**
     *
     */
    @ManyToOne
    @BusinessKey
    private Rol rol;

    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean administraUsuarios;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getAdministraUsuarios() {
        return administraUsuarios;
    }

    public void setAdministraUsuarios(Boolean administraUsuarios) {
        this.administraUsuarios = administraUsuarios;
    }

    public byte[] getPassword2() {
        return password2;
    }

    public void setPassword2(byte[] password2) {
        this.password2 = password2;
    }

    public Boolean getSuperusuario() {
        return superusuario;
    }

    public void setSuperusuario(Boolean superusuario) {
        this.superusuario = superusuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getModificarPermisos() {
        return modificarPermisos;
    }

    public void setModificarPermisos(Boolean modificarPermisos) {
        this.modificarPermisos = modificarPermisos;
    }

}
