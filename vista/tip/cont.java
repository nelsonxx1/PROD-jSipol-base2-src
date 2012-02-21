package vista.tip;

import org.openswing.swing.miscellaneous.client.TipPanelContent;

/**
 *
 * @author bc
 */
public class cont implements TipPanelContent {

    public String[] getTitles() {
        return new String[]{
                    "titulo1",
                    "titulo2",
                };
    }

    public String[] getTips() {
        return new String[]{                    
                    "<html><body><font style='FONT-SIZE: 80%;FONT-FAMILY: Verdana, Helvetica, sans-serif'>desc1</font></body></html>",
                    "<html><body><font style='FONT-SIZE: 80%;FONT-FAMILY: Verdana, Helvetica, sans-serif'>desc2</font></body></html>"
                };
    }
}
