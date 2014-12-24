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
	public ControladorConfeccionarAnuncio(ModeloConfeccionarAnuncio modeloConfeccionarAnuncio, GenerarAnuncio guiGenerarAnuncio) throws Exception
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

		inicializar();
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
	 * 
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
	
	
	@Override
	public void itemStateChanged(ItemEvent evento)
	{
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
		
		if(evento.getSource().equals(guiGenerarAnuncio.cmbSubcategorias))
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






	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void windowClosed(WindowEvent e)
	{
		cerrar_salir();
	}






	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(guiGenerarAnuncio.btnGenerar))
		{
			action_generar();
		}

		if(evento.getSource().equals(guiGenerarAnuncio.btnEnviar))
		{
        	action_enviar();
		}
		
		if(evento.getSource().equals(guiGenerarAnuncio.btnCerrar))
		{
        	cerrar_salir();
		}			
	}
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent evento)
	{
		//
		if(guiGenerarAnuncio.tblProductos.columnAtPoint(evento.getPoint())==5)
		{
			click_aniadir_producto();
		}
		//
		if(guiGenerarAnuncio.tblProductosAnuncio.columnAtPoint(evento.getPoint())==5)
		{
			click_eliminar_producto();
		}
		//
		if(evento.getSource().equals(guiGenerarAnuncio.lblModificarDestinatarios))
		{
			if(guiGenerarAnuncio.lblModificarDestinatarios.isEnabled())
			{
				click_label_modificar_destinatarios();
			}
		}
		//
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






	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	/**
	 * 
	 * @throws Exception
	 */
	public void actualizar() throws Exception
	{
		this.inicializar();
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}	
	//////////////////////////////////////////

	
	
	
	
	
	
	
	
	
	/**
	 * INCIALIZACION DE COMPONENTES
	 * @throws Exception 
	 */
	protected void inicializar() throws Exception
	{		
		guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.WAIT_CURSOR));

		modeloConfeccionarAnuncio.inicializarCatalogos();
		
		

		/***************************************************************
		 * COMBO CATEGORIAS
		 ***************************************************************/
		guiGenerarAnuncio.cmbCategorias.completarDatos(
				modeloConfeccionarAnuncio.getCatalogoCategorias().getCategorias());

		

		/***************************************************************
		 * COMBO SUBCATEGORIAS
		 ***************************************************************/
		categoria = (negocio.Categoria) guiGenerarAnuncio.cmbCategorias.getSelectedItem();
		guiGenerarAnuncio.cmbSubcategorias.completarDatos(
				modeloConfeccionarAnuncio.seleccionarCategoria(categoria.getIdCategoria()));
		
		
		subcategoriaActual = (negocio.SubCategoria) guiGenerarAnuncio.cmbSubcategorias.getSelectedItem();

		
		/***************************************************************
		* TABLA PRODUCTOS
		***************************************************************/		 
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
	 * 
	 * @param evento
	 * @throws Exception
	 */
	protected void click_combo_subcategorias(ItemEvent evento) throws Exception
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) guiGenerarAnuncio.cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
			
			guiGenerarAnuncio.tblProductos.completarTabla(modeloConfeccionarAnuncio.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	////////////////////////////////////////////////////////////////////////////
	
	

	/**
	 * 
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
	        		        		        	
				@SuppressWarnings("unused")
				EditorHTML editorHTML = new EditorHTML(guiGenerarAnuncio.frmGenerarAnuncio, productos, guiGenerarAnuncio.txtAsunto.getText());
	        	if(guiGenerarAnuncio.txtAsunto.getText().equals(""))
	        		guiGenerarAnuncio.txtAsunto.setEnabled(false);
	        	guiGenerarAnuncio.frmGenerarAnuncio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        }
	}
	///////////////////////////////////////////////////
	
	
	
	/**
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
	 */
	protected void cerrar_salir()
	{
		limpiar_formulario();
		limpiar_objetos_temporales();
		guiGenerarAnuncio.frmGenerarAnuncio.dispose();
	}
	//////////////////////////////
	
	

	/**
	 * 
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
	 * 
	 */
	private void limpiar_objetos_temporales()
	{
		modeloConfeccionarAnuncio.getArrClientesInteresados().clear();
		modeloConfeccionarAnuncio.getArrProductosPublicacion().clear();
		modeloConfeccionarAnuncio.setAnuncioActual(new negocio.Anuncio()); 
	}
	//////////////////////////////////////////
	
	
	/**
	 * 
	 */
	private void eliminar_temporal()
	{
		try
			{
				File archivoHTML = new File(utilidades.Configuraciones.DIR_MAILS+"temporal.html");
				if(archivoHTML.exists())
					archivoHTML.delete();
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}	
	}
	/////////////////////////////////
	
	
	
	/**
	 * 
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
	 * 
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
	 * 
	 *  
	 *
	 */
	public class TabajoAniadirProducto implements Runnable
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

	        	Thread.sleep( 1000 );
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
