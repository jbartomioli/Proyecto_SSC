package interfaces.componentes;

import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class RendererFormatoPrecioTabla extends JFormattedTextField implements TableCellRenderer
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
	

    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
    {
    	JFormattedTextField campoTexto = new JFormattedTextField();
    	campoTexto.setBorder(BorderFactory.createEmptyBorder());
    	campoTexto.setHorizontalAlignment(SwingConstants.TRAILING); 
    	campoTexto.setValue(value);
    	
    	if(isSelected)
    		campoTexto.setBackground(table.getSelectionBackground()); 

    	campoTexto.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("$ #,##0.00"))));
    	
    	return campoTexto;
    }
    
}
