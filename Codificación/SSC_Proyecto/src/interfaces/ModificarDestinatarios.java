package interfaces;


import interfaces.componentes.BotonesIconos;

import java.awt.SystemColor;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
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
import javax.swing.table.TableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Vector;

import javax.swing.JButton;

import controladores.ControladorConfeccionarAnuncio;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ModificarDestinatarios extends interfaces.componentes.JDialogBaseFormularios 
{

	private static final long serialVersionUID = -6385198300914272668L;
	
	private JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;
	private JLabel lblEspecialidad;
	private JComboBox<String> cmbEspecialidad;
	private String[] especialidades = {"Seleccione...", "Distribuidor", "Endodoncia", "Gnatologia", "Odontologia General", "Ortodoncia", "Periodoncia", "Protesista"};
	private interfaces.componentes.TablaModificarDestinatarios tblDestinatariosBuscados;
	private interfaces.componentes.TablaModificarDestinatarios tblDestinatariosNuevos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.BotonesIconos btnCancelar;	
	private JButton btnBuscarDestinatario;


	/**
	 * CONSTRUCTOR
	 * @param dialogPadre
	 */
	public ModificarDestinatarios(final JDialog dialogPadre, ControladorConfeccionarAnuncio controladorConfeccionarAnuncio) 
	{
		/**
		 * FORMULARIO BASE
		 */
		super((JDialog) dialogPadre,"Modificar Clientes Destinatarios","CLIENTES.png",true);
		setDimensionFormulario(1024, 460);		
		setBotonAyuda(978, 45);
		
		/**
		 * TITULO
		 */
		lblBuscarDestinatarios = new JLabel("Buscar destinatarios");
		lblBuscarDestinatarios.setForeground(Color.DARK_GRAY);
		lblBuscarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBuscarDestinatarios.setBounds(10, 11, 236, 29);
		getContentPane().add(lblBuscarDestinatarios);
			
		
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
		txtBuscarDestinatarios = new JTextField();
		txtBuscarDestinatarios.setForeground(Color.GRAY);
		txtBuscarDestinatarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarDestinatarios.setText("Ingrese apellido o nombre...");
		txtBuscarDestinatarios.setBounds(270, 51, 154, 20);
		txtBuscarDestinatarios.setColumns(10);
		getContentPane().add(txtBuscarDestinatarios);
		
		
		/**
		 * TABLA DESTINATARIOS SELECCIONADOS
		 */
		Box boxDestinatariosNuevos = Box.createHorizontalBox();
		boxDestinatariosNuevos.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosNuevos.setBounds(10, 82, 500, 264);
		getContentPane().add(boxDestinatariosNuevos);
		
		JScrollPane scrollDestinatariosNuevos = new JScrollPane();
		boxDestinatariosNuevos.add(scrollDestinatariosNuevos);
		
		tblDestinatariosNuevos = new interfaces.componentes.TablaModificarDestinatarios();
		scrollDestinatariosNuevos.setViewportView(tblDestinatariosNuevos);
		
		
		/**
		 * TABLA DESTINATARIOS BUSCADOS
		 */
		Box boxDestinatariosBuscados = Box.createHorizontalBox();
		boxDestinatariosBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosBuscados.setBounds(520, 82, 488, 264);
		getContentPane().add(boxDestinatariosBuscados);
		
		JScrollPane scrollDestinatariosBuscados = new JScrollPane();
		boxDestinatariosBuscados.add(scrollDestinatariosBuscados);
		
	    tblDestinatariosBuscados = new interfaces.componentes.TablaModificarDestinatarios();
		scrollDestinatariosBuscados.setViewportView(tblDestinatariosBuscados);
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");		
		btnAceptar.setLocation(819, 357);
		getContentPane().add(btnAceptar);
		
		
		/**
		 * BOTON CANCELAR
		 */
		btnCancelar = new BotonesIconos("Cancelar","CERRAR.png");
		btnCancelar.setLocation(918, 357);
		getContentPane().add(btnCancelar);
		
		
		/**
		 * BOTON BUSCADOR
		 */
		btnBuscarDestinatario = new BotonesIconos("BUSCAR.png");
		btnBuscarDestinatario.setBounds(434, 51, 30, 20);
		getContentPane().add(btnBuscarDestinatario);
		
		
		/**
		 * INICIALIZACION DE CONTROLES
		 */
		inicializar(controladorConfeccionarAnuncio);
	}
	
	
	
	//-------------------------------------------------------------------------
	protected void inicializar(final ControladorConfeccionarAnuncio controladorConfeccionarAnuncio)
	{
		cmbEspecialidad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				click_combo_especialidad(controladorConfeccionarAnuncio, evento);}});
		
		
		txtBuscarDestinatarios.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evento) {
				//Busca clientes si el usuario presiona enter
				if(evento.getKeyCode() == KeyEvent.VK_ENTER)
				{
					buscar_cliente_textField(controladorConfeccionarAnuncio);
				}
			}
		});		
		
		txtBuscarDestinatarios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) 
			{
				txtBuscarDestinatarios.setText("");
				txtBuscarDestinatarios.setForeground(SystemColor.black);
			}
		});
		
		
		// LA TABLA SE DEBE LLENAR CON LOS CLIENTES ASOCIADOS A LOS PRODUCTOS SELECCIONADOS
		tblDestinatariosNuevos.completarTabla(controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().getArrClientesInteresados());
		//Agrega el btn eliminar a la tabla
		tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
				
						
		//Evento para eliminar destinatarios a la lista de destino
		tblDestinatariosNuevos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
					{
						if(tblDestinatariosNuevos.columnAtPoint(me.getPoint())==4)
							click_eliminar_destinatario();
					}
				});
				
				
		//Evento para agregar destinatarios a la lista de destino
		tblDestinatariosBuscados.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
					{
						if(tblDestinatariosBuscados.columnAtPoint(me.getPoint())==4)
							click_aniadir_destinatario();
					}});

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
		       		click_boton_aceptar(controladorConfeccionarAnuncio);}});
				
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
		        	click_boton_cancelar();}});
				
		btnBuscarDestinatario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
					click_boton_buscar(controladorConfeccionarAnuncio);}});
	}
	
	
	// EVENTOS
	//-------------------------------------------------------------------------------------------------------
	public void click_combo_especialidad(ControladorConfeccionarAnuncio controladorConfeccionarAnuncio, ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			Object esp = cmbEspecialidad.getSelectedItem();
			String especialidad = String.valueOf(esp);
					
			tblDestinatariosBuscados.completarTabla(controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().getCatalogoClientes().buscarClientesPorEspecialidad(especialidad));
			
			//Agrega el btn eliminar a la tabla
			//tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
			//Agrega el btn a�adir a la tabla
			tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
		}
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	@SuppressWarnings("rawtypes")
	public void completarDestinatarios(ControladorConfeccionarAnuncio controladorConfeccionarAnuncio)
	{
		DefaultTableModel modelo = (DefaultTableModel) tblDestinatariosNuevos.getModel();
		modelo.addRow((Vector) controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().getArrClientesInteresados());
		
		//Agrega el btn eliminar a la tabla
		//tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_eliminar_destinatario()
	{
		DefaultTableModel tableModel = (DefaultTableModel) tblDestinatariosNuevos.getModel();
		int filaSeleccionada = tblDestinatariosNuevos.getSelectedRow();
	    if (filaSeleccionada >= 0)
	         tableModel.removeRow(filaSeleccionada);
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	@SuppressWarnings("rawtypes")
	public void click_aniadir_destinatario()
	{
		DefaultTableModel modeloTblDestNuevos = (DefaultTableModel) tblDestinatariosNuevos.getModel();
		DefaultTableModel modeloTblDestBusc = (DefaultTableModel) tblDestinatariosBuscados.getModel();
		
		int filaSeleccionada = tblDestinatariosBuscados.getSelectedRow();
		java.util.Vector fila;
		fila = (java.util.Vector) modeloTblDestBusc.getDataVector().elementAt(filaSeleccionada);
		  
	    if(modeloTblDestNuevos.getDataVector().contains(fila))
			JOptionPane.showMessageDialog(null, 
					"No puede agregar dos veces al mismo cliente.", 
					"ATENCI�N",
					JOptionPane.WARNING_MESSAGE);
		else 
			if(filaSeleccionada >= 0)
			{
				modeloTblDestNuevos.addRow(fila);
			}
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_cancelar()
	{
		limpiar_formulario();
		super.cerrar_salir();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_aceptar(ControladorConfeccionarAnuncio controladorConfeccionarAnuncio)
	{		
		TableModel modelo = new DefaultTableModel();
		
		modelo = tblDestinatariosNuevos.getModel();
		
		controladorConfeccionarAnuncio.actualizarClientesDestinatarios(modelo);
		
		super.cerrar_salir();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_buscar(ControladorConfeccionarAnuncio controladorConfeccionarAnuncio)
	{
		//Evento para llenar la tabla de destinatarios buscados desde la lupa
		tblDestinatariosBuscados.completarTabla(controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().getCatalogoClientes().buscarClientesDescPcial(txtBuscarDestinatarios.getText()));
		tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------
	private void buscar_cliente_textField(ControladorConfeccionarAnuncio controladorConfeccionarAnuncio) 
	{
		tblDestinatariosBuscados.completarTabla(
				controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().getCatalogoClientes().buscarClientesDescPcial(txtBuscarDestinatarios.getText()));
		tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
	}
	
		
	//-------------------------------------------------------------------------------------------------------
	protected void limpiar_formulario()
	{
		cmbEspecialidad.setSelectedIndex(0);
		txtBuscarDestinatarios.setText("");
			
		tblDestinatariosBuscados.limpiar_tabla();
		tblDestinatariosNuevos.limpiar_tabla();
	}
}
