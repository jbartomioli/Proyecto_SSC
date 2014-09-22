package interfaces.componentes;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellEditor;

// El TableCellEditor se utiliza para editar las celdas
public class EditorCeldasMonto extends AbstractCellEditor implements TableCellEditor {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8892573371156211838L;
	Float currentValue;
	JFormattedTextField campoTexto;
	@SuppressWarnings("unused")
	private JTable table;

    public EditorCeldasMonto(JTable table) {
    	 campoTexto = new JFormattedTextField();

    	 campoTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
             		new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$ #,##0.00")))); 
                  
         
         //Se aplica alineación a la izquierda
         campoTexto.setHorizontalAlignment(SwingConstants.TRAILING); 
         //campoTexto.setValue(value);
         
         this.table = table;
    }


    //Implement the one CellEditor method that AbstractCellEditor doesn't.
    public Object getCellEditorValue()
    {
        return currentValue;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) 
    {
    	currentValue = (Float) value;
        return campoTexto;
    }
}
