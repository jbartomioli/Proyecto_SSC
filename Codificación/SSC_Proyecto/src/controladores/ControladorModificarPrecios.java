package controladores;

import interfaces.ModificarPrecios;

import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collection;




import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.exception.JDBCConnectionException;

import negocio.Categoria;
import negocio.ControladorConfeccionarAnuncio;
import negocio.ModeloModificarPrecios;
import negocio.Producto;
import negocio.SubCategoria;

/**
 * CONTROLADOR MODIFICACIONES DE PRECIOS DE PRODUCTOS 
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class ControladorModificarPrecios implements ActionListener, MouseListener, KeyListener, ItemListener
{
	//ATRIBUTOS
	private ModificarPrecios guiModificarPrecios;
	private ModeloModificarPrecios modeloModificarPrecios;
	
	//VARIABLES
	private Producto productoSeleccionado;
	private Categoria categoria;
	private SubCategoria subcategoriaActual;
	private Collection<Integer> idProductos;
	
	
	/**
	 * CONSTRUCTOR JFRAME
	 * @param guiImportarDatos
	 */	
	public ControladorModificarPrecios(ModificarPrecios guiModificarPrecios, ModeloModificarPrecios modeloModificarPrecios)
	{
		this.modeloModificarPrecios = modeloModificarPrecios;
		
		this.guiModificarPrecios = guiModificarPrecios;
		this.guiModificarPrecios.txtBuscarProductos.addKeyListener(this);
		this.guiModificarPrecios.txtBuscarProductos.addMouseListener(this);
		this.guiModificarPrecios.tblProductos.addMouseListener(this);
		this.guiModificarPrecios.btnAceptar.addActionListener(this);
		this.guiModificarPrecios.btnBuscarProducto.addActionListener(this);
		this.guiModificarPrecios.cmbCategorias.addItemListener(this);
		this.guiModificarPrecios.cmbSubcategorias.addItemListener(this);
		
		this.idProductos = null;
		
		try
		{
			this.modeloModificarPrecios.inicializarCatalogos();
			inicializar_componentes();
			this.guiModificarPrecios.frmModificarPrecios.setVisible(true);
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, 
					"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde el importador de datos.",
					"ATENCIÓN",
					JOptionPane.INFORMATION_MESSAGE);
			guiModificarPrecios.frmModificarPrecios.dispose();
			npe.printStackTrace();
		} 
		catch (JDBCConnectionException  jdbce)
		{
			JOptionPane.showMessageDialog(null, 
					"Error al conectarse a la Base de Datos.\nRevisar la configuración y volver a intentarlo.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			guiModificarPrecios.frmModificarPrecios.dispose();
			jdbce.printStackTrace();
		}
		catch(Exception e)
		{
			guiModificarPrecios.frmModificarPrecios.dispose();
			e.printStackTrace();
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
		
	/**
	 * CONSTRUCTOR JDIALOG
	 * @param guiModificarPrecios
	 * @param modeloModificarPrecios
	 * @param controladorAnuncios
	 * @param idProductos
	 */
	public ControladorModificarPrecios(
			ModificarPrecios guiModificarPrecios, 
			ModeloModificarPrecios modeloModificarPrecios, 
			ControladorConfeccionarAnuncio controladorAnuncios, 
			Collection<Integer> idProductos)
	{	
		this.modeloModificarPrecios = modeloModificarPrecios;
		
		this.guiModificarPrecios = guiModificarPrecios;
		this.guiModificarPrecios.txtBuscarProductos.addKeyListener(this);
		this.guiModificarPrecios.txtBuscarProductos.addMouseListener(this);
		this.guiModificarPrecios.tblProductos.addMouseListener(this);
		this.guiModificarPrecios.btnAceptar.addActionListener(this);
		this.guiModificarPrecios.btnBuscarProducto.addActionListener(this);
		this.guiModificarPrecios.cmbCategorias.addItemListener(this);
		this.guiModificarPrecios.cmbSubcategorias.addItemListener(this);
					
		this.modeloModificarPrecios.setCatalogoCategorias(controladorAnuncios.getCatalogoCategorias());
		this.modeloModificarPrecios.setCatalogoProductos(controladorAnuncios.getCatalogoProductos());
		this.modeloModificarPrecios.setCatalogoSubcategorias(controladorAnuncios.getCatalogoSubCategorias());
		
		this.idProductos = idProductos;
		
		try
		{
			inicializar_componentes();
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, 
					"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde ....",
					"ATENCIÓN",
					JOptionPane.INFORMATION_MESSAGE);
			guiModificarPrecios.frmModificarPrecios.dispose();
			npe.printStackTrace();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	////////////////////////////////////
	
	
	
	/**
	 * INICIALIZACION COMPONENTES GUI
	 * @throws Exception 
	 */
	protected void inicializar_componentes() throws Exception
	{		
		guiModificarPrecios.cmbCategorias.completarDatos(modeloModificarPrecios.getCatalogoCategorias().getCategorias());
	
		categoria = (negocio.Categoria) guiModificarPrecios.cmbCategorias.getSelectedItem();		
	
		guiModificarPrecios.cmbSubcategorias.completarDatos(modeloModificarPrecios.seleccionarCategoria(categoria.getIdCategoria()));
		
		subcategoriaActual = (negocio.SubCategoria) guiModificarPrecios.cmbSubcategorias.getSelectedItem();
		

		guiModificarPrecios.tblProductos.completarTabla(
				modeloModificarPrecios.seleccionarSubcategoria(
						subcategoriaActual.getIdcategoria(), 
						subcategoriaActual.getIdSubcategoria()));
		
		guiModificarPrecios.tblProductos.definirTablaProductos();
		guiModificarPrecios.tblProductos.ocultar_columna(4);
		
	}
	//////////////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA ACTION PERFORMED
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		//BOTON ACEPTAR
		if(evento.getSource().equals(guiModificarPrecios.btnAceptar))
			click_aceptar();
		//BOTON BUSCAR
		if(evento.getSource().equals(guiModificarPrecios.btnBuscarProducto))
			click_buscar();
	}
	////////////////////////////////////////////////



	/**
	 * REESCRITURA MOUSE CLIKED
	 */
	@Override
	public void mouseClicked(MouseEvent evento)
	{
		//BOTON MODIFICAR PRECIO EN TABLA
		if(guiModificarPrecios.tblProductos.columnAtPoint(evento.getPoint())==5)
		{
			try 
			{
				click_modificar_precio(idProductos);
			} 
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		//TXT BUSCAR PRODUCTO
		if(evento.getSource().equals(guiModificarPrecios.txtBuscarProductos))
		{
			guiModificarPrecios.txtBuscarProductos.setText("");
			guiModificarPrecios.txtBuscarProductos.setForeground(SystemColor.black);
		}
	}
	////////////////////////////////////////////

	@Override
	public void mouseEntered(MouseEvent e)
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
	////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA EVENTO KEY PRESSED 
	 */
	@Override
	public void keyPressed(KeyEvent evento)
	{
		//TXT ENTER
		if(evento.getKeyCode() == KeyEvent.VK_ENTER)
		{
			try 
			{
				guiModificarPrecios.tblProductos.limpiar_tabla();
				guiModificarPrecios.tblProductos.completarTabla(
						modeloModificarPrecios.getCatalogoProductos().buscarProducto(guiModificarPrecios.txtBuscarProductos.getText()));			
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	
	}
	////////////////////////////////////////
	
	@Override
	public void keyReleased(KeyEvent e)
	{
	}
	
	@Override
	public void keyTyped(KeyEvent e)
	{
	}
	/////////////////////////////////
	
	
	
	/**
	 * REESCRITURA EVENTO ITEM STATE CHANGED
	 */
	@Override
	public void itemStateChanged(ItemEvent evento)
	{
		//COMBO CATEGORIAS
		if(evento.getSource().equals(guiModificarPrecios.cmbCategorias))
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
		//COMBO SUBCATEGORIAS
		if(evento.getSource().equals(guiModificarPrecios.cmbSubcategorias))
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
	///////////////////////////////////////////////
		
	
	
	/**
	 * EVENTO PARA LLENAR LA TABLA DE PRDUCTOS
	 * BUSCADOS DESDE LA LUPA
	 */
	protected void click_buscar()
	{
		try 
		{
			guiModificarPrecios.frmModificarPrecios.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			guiModificarPrecios.tblProductos.limpiar_tabla();

			guiModificarPrecios.tblProductos.completarTabla(modeloModificarPrecios.getCatalogoProductos().buscarProducto(guiModificarPrecios.txtBuscarProductos.getText()));
			guiModificarPrecios.tblProductos.definirTablaProductos();
			
			guiModificarPrecios.frmModificarPrecios.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	//////////////////////////////	
	
	
	
	/**
	 * CLICK COMBO CATEGORIAS
	 * @param evento
	 * @throws Exception
	 */
	protected void click_combo_categorias(ItemEvent evento) throws Exception
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{
			categoria = new negocio.Categoria();
			
			categoria = (negocio.Categoria) guiModificarPrecios.cmbCategorias.getSelectedItem();
						
			guiModificarPrecios.cmbSubcategorias.completarDatos(
					modeloModificarPrecios.seleccionarCategoria(categoria.getIdCategoria()));	
			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) guiModificarPrecios.cmbSubcategorias.getSelectedItem();
						
			guiModificarPrecios.tblProductos.limpiar_tabla();
			guiModificarPrecios.tblProductos.completarTabla(modeloModificarPrecios.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	/////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * CLICK COMBO SUBCATEGORIAS
	 * @param evento
	 * @throws Exception
	 */
	protected void click_combo_subcategorias(ItemEvent evento) throws Exception
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) guiModificarPrecios.cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
			
			guiModificarPrecios.tblProductos.limpiar_tabla();
			guiModificarPrecios.tblProductos.completarTabla(modeloModificarPrecios.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * ACCION DE MODIFICACION DE PRECIO
	 * @param controladorAnuncios
	 * @param idProductos
	 * @throws Exception
	 */
	protected void click_modificar_precio(Collection<Integer> idProductos) throws Exception
	{
		DefaultTableModel tableModel = (DefaultTableModel) guiModificarPrecios.tblProductos.getModel();
		int idProductoInt = 0;
		int filaSeleccionada = -1;
		
		boolean aux = false;
		
		filaSeleccionada = guiModificarPrecios.tblProductos.getSelectedRow();
		
		if (filaSeleccionada >= 0)
	    {
			if(idProductos != null && !idProductos.isEmpty() && idProductos.contains(guiModificarPrecios.tblProductos.getModel().getValueAt(filaSeleccionada, 0)))
			{
				aux = true;
			}
		
			if(aux)
			{
				JOptionPane.showMessageDialog(guiModificarPrecios.frmModificarPrecios, 
						"Antes de modificar el precio del producto, debe eliminarlo de la tabla Productos del Anuncio.", 
						"ATENCIÓN",
						JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				interfaces.componentes.JPanelPrecios panelPrecio = new interfaces.componentes.JPanelPrecios();

		    	idProductoInt = Integer.parseInt(tableModel.getValueAt(filaSeleccionada, 0).toString());	
		    	productoSeleccionado = new negocio.Producto();
		    	
		    	productoSeleccionado = modeloModificarPrecios.getCatalogoProductos().buscarProducto(idProductoInt);
		    	
		    	panelPrecio.setPrecioVigente(Float.parseFloat(tableModel.getValueAt(filaSeleccionada, 2).toString()));
		    	panelPrecio.setPrecioPromocional(Float.parseFloat(tableModel.getValueAt(filaSeleccionada, 3).toString()));

		        int rta = 0;
		        rta = JOptionPane.showConfirmDialog(guiModificarPrecios.frmModificarPrecios, panelPrecio, "Ingrese el/los nuevo/s precio/s", JOptionPane.OK_CANCEL_OPTION);
		        
		        if (rta == JOptionPane.OK_OPTION) 
		        {
		            //GUARDA NUEVOS PRECIOS		    	
		        	modeloModificarPrecios.getCatalogoProductos().actualizarPreciosProducto(
		        			productoSeleccionado, 
		        			panelPrecio.getPrecioVigente(),
		        			panelPrecio.getPrecioPromocional());
		        	
		        	productoSeleccionado.setPrecioPromocional(panelPrecio.getPrecioPromocional());
		        	productoSeleccionado.setPrecio(panelPrecio.getPrecioVigente());
		        	
		        	modeloModificarPrecios.getCatalogoSubcategorias().actualizarProducto(productoSeleccionado);
		        	
		        	negocio.SubCategoria subcategoriaActual = new negocio.SubCategoria();
		        	subcategoriaActual = (negocio.SubCategoria) guiModificarPrecios.cmbSubcategorias.getSelectedItem();
		       		        	
					guiModificarPrecios.tblProductos.limpiar_tabla();

		        	guiModificarPrecios.tblProductos.completarTabla(
		        			modeloModificarPrecios.getCatalogoProductos().obtenerProductoSubCategoria(subcategoriaActual.getDescripcion()));
		        
		        }
		    }				
		}
	}	
	////////////////////////////////////////////////////////////////////////////////////////

	
	
	/**
	 * CLICK BOTON ACEPTAR
	 */
	protected void click_aceptar()
	{		
		guiModificarPrecios.frmModificarPrecios.dispose();
	}
	///////////////////////////////
}
