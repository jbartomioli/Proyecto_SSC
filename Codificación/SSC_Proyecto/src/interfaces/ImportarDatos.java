package interfaces;

import interfaces.componentes.BotonesIconos;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class ImportarDatos extends JDialog
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1861553205753683189L;
	private JLabel lblImportarDatos;
	private BotonesIconos btnAceptar;

	public ImportarDatos(JFrame dialogPadre) 
	{
		/**
		 * FORMULARIO BASE
		 */
		super(dialogPadre);
		setResizable(false);
		setMinimumSize(new Dimension(800, 460));
		getContentPane().setMinimumSize(new Dimension(800, 460));
		getContentPane().setMaximumSize(new Dimension(800, 460));
		setMaximumSize(new Dimension(800, 460));
		setSize(800, 460);	
		setTitle("Importar Datos");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"IMPORTAR_32.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		/**
		 * TITULO
		 */
		lblImportarDatos = new JLabel("Importar Datos al Sistema");
		lblImportarDatos.setForeground(Color.DARK_GRAY);
		lblImportarDatos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblImportarDatos.setBounds(10, 11, 266, 29);
		getContentPane().add(lblImportarDatos);
	
		addEscapeListenerWindowDialog();
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");		
		btnAceptar.setLocation(692, 356);
		getContentPane().add(btnAceptar);
		
		
		inicializar();
		
	}
	
	protected void inicializar()
	{
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	       		click_boton_aceptar();}});
	}
	
	
	//
	protected void addEscapeListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 click_boton_aceptar();
		 }
	 };
	 getRootPane().registerKeyboardAction(
			 escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_aceptar()
	{		
		dispose();
	}
}
