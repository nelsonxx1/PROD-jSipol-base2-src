package vista.tip;

import controlador.General; 
import java.awt.*;
import java.beans.PropertyVetoException;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import logger.LoggerUtil;
import modelo.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.miscellaneous.client.TipPanelContent;
import org.openswing.swing.miscellaneous.util.client.TipPanelContainer;
import org.openswing.swing.util.client.ClientSettings;

/**
 * @author bc
 */
public class xxxtip extends InternalFrame implements TipPanelContainer {

    /** tip panel to show */
    MiTipPanel tipPanel = null;

    /**
     * Constructor.
     * @param tipPanelContent TipPanel container
     */
    public xxxtip(TipPanelContent tipPanelContent) {
        try {
            tipPanel = new MiTipPanel(
                    this,
                    tipPanelContent);
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setTitle(ClientSettings.getInstance().getResources().getResource("tip of the day"));
        setShowCheck(true);
        setSize(650, 300);
        setImageName("kblackbox.png");
        setShowToolTip(General.licencia.isActivoTipDelDia());
        this.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                if (isShowToolTip() != General.licencia.isActivoTipDelDia()) {
                    General.licencia.setActivoTipDelDia(isShowToolTip());
                    Session s = null;
                    try {
                        s = HibernateUtil.getSessionFactory().openSession();
                        Transaction t = s.beginTransaction();
                        s.update(General.licencia);
                        t.commit();
                    } catch (Exception ex) {
                        LoggerUtil.error(this.getClass(), "closeTipPanel", ex);
                    } finally {
                        s.close();
                    }
                }
            }
        });
    }

    /**
     * Set tip image.
     * @param imageName tip image
     */
    public final void setImageName(String imageName) {
        if (tipPanel != null) {
            this.tipPanel.setImageName(imageName);
        }
    }

    /**
     * @return tip image
     */
    public final String getImageName() {
        if (tipPanel != null) {
            return this.tipPanel.getImageName();
        } else {
            return null;
        }
    }

    /**
     * @return used to define if the checkbox 'show 'tip of the day' after launching' must be showed
     */
    public final boolean isShowCheck() {
        if (tipPanel != null) {
            return tipPanel.isShowCheck();
        } else {
            return true;
        }
    }

    /**
     * Used to define if the checkbox 'show 'tip of the day' after launching' must be showed.
     * @param showCheck used to define if the checkbox 'show 'tip of the day' after launching' must be showed
     */
    public final void setShowCheck(boolean showCheck) {
        if (tipPanel != null) {
            this.tipPanel.setShowCheck(showCheck);
        }
    }

    /**
     * Method called by TipPanel to close TipPanel container.
     */
    public final void closeTipPanel() {
        try {
            closeFrame();
        } catch (PropertyVetoException ex) {
        }
    }

    /**
     * @return <code>true</code> to show tip frame when launching an application, <code>false</code> otherwise
     */
    public final boolean isShowToolTip() {
        return tipPanel.isShowToolTip();
    }

    /**
     * Set/unset check-box 'show 'tip of the day' after launching'.
     * @return <code>true</code> to show check-box 'show 'tip of the day' after launching', <code>false</code> to hide it
     */
    public final void setShowToolTip(boolean showToolTip) {
        tipPanel.setShowToolTip(showToolTip);
    }

    private void jbInit() throws Exception {
        this.getContentPane().add(tipPanel, BorderLayout.CENTER);
    }
}
