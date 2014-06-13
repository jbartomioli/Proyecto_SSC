package interfaces.componentes;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

// El TableCellEditor se utiliza para editar las celdas
public class EditorCeldas extends AbstractCellEditor implements TableCellEditor, ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8892573371156211838L;
	Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable table;

    public EditorCeldas(JTable table) {
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.table = table;
    }

    public void actionPerformed(ActionEvent e) {
        // mymodel t = (mymodel) jTable1.getModel();
        // t.addNewRecord();
    	//JOptionPane.showMessageDialog(null, "Presiona boton");
        fireEditingStopped();
    }

    //Implement the one CellEditor method that AbstractCellEditor doesn't.
    public Object getCellEditorValue() {
        return currentValue;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // Va a mostrar el botón solo en la última fila.
        // de otra forma muestra un espacio en blanco.
            currentValue = (Boolean) value;
            return button;
    }
}
