package interfaces.componentes;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

// El TableCellRenderer se encarga de dibujar datos en las celdas de un JTable
public class RendererBotonCeldaModificar extends JLabel implements TableCellRenderer 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1304814959224227564L;
	boolean isBordered = true;

    public RendererBotonCeldaModificar(boolean isBordered) 
    {
        this.isBordered = isBordered;
    }

    
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        // Muestra el Boton en cada fila del JTable ProductosAnuncio.
    	BotonesIconos botonModificar = new BotonesIconos("MODIFICAR.png");
    	
    	return botonModificar; //new JButton();
    }
}