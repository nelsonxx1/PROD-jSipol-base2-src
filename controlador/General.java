

package controlador;


import java.util.HashMap;
import modelo.entidades.Empresa;
import modelo.entidades.Licencia;
import modelo.entidades.Oficina;
import modelo.entidades.Usuario;
import modelo.entidades.defaultData.DefaultPersona;
import modelo.entidades.menu.MenuByRol;


/**
 *
 * @author orlandobcrra
 */
public class General {

    public static Usuario usuario = new Usuario();
    public static Empresa empresa = new Empresa();
    public static Licencia licencia = new Licencia();
    public static Oficina oficina = new Oficina();
    public static String version = "";
    public static String edition = "";
    public static String splashLine2 = "";
    public static DefaultPersona defaultPersona;
    public static HashMap<String,MenuByRol> permisologiaModulo=new HashMap<String,MenuByRol>(0);
    
}
