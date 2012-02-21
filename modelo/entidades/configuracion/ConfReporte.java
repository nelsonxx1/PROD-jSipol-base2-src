/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entidades.configuracion;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import modelo.entidades.Reporte;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import org.hibernate.annotations.Entity;

/**
 *
 * @author NELSON
 */
@Entity
public class ConfReporte{
    /**
     * Pk autogenerado
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
    private Boolean incioAplicacion;

    private Reporte reporte;

    private String descripcion;



    public ConfReporte() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
