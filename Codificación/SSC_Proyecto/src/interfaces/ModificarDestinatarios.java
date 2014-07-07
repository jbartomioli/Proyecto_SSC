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
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Vector;

import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class ModificarDestinatarios extends JDialog {

	private static final long serialVersionUID = -6385198300914272668L;
	
	private JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;
	private JLabel lblEspecialidad;
	private JComboBox<String> cmbEspecialidad;
	private String[] especialidades = {"", "Distribuidor", "Endodoncia", "Gnatologia", "Odontologia General", "Ortodoncia", "Periodoncia", "Protesista"};
	private interfaces.componentes.TablaModificarDestinatarios tblDestinatariosBuscados;
	private interfaces.componentes.TablaModificarDestinatarios tblDestinatariosNuevos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.BotonesIconos btnCancelar;
	


	//CONSTRUCTOR
	public ModificarDestinatarios(final interfaces.GenerarAnuncio dialogPadre) 
	{
		super(dialogPadre);
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
		lblEspecialidad.setBounds(10, 83, 83, 14);
		getContentPane().add(lblEspecialidad);
				
		
		cmbEspecialidad = new JComboBox<String>();
		cmbEspecialidad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				click_combo_especialidad(dialogPadre, evento);}
			});
		
		cmbEspecialidad.setModel(new DefaultComboBoxModel<String>(especialidades));
		cmbEspecialidad.setBounds(92, 80, 154, 20);
		getContentPane().add(cmbEspecialidad);
		
		txtBuscarDestinatarios = new JTextField();
		txtBuscarDestinatarios.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evento) {
				//Busca clientes si el usuario presiona enter
				if(evento.getKeyCode() == KeyEvent.VK_ENTER)
				{
					buscar_cliente_textField(dialogPadre);
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
		txtBuscarDestinatarios.setForeground(Color.GRAY);
		txtBuscarDestinatarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarDestinatarios.setText("ingrese apellido o nombre...");
		txtBuscarDestinatarios.setBounds(270, 80, 154, 20);
		txtBuscarDestinatarios.setColumns(10);
		getContentPane().add(txtBuscarDestinatarios);
		
		
		Box boxDestinatariosNuevos = Box.createHorizontalBox();
		boxDestinatariosNuevos.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosNuevos.setBounds(10, 134, 500, 250);
		getContentPane().add(boxDestinatariosNuevos);
		
		JScrollPane scrollDestinatariosNuevos = new JScrollPane();
		boxDestinatariosNuevos.add(scrollDestinatariosNuevos);
		
		tblDestinatariosNuevos = new interfaces.componentes.TablaModificarDestinatarios();
		scrollDestinatariosNuevos.setViewportView(tblDestinatariosNuevos);
		
		// LA TABLA SE DEBE LLENAR CON LOS CLIENTES ASOCIADOS A LOS PRODUCTOS SELECCIONADOS
		tblDestinatariosNuevos.completarTabla(dialogPadre.getControlador().getArrClientesInteresados());
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
		
			
		Box boxDestinatariosBuscados = Box.createHorizontalBox();
		boxDestinatariosBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosBuscados.setBounds(520, 134, 488, 250);
		getContentPane().add(boxDestinatariosBuscados);
		
		JScrollPane scrollDestinatariosBuscados = new JScrollPane();
		boxDestinatariosBuscados.add(scrollDestinatariosBuscados);
		
	    tblDestinatariosBuscados = new interfaces.componentes.TablaModificarDestinatarios();
		scrollDestinatariosBuscados.setViewportView(tblDestinatariosBuscados);
		
		//Evento para agregar destinatarios a la lista de destino
		tblDestinatariosBuscados.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(tblDestinatariosBuscados.columnAtPoint(me.getPoint())==4)
					click_aniadir_destinatario();
			}
		});

		
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        		click_boton_aceptar(dialogPadre);
	        	}
			});
		
		btnAceptar.setLocation(819, 569);
		getContentPane().add(btnAceptar);
		
		
		btnCancelar = new BotonesIconos("Cancelar",utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	click_boton_cancelar();}
			});
		btnCancelar.setLocation(918, 569);
		getContentPane().add(btnCancelar);
		
		
		JButton btnBuscarDestinatario = new BotonesIconos("",utilidades.Configuraciones.IMG_ICONOS+"BUSCAR_16.png");
		btnBuscarDestinatario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				click_boton_buscar(dialogPadre);}
			});
		btnBuscarDestinatario.setBounds(434, 80, 30, 20);
		getContentPane().add(btnBuscarDestinatario);
	}
	
	
	// EVENTOS
	//-------------------------------------------------------------------------------------------------------
	public void click_combo_especialidad(interfaces.GenerarAnuncio dialogPadre, ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			Object esp = cmbEspecialidad.getSelectedItem();
			String especialidad = String.valueOf(esp);
					
			tblDestinatariosBuscados.completarTabla(dialogPadre.getControlador().getCatalogoClientes().buscarClientesPorEspecialidad(especialidad));
			
			//Agrega el btn eliminar a la tabla
			//tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
			//Agrega el btn añadir a la tabla
			tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
		}
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	@SuppressWarnings("rawtypes")
	public void completarDestinatarios(interfaces.GenerarAnuncio dialogPadre)
	{
		DefaultTableModel modelo = (DefaultTableModel) tblDestinatariosNuevos.getModel();
		modelo.addRow((Vector) dialogPadre.getControlador().getArrClientesInteresados());
		
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
					"ATENCIÓN",
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
		int rta = JOptionPane.showConfirmDialog(
				this, 
				"¿Desea salir y volver a la pantalla Generar Anuncio?\n"
					+ "Todo cambio que no haya guardado se perderá.",
				"ATENCIÓN",
				JOptionPane.YES_NO_OPTION);
			
		switch(rta)
		{
		case(1):
			break;
		case(0): limpiar_formulario();
			 dispose();
			 break;
		}
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_aceptar(interfaces.GenerarAnuncio dialogPadre)
	{		
		TableModel modelo = new DefaultTableModel();
		
		modelo = tblDestinatariosNuevos.getModel();
		
		dialogPadre.actualizarClientesDestinatarios(modelo);
		
		dispose();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_buscar(interfaces.GenerarAnuncio dialogPadre)
	{
		//Evento para llenar la tabla de destinatarios buscados desde la lupa
		tblDestinatariosBuscados.completarTabla(dialogPadre.getControlador().getCatalogoClientes().buscarClientesDescPcial(txtBuscarDestinatarios.getText()));
		tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------
	private void buscar_cliente_textField(interfaces.GenerarAnuncio dialogPadre) 
	{
		tblDestinatariosBuscados.completarTabla(dialogPadre.getControlador().getCatalogoClientes().buscarClientesDescPcial(txtBuscarDestinatarios.getText()));
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
