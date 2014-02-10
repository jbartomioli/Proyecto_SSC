package interfaces.componentes;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

// El TableCellRenderer se encarga de dibujar datos en las celdas de un JTable
public class RendererBotonCeldaAniadir extends JLabel implements TableCellRenderer 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1304814959224227564L;
	boolean isBordered = true;

    public RendererBotonCeldaAniadir(boolean isBordered) 
    {
        this.isBordered = isBordered;
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        // Muestra el Boton en cada fila del JTable ProductosAnuncio.
    	JButton botonAniadir = new JButton();
    	botonAniadir.setIcon(new ImageIcon("D:\\Proyecto_Final_SSC\\Codificación\\SSC_Proyecto\\recursos\\iconos\\"+"ANIADIR_16.png"));
    	
    	return botonAniadir; //new JButton();
    }
}