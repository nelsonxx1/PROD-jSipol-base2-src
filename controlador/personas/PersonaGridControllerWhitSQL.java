/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador.personas;

import controlador.util.DefaultGridControllerWhitSQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.entidades.personas.maestra.Persona;
import modelo.util.bean.BeanVO;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ValueObject;

/**
 *
 * @author PAPA
 */
public class PersonaGridControllerWhitSQL extends DefaultGridControllerWhitSQL implements ActionListener{

    public PersonaGridControllerWhitSQL(String gridFramePath, String detailFramePath, String claseModeloFullPath, String titulo, String sql, Object[] values, Type[] valueType) {
        super(gridFramePath, detailFramePath, claseModeloFullPath, titulo, sql, values, valueType);
    }

    @Override
    public void doubleClick(int rowNumber, ValueObject persistentObject) {
        new PersonasDetailController(null, (BeanVO) persistentObject, null);
    }

    public void actionPerformed(ActionEvent e) {
        
    }

}
