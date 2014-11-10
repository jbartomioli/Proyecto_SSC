package interfaces;
/**
 * PANTALLA DE MODIFICACION DE PRECIOS
 */
import interfaces.componentes.BotonesIconos;

import java.awt.SystemColor;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Collection;


public class ModificarPrecios extends interfaces.componentes.JDialogBaseFormularios
{
	
	/****************
	 * SERIALIZABLE
	 ****************/
	private static final long serialVersionUID = -7981551557460343338L;
	
	
	/**************
	 * COMPONENTES
	 **************/
	private JTextField txtBuscarProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private negocio.Categoria categoria;
	private interfaces.componentes.TablaProductos tblProductos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private negocio.ControladorModificarPrecios controladorPrecios;
	private negocio.Producto productoSeleccionado;
	private negocio.SubCategoria subcategoriaActual;
	private interfaces.componentes.BotonesIconos btnBuscarProducto;


	/****************************
	 * CONSTRUCTOR JFRAME
	 * @wbp.parser.constructor
	 ****************************/
	public ModificarPrecios(JFrame jframePadre) throws Exception 
	{
		super(jframePadre,"Modificar Precios","PRECIO_32.png",true);
		controladorPrecios = new negocio.ControladorModificarPrecios();

		controladorPrecios.inicializarCatalogos();
		inicializar(null, null);
		
	}
	
	
	/****************************
	 * CONSTRUCTOR JDIALOG
	 ****************************/
	public ModificarPrecios(JDialog jdialogPadre, negocio.ControladorConfeccionarAnuncio controladorAnuncios, Collection<Integer> idProductos) throws Exception
	{
		super(jdialogPadre, "Modificar Precios","PRECIO_32.png",true);
		
		controladorPrecios = new negocio.ControladorModificarPrecios();

		controladorPrecios.setCatalogoCategorias(controladorAnuncios.getCatalogoCategorias());
		controladorPrecios.setCatalogoProductos(controladorAnuncios.getCatalogoProductos());
		controladorPrecios.setCatalogoSubcategorias(controladorAnuncios.getCatalogoSubCategorias());
		
		inicializar(controladorAnuncios, idProductos);
	}
	

	/**********************
	 * INICIALIZACION GUI
	 * @throws Exception 
	 **********************/
	private void inicializar(final negocio.ControladorConfeccionarAnuncio controladorAnuncios, final Collection<Integer> idProductos) throws Exception
	{
		/******************
		 * FORMULARIO BASE
		 ******************/
		setDimensionFormulario(650, 460);
		
		/*********
		 * TITULO
		 *********/
		JLabel lblPrecios = new JLabel("Modificar Precios");
		lblPrecios.setLabelFor(this);
		lblPrecios.setForeground(Color.DARK_GRAY);
		lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrecios.setBounds(10, 11, 341, 20);
		getContentPane().add(lblPrecios);
		
				
		/*************
		 * CATEGORIAS
		 *************/
		JLabel lblCategoria = new JLabel("Categor�a:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(10, 43, 77, 23);
		getContentPane().add(lblCategoria);
				
		cmbCategorias = new interfaces.componentes.ComboCategorias();
		
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(87, 43, 200, 23);
		getContentPane().add(cmbCategorias);
		
		
		/****************
		 * SUBCATEGORIAS
		 ****************/
		JLabel lblSubcategoria = new JLabel("Subcategoria:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(334, 43, 97, 23);
		getContentPane().add(lblSubcategoria);
				
		cmbSubcategorias = new interfaces.componentes.ComboSubcategorias();
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		cmbSubcategorias.setBounds(434, 43, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
				
		/***********
		 * BUSCADOR
		 ***********/
		txtBuscarProductos = new JTextField();
		txtBuscarProductos.setForeground(Color.GRAY);
		txtBuscarProductos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarProductos.setText("Ingrese Descripci\u00F3n...");
		txtBuscarProductos.setBounds(20, 88, 411, 20);
		txtBuscarProductos.setColumns(10);
		getContentPane().add(txtBuscarProductos);
		
		btnBuscarProducto = new BotonesIconos("",utilidades.Configuraciones.IMG_ICONOS+"BUSCAR_16.png");
		btnBuscarProducto.setBounds(444, 89, 30, 19);
		getContentPane().add(btnBuscarProducto);
		
		
		/******************
		 * TABLA PRODUCTOS
		 ******************/
		Box boxPrecios = Box.createHorizontalBox();
		boxPrecios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Precios Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxPrecios.setBounds(10, 120, 622, 222);
		getContentPane().add(boxPrecios);
		
		JScrollPane scrollPrecios = new JScrollPane();
		scrollPrecios.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPrecios.setAlignmentX(Component.LEFT_ALIGNMENT);
		boxPrecios.add(scrollPrecios);
		
		scrollPrecios.setViewportView(tblProductos);
				
		tblProductos = new interfaces.componentes.TablaProductos();
		scrollPrecios.setViewportView(tblProductos);
		
		tblProductos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mePrecio)
			{
				if(tblProductos.columnAtPoint(mePrecio.getPoint())==5)
					try 
					{
						click_modificar_precio(controladorAnuncios, idProductos);
					} 
					catch(Exception e)
					{
						e.printStackTrace();
					}
			}
		});
		
		
			
		/****************
		 * BOTON ACEPTAR			
		 ****************/
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(540, 357);
		getContentPane().add(btnAceptar);
		
		
		/********************************
		 * INICIALIZACION DE COMPONENTES
		 ********************************/
		try
		{
			inicializar_componentes();
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, 
					"No existen datos almacenados en la Base de Datos. Debe importar el contenido desde ....",
					"ATENCI�N",
					JOptionPane.INFORMATION_MESSAGE);
			dispose();
			npe.printStackTrace();
		}

	}
	
		
	/**********************************
	 * INICIALIZACION COMPONENTES GUI
	 * @throws Exception 
	 **********************************/
	protected void inicializar_componentes() throws Exception
	{
		cmbCategorias.completarDatos(controladorPrecios.getCatalogoCategorias().getCategorias());
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				try {
					click_combo_categorias(evento);
				} catch (Exception e) {
					e.printStackTrace();
				}
				}});
		
		
		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		
		cmbSubcategorias.completarDatos(controladorPrecios.seleccionarCategoria(categoria.getIdCategoria()));
		cmbSubcategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				try {
					click_combo_subcategorias(evento);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		txtBuscarProductos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evento) {
				//Busca productos si el usuario presiona enter
				if(evento.getKeyCode() == KeyEvent.VK_ENTER)
				{
					try 
					{
						controladorPrecios.getCatalogoProductos().obtenerProductos();
						tblProductos.limpiar_tabla();
						tblProductos.completarTabla(controladorPrecios.getCatalogoProductos().buscarProducto(txtBuscarProductos.getText()));			
					} 
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		txtBuscarProductos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				txtBuscarProductos.setText("");
				txtBuscarProductos.setForeground(SystemColor.black);
			}
		});
		
		
		subcategoriaActual = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
		
		
		try
		{
			tblProductos.completarTabla(
					controladorPrecios.seleccionarSubcategoria(
							subcategoriaActual.getIdcategoria(), 
							subcategoriaActual.getIdSubcategoria()));
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		
		tblProductos.definirTablaProductos();
		tblProductos.ocultar_columna(4);
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	click_boton_aceptar();}});
		
		
		btnBuscarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) 
			{
				//Evento para buscar destinatarios que coincidan con el string ingresado
				setCursor(new Cursor(Cursor.WAIT_CURSOR));
				click_boton_buscar();
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		

	}

	/**********
	 * EVENTOS
	 **********/
	
	protected void click_combo_categorias(ItemEvent evento) throws Exception
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{
			categoria = new negocio.Categoria();
			
			categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
			
			//categoria.obtenerSubCategorias();
			
			cmbSubcategorias.completarDatos(
					controladorPrecios.seleccionarCategoria(categoria.getIdCategoria()));	
			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			//subcategoriaSeleccionada.obtenerProductos();
						
			tblProductos.limpiar_tabla();
			tblProductos.completarTabla(controladorPrecios.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	
	
	protected void click_combo_subcategorias(ItemEvent evento) throws Exception
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
			
			tblProductos.limpiar_tabla();
			tblProductos.completarTabla(controladorPrecios.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	
	public void click_boton_aceptar()
	{		
		super.cerrar_salir();
	}
	
	public void click_boton_buscar()
	{
		//Evento para llenar la tabla de productos buscados desde la lupa
		try 
		{
			controladorPrecios.getCatalogoProductos().obtenerProductos();
			tblProductos.limpiar_tabla();

			tblProductos.completarTabla(controladorPrecios.getCatalogoProductos().buscarProducto(txtBuscarProductos.getText()));
			tblProductos.definirTablaProductos();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
		
	//-----------------------------------------------------------------
	protected void limpiar_formulario()
	{
		cmbCategorias.setSelectedIndex(0);
		txtBuscarProductos.setText("");

		tblProductos.limpiar_tabla();
	}
	
	
	//-------------------------------------------------------------
		protected void cerrar_salir()
		{
			super.cerrar_salir();
			limpiar_formulario();
		}
		
		
		
		protected void click_modificar_precio(negocio.ControladorConfeccionarAnuncio controladorAnuncios, Collection<Integer> idProductos) throws Exception
		{
			DefaultTableModel tableModel = (DefaultTableModel) tblProductos.getModel();
			int idProductoInt = 0;
			int filaSeleccionada = -1;
			
			boolean aux = false;
			
			filaSeleccionada = tblProductos.getSelectedRow();
			
			if (filaSeleccionada >= 0)
		    {
				if(idProductos != null && !idProductos.isEmpty() && idProductos.contains(tblProductos.getModel().getValueAt(filaSeleccionada, 0)))
				{
					aux = true;
				}
			
				if(aux)
				{
					JOptionPane.showMessageDialog(null, 
							"Antes de modificar el precio del producto, debe eliminarlo de la tabla Productos del Anuncio.", 
							"ATENCI�N",
							JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					interfaces.componentes.JPanelPrecios panelPrecio = new interfaces.componentes.JPanelPrecios();

			    	idProductoInt = Integer.parseInt(tableModel.getValueAt(filaSeleccionada, 0).toString());	
			    	productoSeleccionado = new negocio.Producto();
			    	
			    	productoSeleccionado = controladorPrecios.getCatalogoProductos().buscarProducto(idProductoInt);
			    	
			    	panelPrecio.setPrecioVigente(Float.parseFloat(tableModel.getValueAt(filaSeleccionada, 2).toString()));
			    	panelPrecio.setPrecioPromocional(Float.parseFloat(tableModel.getValueAt(filaSeleccionada, 3).toString()));

			        int rta = 0;
			        rta = JOptionPane.showConfirmDialog(this, panelPrecio, "Ingrese el/los nuevo/s precio/s", JOptionPane.OK_CANCEL_OPTION);
			        
			        if (rta == JOptionPane.OK_OPTION) 
			        {
			            //GUARDA NUEVOS PRECIOS		    	
			        	controladorPrecios.getCatalogoProductos().actualizarPreciosProducto(
			        			productoSeleccionado, 
			        			panelPrecio.getPrecioVigente(),
			        			panelPrecio.getPrecioPromocional());
			        	
			        	productoSeleccionado.setPrecioPromocional(panelPrecio.getPrecioPromocional());
			        	productoSeleccionado.setPrecio(panelPrecio.getPrecioVigente());
			        	
			        	controladorPrecios.getCatalogoSubcategorias().actualizarProducto(productoSeleccionado);
			        	
			        	negocio.SubCategoria subcategoriaActual = new negocio.SubCategoria();
			        	subcategoriaActual = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			       		        	
						tblProductos.limpiar_tabla();

			        	tblProductos.completarTabla(
			        		controladorPrecios.getCatalogoProductos().obtenerProductoSubCategoria(subcategoriaActual.getDescripcion()));
			        
			        }
			    }				
			}
		}
}