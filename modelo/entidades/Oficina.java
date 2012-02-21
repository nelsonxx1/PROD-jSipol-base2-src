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

/**
 *
 * @author Orlando Becerra
 */
@Entity
public class Oficina extends BeanVO implements Serializable {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     */
    @Column
    @Size(min = 2, max = 240)
    @BusinessKey
    private String nombre;
    /**
     */
    @Column
    @Size(min = 2, max = 240)
    @BusinessKey
    private String codigo;
    /**
     */
    @Column
    @BusinessKey
    private String responsable;
    /**
     */
    @Column
    @BusinessKey
    private String telefono;
    /**
     */
    @Column
    @BusinessKey
    private String direccion;
    /**
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     *
     */
    @Column
    @Email
    @BusinessKey
    private String emailEmpresaSoporte;
    /**
     *
     */
    @Column
    @Email
    @BusinessKey
    private String emailSistemaSoporte;
    /**
     *
     */
    @Version
    @Column
    private Integer optLock;

    public Oficina() {
    }

    public Oficina(String nombre) {
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
