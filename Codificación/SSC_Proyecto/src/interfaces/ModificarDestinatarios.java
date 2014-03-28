package interfaces;



import interfaces.componentes.BotonesIconos;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.*;




public class ModificarDestinatarios extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1068385037676479263L;

	private JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;
	private JLabel lblEspecialidad;
	private JLabel lblImagen;
	private JComboBox cmbEspecialidad;
	private interfaces.componentes.TablaDestinatariosBuscados tblDestinatariosBuscados;
	private JTable tblDestinatariosNuevos;
	private Box boxDestinatariosBuscados;
	private Box boxDestinatariosNuevos;
	private JScrollPane scrollDestinatariosBuscados;
	private JScrollPane scrollDestinatariosNuevos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.BotonesIconos btnCancelar;



	//CONSTRUCTOR
	public ModificarDestinatarios(JDialog padre) {
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
		setMaximumSize(new Dimension(1366, 768));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
		//setLocationRelativeTo(null); AL PONER LA SENTENCIA EN EL BOTON NO HACE FALTA PONERLO ACÁ		
		setTitle("Modificar Clientes Destinatarios");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CLIENTES_32.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
	
		lblBuscarDestinatarios = new JLabel("Buscar destinatarios");
		lblBuscarDestinatarios.setForeground(Color.DARK_GRAY);
		lblBuscarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBuscarDestinatarios.setBounds(10, 30, 341, 29);
		getContentPane().add(lblBuscarDestinatarios);
		
				
		lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(10, 83, 86, 14);
		getContentPane().add(lblEspecialidad);
				
		
		cmbEspecialidad = new JComboBox();
		cmbEspecialidad.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_SSC", "root", "root");
					Statement stm = conexion.createStatement();
					Object esp = cmbEspecialidad.getSelectedItem();
					String especialidad = String.valueOf(esp);
					String SQL = "select apellido, nombre, especialidad from clientes where especialidad =" + especialidad;
					ResultSet rst = stm.executeQuery(SQL);
					ResultSetMetaData rstMd = rst.getMetaData();
					
					int nroColumnas = rstMd.getColumnCount();
					
					while(rst.next())
					{
						Object [] fila = new Object [nroColumnas];
						
						for(int i = 0; i<nroColumnas; i++)
						{
							fila [i] = rst.getObject(i+1);
						}
						
						tblDestinatariosBuscados.agregarFila(fila);
					}
					
				}
				
				catch(ClassNotFoundException ce) 
				{
					ce.printStackTrace();
				}
				
				catch(SQLException se) 
				{
					se.printStackTrace();
				}
			}
		});
		cmbEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"", "Distribuidor", "Endodoncia", "Gnatología", "Odontología General", "Ortodoncia", "Periodoncia", "Protesista"}));
		cmbEspecialidad.setBounds(92, 80, 111, 20);
		getContentPane().add(cmbEspecialidad);
		
		txtBuscarDestinatarios = new JTextField();
		txtBuscarDestinatarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				txtBuscarDestinatarios.setText("");
				txtBuscarDestinatarios.setForeground(SystemColor.black);
			}
		});
		txtBuscarDestinatarios.setForeground(Color.GRAY);
		txtBuscarDestinatarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarDestinatarios.setText("ingrese apellido o nombre...");
		txtBuscarDestinatarios.setBounds(283, 80, 141, 20);
		txtBuscarDestinatarios.setColumns(10);
		getContentPane().add(txtBuscarDestinatarios);
		
		
		lblImagen = new JLabel("");
		lblImagen.setSize(new Dimension(32, 32));
		lblImagen.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"BUSCAR_32.png"));
		lblImagen.setBounds(434, 72, 44, 36);
		getContentPane().add(lblImagen);
		
		
		boxDestinatariosNuevos = Box.createHorizontalBox();
		boxDestinatariosNuevos.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosNuevos.setBounds(10, 134, 500, 250);
		getContentPane().add(boxDestinatariosNuevos);
		
		scrollDestinatariosNuevos = new JScrollPane();
		boxDestinatariosNuevos.add(scrollDestinatariosNuevos);
		
				String[] columnNames = {"Apellido",
		                "Nombre",
		                "Especialidad",
		                ""};
				
				Object[][] data = {
					    {"Diaz", "Carolina", "Endodoncista", new Boolean(false)},
					    {"Hulter", "Antonio", "Ortodoncista", new Boolean(true)},
					    {"Ríos", "Damián", "Ortodoncista", new Boolean(false)}
				};
				
		tblDestinatariosNuevos = new JTable(data, columnNames);
		scrollDestinatariosNuevos.setViewportView(tblDestinatariosNuevos);
		
		TableColumn agregarColumn;
		agregarColumn = tblDestinatariosNuevos.getColumnModel().getColumn(3);
		agregarColumn.setCellEditor(new interfaces.componentes.EditorCeldas(tblDestinatariosNuevos));
		agregarColumn.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(true));
		agregarColumn.setPreferredWidth(16);
		agregarColumn.setMaxWidth(16);
		
		
		boxDestinatariosBuscados = Box.createHorizontalBox();
		boxDestinatariosBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosBuscados.setBounds(520, 134, 488, 250);
		getContentPane().add(boxDestinatariosBuscados);
		
		scrollDestinatariosBuscados = new JScrollPane();
		boxDestinatariosBuscados.add(scrollDestinatariosBuscados);
		
		//FALTA COMPLETAR LA TABLA
		/*tblDestinatariosBuscados = new interfaces.componentes.TablaDestinatariosBuscados();
		tblDestinatariosBuscados.completarTabla(clientes);
		tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
		scrollDestinatariosBuscados.setViewportView(tblDestinatariosBuscados);
		
		
		TableColumn agregarColumna;
		agregarColumna = tblDestinatariosBuscados.getColumnModel().getColumn(3);
		agregarColumna.setCellEditor(new interfaces.componentes.EditorCeldas(tblDestinatariosBuscados));
		agregarColumna.setCellRenderer(new interfaces.componentes.RendererBotonCeldaAniadir(true));
		agregarColumna.setPreferredWidth(16);
		agregarColumna.setMaxWidth(16);
		*/
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(819, 569);
		getContentPane().add(btnAceptar);
		
		
		btnCancelar = new BotonesIconos("Cancelar",utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	clickBotonCancelar(evento);}});
		
		btnCancelar.setLocation(918, 569);
		getContentPane().add(btnCancelar);
	}
	
	
	
	
	// EVENTOS
	public void clickComboEspecialidad(ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
				
		}
	}
	
	
	public void clickBotonCancelar(ActionEvent evento)
	{
		dispose();
	}
	
}
