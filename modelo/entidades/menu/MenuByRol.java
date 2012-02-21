package modelo.entidades.menu;

import modelo.util.bean.BeanVO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import modelo.entidades.auditoria.Auditable;
import modelo.entidades.auditoria.AuditoriaBasica;
import modelo.util.ehts.BusinessKey;
import modelo.util.ehts.Method;

/**
 * 
 * @author Luis Adrian Gonzalez Benavides
 */
@Entity
public class MenuByRol extends BeanVO implements Serializable, Auditable {

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
    private Boolean enable;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean insertable;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean editable;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean deletable;
    /**
     *
     */
    @Column
    @BusinessKey
    private Boolean searchable;
    /**
     *
     */
    @Column
    @BusinessKey
    private Long itemId;
    /**
     *
     */
    @Column
    @BusinessKey
    private Long rolId;
    /**
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;
    /**
     *
     */
    @Version
    @Column
    private Integer optLock;

    public MenuByRol() {
    }

    public MenuByRol(Long item, Long rol, Boolean inicial) {
        this.enable = inicial;
        this.insertable = inicial;
        this.editable = inicial;
        this.deletable = inicial;
        this.searchable = inicial;
        this.itemId = item;
        this.rolId = rol;
    }

    public MenuByRol(Boolean enable, Boolean insertable, Boolean editable,
            Boolean deletable, Boolean searchable, Long item, Long rol) {
        this.enable = enable;
        this.insertable = insertable;
        this.editable = editable;
        this.deletable = deletable;
        this.searchable = searchable;
        this.itemId = item;
        this.rolId = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public boolean isDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isInsertable() {
        return insertable;
    }

    public void setInsertable(boolean insertable) {
        this.insertable = insertable;
    }

    public boolean isSearchable() {
        return searchable;
    }

    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }
}
