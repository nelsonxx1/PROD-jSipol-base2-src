package controlador.personas.mant;

import controlador.util.DefaultAllGridFrameController;
import modelo.entidades.personas.dominio.TipoPersona;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author bc
 */
public class TipoPersonaGridFrameController extends DefaultAllGridFrameController {

    public TipoPersonaGridFrameController(String gridFramePath, String detailFramePath, String claseModeloFullPath, String titulo) {
        super(gridFramePath, detailFramePath, claseModeloFullPath, titulo);
    }

    @Override
    public boolean isCellEditable(GridControl grid, int row, String attributeName) {
        if ((Consts.EDIT == grid.getMode()) &&
                (attributeName.equals("idPropio") ||
                attributeName.equals("nombre") ||
                attributeName.equals("bloqueado"))) {
            TipoPersona tp = (TipoPersona) grid.getVOListTableModel().getObjectForRow(row);
            if (tp.getId() != null) {
                return !tp.isBloqueado();
            }
        }
        return super.isCellEditable(grid, row, attributeName);
    }
}
