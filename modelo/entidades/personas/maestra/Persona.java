

package modelo.entidades.personas.maestra;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.Version;
import modelo.entidades.Documento;
import modelo.entidades.Observacion;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.util.bean.BeanVO;
import modelo.entidades.personas.dominio.TipoPersona;
import modelo.entidades.personas.dominio.TipoCapacidadEconomica;
import modelo.entidades.personas.dominio.TipoActividadEconomica;
import modelo.entidades.personas.transac.CuentaBancariaPersona;
import modelo.entidades.personas.transac.DireccionPersona;
import modelo.entidades.personas.transac.TelefonoPersona;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.Size;
import javax.validation.constraints.Past;
import modelo.Dominios.Ranking;
import modelo.Dominios.TipoContribuyente;

/**
 * Clase Maestra Supertipo de Personas
 * @version 1.1 22/05/2009
 * @since JDK 1.5
 * @see Tipo
 * @see TipoCapacidadEconomica
 * @see TipoActividadEconomica
 * @see TipoPersona
 * @see ObservacionPersona
 * @see EmailPersona
 * @see TelefonoPersona
 * @see DireccionPersona
 * @see DocumentoPersona
 * @see CuentaBancariaPersona
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona extends BeanVO implements Serializable, Auditable {

    /**
     * Pk autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Codigo en Archivo
     */
    @Column
    @BusinessKey
    private String codigoArchivo;
    /**
     * Codigo ??
     */
    @Column
    @BusinessKey
    private String codigoX;
    /**
     * Datos de la identificacion de la persona
     */
    @Embedded
    @BusinessKey
    private Rif rif;
    /**
     * Nombre completo de la persona
     * Autogenerado si es persona natural
     */
    @Column
    @Size(min = 2, max = 240)
    @Index(name = "nombreLargoPersona")
    @BusinessKey
    private String nombreLargo;
    /**
     * Nombre Corto de la persona
     */
    @Column
    @Index(name = "nombreCortoPersona")
    @BusinessKey(include = Method.TO_STRING)
    private String nombreCorto;
    /**
     *
     */
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private String alias2;
    /**
     * Email de la persona
     */
    @Column
    @Email
    @BusinessKey
    private String email;
    /**
     * Web de la persona
     */
    @Column
    @BusinessKey
    private String web;
    /**
     * Rankin de persona
     */
    @Column
    @Enumerated(EnumType.STRING)
    @BusinessKey
    private Ranking ranking;
    /**
     * Tipo de contribullente
     * <p>
     * Ejemplo: Contribuyente: formal, ordinario
     */
    @Column
    @Enumerated(EnumType.STRING)
    @BusinessKey
    private TipoContribuyente tipoContribuyente;
    /**
     * Fecha del ultimo balance de la persona
     */
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    @Past
    @BusinessKey
    private Date fechaUltimoBalance;
    /**
     * Es un ente gubernamental?
     */
    @Column
    @BusinessKey
    private Boolean gobierno;
    /**
     * Capacidad Economica de la persona
     */
    @ManyToOne()
    @BusinessKey
    private TipoCapacidadEconomica capacidadEconomica;
    /**
     * Actividad Economica de la persona
     */
    @ManyToOne()
    @BusinessKey
    private TipoActividadEconomica actividadEconomica;
    /**
     * Coleccion, tipo de persona
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<TipoPersona> tiposPersona = new HashSet<TipoPersona>(0);
    /**
     * Coleccion de observaciones de la persona
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    @OrderBy(value = "auditoria.fechaInsert")
    private List<Observacion> observaciones = new ArrayList<Observacion>(0);
    /**
     *  Coleccion de telefonos de la persona
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<TelefonoPersona> telefonos = new HashSet<TelefonoPersona>(0);
    /**
     * Coleccion de direcciones de la persona
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<DireccionPersona> direcciones = new HashSet<DireccionPersona>(0);
    /**
     * Coleccion de documentos anexos de la persona
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<Documento> documentos = new HashSet<Documento>(0);
    /**
     * Coleccion de cuentas bancarias de la persona
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<CuentaBancariaPersona> cuentasBancarias = new HashSet<CuentaBancariaPersona>(0);
    /**
     * Coleccion de sucursales de de la persona juridica
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @BusinessKey(exclude = Method.ALL)
    private Set<Sucursal> sucursales = new HashSet<Sucursal>(0);    
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
    
    public Persona() {
        auditoria = new AuditoriaBasica();
    }

    public Persona(Rif rif) {
        this.rif = rif;
    }

    public Persona(Rif rif, Ranking ranking, TipoContribuyente tipoContribuyente, Date fechaUltimoBalance, Boolean gobierno) {
        this.gobierno = gobierno;
        this.rif = rif;
        this.ranking = ranking;
        this.tipoContribuyente = tipoContribuyente;
        this.fechaUltimoBalance = fechaUltimoBalance;
    }

    public Persona(Rif rif, Ranking ranking, TipoContribuyente tipoContribuyente, Date fechaUltimoBalance, Boolean gobierno, TipoCapacidadEconomica capacidadEconomica, TipoActividadEconomica actividadEconomica) {
        this.gobierno = gobierno;
        this.rif = rif;
        this.ranking = ranking;
        this.tipoContribuyente = tipoContribuyente;
        this.fechaUltimoBalance = fechaUltimoBalance;
        this.capacidadEconomica = capacidadEconomica;
        this.actividadEconomica = actividadEconomica;
    }

    public TipoActividadEconomica getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(TipoActividadEconomica actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public TipoCapacidadEconomica getCapacidadEconomica() {
        return capacidadEconomica;
    }

    public void setCapacidadEconomica(TipoCapacidadEconomica capacidadEconomica) {
        this.capacidadEconomica = capacidadEconomica;
    }

    public Set<CuentaBancariaPersona> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(Set<CuentaBancariaPersona> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public Set<DireccionPersona> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Set<DireccionPersona> direcciones) {
        this.direcciones = direcciones;
    }

    public Set<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }

    public Date getFechaUltimoBalance() {
        return fechaUltimoBalance;
    }

    public void setFechaUltimoBalance(Date fechaUltimoBalance) {
        this.fechaUltimoBalance = fechaUltimoBalance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombreLargo() {
        return nombreLargo;
    }

    public void setNombreLargo(String nombreLargo) {
        this.nombreLargo = nombreLargo;
    }

    public List<Observacion> getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(List<Observacion> observaciones) {
        this.observaciones = observaciones;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Set<TelefonoPersona> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Set<TelefonoPersona> telefonos) {
        this.telefonos = telefonos;
    }

    public TipoContribuyente getTipoContribuyente() {
        return tipoContribuyente;
    }

    public void setTipoContribuyente(TipoContribuyente tipoContribuyente) {
        this.tipoContribuyente = tipoContribuyente;
    }

    public Set<TipoPersona> getTiposPersona() {
        return tiposPersona;
    }

    public void setTiposPersona(Set<TipoPersona> tiposPersona) {
        this.tiposPersona = tiposPersona;
    }

    public Boolean getGobierno() {
        return gobierno;
    }

    public void setGobierno(Boolean gobierno) {
        this.gobierno = gobierno;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    public String getCodigoArchivo() {
        return codigoArchivo;
    }

    public void setCodigoArchivo(String codigoArchivo) {
        this.codigoArchivo = codigoArchivo;
    }

    public Rif getRif() {
        return rif;
    }

    public void setRif(Rif rif) {
        this.rif = rif;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String toString2() {
        return "Persona[ "
                + "id=" + id + ", "
                + "rif=" + rif.toString() + ", "
                + "ranking=" + ranking + ", "
                + "tipoContribuyente=" + tipoContribuyente + ", "
                + "fechaUltimoBalance=" + fechaUltimoBalance + ", "
                + "capacidadEconomica=" + capacidadEconomica.getId() + ", "
                + "actividadEconomica=" + actividadEconomica.getId() + "]";
    }

    public String getCodigoX() {
        return codigoX;
    }

    public void setCodigoX(String codigoX) {
        this.codigoX = codigoX;
    }

    public String getAlias2() {
        return alias2;
    }

    public void setAlias2(String alias2) {
        this.alias2 = alias2;
    }
}
