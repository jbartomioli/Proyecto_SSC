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
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;



public class ModificarDestinatarios extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1068385037676479263L;

	private JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;
	private JLabel lblEspecialidad;
	//private JLabel lblImagen;
	private JComboBox cmbEspecialidad;
	private interfaces.componentes.TablaDestinatarios tblDestinatariosBuscados;
	private interfaces.componentes.TablaDestinatarios tblDestinatariosNuevos;
	private Box boxDestinatariosBuscados;
	private Box boxDestinatariosNuevos;
	private JScrollPane scrollDestinatariosBuscados;
	private JScrollPane scrollDestinatariosNuevos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.BotonesIconos btnCancelar;
	private negocio.ControladorConfeccionarAnuncio controladorAux;


	//CONSTRUCTOR
	public ModificarDestinatarios(JDialog padre) {
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
		setMaximumSize(new Dimension(1366, 768));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);	
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
		cmbEspecialidad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				clickComboEspecialidad(evento);}});
		
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
		
		//IMAGEN SACADA PARA PODER PARA COLOCAR UN BOTÓN QUE FACILITE LA BÚSQUEDA DE LOS CLIENTES
		/*lblImagen = new JLabel("");
		lblImagen.setSize(new Dimension(32, 32));
		lblImagen.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"BUSCAR_32.png"));
		lblImagen.setBounds(455, 30, 44, 36);
		getContentPane().add(lblImagen);
		*/
		
		Box boxDestinatariosNuevos = Box.createHorizontalBox();
		boxDestinatariosNuevos.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosNuevos.setBounds(10, 134, 500, 250);
		getContentPane().add(boxDestinatariosNuevos);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		/// EL SCROLL SE DEBE LLENAR CON LOS CLIENTES ASOCIADOS A LOS PRODUCTOS SELECCIONADOS ///
		/////////////////////////////////////////////////////////////////////////////////////////
		JScrollPane scrollDestinatariosNuevos = new JScrollPane();
		boxDestinatariosNuevos.add(scrollDestinatariosNuevos);
		///////////////////////////////////////////////////////////////////////////////
		tblDestinatariosNuevos = new interfaces.componentes.TablaDestinatarios();
		scrollDestinatariosNuevos.setViewportView(tblDestinatariosNuevos);
	
				
        //Evento para eliminar destinatarios a la lista de destino
		tblDestinatariosNuevos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				DefaultTableModel tableModel = (DefaultTableModel) tblDestinatariosNuevos.getModel();
				int filaSeleccionada = tblDestinatariosNuevos.getSelectedRow();
				//JOptionPane.showMessageDialog(null, "Fila presionada: " + filaSeleccionada);
			    if (filaSeleccionada >= 0)
			         tableModel.removeRow(filaSeleccionada);
			}
		});
		
		
		//TableColumn agregarColumn;
		//agregarColumn = tblDestinatariosNuevos.getColumnModel().getColumn(3);
		//agregarColumn.setCellEditor(new interfaces.componentes.EditorCeldas(tblDestinatariosNuevos));
		//agregarColumn.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(true));
		//agregarColumn.setPreferredWidth(16);
		//agregarColumn.setMaxWidth(16);
		
		
		Box boxDestinatariosBuscados = Box.createHorizontalBox();
		boxDestinatariosBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosBuscados.setBounds(520, 134, 488, 250);
		getContentPane().add(boxDestinatariosBuscados);
		
		JScrollPane scrollDestinatariosBuscados = new JScrollPane();
		boxDestinatariosBuscados.add(scrollDestinatariosBuscados);
		
	    tblDestinatariosBuscados = new interfaces.componentes.TablaDestinatarios();
		scrollDestinatariosBuscados.setViewportView(tblDestinatariosBuscados);
		
		//Evento para agregar destinatarios a la lista de destino
		tblDestinatariosBuscados.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) 
			{
				DefaultTableModel tableModel = (DefaultTableModel) tblDestinatariosNuevos.getModel();
				DefaultTableModel tableModel1 = (DefaultTableModel) tblDestinatariosBuscados.getModel();
				int filaSeleccionada = tblDestinatariosBuscados.getSelectedRow();
				java.util.Vector fila;
				fila = (java.util.Vector) tableModel1.getDataVector().elementAt(filaSeleccionada);
				
			    if (filaSeleccionada >= 0)
			        tableModel.addRow(fila);
			}
		});

		
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(819, 569);
		getContentPane().add(btnAceptar);
		
		
		btnCancelar = new BotonesIconos("Cancelar",utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	clickBotonCancelar(evento);}});
		
		btnCancelar.setLocation(918, 569);
		getContentPane().add(btnCancelar);
		
		JButton btnBuscarDestinatario = new JButton("");
		btnBuscarDestinatario.setIcon(new ImageIcon(ModificarDestinatarios.class.getResource("/resources/images/x16/find.png")));
		btnBuscarDestinatario.setBounds(424, 80, 30, 19);
		getContentPane().add(btnBuscarDestinatario);
	}
	
	
	// EVENTOS
	public void clickComboEspecialidad(ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			Object esp = cmbEspecialidad.getSelectedItem();
			String especialidad = String.valueOf(esp);
			
			negocio.CatalogoClientes catClie = new negocio.CatalogoClientes();
			
			catClie.obtenerClientes();
			
			///////////////LA LINEA ES PARA PROBAR INSERCION Y ELIMINACION DE FILAS////////////////////
			//////////////HAY QUE LLENAR LA TABLA CON LOS DATOS DE LA PANTALLA ANTERIOR////////////////
			tblDestinatariosNuevos.completarTabla(catClie.buscarClientesPorEspecialidad(especialidad));
			///////////////////////////////////////////////////////////////////////////////////////////
			tblDestinatariosBuscados.completarTabla(catClie.buscarClientesPorEspecialidad(especialidad));
			
			//Agrega el btn eliminar a la tabla
			tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
			//Agrega el btn añadir a la tabla
			tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
		}
	}
	
	
	public void clickBotonCancelar(ActionEvent evento)
	{
		dispose();
	}
}
