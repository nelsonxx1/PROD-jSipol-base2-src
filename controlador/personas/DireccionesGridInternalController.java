package controlador.personas;

import controlador.General;
import controlador.util.DefaultGridInternalController;
import java.util.ArrayList;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.ValueObject;

/**
 *
 * @author bc
 */
public class DireccionesGridInternalController extends DefaultGridInternalController {

    public DireccionesGridInternalController(String classNameModelFullPath, String getMethodName, GridControl miGrid, ArrayList<DefaultGridInternalController> listSubGrids) {
        super(classNameModelFullPath, getMethodName, miGrid, listSubGrids);
    }

    @Override
    public void createValueObject(ValueObject valueObject) throws Exception {
        int rowToSel = miGrid.getVOListTableModel().getRowCount() - 1;
        miGrid.getVOListTableModel().setField(rowToSel, "tipoDireccion", General.defaultPersona.getDireccion());
    }
}
