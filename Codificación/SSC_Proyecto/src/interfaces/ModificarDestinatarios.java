package interfaces;


import interfaces.componentes.BotonesIconos;
import interfaces.componentes.JDialogBaseFormularios;
import interfaces.componentes.TablaModificarDestinatarios;

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
import javax.swing.UIManager;
import javax.swing.JButton;
/**
 * GUI MODIFICACION DE DESTINATARIOS DEL ANUNCIO
 * 
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class ModificarDestinatarios
{
	//COMPONENTES
	public JDialogBaseFormularios frmModificarDestinatarios;
	public JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;
	private JLabel lblEspecialidad;
	public JComboBox<String> cmbEspecialidad;
	public TablaModificarDestinatarios tblDestinatariosBuscados;
	public TablaModificarDestinatarios tblDestinatariosNuevos;
	public BotonesIconos btnAceptar;
	public BotonesIconos btnCancelar;	
	public JButton btnBuscarDestinatario;

	//VARIABLES
	private String[] especialidades = {"Seleccione...", "Distribuidor", "Endodoncia", "Gnatologia", "Odontologia General", "Ortodoncia", "Periodoncia", "Protesista"};

	
	/**
	 * CONSTRUCTOR
	 * @param dialogPadre
	 */
	public ModificarDestinatarios(JDialog dialogPadre) 
	{
		//FORMULARIO BASE
		frmModificarDestinatarios = new JDialogBaseFormularios(dialogPadre,"Modificar Clientes Destinatarios","CLIENTES.png",true);
		frmModificarDestinatarios.setDimensionFormulario(1024, 460);		
		frmModificarDestinatarios.setBotonAyuda(978, 45);
		
		
		//TITULO
		lblBuscarDestinatarios = new JLabel("Buscar destinatarios");
		lblBuscarDestinatarios.setForeground(Color.DARK_GRAY);
		lblBuscarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBuscarDestinatarios.setBounds(10, 11, 236, 29);
		frmModificarDestinatarios.getContentPane().add(lblBuscarDestinatarios);
			
		
		 //LABEL BUSCADOR
		lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(10, 54, 83, 14);
		frmModificarDestinatarios.getContentPane().add(lblEspecialidad);
		
	
		//COMBO ESPECIALIDADES
		cmbEspecialidad = new JComboBox<String>();		
		cmbEspecialidad.setModel(new DefaultComboBoxModel<String>(especialidades));
		cmbEspecialidad.setBounds(92, 51, 154, 20);
		frmModificarDestinatarios.getContentPane().add(cmbEspecialidad);
		
		
		//BUSCADOR NOMBRE
		txtBuscarDestinatarios = new JTextField();
		txtBuscarDestinatarios.setForeground(Color.GRAY);
		txtBuscarDestinatarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarDestinatarios.setText("Ingrese apellido o nombre...");
		txtBuscarDestinatarios.setBounds(270, 51, 154, 20);
		txtBuscarDestinatarios.setColumns(10);
		frmModificarDestinatarios.getContentPane().add(txtBuscarDestinatarios);
		
		
		//TABLA DESTINATARIOS SELECCIONADOS
		Box boxDestinatariosNuevos = Box.createHorizontalBox();
		boxDestinatariosNuevos.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosNuevos.setBounds(10, 82, 500, 264);
		frmModificarDestinatarios.getContentPane().add(boxDestinatariosNuevos);
		
		JScrollPane scrollDestinatariosNuevos = new JScrollPane();
		boxDestinatariosNuevos.add(scrollDestinatariosNuevos);
		
		tblDestinatariosNuevos = new interfaces.componentes.TablaModificarDestinatarios();
		scrollDestinatariosNuevos.setViewportView(tblDestinatariosNuevos);
		
		
		//TABLA DESTINATARIOS BUSCADOS
		Box boxDestinatariosBuscados = Box.createHorizontalBox();
		boxDestinatariosBuscados.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios por Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosBuscados.setBounds(520, 82, 488, 264);
		frmModificarDestinatarios.getContentPane().add(boxDestinatariosBuscados);
		
		JScrollPane scrollDestinatariosBuscados = new JScrollPane();
		boxDestinatariosBuscados.add(scrollDestinatariosBuscados);
		
	    tblDestinatariosBuscados = new interfaces.componentes.TablaModificarDestinatarios();
		scrollDestinatariosBuscados.setViewportView(tblDestinatariosBuscados);
		
		
		//BOTON ACEPTAR
		btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");		
		btnAceptar.setLocation(819, 357);
		frmModificarDestinatarios.getContentPane().add(btnAceptar);
		
		
		//BOTON CANCELAR
		btnCancelar = new BotonesIconos("Cancelar","CERRAR.png");
		btnCancelar.setLocation(918, 357);
		frmModificarDestinatarios.getContentPane().add(btnCancelar);
		
		
		//BOTON BUSCADOR
		btnBuscarDestinatario = new BotonesIconos("BUSCAR.png");
		btnBuscarDestinatario.setBounds(434, 51, 30, 20);
		frmModificarDestinatarios.getContentPane().add(btnBuscarDestinatario);
	}
}
