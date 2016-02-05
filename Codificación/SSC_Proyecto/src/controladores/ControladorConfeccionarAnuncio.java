package controladores;

import interfaces.EditorHTML;
import interfaces.GenerarAnuncio;
import interfaces.ModificarDestinatarios;
import interfaces.ModificarPrecios;
import interfaces.PrevisualizadorHTML;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import negocio.Categoria;
import negocio.ModeloConfeccionarAnuncio;
import negocio.ModeloModificarPrecios;

/**
 * CONTROLADOR CONFECCIONAR ANUNCIO
 * 
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class ControladorConfeccionarAnuncio implements ActionListener, WindowListener, ItemListener, MouseListener
{
	
	//ATRIBUTOS
	private ModeloConfeccionarAnuncio modeloConfeccionarAnuncio;
	private GenerarAnuncio guiGenerarAnuncio;
	
	//VARIABLES TEMPORALES
	private negocio.SubCategoria subcategoriaActual;
	private Categoria categoria;

	
	/**
	 * CONSTRUCTOR
	 * @param modeloConfeccionarAnuncio
	 * @param guiGenerarAnuncio
	 * @throws Exception
	 */
	public ControladorConfeccionarAnuncio(ModeloConfeccionarAnuncio modeloConfeccionarAnuncio, GenerarAnuncio guiGenerarAnuncio)
	{
		this.modeloConfeccionarAnuncio = modeloConfeccionarAnuncio;
		this.guiGenerarAnuncio = guiGenerarAnuncio;

		
		this.guiGenerarAnuncio.btnGenerar.addActionListener(this);
		this.guiGenerarAnuncio.btnEnviar.addActionListener(this);
		this.guiGenerarAnuncio.btnCerrar.addActionListener(this);
		this.guiGenerarAnuncio.cmbCategorias.addItemListener(this);
		this.guiGenerarAnuncio.cmbSubcategorias.addItemListener(this);
		this.guiGenerarAnuncio.tblProductos.addMouseListener(this);
		this.guiGenerarAnuncio.tblProductosAnuncio.addMouseListener(this);
		this.guiGenerarAnuncio.tblDestinatarios.addMouseListener(this);
		this.guiGenerarAnuncio.lblModificarDestinatarios.addMouseListener(this);
		this.guiGenerarAnuncio.lblModificarPrecios.addMouseListener(this);

		try
		{
			inicializar();
			this.guiGenerarAnuncio.frmGenerarAnuncio.setVisible(true);
		}
		catch(Exception e)
		{
			if(e.toString().contains("NullPointerException"))
			{
				JOptionPane.showMessageDialog(null, 
						"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde el importador de datos.",
						"ATENCIÓN",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(e.toString().contains("GenericJDBCException") || e.toString().contains("JDBCConnectionException") )
			{
				JOptionPane.showMessageDialog(null, 
						"Error al conectarse a la Base de Datos.\nRevisar la configuración y volver a intentarlo.",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
			}			
			guiGenerarAnuncio.frmGenerarAnuncio.dispose();
			e.printStackTrace();
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	

	/**
	 * OBTIENE EL modeloConfeccionarAnuncio
	 * @return negocio.modeloConfeccionarAnuncioConfeccionarAnuncio - modeloConfeccionarAnuncio
	 */
	public ModeloConfeccionarAnuncio getModeloConfeccionarAnuncio()
	{
		return modeloConfeccionarAnuncio;
	}
	///////////////////////////////////////////////////////////////
	
	
	
	/**
	 * ACTUALIZA LA LISTA DE DESTINATARIOS DEL ANUNCIO
	 * LUEGO DE HABER SIDO MODIFICADA
	 * @param nuevoModelo
	 */
	public void actualizarClientesDestinatarios(TableModel nuevoModelo)
	{			
		String[] idClientesModif = new String[nuevoModelo.getRowCount()];
		
		modeloConfeccionarAnuncio.getArrClientesInteresados().clear();
		
		for(int j=0; j<nuevoModelo.getRowCount(); j++)
			idClientesModif[j] = nuevoModelo.getValueAt(j,0).toString();
		
		for(int i=0; i<idClientesModif.length; i++)
		{
			negocio.Cliente clienteActual = new negocio.Cliente();
			
			clienteActual = modeloConfeccionarAnuncio.buscarCliente(Integer.parseInt(idClientesModif[i]));
			
			modeloConfeccionarAnuncio.getArrClientesInteresados().add(clienteActual);
		}
		
		guiGenerarAnuncio.tblDestinatarios.completarDatos(modeloConfeccionarAnuncio.getArrClientesInteresados());
		
	}
	////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA ITEMLISTENER
	 */
	@Override
	public void itemStateChanged(ItemEvent evento)
	{
		//SELECCION DE ITEM DE COMBO CATEGORIAS
		if(evento.getSource().equals(guiGenerarAnuncio.cmbCategorias))
		{
			try 
			{
				click_combo_categorias(evento);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		//SELECCION DE ITEM DE COMBO SUBCATEGORIAS
		if(evento.getSource().equals(guiGenerarAnuncio.cmbSubcategorias))
		{
			if(evento.getStateChange() == ItemEvent.SELECTED)
			{
				try
				{
					click_combo_subcategorias(evento);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void windowActivated(WindowEvent evento)
	{
	}
	//////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA WINDOWLISTERNER
	 */
	@Override
	public void windowClosed(WindowEvent evento)
	{
		cerrar_salir();
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
	public void windowIconified(WindowEvent evento)
	{
	}

	@Override
	public void windowOpened(WindowEvent evento)
	{		
	}
	///////////////////////////////////////
	

	
	/**
	 * REESCRITURA ACTIONPERFORMED
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		//BOTON GENERAR
		if(evento.getSource().equals(guiGenerarAnuncio.btnGenerar))
		{
			action_generar();
		}
		//BOTON ENVIAR
		if(evento.getSource().equals(guiGenerarAnuncio.btnEnviar))
		{
        	action_enviar();
		}
		//BOTON CERRAR
		if(evento.getSource().equals(guiGenerarAnuncio.btnCerrar))
		{
        	cerrar_salir();
		}			
	}
	////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA MOUSE LISTENER
	 */
	@Override
	public void mouseClicked(MouseEvent evento)
	{
		//CLICK ANIADIR PRODUCTO
		if(guiGenerarAnuncio.tblProductos.columnAtPoint(evento.getPoint())==5)
		{
			click_aniadir_producto();
		}
		//CLICK ELIMINAR PRODUCTO
		if(guiGenerarAnuncio.tblProductosAnuncio.columnAtPoint(evento.getPoint())==5)
		{
			click_eliminar_producto();
		}
		//CLICK MODIFICAR DESTINATARIOS
		if(evento.getSource().equals(guiGenerarAnuncio.lblModificarDestinatarios))
		{
			if(guiGenerarAnuncio.lblModificarDestinatarios.isEnabled())
			{
				click_label_modificar_destinatarios();
			}
		}
		//CLICK MODIFICAR PRECIOS
		if(evento.getSource().equals(guiGenerarAnuncio.lblModificarPrecios))
		{
			if(guiGenerarAnuncio.lblModificarPrecios.isEnabled())
			{
				try
				{
					click_label_modificar_precios();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}

		}
	}
	////////////////////////////////////////////

	@Override
	public void mouseEntered(MouseEvent evento)
	{		
	}

	@Override
	public void mouseExited(MouseEvent e)
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
	//////////////////////////////////////////
	
	
	
	//METODOS
	/**
	 * 
	 * @throws Exception
	 */
//	public void actualizar() throws Exception
//	{
//		this.inicializar();
//		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//	}	
	//////////////////////////////////////////

	
		
	/**
	 * INCIALIZACION DE COMPONENTES
	 * @throws Exception 
	 */
	protected void inicializar() throws Exception
	{		
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.WAIT_CURSOR));

		modeloConfeccionarAnuncio.inicializarCatalogos();
		
		guiGenerarAnuncio.cmbCategorias.completarDatos(
				modeloConfeccionarAnuncio.getCatalogoCategorias().getCategorias());

		categoria = (negocio.Categoria) guiGenerarAnuncio.cmbCategorias.getSelectedItem();
		guiGenerarAnuncio.cmbSubcategorias.completarDatos(
				modeloConfeccionarAnuncio.seleccionarCategoria(categoria.getIdCategoria()));
		
		subcategoriaActual = (negocio.SubCategoria) guiGenerarAnuncio.cmbSubcategorias.getSelectedItem();

		guiGenerarAnuncio.tblProductos.completarTabla(modeloConfeccionarAnuncio.seleccionarSubcategoria(
				subcategoriaActual.getIdcategoria(), 
				subcategoriaActual.getIdSubcategoria()));
		guiGenerarAnuncio.tblProductos.definirTablaProductos();
				
		guiGenerarAnuncio.tblProductosAnuncio.completarTabla(new ArrayList<negocio.Producto>());

		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	//////////////////////////////////////////////

	
	
	/**
	 * ACCION CLICK COMBO CATEGORIAS
	 * @param evento
	 * @throws Exception
	 */
	protected void click_combo_categorias(ItemEvent evento) throws Exception
	{
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{
			categoria = new negocio.Categoria();
			
			categoria = (negocio.Categoria) guiGenerarAnuncio.cmbCategorias.getSelectedItem();
			
			categoria.obtenerSubCategorias();
			
			guiGenerarAnuncio.cmbSubcategorias.completarDatos(
					modeloConfeccionarAnuncio.seleccionarCategoria(categoria.getIdCategoria()));	
			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) guiGenerarAnuncio.cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
						
			guiGenerarAnuncio.tblProductos.completarTabla(modeloConfeccionarAnuncio.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	/////////////////////////////////////////////////////////////////////////

	

	/**
	 * EVENTO DE SELECCION EN COMBO SUBCATEGORIAS
	 * @param evento
	 * @throws Exception
	 */
	protected void click_combo_subcategorias(ItemEvent evento) throws Exception
	{				
		negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
		subcategoriaSeleccionada = (negocio.SubCategoria) guiGenerarAnuncio.cmbSubcategorias.getSelectedItem();
		subcategoriaSeleccionada.obtenerProductos();
		
		guiGenerarAnuncio.tblProductos.completarTabla(modeloConfeccionarAnuncio.seleccionarSubcategoria(
				subcategoriaSeleccionada.getIdcategoria(),
				subcategoriaSeleccionada.getIdSubcategoria()));
	}
	////////////////////////////////////////////////////////////////////////////
	
	

	/**
	 * ACCION BOTON GENERAR CONTENIDO HTML MAIL
	 * @param dialogPadre
	 */
	protected void action_generar()
	{
    	if(guiGenerarAnuncio.txtAsunto.getText().equals(""))
    		JOptionPane.showMessageDialog(
    				guiGenerarAnuncio.frmGenerarAnuncio, 
    				"Debe completar el Asunto.", 
    				"ATENCIÓN",
    				JOptionPane.WARNING_MESSAGE);
    	else 
    		if(guiGenerarAnuncio.tblProductosAnuncio.getModel().getRowCount() == 0)
    			JOptionPane.showMessageDialog(
    					guiGenerarAnuncio.frmGenerarAnuncio, 
    					"Debe Agregar al menos un producto.", 
    					"ATENCIÓN",
    					JOptionPane.WARNING_MESSAGE);
        	else
	        {
        		eliminar_temporal();
        		
        		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.WAIT_CURSOR));
	        	
	        	Collection<HashMap<String, String>> productos = new ArrayList<HashMap<String,String>>();
	        		        	
	        	for(int i=0; i<guiGenerarAnuncio.tblProductosAnuncio.getModel().getRowCount();++i)
	        	{
	        		HashMap<String, String> producto = new HashMap<String, String>();
	        		
	        		producto.put("ID", guiGenerarAnuncio.tblProductosAnuncio.getModel().getValueAt(i, 0).toString());
	        		producto.put("DESCRIPCION", guiGenerarAnuncio.tblProductosAnuncio.getModel().getValueAt(i, 1).toString());
	        		producto.put("VIGENTE", guiGenerarAnuncio.tblProductosAnuncio.getModel().getValueAt(i, 2).toString());
	        		producto.put("PROMOCIONAL", guiGenerarAnuncio.tblProductosAnuncio.getModel().getValueAt(i, 3).toString());
	        		
	        		productos.add(producto);
	        	}
	        		        		        	
				new EditorHTML(guiGenerarAnuncio.frmGenerarAnuncio, productos, guiGenerarAnuncio.txtAsunto.getText());
	        	
	        	guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        }
	}
	///////////////////////////////////////////////////
	
	
	
	/**
	 * ACCION ENVIAR EMAIL
	 * @param dialogPadre
	 */
	protected void action_enviar()
	{
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
    	boolean enviado = false;
		
    	
		PrevisualizadorHTML guiPrevisualizadorHTML = new PrevisualizadorHTML(guiGenerarAnuncio.frmGenerarAnuncio);

    	String mailsClientes[] = new String[guiGenerarAnuncio.tblDestinatarios.getModel().getRowCount()];
    	
    	for(int i=0; i<guiGenerarAnuncio.tblDestinatarios.getModel().getRowCount();++i)
    		mailsClientes[i] = guiGenerarAnuncio.tblDestinatarios.getModel().getValueAt(i, 3).toString();
    	
		ControladorPrevisualizarHTML controladorPrevisualizarHTML = 
    			new ControladorPrevisualizarHTML(guiPrevisualizadorHTML, guiGenerarAnuncio.frmGenerarAnuncio, modeloConfeccionarAnuncio, "temporal.html", mailsClientes);

		
		enviado = controladorPrevisualizarHTML.seEnvio();

		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    	
		modeloConfeccionarAnuncio.finalizarCargaProducto();
		
    	if(enviado)
    	{    		
            limpiar_formulario();
            eliminar_temporal();
            
    		modeloConfeccionarAnuncio.guardarAnuncio();   
    		limpiar_objetos_temporales();
    	}
	}
	/////////////////////////////////////////////////////////
	

	
	/**
	 * ACCION ANIADIR PRODUCTO
	 */
	@SuppressWarnings("rawtypes")
	protected void click_aniadir_producto()
	{
		DefaultTableModel modeloTblProductosAnuncio = (DefaultTableModel) guiGenerarAnuncio.tblProductosAnuncio.getModel();
		DefaultTableModel modeloTblProductos = (DefaultTableModel) guiGenerarAnuncio.tblProductos.getModel();

		
		int filaSeleccionada = guiGenerarAnuncio.tblProductos.getSelectedRow();
		Vector fila = new Vector(1);
		fila = (Vector) modeloTblProductos.getDataVector().elementAt(filaSeleccionada);
		
		boolean aux = false;

		for(int i=0; i<guiGenerarAnuncio.tblProductosAnuncio.getRowCount(); ++i)
		{
			if(guiGenerarAnuncio.tblProductosAnuncio.getValueAt(i, 0) == guiGenerarAnuncio.tblProductos.getValueAt(filaSeleccionada,0))
			{ 
				JOptionPane.showMessageDialog(
						guiGenerarAnuncio.frmGenerarAnuncio, 
						"No puede agregar dos veces el mismo producto al anuncio.", 
						"ATENCIÓN",
						JOptionPane.WARNING_MESSAGE);
				aux = true;
			}
		}
		
		if(!aux && filaSeleccionada >= 0)
			{
				modeloTblProductosAnuncio.addRow(fila);
				guiGenerarAnuncio.tblProductosAnuncio.definirTablaProductosAnuncio();
												
				int idProducto = Integer.parseInt(fila.elementAt(0).toString());
								
				Thread hiloTrabajoAniadir = new Thread(new TabajoAniadirProducto(idProducto));
				hiloTrabajoAniadir.start();		    	
		    	
				new Thread(new interfaces.software.HiloBarraProgreso(
						hiloTrabajoAniadir, guiGenerarAnuncio.frmGenerarAnuncio, guiGenerarAnuncio.prgProgresoAniadir, 500, false)).start();   
			}	
	}
	////////////////////////////////////////
	
	
	
	/**
	 * ACCION ELIMINAR PRODUCTO
	 */
	protected void click_eliminar_producto()
	{
		DefaultTableModel tableModel = (DefaultTableModel) guiGenerarAnuncio.tblProductosAnuncio.getModel();
		int filaSeleccionada = guiGenerarAnuncio.tblProductosAnuncio.getSelectedRow();

	    if (filaSeleccionada >= 0)
	    {
	    	modeloConfeccionarAnuncio.eliminarProducto(
	    			Integer.parseInt(guiGenerarAnuncio.tblProductosAnuncio.getModel().getValueAt(filaSeleccionada,0).toString()));
	    	tableModel.removeRow(filaSeleccionada);	
	    }	    
	}
	/////////////////////////////////////////
	
	
	
	/**
	 * ACCION MODIFICAR DESTINATARIOS
	 * @param dialogPadre
	 */
	protected void click_label_modificar_destinatarios()
	{
		modeloConfeccionarAnuncio.finalizarCargaProducto();
		
		ModificarDestinatarios guiModificarDestinatarios = new ModificarDestinatarios(guiGenerarAnuncio.frmGenerarAnuncio);
		
		new ControladorModificarDestinatarios(guiModificarDestinatarios, this);
		
		guiModificarDestinatarios.frmModificarDestinatarios.setVisible(true);
		
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * ACCION MODIFICAR PRECIOS
	 * @param dialogPadre
	 * @throws Exception
	 */
	protected void click_label_modificar_precios() throws Exception
	{
		Collection<Integer> productosAgregados = new ArrayList<Integer>();
		
		for(int i = 0; i < guiGenerarAnuncio.tblProductosAnuncio.getRowCount(); i++)
		{
			productosAgregados.add((Integer) guiGenerarAnuncio.tblProductosAnuncio.getModel().getValueAt(i, 0));
		}
				
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		ModificarPrecios guiModificarPrecios = new ModificarPrecios(guiGenerarAnuncio.frmGenerarAnuncio);

		ModeloModificarPrecios modeloModificarPrecios = new ModeloModificarPrecios();
		
		new ControladorModificarPrecios(guiModificarPrecios, modeloModificarPrecios, modeloConfeccionarAnuncio, productosAgregados);
		
		guiModificarPrecios.frmModificarPrecios.setVisible(true);

		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
		
		guiGenerarAnuncio.tblProductos.limpiar_tabla();
		negocio.SubCategoria subAux = (negocio.SubCategoria) guiGenerarAnuncio.cmbSubcategorias.getSelectedItem();
		guiGenerarAnuncio.tblProductos.completarTabla(modeloConfeccionarAnuncio.seleccionarSubcategoria(
					subAux.getIdcategoria(), 
					subAux.getIdSubcategoria()));
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
		

	/**
	 * ACCION AL CERRAR MODULO
	 */
	protected void cerrar_salir()
	{
		limpiar_formulario();
		limpiar_objetos_temporales();
		guiGenerarAnuncio.frmGenerarAnuncio.dispose();
	}
	//////////////////////////////
	
	

	/**
	 * LIMPIA CAMPOS DEL FORMULARIO
	 */
	protected void limpiar_formulario()
	{
		guiGenerarAnuncio.cmbCategorias.setSelectedIndex(0);
		guiGenerarAnuncio.cmbSubcategorias.setSelectedIndex(0);
		guiGenerarAnuncio.txtAsunto.setText("");
		guiGenerarAnuncio.lblModificarDestinatarios.setEnabled(false);
		
		guiGenerarAnuncio.tblProductosAnuncio.limpiar_tabla();
		guiGenerarAnuncio.tblDestinatarios.limpiar_tabla();
		guiGenerarAnuncio.prgProgresoAniadir.setValue(0);
	}
	////////////////////////////////////
	
	

	/**
	 * LIMPIA OBJETOS TEMPORALES
	 */
	private void limpiar_objetos_temporales()
	{
		modeloConfeccionarAnuncio.getArrClientesInteresados().clear();
		modeloConfeccionarAnuncio.getArrProductosPublicacion().clear();
		modeloConfeccionarAnuncio.setAnuncioActual(new negocio.Anuncio()); 
	}
	//////////////////////////////////////////
	
	
	/**
	 * ELIMINA ARCHIVO TEMPORAL
	 */
	private void eliminar_temporal()
	{
		try
		{
			File archivoHTML = new File(utilidades.Configuraciones.DIR_MAILS+"temporal.html");
			
			if(archivoHTML.exists())
				archivoHTML.delete();
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(
					guiGenerarAnuncio.frmGenerarAnuncio, 
					"Se ha producido un error al eliminar o acceder al archivo temporal en la ubicación:\n"
					+ utilidades.Configuraciones.DIR_MAILS+"temporal.html" + "Verifique los permisos del directorio y del archivo.", 
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}	
	}
	/////////////////////////////////
	
	
	
	/**
	 * DESACTIVA CONTROLES
	 */
	private void desactivar_botones()
	{
		guiGenerarAnuncio.frmGenerarAnuncio.setEnabled(false);
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		guiGenerarAnuncio.btnCerrar.setEnabled(false);
		guiGenerarAnuncio.btnEnviar.setEnabled(false);
		guiGenerarAnuncio.btnGenerar.setEnabled(false);
		guiGenerarAnuncio.lblModificarDestinatarios.setEnabled(false);
		guiGenerarAnuncio.lblModificarPrecios.setEnabled(false);
	}
	//////////////////////////////////
	
	
	/**
	 * ACTIVA CONTROLES
	 */
	private void activar_botones()
	{
		guiGenerarAnuncio.btnCerrar.setEnabled(true);
		guiGenerarAnuncio.btnEnviar.setEnabled(true);
		guiGenerarAnuncio.btnGenerar.setEnabled(true);
		guiGenerarAnuncio.lblModificarDestinatarios.setEnabled(true);
		guiGenerarAnuncio.lblModificarPrecios.setEnabled(true);
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		guiGenerarAnuncio.frmGenerarAnuncio.setEnabled(true);
	}
	///////////////////////////////
	
	
	
	/**
	 * TRABAJO HILO ANIADIR PRODUCTO AL ANUNCIO
	 * 
	 */
	private class TabajoAniadirProducto implements Runnable
	{
		
		private int idProducto;

	    
	    public TabajoAniadirProducto(int idProducto)
	    {
	    	this.idProducto = idProducto;
	    }
	    
	    @Override
	    public void run()
	    {			
	        try
	        {		
	        	desactivar_botones();
	        	
	        	modeloConfeccionarAnuncio.seleccionarProducto(this.idProducto);		
	        	
	        	guiGenerarAnuncio.tblDestinatarios.completarDatos(modeloConfeccionarAnuncio.getArrClientesInteresados());

	        	Thread.sleep(1000);
	        }
	        catch(InterruptedException e)
	        {
	        	e.printStackTrace();
	        } 
	        catch(Exception e) 
	        {
				e.printStackTrace();
			}
	        finally
	        {
				if(guiGenerarAnuncio.tblDestinatarios.getModel().getRowCount()>0)
					guiGenerarAnuncio.lblModificarDestinatarios.setEnabled(true);
				
				activar_botones();
	        }
	    }
	} 
	///////////////////////////////////////////////////////
}
