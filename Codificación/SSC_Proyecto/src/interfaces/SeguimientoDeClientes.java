package interfaces;

import interfaces.componentes.BotonesIconos;
import interfaces.componentes.JDialogBaseFormularios;
import interfaces.componentes.TablaClientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;



import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
/**
 * GUI FORMULARIO DE SEGUIMIENTO DE CLIENTES
 * @author Javier Bartomioli - Rodrigo Naredo 
 *
 */
public class SeguimientoDeClientes
{
	//COMPONENTES
	public JDialogBaseFormularios frmSeguimiento;
	public JTextField txtBuscarCliente;
	private JLabel lblEspecialidad;
	public JComboBox<String> cmbEspecialidad;
	private JScrollPane scrollClientesBuscados;
	public TablaClientes tblClientesBuscados;
	public BotonesIconos btnAceptar;	
	private Box boxClientesBuscados;
	private Box boxClienteSeleccionado;
	
	public BotonesIconos btnBuscarCliente;
	private JPanel pnlClienteSeleccionado;
	private JLabel lblApellidoNombre;
	private JLabel lblEmail;
	private JLabel lblEspecialidadProf;
	private JLabel lblDireccion;
	private JLabel lblTelfono;
	private JLabel lblTotalVentas;
	public JTextField txtApNomSelec;
	public JTextField txtMailSelec;
	public JTextField txtEspecSelec;
	public JTextField txtDirSelec;
	public JTextField txtTelSelec;
	public JTextField txtTotVtasSelec;
	private JLabel lblTitulo;
	public JLabel lblInfo, lblWarning;
	private String[] especialidades = {"Seleccione...", "Distribuidor", "Endodoncia", "Gnatologia", "Odontologia General", "Ortodoncia", "Periodoncia", "Protesista"};
	private JLayeredPane layerGrafico;
	public JPanel pnlGrafico;
	private JTable tblVentasCliente;
	private DefaultTableModel modelVentasCliente;
	
	/**
	 * CONSTRUCTOR
	 * @param dialogPadre
	 */
	public SeguimientoDeClientes(JFrame jframePadre)
	{
		//FORMULARIO BASE
		frmSeguimiento = new JDialogBaseFormularios(jframePadre,"Seguimiento de Clientes","SEGUIMIENTO.png",true);
		frmSeguimiento.setPantallaCompleta();
		frmSeguimiento.setDimensionFormulario(1024, 668);
		frmSeguimiento.setBotonAyuda(1258,48);

		
    	//TITULO
		lblTitulo = new JLabel("Seguimiento de Clientes");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 304, 23);
		frmSeguimiento.getContentPane().add(lblTitulo);
		
		
		//LABEL BUSCADOR
		lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(10, 54, 83, 14);
		frmSeguimiento.getContentPane().add(lblEspecialidad);
	
		
		//COMBO ESPECIALIDADES
		cmbEspecialidad = new JComboBox<String>();		
		cmbEspecialidad.setModel(new DefaultComboBoxModel<String>(especialidades));
		cmbEspecialidad.setBounds(92, 51, 154, 20);
		frmSeguimiento.getContentPane().add(cmbEspecialidad);
		

		//BUSCADOR NOMBRE
		txtBuscarCliente = new JTextField();
		txtBuscarCliente.setForeground(Color.GRAY);
		txtBuscarCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarCliente.setText("Ingrese apellido o nombre...");
		txtBuscarCliente.setBounds(270, 51, 154, 20);
		txtBuscarCliente.setColumns(10);
		frmSeguimiento.getContentPane().add(txtBuscarCliente);
		

		//BOTON ACEPTAR
		btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");		
		btnAceptar.setLocation(1200, 609);
		frmSeguimiento.getContentPane().add(btnAceptar);
		
		
		//BOTON BUSCADOR
		btnBuscarCliente = new BotonesIconos("BUSCAR.png");
		btnBuscarCliente.setBounds(434, 51, 30, 20);
		frmSeguimiento.getContentPane().add(btnBuscarCliente);


		//TABLA CLIENTES BUSCADOS
		boxClientesBuscados = Box.createHorizontalBox();
		boxClientesBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Clientes por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxClientesBuscados.setBounds(10, 106, 464, 244);
		frmSeguimiento.getContentPane().add(boxClientesBuscados);
		
		scrollClientesBuscados = new JScrollPane();
		boxClientesBuscados.add(scrollClientesBuscados);
		
	    tblClientesBuscados = new interfaces.componentes.TablaClientes();
		scrollClientesBuscados.setViewportView(tblClientesBuscados);
		
	
		//TABLA CLIENTE SELECCIONADO
		boxClienteSeleccionado = Box.createHorizontalBox();
		boxClienteSeleccionado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cliente seleccionado", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxClienteSeleccionado.setBounds(10, 371, 464, 235);
		frmSeguimiento.getContentPane().add(boxClienteSeleccionado);
		
		
		//PANEL DATOS CLIENTE
		pnlClienteSeleccionado = new JPanel();
		boxClienteSeleccionado.add(pnlClienteSeleccionado);
		pnlClienteSeleccionado.setLayout(null);
		
			lblApellidoNombre = new JLabel("Apellido y Nombre:");
			lblApellidoNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblApellidoNombre.setBounds(10, 12, 121, 21);
			pnlClienteSeleccionado.add(lblApellidoNombre);
			
			txtApNomSelec = new JTextField("");
			txtApNomSelec.setEditable(false);
			txtApNomSelec.setForeground(Color.DARK_GRAY);
			txtApNomSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtApNomSelec.setBounds(134, 12, 308, 21);
			pnlClienteSeleccionado.add(txtApNomSelec);
			
			txtEspecSelec = new JTextField("");
			txtEspecSelec.setEditable(false);
			txtEspecSelec.setForeground(Color.DARK_GRAY);
			txtEspecSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtEspecSelec.setBounds(96, 45, 346, 21);
			
			lblEspecialidadProf = new JLabel("Especialidad:");
			lblEspecialidadProf.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblEspecialidadProf.setBounds(10, 45, 85, 21);
			pnlClienteSeleccionado.add(lblEspecialidadProf);
			pnlClienteSeleccionado.add(txtEspecSelec);
			
			lblEmail = new JLabel("E-mail:");
			lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblEmail.setBounds(10, 78, 48, 21);
			pnlClienteSeleccionado.add(lblEmail);
			
			txtMailSelec = new JTextField("");
			txtMailSelec.setEditable(false);
			txtMailSelec.setForeground(Color.DARK_GRAY);
			txtMailSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtMailSelec.setBounds(59, 78, 383, 21);
			pnlClienteSeleccionado.add(txtMailSelec);
			
			lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblDireccion.setBounds(10, 111, 66, 21);
			pnlClienteSeleccionado.add(lblDireccion);
			
			txtDirSelec = new JTextField("");
			txtDirSelec.setEditable(false);
			txtDirSelec.setForeground(Color.DARK_GRAY);
			txtDirSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtDirSelec.setBounds(78, 111, 364, 21);
			pnlClienteSeleccionado.add(txtDirSelec);
			
			lblTelfono = new JLabel("Tel\u00E9fono:");
			lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTelfono.setBounds(10, 144, 66, 21);
			pnlClienteSeleccionado.add(lblTelfono);
			
			txtTelSelec = new JTextField("");
			txtTelSelec.setEditable(false);
			txtTelSelec.setForeground(Color.DARK_GRAY);
			txtTelSelec.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtTelSelec.setBounds(77, 144, 365, 21);
			pnlClienteSeleccionado.add(txtTelSelec);
			
			lblTotalVentas = new JLabel("Total por ventas:");
			lblTotalVentas.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblTotalVentas.setBounds(10, 177, 121, 21);
			pnlClienteSeleccionado.add(lblTotalVentas);
			
			txtTotVtasSelec = new JTextField("");
			txtTotVtasSelec.setEditable(false);
			txtTotVtasSelec.setForeground(new Color(46, 139, 87));
			txtTotVtasSelec.setFont(new Font("Tahoma", Font.BOLD, 13));
			txtTotVtasSelec.setBounds(134, 177, 308, 21);
			pnlClienteSeleccionado.add(txtTotVtasSelec);	
		////////////////////////////////////////////////	
		
			
		//INICIO GRAFICO DE LINEAS //
		layerGrafico = new JLayeredPane();
		layerGrafico.setBorder(new TitledBorder(null, "Ventas por Mes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layerGrafico.setBounds(486, 106, 802, 434);
		frmSeguimiento.getContentPane().add(layerGrafico);

			pnlGrafico = new JPanel();
			pnlGrafico.setBounds(10, 21, 780, 402);
			layerGrafico.add(pnlGrafico, BorderLayout.CENTER);
			pnlGrafico.setLayout(new BorderLayout(0, 0));
			
			lblInfo = new JLabel("Informaci\u00F3n ventas");
			lblInfo.setBounds(488, 552, 802, 22);
			lblInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblInfo.setVisible(false);
			frmSeguimiento.getContentPane().add(lblInfo);
			
			lblWarning = new JLabel("Informaci\u00F3n falta de ventas");
			lblWarning.setBounds(486, 552, 804, 22);
			lblWarning.setForeground(Color.RED);
			lblWarning.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblWarning.setVisible(false);
			frmSeguimiento.getContentPane().add(lblWarning);
			
			tblVentasCliente = new JTable();
			modelVentasCliente = (DefaultTableModel) tblVentasCliente.getModel();
			modelVentasCliente.addColumn("Mes Venta");
			modelVentasCliente.addColumn("Importe");
		//FIN GRAFICO DE LINEAS//
	}
}