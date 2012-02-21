package modelo.entidades.personas.maestra;

/**
 *
 * @author bc
 */
public class LNPersonaNatural {

    public static void generarNombres(PersonaNatural pn) {
        String nombreLargo = pn.getPrimerApellido();
        if (pn.getSegundoApellido() != null && pn.getSegundoApellido().length() > 0) {
            nombreLargo += " " + pn.getSegundoApellido();
        }
        nombreLargo += ", " + pn.getPrimerNombre();
        if (pn.getSegundoNombre() != null && pn.getSegundoNombre().length() > 0) {
            nombreLargo += " " + pn.getSegundoNombre();
        }
        pn.setNombreLargo(nombreLargo);
        pn.setNombreCorto(pn.getPrimerNombre() + " " + pn.getPrimerApellido());
    }
}
