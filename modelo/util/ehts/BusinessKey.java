package modelo.util.ehts;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Orlando Becerra
 * @author Nelson Moncada
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface BusinessKey {

    Method[] include() default Method.ALL;

    Method[] exclude() default Method.NONE;
}
