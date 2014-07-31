package interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Ayuda extends JDialog{

	private static final long serialVersionUID = -6953956084228789774L;
	
	
	private interfaces.componentes.BotonesIconos btnAceptar;

	public Ayuda(JFrame padre, boolean modal) 
	{
		/**
		 * FORMULARIO BASE
		 */
		super(padre,modal);
		getContentPane().setVisible(false);
		setTitle("Ayuda del Sistema");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"AYUDA_32.png"));
		setResizable(false);
		setMinimumSize(new Dimension(650, 460));
		getContentPane().setMinimumSize(new Dimension(650, 460));
		getContentPane().setMaximumSize(new Dimension(650, 460));
		setMaximumSize(new Dimension(650, 460));
		setSize(650, 460);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);

		
		getContentPane().setLayout(null);
		
		
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(544, 357);
		getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	clickBotonCerrar(evento);
	        }
	      });
	}
		
		
		
		//EVENTOS	
		//EVENTO BOTON ACEPTAR
		private void clickBotonCerrar(ActionEvent evento)
		{
			dispose();
		}
}

