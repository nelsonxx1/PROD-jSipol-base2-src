package modelo;

import java.io.Serializable;
import org.hibernate.event.*;
import org.hibernate.event.def.DefaultSaveEventListener;

/**
 *
 * @author orlandobcrra
 */
public class Eventos extends DefaultSaveEventListener implements PostLoadEventListener, PostInsertEventListener,
        PostUpdateEventListener, PostDeleteEventListener, PreLoadEventListener,
        PreInsertEventListener, PreUpdateEventListener, PreDeleteEventListener {

    @Override
    protected Serializable saveWithGeneratedOrRequestedId(SaveOrUpdateEvent event) {
        System.out.println("jaajjja2222");
        return super.saveWithGeneratedOrRequestedId(event);
    }

    public void onPostLoad(PostLoadEvent event) {
        if (event.getEntity() instanceof PostLoadEventListener) {
            ((PostLoadEventListener) event.getEntity()).onPostLoad(event);
        }
    }

    public void onPostInsert(PostInsertEvent event) {
        if (event.getEntity() instanceof PostInsertEventListener) {
            ((PostInsertEventListener) event.getEntity()).onPostInsert(event);
        }
    }

    public void onPostUpdate(PostUpdateEvent event) {
        if (event.getEntity() instanceof PostUpdateEventListener) {
            ((PostUpdateEventListener) event.getEntity()).onPostUpdate(event);
        }
    }

    public void onPostDelete(PostDeleteEvent event) {
        if (event.getEntity() instanceof PostDeleteEventListener) {
            ((PostDeleteEventListener) event.getEntity()).onPostDelete(event);
        }
    }

    public void onPreLoad(PreLoadEvent event) {
        if (event.getEntity() instanceof PreLoadEventListener) {
            ((PreLoadEventListener) event.getEntity()).onPreLoad(event);
        }
    }

    public boolean onPreInsert(PreInsertEvent event) {
        if (event.getEntity() instanceof PreInsertEventListener) {
            return ((PreInsertEventListener) event.getEntity()).onPreInsert(event);
        }
        return false;
    }

    public boolean onPreUpdate(PreUpdateEvent event) {
        if (event.getEntity() instanceof PreUpdateEventListener) {
            return ((PreUpdateEventListener) event.getEntity()).onPreUpdate(event);
        }
        return false;
    }

    public boolean onPreDelete(PreDeleteEvent event) {
        if (event.getEntity() instanceof PreDeleteEventListener) {
            ((PreDeleteEventListener) event.getEntity()).onPreDelete(event);
        }
        return false;
    }
    
}
