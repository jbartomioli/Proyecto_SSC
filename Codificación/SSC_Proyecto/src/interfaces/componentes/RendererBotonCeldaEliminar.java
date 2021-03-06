package interfaces.componentes;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

// El TableCellRenderer se encarga de dibujar datos en las celdas de un JTable
public class RendererBotonCeldaEliminar extends JLabel implements TableCellRenderer 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7233213271024931631L;
	boolean isBordered = true;

    public RendererBotonCeldaEliminar(boolean isBordered) 
    {
        this.isBordered = isBordered;
    }

    
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        // Muestra el Boton Eliminar en cada fila del JTable ProductosAnuncio.
    	BotonesIconos botonEliminar = new BotonesIconos("ELIMINAR.png");
    	
    	return botonEliminar;
    }
}