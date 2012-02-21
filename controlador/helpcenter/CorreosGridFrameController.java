package controlador.helpcenter;

import controlador.util.DefaultGridFrameController;
import modelo.util.bean.BeanVO;
import org.openswing.swing.message.receive.java.ValueObject;
import vista.sistema.soporteTecnico.CorreosGridFrame;

public class CorreosGridFrameController extends DefaultGridFrameController {

    CorreosGridFrame gridFrame2;

    public CorreosGridFrameController(String claseModeloFullPath) {
        this.claseModeloFullPath = claseModeloFullPath;
        gridFrame2 = new CorreosGridFrame(this);

    }

    @Override
    public void doubleClick(int rowNumber, ValueObject persistentObject) {
        new CorreoDetailFrameController(null, null, "", (BeanVO) persistentObject, false);
    }
}
