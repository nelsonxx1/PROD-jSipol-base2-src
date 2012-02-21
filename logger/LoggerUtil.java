package logger;

import controlador.General;
import java.util.Iterator;
import java.util.Set;
import javax.validation.ConstraintViolationException;
import org.hibernate.validator.engine.ConstraintViolationImpl;
import org.openswing.swing.logger.server.Logger;
import org.openswing.swing.util.client.ClientSettings;

/**
 *
 * @author bc
 */
public class LoggerUtil {

    public static final String isInvalidStateException(Class c, String methodName, Exception exception) {
        if (exception instanceof ConstraintViolationException) {
            String message = "";
            Set cv = ((ConstraintViolationException) exception).getConstraintViolations();
            for (Object o : cv) {
                ConstraintViolationImpl cvi = (ConstraintViolationImpl) o;
                message += ClientSettings.getInstance().getResources().getResource(cvi.getPropertyPath().toString()) + ": ";
                message += cvi.getMessage() + "\n";
            }
            return message;
        } else {
            LoggerUtil.error(c, methodName, exception);
        }
        return exception.getMessage();
    }

    public static final void error(Class c,
            String methodName,
            Throwable exception) {
        Logger.error(General.usuario.getUserName(),
                c.getName(),
                methodName,
                exception.getMessage(),
                exception);
    }

    public static final void warn(Class c,
            String methodName,
            String message) {
        Logger.warn(General.usuario.getUserName(),
                c.getName(),
                methodName,
                message);
    }

    public static final void debug(Class c,
            String methodName,
            String message) {
        Logger.debug(General.usuario.getUserName(),
                c.getName(),
                methodName,
                message);
    }

    public static final void info(Class c,
            String methodName,
            String message) {
        Logger.info(General.usuario.getUserName(),
                c.getName(),
                methodName,
                message);
    }
}