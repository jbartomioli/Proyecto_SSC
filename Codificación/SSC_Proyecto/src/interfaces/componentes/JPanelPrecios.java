package interfaces.componentes;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.Box;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

import java.awt.Component;
import java.awt.FlowLayout;

public class JPanelPrecios extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5060178098605109259L;
	
	
	private JFormattedTextField precioPromocional;
	private JFormattedTextField precioVigente;

	public float getPrecioPromocional() {
		return Float.parseFloat(precioPromocional.getValue().toString());
	}

	public void setPrecioPromocional(float precioPromocional) {
		this.precioPromocional.setValue(precioPromocional);
	}

	public float getPrecioVigente() {
		return Float.parseFloat(precioVigente.getValue().toString());
	}

	public void setPrecioVigente(float precioVigente) {
		this.precioVigente.setValue(precioVigente);
	}

	public JPanelPrecios()
	{
		/**
		 * FORMULARIO BASE
		 */
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		  
		
		/**
		 * MASCARA CAMPOS DE TEXTO
		 */
    	NumberFormat dispFormat = NumberFormat.getCurrencyInstance();
    	NumberFormat editFormat	= NumberFormat.getNumberInstance(Locale.getDefault());
    	
    	editFormat.setGroupingUsed(false);
    	
    	NumberFormatter dnFormat = new NumberFormatter(dispFormat);
    	NumberFormatter enFormat = new NumberFormatter(editFormat);

    	DefaultFormatterFactory currFactory = new DefaultFormatterFactory(dnFormat,dnFormat,enFormat);
    	enFormat.setAllowsInvalid(true);
    	
    	
	    /**
	     * PRECIO VIGENTE
	     */
        JLabel lblPrecioVigente = new JLabel("Precio Vigente:");
        lblPrecioVigente.setLabelFor(precioVigente);
        add(lblPrecioVigente);
    	
    	precioVigente = new JFormattedTextField();
    	precioVigente.setColumns(6);
    	precioVigente.setFormatterFactory(currFactory);
       	precioVigente.setForeground(Color.GRAY);
        add(precioVigente);
        
        /**
         * 
         */
        Component horizontalStrut = Box.createHorizontalStrut(15);
        add(horizontalStrut);
        
        
        /**
         * PRECIO PROMOCIONAL
         */
        JLabel lblPrecioPromocional = new JLabel("Precio Promocional:");
        lblPrecioPromocional.setLabelFor(precioPromocional);
        add(lblPrecioPromocional);
        
    	precioPromocional = new JFormattedTextField();
    	precioPromocional.setColumns(6);
    	precioPromocional.setFormatterFactory(currFactory);
    	precioPromocional.setForeground(Color.GRAY);
        add(precioPromocional);
	}

}
