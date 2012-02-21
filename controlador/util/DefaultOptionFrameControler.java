/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.util;

import logger.LoggerUtil;
import vista.util.DefaultOptionFrame;
import modelo.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author adrian
 */
public class DefaultOptionFrameControler {

    protected String claseModeloFullPath;
    protected String detailFramePath;
    protected DefaultOptionFrame optionFrame;

    public DefaultOptionFrameControler(String optionFramePath,
            String claseModeloFullPath,
            String titulo) {
        this.claseModeloFullPath = claseModeloFullPath;
        if (titulo == null) {
            titulo = claseModeloFullPath;
        }
        try {
            Class<DefaultOptionFrame> t = (Class<vista.util.DefaultOptionFrame>) Class.forName(optionFramePath);
            optionFrame = t.newInstance();
            optionFrame.inicializar(this, claseModeloFullPath, titulo, true);
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "new", ex);
        }
    }

    public java.util.List optenerData(String valueObjectClassName) {

        Session s = null;
        java.util.List mensajes = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            {
                String hql = "FROM " + valueObjectClassName;
                Query query = s.createQuery(hql);
                mensajes = query.list();
            }
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
        return mensajes;
    }

    public void actualizarData(String valueObjectClassName) {


        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            {
                String hqlS = "UPDATE " + valueObjectClassName;
                Query query = s.createQuery(hqlS);
                query.executeUpdate();
            }
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }


    }

    public void save(Object o) {

        Session s = null;
        try {
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            {
                s.save(o);
            }
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }

    }
}
