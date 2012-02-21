/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import org.hibernate.annotations.Entity;

/**
 *
 * @author NELSON
 */
@Entity
public class ConfiguracionReportes extends BeanVO implements Serializable{

    public ConfiguracionReportes() {
    }

    /**
     *  PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(exclude= Method.ALL)
    private Long id;

    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String nombre;

    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String telefonos;

    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String rif;

    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String direccion;

    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String emails;

    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String paginaWeb;
    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String esloganSuper;
    /**
     *
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String codigoSuper;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
