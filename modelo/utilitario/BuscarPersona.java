/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.utilitario;

import modelo.entidades.personas.dominio.TipoPersona;
import modelo.util.bean.BeanVO;

/**
 *
 * @author Nelson Moncada
 * @author Orlando Becerra
 * 
 */
public class BuscarPersona extends BeanVO {
    private String rif;
    private String nombreLargo;
    private TipoPersona tipoPersona;

    public BuscarPersona() {
    }

    public String getNombreLargo() {
        return nombreLargo;
    }

    public void setNombreLargo(String nombreLargo) {
        this.nombreLargo = nombreLargo;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
