package interfaces;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class myeditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable table;

    public myeditor(JTable table) {
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.table = table;
    }

    public void actionPerformed(ActionEvent e) {
        // mymodel t = (mymodel) jTable1.getModel();
        // t.addNewRecord();
        fireEditingStopped();
    }

    //Implement the one CellEditor method that AbstractCellEditor doesn't.
    public Object getCellEditorValue() {
        return currentValue;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // Va a mostrar el bot�n solo en la �ltima fila.
        // de otra forma muestra un espacio en blanco.
        if (row == table.getModel().getRowCount() - 1) {
            currentValue = (Boolean) value;
            return button;
        }
        return new JLabel();
    }
}
