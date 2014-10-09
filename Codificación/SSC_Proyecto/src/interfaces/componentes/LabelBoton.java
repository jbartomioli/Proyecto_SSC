package interfaces.componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class LabelBoton extends JLabel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8731164048600626860L;

	public LabelBoton(String textoLabel) 
	{
		setText(textoLabel);
		setHorizontalAlignment(SwingConstants.CENTER);
		setForeground(SystemColor.inactiveCaptionText);
		setBorder(new BevelBorder(0));
		
		// Cambia el tipo de cursor al posarlo sobre el link
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setBackground(UIManager.getColor("Button.disabledForeground"));
		setForeground(new Color(8,98,235));
		setFont(new Font("Tahoma", Font.BOLD, 12));
	}

}
