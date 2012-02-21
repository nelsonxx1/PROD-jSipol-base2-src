package vista.tip;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.html.HTMLEditorKit;
import org.openswing.swing.client.CheckBoxControl;
import org.openswing.swing.client.ImagePanel;
import org.openswing.swing.miscellaneous.client.TipPanelContent;
import org.openswing.swing.miscellaneous.util.client.TipPanelContainer;
import org.openswing.swing.util.client.ClientSettings;

/**
 * @author Mauro Carniel
 * @author bc
 */
public class MiTipPanel extends JPanel {

    GridBagLayout gridBagLayout1 = new GridBagLayout();
    ImagePanel imagePanel = new ImagePanel();
    JPanel buttonsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    JLabel labelTitle = new JLabel();
    JScrollPane scrollPane = new JScrollPane();
    JEditorPane tipPane = new JEditorPane();
    CheckBoxControl controlShow = new CheckBoxControl();
    JButton buttonList = new JButton();
    JButton buttonPrev = new JButton();
    JButton buttonNext = new JButton();
    JButton buttonClose = new JButton();
    /** TipPanel container */
    private TipPanelContainer tipPanelContainer = null;
    /** tip image */
    private String imageName = "tip.gif";
    /** flag used to define if the checkbox 'show 'tip of the day' after launching' must be showed */
    private boolean showCheck = true;
    /** TipPanel content manager */
    private TipPanelContent tipPanelContent;
    /** current index of the showed tip */
    private int index = 0;

    /**
     * Constructor.
     * @param tipPanelContainer TipPanel content manager
     * @param tipPanelContent TipPanel container
     */
    public MiTipPanel(TipPanelContainer tipPanelContainer, TipPanelContent tipPanelContent) {
        this.tipPanelContainer = tipPanelContainer;
        this.tipPanelContent = tipPanelContent;
        try {
            jbInit();
            setImageName(imageName);
            tipPane.setFont(labelTitle.getFont());
            tipPane.setEditorKit(new HTMLEditorKit());

            // automatically show a random tip of day...
            index = (int) (Math.random() * (double) tipPanelContent.getTips().length);
            showTip();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(gridBagLayout1);
        mainPanel.setLayout(gridBagLayout2);
        tipPane.setEditable(false);
        controlShow.setText("show 'tip of the day' after launching");
        controlShow.setFont(new Font(labelTitle.getFont().getName(), Font.PLAIN, 9));
        buttonList.setText(ClientSettings.getInstance().getResources().getResource("select tip"));
        buttonList.addActionListener(new TipPanel_buttonList_actionAdapter(this));
        buttonPrev.setText(ClientSettings.getInstance().getResources().getResource("previous tip"));
        buttonPrev.addActionListener(new TipPanel_buttonPrev_actionAdapter(this));
        buttonNext.setText(ClientSettings.getInstance().getResources().getResource("next tip"));
        buttonNext.addActionListener(new TipPanel_buttonNext_actionAdapter(this));
        buttonClose.setText(ClientSettings.getInstance().getResources().getResource("close"));
        buttonClose.addActionListener(new TipPanel_buttonClose_actionAdapter(this));
        labelTitle.setFont(new Font(labelTitle.getFont().getName(), Font.PLAIN, 14));
        this.add(imagePanel, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        this.add(mainPanel, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        if (showCheck) {
            mainPanel.add(controlShow, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        }

        mainPanel.add(labelTitle, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
        mainPanel.add(scrollPane, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
        mainPanel.add(buttonsPanel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 5, 5, 0), 0, 0));
        scrollPane.getViewport().add(tipPane, null);
        buttonsPanel.add(buttonList, null);
        buttonsPanel.add(buttonPrev, null);
        buttonsPanel.add(buttonNext, null);
        buttonsPanel.add(buttonClose, null);
    }

    void buttonPrev_actionPerformed(ActionEvent e) {
        if (index == 0 && tipPanelContent.getTips().length > 0) {
            index = tipPanelContent.getTips().length - 1;
        } else if (index > 0) {
            index--;
        }
        showTip();
    }

    void buttonNext_actionPerformed(ActionEvent e) {
        if (index == tipPanelContent.getTips().length - 1 && tipPanelContent.getTips().length > 0) {
            index = 0;
        } else if (index < tipPanelContent.getTips().length - 1) {
            index++;
        }
        showTip();
    }

    /**
     * Show tip text and title.
     */
    private void showTip() {
        labelTitle.setText((tipPanelContent.getTitles()[index]));
        tipPane.setText((tipPanelContent.getTips()[index]));
    }

    void buttonClose_actionPerformed(ActionEvent e) {
        tipPanelContainer.closeTipPanel();
    }

    /**
     * @return <code>true</code> to show tip frame when launching an application, <code>false</code> otherwise
     */
    public final boolean isShowToolTip() {
        return controlShow.isSelected();
    }

    /**
     * Set/unset check-box 'show 'tip of the day' after launching'.
     * @return <code>true</code> to show check-box 'show 'tip of the day' after launching', <code>false</code> to hide it
     */
    public final void setShowToolTip(boolean showToolTip) {
        controlShow.setSelected(showToolTip);
    }

    /**
     * Set tip image.
     * @param imageName tip image
     */
    public final void setImageName(String imageName) {
        this.imageName = imageName;
        imagePanel.setImageName(imageName);
        imagePanel.setScrollBarsPolicy(ImagePanel.SCROLLBAR_NEVER);
        imagePanel.setMinimumSize(new Dimension(imagePanel.getImageWidth(), imagePanel.getImageHeight()));
        imagePanel.setMaximumSize(new Dimension(imagePanel.getImageWidth(), imagePanel.getImageHeight()));
        imagePanel.setPreferredSize(new Dimension(imagePanel.getImageWidth(), imagePanel.getImageHeight()));
    }

    @Override
    public final void addNotify() {
        super.addNotify();
        if (this.isVisible()) {
            int w = (int) ((Container) tipPanelContainer).getWidth() - imagePanel.getImageWidth() - 30;
            int h = (int) ((Container) tipPanelContainer).getHeight() - imagePanel.getImageHeight() - 30;
            scrollPane.setMinimumSize(new Dimension(w, h));
            scrollPane.setMaximumSize(new Dimension(w, h));
            if (tipPanelContainer instanceof JInternalFrame) {
                ((JInternalFrame) tipPanelContainer).setMinimumSize(new Dimension(((Container) tipPanelContainer).getWidth(), ((Container) tipPanelContainer).getHeight()));
            }
        }
    }

    /**
     * @return tip image
     */
    public final String getImageName() {
        return imageName;
    }

    /**
     * @return used to define if the checkbox 'show 'tip of the day' after launching' must be showed
     */
    public final boolean isShowCheck() {
        return showCheck;
    }

    /**
     * Used to define if the checkbox 'show 'tip of the day' after launching' must be showed.
     * @param showCheck used to define if the checkbox 'show 'tip of the day' after launching' must be showed
     */
    public final void setShowCheck(boolean showCheck) {
        if (this.showCheck && !showCheck) {
            mainPanel.remove(controlShow);
        } else if (!this.showCheck && showCheck) {
            mainPanel.add(controlShow, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        }

        mainPanel.revalidate();
        this.showCheck = showCheck;
    }

    void buttonList_actionPerformed(ActionEvent e) {
        TipSelectDialog dlg = new TipSelectDialog(tipPanelContent);
        int idx = dlg.getTipIndex();
        if ((idx >= 0) && (idx < tipPanelContent.getTips().length)) {
            index = idx;
            showTip();
        }
    }
}

class TipPanel_buttonPrev_actionAdapter implements java.awt.event.ActionListener {

    MiTipPanel adaptee;

    TipPanel_buttonPrev_actionAdapter(MiTipPanel adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.buttonPrev_actionPerformed(e);
    }
}

class TipPanel_buttonNext_actionAdapter implements java.awt.event.ActionListener {

    MiTipPanel adaptee;

    TipPanel_buttonNext_actionAdapter(MiTipPanel adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.buttonNext_actionPerformed(e);
    }
}

class TipPanel_buttonClose_actionAdapter implements java.awt.event.ActionListener {

    MiTipPanel adaptee;

    TipPanel_buttonClose_actionAdapter(MiTipPanel adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.buttonClose_actionPerformed(e);
    }
}

class TipPanel_buttonList_actionAdapter implements java.awt.event.ActionListener {

    MiTipPanel adaptee;

    TipPanel_buttonList_actionAdapter(MiTipPanel adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.buttonList_actionPerformed(e);
    }
}
