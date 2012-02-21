package modelo.entidades.auditoria;

import controlador.General; 
import modelo.HibernateUtil;
import org.hibernate.classic.Session;

/**
 *
 * @author bc
 */
public class AuditLog {

    public static void logEvent(
            String message,
            Auditable entity){

        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            AuditLogRecord record =
                    new AuditLogRecord(message,
                    entity.getId(),
                    entity.getClass(),
                    General.usuario.getId());
            s.save(record);
            s.flush();
        } finally {
            s.close();
        }
    }
}
