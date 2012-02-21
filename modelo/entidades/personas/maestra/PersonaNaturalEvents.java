package modelo.entidades.personas.maestra;

import java.util.Calendar;
import java.util.Date;
import org.hibernate.event.*;

/**
 *
 * @author orlandobcrra
 */
public class PersonaNaturalEvents implements PostLoadEventListener, PreUpdateEventListener {

    public boolean onPreUpdate(PreUpdateEvent pue) {
        return true;
    }

    public void onPostLoad(PostLoadEvent ple) {
        PersonaNatural pn = (PersonaNatural) ple.getEntity();
        Date d = new Date();
        d.setTime(d.getTime() - pn.getFechaNacimiento().getTime());
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        pn.setEdad(c.get(Calendar.YEAR));
        System.out.println(pn.getEdad());
    }
}
