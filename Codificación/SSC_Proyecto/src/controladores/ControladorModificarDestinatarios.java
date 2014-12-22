package controladores;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import interfaces.ModificarDestinatarios;

public class ControladorModificarDestinatarios implements ActionListener, ItemListener, WindowListener, KeyListener, MouseListener
{
	private ModificarDestinatarios guiModificarDestinatarios;
	private ControladorConfeccionarAnuncio controladorConfeccionarAnuncio;
	
	
	public ControladorModificarDestinatarios(ModificarDestinatarios guiModificarDestinatarios, ControladorConfeccionarAnuncio controladorConfeccionarAnuncio)
	{
		this.guiModificarDestinatarios = guiModificarDestinatarios;
		this.controladorConfeccionarAnuncio = controladorConfeccionarAnuncio;
		
		this.guiModificarDestinatarios.btnAceptar.addActionListener(this);
		this.guiModificarDestinatarios.btnBuscarDestinatario.addActionListener(this);
		this.guiModificarDestinatarios.btnCancelar.addActionListener(this);
		this.guiModificarDestinatarios.cmbEspecialidad.addItemListener(this);
		this.guiModificarDestinatarios.txtBuscarDestinatarios.addKeyListener(this);
		this.guiModificarDestinatarios.txtBuscarDestinatarios.addMouseListener(this);
		this.guiModificarDestinatarios.tblDestinatariosBuscados.addMouseListener(this);
		this.guiModificarDestinatarios.tblDestinatariosNuevos.addMouseListener(this);
		this.guiModificarDestinatarios.frmModificarDestinatarios.addWindowListener(this);
		
		inicializar();
	}

		
	

	@Override
	public void mouseClicked(MouseEvent evento)
	{
		//
		if(evento.getSource().equals(guiModificarDestinatarios.txtBuscarDestinatarios))
		{
			guiModificarDestinatarios.txtBuscarDestinatarios.setText("");
			guiModificarDestinatarios.txtBuscarDestinatarios.setForeground(SystemColor.black);
		}
		//
		if(evento.getSource().equals(guiModificarDestinatarios.tblDestinatariosNuevos))
		{
			if(guiModificarDestinatarios.tblDestinatariosNuevos.columnAtPoint(evento.getPoint())==4)
			{
				click_eliminar_destinatario();
			}
		}
		//
		if(evento.getSource().equals(guiModificarDestinatarios.tblDestinatariosBuscados))
		{
			if(guiModificarDestinatarios.tblDestinatariosBuscados.columnAtPoint(evento.getPoint())==4)
			{
				click_aniadir_destinatario();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent evento)
	{		
	}

	@Override
	public void mouseExited(MouseEvent evento)
	{
	}

	@Override
	public void mousePressed(MouseEvent e)
	{	
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}
	///////////////////////////////////////

	
	@Override
	public void keyPressed(KeyEvent evento)
	{		
		if(evento.getSource().equals(guiModificarDestinatarios.txtBuscarDestinatarios))
		{
			if(evento.getKeyCode() == KeyEvent.VK_ENTER)
			{
				buscar_cliente();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent evento)
	{		
	}

	@Override
	public void keyTyped(KeyEvent evento)
	{
	}
	////////////////////////////////
	
	
	
	@Override
	public void windowActivated(WindowEvent evento)
	{		
	}

	@Override
	public void windowClosed(WindowEvent evento)
	{
		if(evento.getSource().equals(guiModificarDestinatarios.frmModificarDestinatarios))
		{
			click_boton_cancelar();
		}
	}

	@Override
	public void windowClosing(WindowEvent evento)
	{
	}

	@Override
	public void windowDeactivated(WindowEvent evento)
	{	
	}

	@Override
	public void windowDeiconified(WindowEvent evento)
	{		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{	
	}

	@Override
	public void windowOpened(WindowEvent evento)
	{
	}
	////////////////////////////////////////////
	
	
	
	@Override
	public void itemStateChanged(ItemEvent evento)
	{
		if(evento.getSource().equals(guiModificarDestinatarios.cmbEspecialidad))
		{
			if(evento.getStateChange() == ItemEvent.SELECTED)
			{
				click_combo_especialidad();
			}
		}
	}
	//////////////////////////////////////////////

	
	
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(guiModificarDestinatarios.btnAceptar))
		{
			click_boton_aceptar();
		}
		//
		if(evento.getSource().equals(guiModificarDestinatarios.btnBuscarDestinatario))
		{
			buscar_cliente();
		}
		//
		if(evento.getSource().equals(guiModificarDestinatarios.btnCancelar))
		{
			click_boton_cancelar();
		}
	}
	////////////////////////////////////////////////		
		
	
		
	/**
	 * 
	 */
	protected void inicializar()
	{
		
		// LA TABLA SE DEBE LLENAR CON LOS CLIENTES ASOCIADOS A LOS PRODUCTOS SELECCIONADOS
		guiModificarDestinatarios.tblDestinatariosNuevos.completarTabla(
				controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().modificarClientesDestinatarios());
		//Agrega el btn eliminar a la tabla
		guiModificarDestinatarios.tblDestinatariosNuevos.definirTablaDestinatariosAnuncio();
	}
	
	
	/**
	 * 
	 * @param controladorConfeccionarAnuncio
	 * @param evento
	 */
	protected void click_combo_especialidad()
	{			
		Object esp = guiModificarDestinatarios.cmbEspecialidad.getSelectedItem();
		String especialidad = String.valueOf(esp);
					
		guiModificarDestinatarios.tblDestinatariosBuscados.completarTabla(
				controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().buscarClientesPorEspecialidad(especialidad));
			
		//Agrega el btn añadir a la tabla
		guiModificarDestinatarios.tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
	}
	
	

	/**
	 * 
	 * @param controladorConfeccionarAnuncio
	 */
	@SuppressWarnings("rawtypes")
	protected void completarDestinatarios(ControladorConfeccionarAnuncio controladorConfeccionarAnuncio)
	{
		DefaultTableModel modelo = (DefaultTableModel) guiModificarDestinatarios.tblDestinatariosNuevos.getModel();
		modelo.addRow((Vector) controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().modificarClientesDestinatarios());
	}
	
	

	/**
	 * 
	 */
	protected void click_eliminar_destinatario()
	{
		DefaultTableModel tableModel = (DefaultTableModel) guiModificarDestinatarios.tblDestinatariosNuevos.getModel();
		int filaSeleccionada = guiModificarDestinatarios.tblDestinatariosNuevos.getSelectedRow();
	    if (filaSeleccionada >= 0)
	         tableModel.removeRow(filaSeleccionada);
	}
	
	
	/**
	 * 
	 */
	@SuppressWarnings("rawtypes")
	protected void click_aniadir_destinatario()
	{
		DefaultTableModel modeloTblDestNuevos = (DefaultTableModel) guiModificarDestinatarios.tblDestinatariosNuevos.getModel();
		DefaultTableModel modeloTblDestBusc = (DefaultTableModel) guiModificarDestinatarios.tblDestinatariosBuscados.getModel();
		
		int filaSeleccionada = guiModificarDestinatarios.tblDestinatariosBuscados.getSelectedRow();
		java.util.Vector fila;
		fila = (java.util.Vector) modeloTblDestBusc.getDataVector().elementAt(filaSeleccionada);
		  
	    if(modeloTblDestNuevos.getDataVector().contains(fila))
			JOptionPane.showMessageDialog(
					guiModificarDestinatarios.frmModificarDestinatarios, 
					"No puede agregar dos veces al mismo cliente.", 
					"ATENCIÓN",
					JOptionPane.WARNING_MESSAGE);
		else 
			if(filaSeleccionada >= 0)
			{
				modeloTblDestNuevos.addRow(fila);
			}
	}
	
	

	/**
	 * 
	 */
	protected void click_boton_cancelar()
	{
		limpiar_formulario();
		guiModificarDestinatarios.frmModificarDestinatarios.dispose();
	}
	
	
	/**
	 * 
	 * @param controladorConfeccionarAnuncio
	 */
	protected void click_boton_aceptar()
	{		
		TableModel modelo = new DefaultTableModel();
		
		modelo = guiModificarDestinatarios.tblDestinatariosNuevos.getModel();
		
		controladorConfeccionarAnuncio.actualizarClientesDestinatarios(modelo);
		
		click_boton_cancelar();
	}
	
	
	

	/**
	 * 
	 * @param controladorConfeccionarAnuncio
	 */
	private void buscar_cliente() 
	{
		guiModificarDestinatarios.tblDestinatariosBuscados.completarTabla(
				controladorConfeccionarAnuncio.getModeloConfeccionarAnuncio().buscarCliente(guiModificarDestinatarios.txtBuscarDestinatarios.getText()));
		guiModificarDestinatarios.tblDestinatariosBuscados.definirTablaDestinatariosBuscados();
	}
	
		
	
	/**
	 * 
	 */
	protected void limpiar_formulario()
	{
		guiModificarDestinatarios.cmbEspecialidad.setSelectedIndex(0);
		guiModificarDestinatarios.txtBuscarDestinatarios.setText("");
			
		guiModificarDestinatarios.tblDestinatariosBuscados.limpiar_tabla();
		guiModificarDestinatarios.tblDestinatariosNuevos.limpiar_tabla();
	}
}
