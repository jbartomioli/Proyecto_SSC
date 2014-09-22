package interfaces.componentes;

import java.awt.Component;


import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

public class RendererFormatoPrecioTabla extends JTextField implements TableCellRenderer
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4028488512845028442L;
	boolean isBordered = true;

    public RendererFormatoPrecioTabla(boolean isBordered) 
    {
        this.isBordered = isBordered;
    }
	
    
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
//    {
//        JFormattedTextField campoTexto = new JFormattedTextField();
//        campoTexto.setBorder(BorderFactory.createEmptyBorder());
//        
//        campoTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
//            		new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$ #,##0.00")))); 
//                 
//        
//        //Se aplica alineación a la izquierda
//        campoTexto.setHorizontalAlignment(SwingConstants.TRAILING); 
//        campoTexto.setValue(value);
//        
//        if(isSelected){ 
//            campoTexto.setBackground(table.getSelectionBackground()); 
//        }
//        
//        return campoTexto;
//    }
    
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        // Muestra el Boton en cada fila del JTable ProductosAnuncio.
    	JFormattedTextField campoTexto = new JFormattedTextField();
    	campoTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
        		new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$ #,##0.00"))));
    	
    	return campoTexto;
    }
    
}
