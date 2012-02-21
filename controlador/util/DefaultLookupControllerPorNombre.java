package controlador.util;

import java.awt.Dimension;
import org.openswing.swing.lookup.client.LookupController;
/**
 *
 * @author Orlando Becerra
 */
public class DefaultLookupControllerPorNombre extends LookupController {

    public DefaultLookupControllerPorNombre() {
    }

    public DefaultLookupControllerPorNombre(
            String classFullName) {
        this.setLookupDataLocator(new DefaultLookupDataLocatorPorNombre(classFullName));
        this.setLookupGridController(new DefaultLookupGridController());
        setLookupValueObjectClassName(classFullName);
        defaultModel();
    }

    public void defaultModel() {
        setCodeSelectionWindow(GRID_FRAME);
        setOnInvalidCode(ON_INVALID_CODE_RESTORE_LAST_VALID_CODE);
        setAllColumnVisible(false);
        setVisibleColumn("id", true);
        setVisibleColumn("nombre", true);
        setPreferredWidthColumn("id", 50);
        setPreferredWidthColumn("nombre", 200);
        setFilterableColumn("nombre", true);
        setSortableColumn("id", true);
        setSortableColumn("nombre", true);
        setFramePreferedSize(new Dimension(300, 330));
    }
}
