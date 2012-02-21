package vista.util;

import modelo.util.bean.BeanVO;
import org.openswing.swing.client.BaseInputControl;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.InternalFrame;

/**
 * @author Orlando Becerra
 */
public abstract class DefaultDetailFrame extends InternalFrame {

    public abstract void inicializar(FormController formController, boolean addToMDIFrame);

    public abstract void reloadGridsData();

    public abstract void clearGridsData();

    public abstract void saveGridsData();

    public abstract void setOwnerVO(BeanVO beanVO);

    public abstract Form getMainPanel();

    public abstract void modeChanged(int currentMode);

    public void setActivo(BaseInputControl campo, boolean enabled, boolean required) {
        campo.setRequired(required);
        campo.setEnabled(enabled);
        campo.setEnabledOnEdit(enabled);
        campo.setEnabledOnInsert(enabled);
        campo.repaint();
        if (!enabled) {
            campo.setValue(null);
        }
    }
}
