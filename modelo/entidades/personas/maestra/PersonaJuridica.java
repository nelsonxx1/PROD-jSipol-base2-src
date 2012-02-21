package modelo.entidades.personas.maestra;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import modelo.entidades.personas.dominio.TipoActividadEconomica;
import modelo.entidades.personas.dominio.TipoCapacidadEconomica;
import modelo.util.ehts.BusinessKey;
import javax.validation.constraints.Past;
import modelo.Dominios.Ranking;
import modelo.Dominios.TipoContribuyente;

/**
 *  Clase Maestra de Personas Juridicas
 *  @version 1.0 22/05/2009
 *  @since JDK 1.5
 *  @see Persona
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Entity
public class PersonaJuridica extends Persona {

    /**
     * Fecha de Registro Mercantil
     */
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    @Past
    @BusinessKey
    private Date fechaRegistro;
    /**
     * Numero de Registro Mercantil
     */
    @Column
    @BusinessKey
    private String numeroRegistro;
    /**
     * Tomo del Registro Mercantil
     */
    @Column
    @BusinessKey
    private String numeroTomo;
    /**
     *
     */
    @Column
    @BusinessKey
    private String numeroGaceta;
    /**
     * Capital suscrito de la persona juridica
     */
    @Column
    @BusinessKey
    private Double montoCapitalSuscrito;
    /**
     * Capital pagado de la persona juridica
     */
    @Column
    @BusinessKey
    private Double montoCapitalPagado;
    /**
     * Monto del patrimonio neto
     */
    @Column
    @BusinessKey
    private Double montoPatrimonioNeto;

    public PersonaJuridica() {
    }

    public PersonaJuridica(Rif rif, Ranking ranking, TipoContribuyente tipoContribuyente, Date fechaUltimoBalance, Boolean gobierno, Date fechaRegistro, String numeroRegistro, String numeroTomo, Double montoCapitalSuscrito, Double montoCapitalPagado, Double montoPatrimonioNeto) {
        super(rif, ranking, tipoContribuyente, fechaUltimoBalance, gobierno);
        this.fechaRegistro = fechaRegistro;
        this.numeroRegistro = numeroRegistro;
        this.numeroTomo = numeroTomo;
        this.montoCapitalSuscrito = montoCapitalSuscrito;
        this.montoCapitalPagado = montoCapitalPagado;
        this.montoPatrimonioNeto = montoPatrimonioNeto;
    }

    public PersonaJuridica(Rif rif, Ranking ranking, TipoContribuyente tipoContribuyente, Date fechaUltimoBalance, Boolean gobierno, TipoCapacidadEconomica capacidadEconomica, TipoActividadEconomica actividadEconomica, Date fechaRegistro, String numeroRegistro, String numeroTomo, Double montoCapitalSuscrito, Double montoCapitalPagado, Double montoPatrimonioNeto) {
        super(rif, ranking, tipoContribuyente, fechaUltimoBalance, gobierno, capacidadEconomica, actividadEconomica);
        this.fechaRegistro = fechaRegistro;
        this.numeroRegistro = numeroRegistro;
        this.numeroTomo = numeroTomo;
        this.montoCapitalSuscrito = montoCapitalSuscrito;
        this.montoCapitalPagado = montoCapitalPagado;
        this.montoPatrimonioNeto = montoPatrimonioNeto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getMontoCapitalPagado() {
        return montoCapitalPagado;
    }

    public void setMontoCapitalPagado(Double montoCapitalPagado) {
        this.montoCapitalPagado = montoCapitalPagado;
    }

    public Double getMontoCapitalSuscrito() {
        return montoCapitalSuscrito;
    }

    public void setMontoCapitalSuscrito(Double montoCapitalSuscrito) {
        this.montoCapitalSuscrito = montoCapitalSuscrito;
    }

    public Double getMontoPatrimonioNeto() {
        return montoPatrimonioNeto;
    }

    public void setMontoPatrimonioNeto(Double montoPatrimonioNeto) {
        this.montoPatrimonioNeto = montoPatrimonioNeto;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroTomo() {
        return numeroTomo;
    }

    public void setNumeroTomo(String numeroTomo) {
        this.numeroTomo = numeroTomo;
    }

    public String getNumeroGaceta() {
        return numeroGaceta;
    }

    public void setNumeroGaceta(String numeroGaceta) {
        this.numeroGaceta = numeroGaceta;
    }

    @Override
    public String toString2() {
        return "PersonaJuridica[ " +
                super.toString2() + ", " +
                "fechaRegistro=" + fechaRegistro + ", " +
                "numeroRegistro=" + numeroRegistro + ", " +
                "numeroTomo=" + numeroTomo + ", " +
                "montoCapitalSuscrito=" + montoCapitalSuscrito + ", " +
                "montoCapitalPagado=" + montoCapitalPagado + ", " +
                "montoPatrimonioNeto=" + montoPatrimonioNeto + "]";
    }
}
