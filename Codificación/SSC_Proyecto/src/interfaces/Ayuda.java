package interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.IOException;

public class Ayuda extends JDialog{

	private static final long serialVersionUID = -6953956084228789774L;
	
	
	private interfaces.componentes.BotonesIconos btnAceptar;
	private JEditorPane epnEditor;
	private JScrollPane scrEditor;
	private JPanel panelEditor;

	public Ayuda(JFrame padre, boolean modal) 
	{
		/**
		 * FORMULARIO BASE
		 */
		super(padre,modal);
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
		
		panelEditor = new JPanel();
		panelEditor.setBounds(10, 44, 624, 302);
		getContentPane().add(panelEditor);
	    panelEditor.setLayout(null);
		
		
	    epnEditor = new JEditorPane();	  
	    epnEditor.setEditable(false);
	   
	    epnEditor.setContentType("text/html");
	    try {
			epnEditor.setPage("http://www.facebook.com.ar");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    scrEditor = new JScrollPane(epnEditor);
	    scrEditor.setBounds(0, 0, 624, 302);
	    panelEditor.add(scrEditor);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(10, 357, 624, 60);
		getContentPane().add(panelBotones);
		panelBotones.setLayout(null);
		btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setBounds(534, 0, 90, 60);
		panelBotones.add(btnAceptar);
		
		JLabel lblTitulo = new JLabel("Ayuda del Sistema");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 314, 22);
		getContentPane().add(lblTitulo);
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

