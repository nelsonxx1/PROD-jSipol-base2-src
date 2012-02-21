package modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 * @author Orlando Becerra
 */
@Entity
//TODO sacar de las tablas quitar entity ok
public class ParametroReporte extends BeanVO implements Serializable {

    /**
     * Pk autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Tipo de documento
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String atributo;
    /**
     */
    @Column
    @BusinessKey
    private String operador;
    /**
     */
    @Column
    @BusinessKey
    private String valor;
    /**
     */
    @Version
    @Column(name = "OPTLOCK")
    private Integer optLock;

    public ParametroReporte() {
    }

    public ParametroReporte(String atributo, String operador, String valor) {
        this.atributo = atributo;
        this.operador = operador;
        this.valor = valor;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }
}
