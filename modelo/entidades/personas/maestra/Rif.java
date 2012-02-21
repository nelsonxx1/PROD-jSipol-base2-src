package modelo.entidades.personas.maestra;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import modelo.Dominios.TipoCedula;
import org.hibernate.validator.constraints.Range;

/**
 * Clase Embebible que contiene el rif de Persona
 * No se crea una tabla,
 * forma parte de la clase que la utiliza
 * @version 1.0 24/08/2009
 * @since JDK 1.5
 * @author Orlando Becerra
 */
@Embeddable
public class Rif extends BeanVO implements Serializable {

    /**
     * Tipo de cedula de persona
     */
    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    @BusinessKey
    private TipoCedula tipoCedula;
    /**
     * numero de edula de persona
     */
    @Column
    @NotNull
    @Range(min = 0)
    @BusinessKey
    private Integer numeroCedula;
    /**
     * Cedula completa, ejm: V18256941
     */
    //@Column(unique = true)
    @Column
    @NotEmpty
    @Index(name = "cedulaCompletaPersonaIndex")
    @BusinessKey
    private String cedulaCompleta;
    /**
     * Numero Final del RIF de la persona ejm: V18256941-""7""
     */
    @Column
    @BusinessKey
    private Integer finRif;
    /**
     * cuando un mismo rif esta registrado con diferentes nombres juridicos x ejm: V-18256941-5: Orlando Becerra, V-18256939-5 Venta de Cartuchos
     */
    @Column
    @BusinessKey
    private Integer secuencia;
    /**
     * Rif completo. ejm: V18256941-7
     */
    @Column
    @Index(name = "rifPersonaIndex")
    @BusinessKey
    private String rif;

    public Rif() {
    }

    public Rif(TipoCedula tipoCedula, Integer numeroCedula) {
        this.tipoCedula = tipoCedula;
        this.numeroCedula = numeroCedula;
        this.cedulaCompleta = "" + tipoCedula.getIn() + numeroCedula;
        String s = String.valueOf(numeroCedula);
        System.out.println(s);
        StringBuilder sb = new StringBuilder("00000000");
        sb.replace(8 - s.length(), 8, s);
        this.rif = "" + tipoCedula.getIn() + sb.toString();
    }

    public Rif(TipoCedula tipoCedula, Integer numeroCedula, Integer finRif) {
        this.tipoCedula = tipoCedula;
        this.numeroCedula = numeroCedula;
        this.cedulaCompleta = "" + tipoCedula.getIn() + numeroCedula;
        this.finRif = finRif;
        String s = String.valueOf(numeroCedula);
        StringBuilder sb = new StringBuilder("00000000");
        sb.replace(8 - s.length(), 8, s);
        this.rif = "" + tipoCedula.getIn() + sb.toString() + "-" + finRif;
    }

    public String getCedulaCompleta() {
        return cedulaCompleta;
    }

    public void setCedulaCompleta(String cedulaCompleta) {
        this.cedulaCompleta = cedulaCompleta;
    }

    public Integer getFinRif() {
        return finRif;
    }

    public void setFinRif(Integer finRif) {
        this.finRif = finRif;
    }

    public Integer getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(Integer numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public TipoCedula getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(TipoCedula tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }
}
