package interfaces;

import interfaces.componentes.BotonesIconos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

public class SeguimientoDeClientes extends JDialog
{
	/****************
	 * SERIALIZABLE
	 ****************/
	private static final long serialVersionUID = 4454249604145639431L;
	private negocio.ControladorConfeccionarAnuncio controladorAux;
	private JTextField txtBuscarCliente;
	private JLabel lblEspecialidad;
	private JComboBox<String> cmbEspecialidad;
	private String[] especialidades = {"Seleccione...", "Distribuidor", "Endodoncia", "Gnatologia", "Odontologia General", "Ortodoncia", "Periodoncia", "Protesista"};
	private interfaces.componentes.TablaModificarDestinatarios tblClientesBuscados;
	private interfaces.componentes.BotonesIconos btnAceptar;	
	private JButton btnBuscarCliente;
	private JPanel pnlClienteSeleccionado;
	private JLabel lblApellidoNombre;
	private JLabel lblEmail;
	private JLabel lblEspecialidad_1;
	private JLabel lblDireccin;
	private JLabel lblTelfono;
	private JLabel lblApNomSelec;
	private JLabel lblMailSelec;
	private JLabel lblEspecSelec;
	private JLabel lblDirSelec;
	private JLabel lblTelSelec;
	
	
	/**
	 * CONSTRUCTOR
	 * @param dialogPadre
	 */
	public SeguimientoDeClientes(Frame framePadre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorSeguimiento) throws Exception
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
		btnAceptar.setLocation(1200, 609);
		getContentPane().add(btnAceptar);
		
		
		/**
		 * BOTON BUSCADOR
		 */
		btnBuscarCliente = new BotonesIconos("",utilidades.Configuraciones.IMG_ICONOS+"BUSCAR_16.png");
		btnBuscarCliente.setBounds(434, 51, 30, 20);
		getContentPane().add(btnBuscarCliente);
		
		/**
		 * TABLA CLIENTES BUSCADOS
		 */
		Box boxClientesBuscados = Box.createHorizontalBox();
		boxClientesBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Clientes por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxClientesBuscados.setBounds(10, 106, 464, 244);
		getContentPane().add(boxClientesBuscados);
		
		JScrollPane scrollClientesBuscados = new JScrollPane();
		boxClientesBuscados.add(scrollClientesBuscados);
		
	    tblClientesBuscados = new interfaces.componentes.TablaModificarDestinatarios();
		scrollClientesBuscados.setViewportView(tblClientesBuscados);
		
		
		/**********************
		 * TABLA DESTINATARIOS
		 **********************/
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cliente seleccionado", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 371, 464, 198);
		getContentPane().add(boxDestinatarios);
		
		pnlClienteSeleccionado = new JPanel();
		boxDestinatarios.add(pnlClienteSeleccionado);
		pnlClienteSeleccionado.setLayout(null);
		
		lblApellidoNombre = new JLabel("Apellido y Nombre:");
		lblApellidoNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellidoNombre.setBounds(10, 11, 121, 21);
		pnlClienteSeleccionado.add(lblApellidoNombre);
		
		lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 75, 48, 21);
		pnlClienteSeleccionado.add(lblEmail);
		
		lblEspecialidad_1 = new JLabel("Especialidad:");
		lblEspecialidad_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad_1.setBounds(10, 43, 85, 21);
		pnlClienteSeleccionado.add(lblEspecialidad_1);
		
		lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDireccin.setBounds(10, 107, 66, 21);
		pnlClienteSeleccionado.add(lblDireccin);
		
		lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelfono.setBounds(10, 138, 66, 21);
		pnlClienteSeleccionado.add(lblTelfono);
		
		lblApNomSelec = new JLabel("apNomSelec");
		lblApNomSelec.setForeground(Color.DARK_GRAY);
		lblApNomSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApNomSelec.setBounds(141, 11, 221, 21);
		lblApNomSelec.setVisible(false);
		pnlClienteSeleccionado.add(lblApNomSelec);
		
		lblMailSelec = new JLabel("mailSelec");
		lblMailSelec.setForeground(Color.DARK_GRAY);
		lblMailSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMailSelec.setBounds(68, 75, 294, 21);
		lblMailSelec.setVisible(false);
		pnlClienteSeleccionado.add(lblMailSelec);
		
		lblEspecSelec = new JLabel("especSelec");
		lblEspecSelec.setForeground(Color.DARK_GRAY);
		lblEspecSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEspecSelec.setBounds(105, 43, 257, 21);
		lblEspecSelec.setVisible(false);
		pnlClienteSeleccionado.add(lblEspecSelec);
		
		lblDirSelec = new JLabel("dirSelec");
		lblDirSelec.setForeground(Color.DARK_GRAY);
		lblDirSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDirSelec.setBounds(86, 107, 276, 21);
		lblDirSelec.setVisible(false);
		pnlClienteSeleccionado.add(lblDirSelec);
		
		lblTelSelec = new JLabel("telSelec");
		lblTelSelec.setForeground(Color.DARK_GRAY);
		lblTelSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelSelec.setBounds(86, 138, 276, 21);
		lblTelSelec.setVisible(false);
		pnlClienteSeleccionado.add(lblTelSelec);
		
		
		inicializar(controladorSeguimiento);
	}
	
	
	/*********************************
	 * INICIALIZACION DE COMPONENTES
	 * @param controladorAnuncios
	 * @throws Exception
	 *********************************/
	protected void inicializar(final negocio.ControladorConfeccionarAnuncio controladorSeguimiento) throws Exception
	{
		controladorAux = controladorSeguimiento;
		
		cmbEspecialidad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				click_combo_especialidad(controladorSeguimiento, evento);}});
		
		
		txtBuscarCliente.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evento) {
				//Busca clientes si el usuario presiona enter
				if(evento.getKeyCode() == KeyEvent.VK_ENTER)
				{
					buscar_cliente_textField(controladorSeguimiento);
				}
			}
		});		
		
		txtBuscarCliente.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) 
			{
				txtBuscarCliente.setText("");
				txtBuscarCliente.setForeground(SystemColor.black);
			}
		});
		
		//Evento seleccionar destinatario de la lista
		tblClientesBuscados.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me)
			{
				if(tblClientesBuscados.columnAtPoint(me.getPoint())==4)
					click_seleccionar_destinatario();
				}});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
		       		click_boton_aceptar();}});
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
		
		
		//-------------------------------------------------------------------------------------------------------
		public void click_combo_especialidad(negocio.ControladorConfeccionarAnuncio controladorSeguimiento, ItemEvent evento)
		{		
			if(evento.getStateChange() == ItemEvent.SELECTED)
			{			
				Object esp = cmbEspecialidad.getSelectedItem();
				String especialidad = String.valueOf(esp);
						
				tblClientesBuscados.completarTabla(controladorSeguimiento.getCatalogoClientes().buscarClientesPorEspecialidad(especialidad));
				
				//Agrega el btn eliminar a la tabla
				//tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
				//Agrega el btn añadir a la tabla
				tblClientesBuscados.definirTablaDestinatariosBuscados();
			}
		}
		
		
		//-------------------------------------------------------------------------------------------------------
		private void buscar_cliente_textField(negocio.ControladorConfeccionarAnuncio controladorSeguimiento) 
		{
			tblClientesBuscados.completarTabla(controladorSeguimiento.getCatalogoClientes().buscarClientesDescPcial(txtBuscarCliente.getText()));
			tblClientesBuscados.definirTablaDestinatariosBuscados();
		}
		
		public void click_boton_aceptar()
		{				
			dispose();
		}
		
		
		//-------------------------------------------------------------------------------------------------------
		@SuppressWarnings("rawtypes")
		public void click_seleccionar_destinatario()
		{
			DefaultTableModel modeloClientesBuscados = (DefaultTableModel) tblClientesBuscados.getModel();
			
			int filaSeleccionada = tblClientesBuscados.getSelectedRow();
			java.util.Vector fila;
			fila = (java.util.Vector) modeloClientesBuscados.getDataVector().elementAt(filaSeleccionada);
			  
		    if(filaSeleccionada >= 0)
			{
		    	int idCliente = Integer.parseInt(fila.elementAt(0).toString());
		    	negocio.Cliente cliente = controladorAux.getCatalogoClientes().buscarCliente(idCliente);
				
		    	lblApNomSelec.setText(cliente.getApellido() + ", " + cliente.getNombre());
				lblEspecSelec.setText(cliente.getEspecialidad());
				lblMailSelec.setText(cliente.getEmail());
				lblDirSelec.setText(cliente.getDireccion());
				lblTelSelec.setText(cliente.getTelefono());
				
				lblApNomSelec.setVisible(true);
				lblEspecSelec.setVisible(true);
				lblMailSelec.setVisible(true);
				lblDirSelec.setVisible(true);
				lblTelSelec.setVisible(true);
			}
		}
}
