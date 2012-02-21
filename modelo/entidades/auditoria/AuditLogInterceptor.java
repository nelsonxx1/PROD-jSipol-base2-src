package modelo.entidades.auditoria;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;

/**
 *
 * @author admin
 */
public class AuditLogInterceptor extends EmptyInterceptor {

    public static final AuditLogInterceptor INSTANCE2 = new AuditLogInterceptor();
    private Session session;
    private Set inserts = new HashSet();
    private Set updates = new HashSet();

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean onSave(Object entity,
            Serializable id,
            Object[] state,
            String[] propertyNames,
            Type[] types)
            throws CallbackException {
        if (entity instanceof Auditable) {
            inserts.add(entity);
        }
        return false;
    }

    @Override
    public boolean onFlushDirty(Object entity,
            Serializable id,
            Object[] currentState,
            Object[] previousState,
            String[] propertyNames,
            Type[] types)
            throws CallbackException {
        if (entity instanceof Auditable) {
            updates.add(entity);
        }
        return false;
    }

    @Override
    public void postFlush(Iterator iterator)
            throws CallbackException {
        try {
            for (Iterator it = inserts.iterator(); it.hasNext();) {
                Auditable entity = (Auditable) it.next();
                AuditLog.logEvent("create",
                        entity);
            }
            for (Iterator it = updates.iterator(); it.hasNext();) {
                Auditable entity = (Auditable) it.next();
                AuditLog.logEvent("update",
                        entity);
            }
        } finally {
            inserts.clear();
            updates.clear();
        }
    }
}
