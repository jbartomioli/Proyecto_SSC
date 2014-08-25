package interfaces.componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class FormatoPrecioTabla implements TableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        JFormattedTextField campoTexto = new JFormattedTextField();
        campoTexto.setBorder(BorderFactory.createEmptyBorder());
        
        campoTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
            		new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("$ #,##0.00")))); 
                 
        
        //Se aplica alineación a la izquierda
        campoTexto.setHorizontalAlignment(SwingConstants.TRAILING); 
        campoTexto.setValue(value);
        
        if(isSelected){ 
            campoTexto.setBackground(table.getSelectionBackground()); 
        }
        
        return campoTexto;
    }
    
}
