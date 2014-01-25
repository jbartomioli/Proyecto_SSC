package interfaces;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

// El TableCellRenderer se encarga de dibujar datos en las celdas de un JTable
public class myrenderer extends JLabel implements TableCellRenderer {

    boolean isBordered = true;

    public myrenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
        // Muestra el Boton Eliminar en cada fila del JTable.	
    	return new JButton("Eliminar"); //VER COMO HACER PARA QUE EL BOTON SEA A�ADIR EN LA TABLA DE PRODUCTOS EN LUGAR DE ELIMINAR  		
    }
}