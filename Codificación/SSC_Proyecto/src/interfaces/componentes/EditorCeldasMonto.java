package interfaces.componentes;

import java.awt.Component;

import javax.swing.AbstractCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

// El TableCellEditor se utiliza para editar las celdas
public class EditorCeldasMonto extends AbstractCellEditor implements TableCellEditor
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8892573371156211838L;
	private Float currentValue;
	private JFormattedTextField campoTexto;
	@SuppressWarnings("unused")
	private JTable tabla;

    public EditorCeldasMonto(JTable table)
    {
    	 campoTexto = new JFormattedTextField();
         this.tabla = table;
    }


    //Implement the one CellEditor method that AbstractCellEditor doesn't.
    public Object getCellEditorValue()
    {
        return currentValue;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) 
    {
    	currentValue =  (Float) value;
        return campoTexto;
    }
}
