package modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import modelo.Dominios.CategoriaReporte;
import modelo.util.bean.BeanVO;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;
import javax.validation.constraints.Size;

/**
 *
 * @author bc
 */
@Entity
public class Reporte extends BeanVO implements Serializable {

    public Reporte() {
    }

    public Reporte(CategoriaReporte categoria, int tipo, String file, String titulo, String observacion, String baseSQL) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.file = file;
        this.titulo = titulo;
        this.observacion = observacion;
        this.baseSQL = baseSQL;
         this.tipoPapel="Carta";
    }

    public Reporte(CategoriaReporte categoria, int tipo, String file, String titulo, String observacion, String baseSQL,String tipoPapel) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.file = file;
        this.titulo = titulo;
        this.observacion = observacion;
        this.baseSQL = baseSQL;
        this.tipoPapel=tipoPapel;
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
     */
    @Version
    @Column
    @BusinessKey(exclude= Method.ALL)
    private Integer optLock;
    /**
     */
    @Column
    @Enumerated(EnumType.STRING)
    @BusinessKey(exclude= Method.EQUALS)
    private CategoriaReporte categoria;
        /**
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private String tipoPapel;
    /**
     */
    @Column
    @BusinessKey(exclude= Method.EQUALS)
    private int tipo;
    /**
     */
    @Column
    @Size(min = 2, max = 200)
    @BusinessKey(include=Method.EQUALS)
    private String file;
    /**
     */
    @Column
    @Size(min = 2, max = 100)
    @BusinessKey(exclude= Method.EQUALS)
    private String titulo;
    /**
     */
    @Column
    @Size(max = 300)
    @BusinessKey(exclude= Method.EQUALS)
    private String observacion;
    /**
     */
    @Column
    @Size(min = 0, max = 3000)
    @BusinessKey(exclude= Method.EQUALS)
    private String baseSQL;

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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public CategoriaReporte getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReporte categoria) {
        this.categoria = categoria;
    }

    public String getBaseSQL() {
        return baseSQL;
    }

    public void setBaseSQL(String baseSQL) {
        this.baseSQL = baseSQL;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }

}
