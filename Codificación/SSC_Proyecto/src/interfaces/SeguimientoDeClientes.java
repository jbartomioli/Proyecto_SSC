package interfaces;

import interfaces.componentes.BotonesIconos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class SeguimientoDeClientes extends JDialog
{
	/****************
	 * SERIALIZABLE
	 ****************/
	private static final long serialVersionUID = 4454249604145639431L;
	
	private JTextField txtBuscarCliente;
	private JLabel lblBuscarCliente;
	private JLabel lblEspecialidad;
	private JComboBox<String> cmbEspecialidad;
	private String[] especialidades = {"Seleccione...", "Distribuidor", "Endodoncia", "Gnatologia", "Odontologia General", "Ortodoncia", "Periodoncia", "Protesista"};
	private interfaces.componentes.BotonesIconos btnAceptar;	
	private JButton btnBuscarCliente;
	
	
	/**
	 * CONSTRUCTOR
	 * @param dialogPadre
	 */
	public SeguimientoDeClientes(Frame framePadre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorAnuncios) throws Exception
	{
		/***************************************************************
		 * FORMULARIO BASE
		 ***************************************************************/
		super(framePadre);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
		setMaximumSize(new Dimension(1366, 768));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
		setLocationRelativeTo(null);
		setTitle("Seguimiento de Clientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"SEGUIMIENTO_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
		addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
		
		addEscapeListenerWindowDialog();
		
		
		/*********
    	 * TITULO
    	 *********/
    	JLabel lblTitulo = new JLabel("Seguimiento de Clientes");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 304, 23);
		getContentPane().add(lblTitulo);
		
		
		/**
		 * LABEL BUSCADOR
		 */
		lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(10, 54, 83, 14);
		getContentPane().add(lblEspecialidad);
		
		/**
		 * COMBO ESPECIALIDADES
		 */
		cmbEspecialidad = new JComboBox<String>();		
		cmbEspecialidad.setModel(new DefaultComboBoxModel<String>(especialidades));
		cmbEspecialidad.setBounds(92, 51, 154, 20);
		getContentPane().add(cmbEspecialidad);
		
		
		/**
		 * BUSCADOR NOMBRE
		 */
		txtBuscarCliente = new JTextField();
		txtBuscarCliente.setForeground(Color.GRAY);
		txtBuscarCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarCliente.setText("Ingrese apellido o nombre...");
		txtBuscarCliente.setBounds(270, 51, 154, 20);
		txtBuscarCliente.setColumns(10);
		getContentPane().add(txtBuscarCliente);
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");		
		btnAceptar.setLocation(817, 609);
		getContentPane().add(btnAceptar);
		
		
		/**
		 * BOTON BUSCADOR
		 */
		btnBuscarCliente = new BotonesIconos("",utilidades.Configuraciones.IMG_ICONOS+"BUSCAR_16.png");
		btnBuscarCliente.setBounds(434, 51, 30, 20);
		getContentPane().add(btnBuscarCliente);
	}
	
	
	/********************
	 * EVENTOS
	 * @param evento
	 * @throws Exception
	 ********************/
	
	//-------------------------------------------------------------------
	protected void addEscapeListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 click_boton_cancelar();
		 }
	 };
	 getRootPane().registerKeyboardAction(
			 escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
	
	//-------------------------------------------------------------------------------------------------------
		public void click_boton_cancelar()
		{
			int rta = JOptionPane.showConfirmDialog(
					this, 
					"¿Desea salir y volver a la pantalla principal?",
					"ATENCIÓN",
					JOptionPane.YES_NO_OPTION);
				
			switch(rta)
			{
			case(1):
				break;
			case(0): //limpiar_formulario();
				 dispose();
				 break;
			}
		}
		
		//-------------------------------------------------------------------
		protected void cerrar_salir()
		{
			//limpiar_formulario();
			//limpiar_objetos_temporales();
			dispose();
		}
		
		
}
