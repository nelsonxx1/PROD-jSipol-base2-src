package modelo.util.bean;

import java.io.Serializable;
import modelo.util.ehts.BeanUtils;
import org.openswing.swing.message.receive.java.ValueObjectImpl;

/**
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
public abstract class BeanVO extends ValueObjectImpl implements Serializable{

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return BeanUtils.hashCode(this);
    }

    /**
     *
     * @return
     */
    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object obj) {
        return BeanUtils.equals(this, obj);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return BeanUtils.toString(this);
    }
}
