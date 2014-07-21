package interfaces;
/**
 * PANTALLA DE MODIFICACION DE PRECIOS
 */
import interfaces.componentes.BotonesIconos;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Precios extends JDialog {
	
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
	private interfaces.componentes.BotonesIconos btnCancelar;
	private negocio.ControladorConfeccionarAnuncio controladorAux;
	private negocio.Producto productoSeleccionado;
	private negocio.CatalogoProductos catProd;
	private negocio.SubCategoria subcategoriaActual;
	private JButton btnBuscarProducto;


	/****************************
	 * CONSTRUCTOR JFRAME
	 * @wbp.parser.constructor
	 ****************************/
	public Precios(Frame padre, negocio.ControladorConfeccionarAnuncio controladorAnuncios) throws Exception 
	{
		super(padre);
		setLocationRelativeTo(padre);
		controladorAux = controladorAnuncios;
		
		inicializar();
	}
	
	
	/****************************
	 * CONSTRUCTOR JDIALOG
	 ****************************/
	public Precios(JDialog padre, negocio.ControladorConfeccionarAnuncio controladorAnuncios) throws Exception
	{
		super(padre);
		setLocationRelativeTo(padre);
		controladorAux = controladorAnuncios;
		
		inicializar();
	}
	

	/**********************
	 * INICIALIZACION GUI
	 **********************/
	private void inicializar()
	{
		/******************
		 * FORMULARIO BASE
		 ******************/
		setResizable(false);
		setMinimumSize(new Dimension(650, 460));
		getContentPane().setMinimumSize(new Dimension(650, 460));
		getContentPane().setMaximumSize(new Dimension(650, 460));
		setMaximumSize(new Dimension(650, 460));
		setSize(650, 460);
		setTitle("Modificar Precios");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CLIENTES_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
		
	
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
		JLabel lblCategoria = new JLabel("Categoría:");
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
		
		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		
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
		
		btnBuscarProducto = new JButton("");
		btnBuscarProducto.setIcon(new ImageIcon(Precios.class.getResource("/resources/images/x16/find.png")));
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
		
	
		
		/****************
		 * BOTON ACEPTAR			
		 ****************/
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(440, 354);
		getContentPane().add(btnAceptar);
		
		
		
		/******************
		 * BOTON CANCELAR
		 ******************/
		btnCancelar = new BotonesIconos("Cancelar",utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCancelar.setLocation(540, 354);
		getContentPane().add(btnCancelar);
		
		
		/********************************
		 * INICIALIZACION DE COMPONENTES
		 ********************************/
		inicializar_componentes();

	}
	
	
	
	/**********************************
	 * INICIALIZACION COMPONENTES GUI
	 **********************************/
	protected void inicializar_componentes()
	{
		cmbCategorias.completarDatos(controladorAux.getCatalogoCategorias().getCategorias());
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				try {
					click_combo_categorias(evento);
				} catch (Exception e) {
					e.printStackTrace();
				}
				}});
		
		cmbSubcategorias.completarDatos(controladorAux.seleccionarCategoria(categoria.getIdCategoria()));
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
					negocio.CatalogoProductos catProd = new negocio.CatalogoProductos();
					
					try {
						catProd.obtenerProductos();
					} catch (Exception e) {
						e.printStackTrace();
					}
							
					tblProductos.completarTabla(catProd.buscarProducto(txtBuscarProductos.getText()));
					//Oculta la columna del botón
					tblProductos.getColumn(tblProductos.getColumnName(4)).setWidth(0);
					tblProductos.getColumn(tblProductos.getColumnName(4)).setMinWidth(0);
					tblProductos.getColumn(tblProductos.getColumnName(4)).setMaxWidth(0);
					//tblProductos.definirTablaProductos();
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
		
		
		try {
			tblProductos.completarTabla(
					controladorAux.seleccionarSubcategoria(
							subcategoriaActual.getIdcategoria(), 
							subcategoriaActual.getIdSubcategoria()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		tblProductos.definirTablaProductos();
		
		//Oculta la columna del botón
		tblProductos.getColumn(tblProductos.getColumnName(4)).setWidth(0);
		tblProductos.getColumn(tblProductos.getColumnName(4)).setMinWidth(0);
		tblProductos.getColumn(tblProductos.getColumnName(4)).setMaxWidth(0);
		
		tblProductos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(tblProductos.columnAtPoint(me.getPoint())==5)
					try {
						click_modificar_precio();
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		});
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	click_boton_aceptar(evento);}});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	click_boton_cancelar(evento);}});
		
		
		btnBuscarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) 
			{
				//Evento para buscar destinatarios que coincidan con el string ingresado
				click_boton_buscar(evento);
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
			
			categoria.obtenerSubCategorias();
			
			cmbSubcategorias.completarDatos(
					controladorAux.seleccionarCategoria(categoria.getIdCategoria()));	
			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
						
			tblProductos.completarTabla(controladorAux.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
			//Oculta la columna del botón
			tblProductos.getColumn(tblProductos.getColumnName(4)).setWidth(0);
			tblProductos.getColumn(tblProductos.getColumnName(4)).setMinWidth(0);
			tblProductos.getColumn(tblProductos.getColumnName(4)).setMaxWidth(0);
		}
	}
	
	
	protected void click_combo_subcategorias(ItemEvent evento) throws Exception
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
			
			tblProductos.completarTabla(controladorAux.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}

	
	public void click_boton_cancelar(ActionEvent evento)
	{
		limpiar_formulario();
		dispose();
	}
	
	public void click_boton_aceptar(ActionEvent evento)
	{
		//Evento para guardar los datos
		dispose();
	}
	
	public void click_boton_buscar(ActionEvent evento)
	{
		//Evento para llenar la tabla de productos buscados desde la lupa
		negocio.CatalogoProductos catProd = new negocio.CatalogoProductos();
		
		try {
			catProd.obtenerProductos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tblProductos.completarTabla(catProd.buscarProducto(txtBuscarProductos.getText()));
		tblProductos.definirTablaProductos();
		
		tblProductos.getColumn(tblProductos.getColumnName(4)).setWidth(0);
		tblProductos.getColumn(tblProductos.getColumnName(4)).setMinWidth(0);
		tblProductos.getColumn(tblProductos.getColumnName(4)).setMaxWidth(0);
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
			limpiar_formulario();
			dispose();
		}
		
		protected void click_modificar_precio() throws Exception
		{
			DefaultTableModel tableModel = (DefaultTableModel) tblProductos.getModel();
			int idProductoInt;
			int filaSeleccionada = tblProductos.getSelectedRow();
			
		    if (filaSeleccionada >= 0)
		    {
		    	idProductoInt = Integer.parseInt(tableModel.getValueAt(filaSeleccionada, 0).toString());	
		    	productoSeleccionado = new negocio.Producto();
	        	catProd = new negocio.CatalogoProductos();
	        	catProd.obtenerProductos();
		    	
		    	productoSeleccionado = catProd.buscarProducto(idProductoInt);
	        	//JOptionPane.showConfirmDialog(this, productoSeleccionado.getCodProducto(), "ATENCION", JOptionPane.YES_NO_OPTION);
	       
		    	JTextField precioVigente = new JTextField(5);
		    	precioVigente.setText(tableModel.getValueAt(filaSeleccionada, 2).toString());
		    	precioVigente.setForeground(Color.GRAY);
		        JTextField precioPromocional = new JTextField(5);
		        precioPromocional.setText(tableModel.getValueAt(filaSeleccionada, 3).toString());
		    	precioPromocional.setForeground(Color.GRAY);
		    	
		        JPanel panelPrecio = new JPanel();
		        panelPrecio.add(new JLabel("Precio Vigente:"));
		        panelPrecio.add(precioVigente);
		        panelPrecio.add(Box.createHorizontalStrut(15));
		        panelPrecio.add(new JLabel("Precio Promocional:"));
		        panelPrecio.add(precioPromocional);
		        
		        int rta = JOptionPane.showConfirmDialog(null, panelPrecio, 
		                "Ingrese el/los nuevo/s precio/s", JOptionPane.OK_CANCEL_OPTION);
		        
		        if (rta == JOptionPane.OK_OPTION) 
		        {
		            //Guardar Precio - TERMINAR DE HACER EL GUARDADOS			    	
		        	catProd.actualizarPrecioPromProducto(productoSeleccionado, Float.parseFloat(precioPromocional.getText()));
		         }
		    }
		    	
		}
}