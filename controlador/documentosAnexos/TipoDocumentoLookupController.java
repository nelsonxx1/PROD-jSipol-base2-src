package controlador.documentosAnexos;

import controlador.util.DefaultLookupGridController;
import java.awt.Dimension;
import modelo.entidades.TipoDocumento;
import org.openswing.swing.lookup.client.LookupController;

/**
 *
 * @author Orlando Becerra
 */
public class TipoDocumentoLookupController extends LookupController {

    public TipoDocumentoLookupController() {
    }

    public TipoDocumentoLookupController(
            Enum modulo) {
        this.setLookupDataLocator(new TipoDocumentoLookupDataLocator(modulo));
        this.setLookupGridController(new DefaultLookupGridController());
        setLookupValueObjectClassName(TipoDocumento.class.getName());
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
