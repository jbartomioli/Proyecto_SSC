package interfaces.componentes;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BotonesIconos extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9023240623601720340L;

	public BotonesIconos(String texto, String imagen) 
	{
		setText(texto);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setIcon(new ImageIcon(imagen));
		setSize(90,60);
	}

}
