package modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.persistence.Version;
import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Orlando Becerra
 */
@Entity
public class Empresa extends BeanVO implements Serializable {

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
    @BusinessKey
    private String smsUsuario;
    /**
     *
     */
    @Column
    @BusinessKey
    private String smsClave;
    /**
     *
     */
    @Column
    @BusinessKey
    private String rif2;
    /**
     */
    @Column
    @Size(min = 2, max = 240)
    @BusinessKey
    private String nombre;
    /**
     */
    @Column
    @BusinessKey
    private String telefonos;
    /**
     */
    @Column
    @BusinessKey
    private String superintendencia;
    /**
     */
    @Column
    @BusinessKey
    private String direccion;
    /**
     * Email de la persona
     */
    @Column
    @Email
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
    @Column
    @BusinessKey
    private String codigo;
    /**
     *
     */
    @Column
    @Email
    @NotNull
    @BusinessKey
    private String emailEmpresaSoporte;
    /**
     *
     */
    @Column
    @Email
    @NotNull
    @BusinessKey
    private String emailSistemaSoporte;
    /**
     *
     */
    @Column
    @Size(min = 1)
    @BusinessKey
    private String rutaDocDigitales;
    /**
     *
     */
    @Column
    @Size(min = 1)
    @BusinessKey
    private String rutaReportes;
    /*
     *
     */
    @Column
    @BusinessKey
    private Boolean fileGridProfileManager;
    /*
     *
     */
    @Column
    @BusinessKey
    private Boolean smsBienvenida;
    /*
     *
     */
    @Column
    @BusinessKey
    private Boolean smsVariosProductores;
    /*
     *
     */
    @Column
    @BusinessKey
    private Boolean textoMayuscula;
    /**
     *
     */
    @Version
    @Column
    private Integer optLock;

    public Empresa() {
        textoMayuscula = false;
        smsBienvenida = true;
        fileGridProfileManager=false;
    }

    public Empresa(String rif2, String nombre, String emailEmpresaSoporte, String emailSistemaSoporte, String rutaDocDigitales, String rutaReportes) {
        this.rif2 = rif2;
        this.nombre = nombre;
        this.emailEmpresaSoporte = emailEmpresaSoporte;
        this.emailSistemaSoporte = emailSistemaSoporte;
        this.rutaDocDigitales = rutaDocDigitales;
        this.rutaReportes = rutaReportes;
        textoMayuscula = false;
        smsBienvenida = true;
        fileGridProfileManager=false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailEmpresaSoporte() {
        return emailEmpresaSoporte;
    }

    public void setEmailEmpresaSoporte(String emailEmpresaSoporte) {
        this.emailEmpresaSoporte = emailEmpresaSoporte;
    }

    public String getEmailSistemaSoporte() {
        return emailSistemaSoporte;
    }

    public void setEmailSistemaSoporte(String emailSistemaSoporte) {
        this.emailSistemaSoporte = emailSistemaSoporte;
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

    public String getRutaDocDigitales() {
        return rutaDocDigitales;
    }

    public void setRutaDocDigitales(String rutaDocDigitales) {
        this.rutaDocDigitales = rutaDocDigitales;
    }

    public String getRutaReportes() {
        return rutaReportes;
    }

    public void setRutaReportes(String rutaReportes) {
        this.rutaReportes = rutaReportes;
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

    public Boolean getTextoMayuscula() {
        return textoMayuscula;
    }

    public void setTextoMayuscula(Boolean textoMayuscula) {
        this.textoMayuscula = textoMayuscula;
    }

    public String getRif2() {
        return rif2;
    }

    public void setRif2(String rif2) {
        this.rif2 = rif2;
    }

    public String getSmsClave() {
        return smsClave;
    }

    public void setSmsClave(String smsClave) {
        this.smsClave = smsClave;
    }

    public String getSmsUsuario() {
        return smsUsuario;
    }

    public void setSmsUsuario(String smsUsuario) {
        this.smsUsuario = smsUsuario;
    }

    public Boolean getSmsBienvenida() {
        return smsBienvenida;
    }

    public void setSmsBienvenida(Boolean smsBienvenida) {
        this.smsBienvenida = smsBienvenida;
    }

    public Boolean getSmsVariosProductores() {
        return smsVariosProductores;
    }

    public void setSmsVariosProductores(Boolean smsVariosProductores) {
        this.smsVariosProductores = smsVariosProductores;
    }

    public Boolean getFileGridProfileManager() {
        return fileGridProfileManager;
    }

    public void setFileGridProfileManager(Boolean fileGridProfileManager) {
        this.fileGridProfileManager = fileGridProfileManager;
    }

    public String getSuperintendencia() {
        return superintendencia;
    }

    public void setSuperintendencia(String superintendencia) {
        this.superintendencia = superintendencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
