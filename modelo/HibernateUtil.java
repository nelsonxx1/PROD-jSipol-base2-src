package modelo;

import java.io.File;
import javax.swing.JFileChooser;
import logger.LoggerUtil;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.impl.SessionFactoryImpl;

/**
 * Hibernate Utility class with a convenient method 
 * to get Session Factory object.
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final AnnotationConfiguration annotationConfiguration;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            annotationConfiguration = new AnnotationConfiguration().configure();
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Exception ex) {
            LoggerUtil.error(HibernateUtil.class, "static", ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static AnnotationConfiguration getAnnotationConfiguration() {
        return annotationConfiguration;
    }

    public static SessionFactoryImpl getSessionFactoryImpl() {
        return (SessionFactoryImpl) sessionFactory;
    }
}
