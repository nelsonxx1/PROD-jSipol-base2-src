package modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.swing.Icon;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 * @author bc
 */
@Entity
public class Encabezado extends BeanVO implements Serializable {
    //TODO incluir a la persona que es de tipo productor para obtener sus datos

    /**
     *  PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String nombre;
    /**
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     */
    @Column
    @BusinessKey
    private String imagen;
    /**
     * 
     */
    @Column
    @BusinessKey
    private String rif2;
    /**
     *
     */
    @Column
    @BusinessKey
    private String superintendencia;
    /**
     *
     */
    @Column
    @BusinessKey
    private String telefonos;
    /**
     *
     */
    @Column
    @BusinessKey
    private String codigo;
    /**
     *
     */
    @Column
    @BusinessKey
    private String direccion;
    /**
     *
     */
    @Column
    @BusinessKey
    private String email;
    /**
     *
     */
    @Column
    @BusinessKey
    private String web;
    /**
     *
     */
    private transient Icon button;
    /**
     */
    @Version
    @Column
    private Integer optLock;

    public Encabezado() {
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Icon getButton() {
        return button;
    }

    public void setButton(Icon button) {
        this.button = button;
    }

    public String getRif2() {
        return rif2;
    }

    public void setRif2(String rif2) {
        this.rif2 = rif2;
    }

    public String getSuperintendencia() {
        return superintendencia;
    }

    public void setSuperintendencia(String superintendencia) {
        this.superintendencia = superintendencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
