package interfaces.componentes;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BotonesIconos extends JButton 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9023240623601720340L;

	/**
	 * BOTON CON IMAGEN Y TEXTO DE 90X60
	 * @param texto
	 * @param imagen
	 */
	public BotonesIconos(String texto, String imagen) 
	{
		setText(texto);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setIcon(new ImageIcon(imagen));
		setSize(90,60);
	}
	
	
	
	/**
	 * BOTON CON IMAGEN Y SIN TEXTO DE 30X23
	 * @param imagen
	 */
	public BotonesIconos(String imagen) 
	{
		setText("");
		setIcon(new ImageIcon(imagen));
		setSize(30,23);
	}

}
