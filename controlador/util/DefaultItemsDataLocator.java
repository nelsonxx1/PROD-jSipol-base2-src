package controlador.util;

import java.util.ArrayList;
import java.util.HashMap;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.openswing.swing.items.client.ItemsDataLocator;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author bc
 */
public class DefaultItemsDataLocator extends ItemsDataLocator {

    protected String claseModeloFullPath;
    protected String where;

    public DefaultItemsDataLocator(String claseModeloFullPath, String where) {
        this.claseModeloFullPath = claseModeloFullPath;
        if (where != null) {
            this.where = where;
        } else {
            this.where = "";
        }
    }

    @Override
    public Response loadData(Class valueObjectType) {
        Session s = null;
        try {
            String sql = "FROM " + claseModeloFullPath + " C " + where;
            SessionFactory sf = HibernateUtil.getSessionFactory();
            s = sf.openSession();
            Response res = HibernateUtils.getAllFromQuery(
                    new HashMap(0), // Filtrado de columnas
                    new ArrayList(0), // nombre de lso atributos
                    new ArrayList(0), // Columnas a los cuales va mapeada
                    valueObjectType, // Clase que maneja la tabla
                    sql,           // Base SQL
                    new Object[0], // Valor de los atributos que van en ? de la consulta SQL
                    new Type[0],  // Tipo del dato que va en la consulta SQL ?
                    "C",          // Nombre de la tabla relacionada a la Tabla y el V.O.
                    sf,         // SessionFactory
                    s);         // Session
            return res;
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "loadData", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }
    }
}
