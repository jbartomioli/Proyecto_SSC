package interfaces;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class myrenderer extends JLabel implements TableCellRenderer {

    boolean isBordered = true;

    public myrenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
        // Va a mostrar el bot�n solo en la �ltima fila.
        // de otra forma muestra un espacio en blanco.
        //if (row == table.getModel().getRowCount() - 1) {
            return new JButton("X");
        //} else {
           // setBackground(new Color(0xffffff));
          //  return this;
       // }
    }
}