package interfaces;

import interfaces.componentes.BotonesIconos;
import interfaces.componentes.ComboCategorias;
import interfaces.componentes.ComboSubcategorias;
import interfaces.componentes.JDialogBaseFormularios;
import interfaces.componentes.LabelBoton;
import interfaces.componentes.TablaClientesDestino;
import interfaces.componentes.TablaProductosAnuncio;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.Box;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;



import javax.swing.JTextField;
import javax.swing.JProgressBar;

import controladores.ControladorPrevisualizarHTML;


/**
 * PANTALLA CORRESPONDIENTE AL CU GENERAR ANUNCIO
 */
public class GenerarAnuncio extends JDialogBaseFormularios
{
	//SERIALIZABLE
	private static final long serialVersionUID = 4454249604145639442L;
	
	
	//COMPONENTES
	private negocio.Categoria categoria;
	private TablaProductosAnuncio tblProductosAnuncio;
	private TablaClientesDestino tblDestinatarios;
	private TablaProductosAnuncio tblProductos;
	private ComboCategorias cmbCategorias;
	private ComboSubcategorias cmbSubcategorias;
	private BotonesIconos btnGenerar;
	private BotonesIconos btnEnviar;
	private BotonesIconos btnCerrar;
	private LabelBoton lblModificarDestinatarios;
	private LabelBoton lblModificarPrecios;
	private JTextField txtAsunto;
	private JProgressBar prgProgresoAniadir;
	private JScrollPane scrollProductosAnuncio;
	private JScrollPane scrollProductos;
	
	//VARIABLES TEMPORALES
	private negocio.SubCategoria subcategoriaActual;
	private negocio.ControladorConfeccionarAnuncio controlador;


	/**
	 * OBTIENE EL CONTROLADOR
	 * @return negocio.ControladorConfeccionarAnuncio - Controlador
	 */
	public negocio.ControladorConfeccionarAnuncio getControlador()
	{
		return controlador;
	}
	///////////////////////////////////////////////////////////////
	
	
	
	/**
	 * 
	 * @param nuevoModelo
	 */
	public void actualizarClientesDestinatarios(TableModel nuevoModelo)
	{			
		String[] idClientesModif = new String[nuevoModelo.getRowCount()];
		
		controlador.getArrClientesInteresados().clear();
		
		for(int j=0; j<nuevoModelo.getRowCount(); j++)
			idClientesModif[j] = nuevoModelo.getValueAt(j,0).toString();
		
		for(int i=0; i<idClientesModif.length; i++)
		{
			negocio.Cliente clienteActual = new negocio.Cliente();
			
			clienteActual = controlador.getCatalogoClientes().buscarCliente(Integer.parseInt(idClientesModif[i]));
			
			controlador.getArrClientesInteresados().add(clienteActual);
		}
		
		tblDestinatarios.completarDatos(controlador.getArrClientesInteresados());
		
	}
	////////////////////////////////////////////////////////////////////
	
	
	
	/*******************************
	 * CONSTRUCTOR
	 * @param framePadre
	 * @param modal
	 * @param controladorAnuncios
	 * @throws Exception
	 *******************************/
	public GenerarAnuncio(JFrame framePadre, boolean modal) throws Exception
	{
		//FORMULARIO BASE
		super(framePadre, "Confeccionar Anuncio", "CONFECCIONAR.png", modal);
		setPantallaCompleta();
		setDimensionFormulario(1024, 668);
    	setBotonAyuda(884,32);
        		
    		//TITULO
	    	JLabel lblTitulo = new JLabel("Generar Anuncio");
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblTitulo.setBounds(10, 11, 304, 23);
			getContentPane().add(lblTitulo);
	    	

			//CATEGORIAS 
			JLabel lblCategoria = new JLabel("Categor\u00EDa:");
			lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblCategoria.setBounds(10, 38, 77, 23);
			getContentPane().add(lblCategoria);
	
			cmbCategorias = new ComboCategorias();
			lblCategoria.setLabelFor(cmbCategorias);
			cmbCategorias.setBounds(87, 38, 200, 23);
			getContentPane().add(cmbCategorias);
			
			
			//SUBCATEGORIAS
			JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
			lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblSubcategoria.setBounds(310, 38, 97, 23);
			getContentPane().add(lblSubcategoria);
	
			cmbSubcategorias = new ComboSubcategorias();
			lblSubcategoria.setLabelFor(cmbSubcategorias);
			cmbSubcategorias.setBounds(410, 38, 196, 23);
			getContentPane().add(cmbSubcategorias);
			
			
			 //ASUNTO
			JLabel lblAsunto = new JLabel("Asunto:");
			lblAsunto.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblAsunto.setBounds(10, 72, 77, 23);
			getContentPane().add(lblAsunto);
			
			txtAsunto = new JTextField();
			lblAsunto.setLabelFor(txtAsunto);
			txtAsunto.setBounds(87, 73, 519, 20);
			txtAsunto.setText("");
			getContentPane().add(txtAsunto);
			txtAsunto.setColumns(10);
			
			
			 //TABLA PRODUCTOS DEL ANUNCIO
			Box boxProductosAnuncio = Box.createHorizontalBox();
			boxProductosAnuncio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
			boxProductosAnuncio.setBounds(10, 106, 464, 244);
			getContentPane().add(boxProductosAnuncio);
			
			scrollProductosAnuncio = new JScrollPane();
			scrollProductosAnuncio.setAlignmentY(Component.TOP_ALIGNMENT);
			scrollProductosAnuncio.setAlignmentX(Component.LEFT_ALIGNMENT);
			boxProductosAnuncio.add(scrollProductosAnuncio);
		
					
			//TABLA PRODUCTOS A AGREGAR
			Box boxProductos = Box.createHorizontalBox();
			boxProductos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
			boxProductos.setBounds(484, 106, 430, 446);
			getContentPane().add(boxProductos);
			
			scrollProductos = new JScrollPane();
			scrollProductos.setAlignmentY(0.0f);
			scrollProductos.setAlignmentX(0.0f);
			boxProductos.add(scrollProductos);
			
			tblProductos = new TablaProductosAnuncio();
			scrollProductos.setViewportView(tblProductos);
		
			
			//TABLA DESTINATARIOS
			Box boxDestinatarios = Box.createHorizontalBox();
			boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
			boxDestinatarios.setBounds(10, 361, 464, 192);
			getContentPane().add(boxDestinatarios);
			
			JScrollPane scrollDestinatarios = new JScrollPane();
			boxDestinatarios.add(scrollDestinatarios);
			
			tblDestinatarios = new TablaClientesDestino();
			scrollDestinatarios.setViewportView(tblDestinatarios);
	
			
			//BOTON MODIFICAR DESTINATARIOS
			lblModificarDestinatarios = new LabelBoton("Modificar Destinatarios");
			lblModificarDestinatarios.setBounds(324, 558, 150, 19);
			lblModificarDestinatarios.setEnabled(false);
			getContentPane().add(lblModificarDestinatarios);
			
			
			//BOTON MODIFICAR PRECIOS
			lblModificarPrecios = new LabelBoton("Modificar Precios");
			lblModificarPrecios.setBounds(324, 580, 150, 19);
			getContentPane().add(lblModificarPrecios);
	
			
			//BOTON GENERAR ANUNCIO
			btnGenerar = new BotonesIconos("Modificar Contenido","GENERAR.png");
			btnGenerar.setText("Generar");
			btnGenerar.setLocation(22, 608);
			getContentPane().add(btnGenerar);
				
			
			//BOTON ENVIAR
			btnEnviar = new BotonesIconos("Enviar Mail","ENVIAR.png");
			btnEnviar.setText("Enviar");
			btnEnviar.setLocation(145, 608);		
		    getContentPane().add(btnEnviar);
		
					
			//BOTON CERRAR
			btnCerrar = new BotonesIconos("Cerrar","CERRAR.png");
			btnCerrar.setLocation(817, 609);				
			getContentPane().add(btnCerrar);		
			
			
			//BARRA DE PROGRESO
			prgProgresoAniadir = new JProgressBar();
			prgProgresoAniadir.setStringPainted(true);
			prgProgresoAniadir.setBounds(10, 558, 304, 19);
			getContentPane().add(prgProgresoAniadir);
		/////////////////////////////////////////////
	}
	/////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * 
	 * @throws Exception
	 */
	public void actualizar() throws Exception
	{
		this.inicializar();
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}	
	//////////////////////////////////////////

	
	
	/**
	 * INCIALIZACION DE COMPONENTES
	 * @throws Exception 
	 */
	protected void inicializar() throws Exception
	{
	
		final interfaces.GenerarAnuncio dialogPadre = this;
		
		setCursor(new Cursor(Cursor.WAIT_CURSOR));

		controlador = new negocio.ControladorConfeccionarAnuncio();
		controlador.inicializarCatalogos();
		
		

		/***************************************************************
		 * COMBO CATEGORIAS
		 ***************************************************************/
		cmbCategorias.completarDatos(controlador.getCatalogoCategorias().getCategorias());
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				try {
					click_combo_categorias(evento);
				} catch (Exception e) {
				}
			}});
		

		/***************************************************************
		 * COMBO SUBCATEGORIAS
		 ***************************************************************/
		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		cmbSubcategorias.completarDatos(controlador.seleccionarCategoria(categoria.getIdCategoria()));
		
		cmbSubcategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				try {
					click_combo_subcategorias(evento);
				} catch (Exception e) {
				}
			}
		});
		
		
		/***************************************************************
		 * TABLA PRODUCTOS ANUNCIO
		 ***************************************************************/
		subcategoriaActual = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
		Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
		
		tblProductosAnuncio = new TablaProductosAnuncio();
		tblProductosAnuncio.completarTabla(productos);
		tblProductosAnuncio.definirTablaProductosAnuncio();
		scrollProductosAnuncio.setViewportView(tblProductosAnuncio);
		
		//Evento para eliminar productos del anuncio
		tblProductosAnuncio.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(tblProductosAnuncio.columnAtPoint(me.getPoint())==5)
					click_eliminar_producto();
			}
		});
		
		
		/***************************************************************
		* TABLA PRODUCTOS
		***************************************************************/		 
		tblProductos.completarTabla(controlador.seleccionarSubcategoria(
				subcategoriaActual.getIdcategoria(), 
				subcategoriaActual.getIdSubcategoria()));
		tblProductos.definirTablaProductos();

		//Evento para agregar productos al anuncio
		tblProductos.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) 
					{
						if(tblProductos.columnAtPoint(me.getPoint())==5)
							click_aniadir_producto();
					}
				});
		
		
		 /**************************************************************
		 * LABEL MODIFICAR DESTINATARIOS
		 ***************************************************************/
		lblModificarDestinatarios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(lblModificarDestinatarios.isEnabled())
				{
					click_label_modificar_destinatarios(dialogPadre);
				}
			}
		});
		

		/**************************************************************
		 * LABEL MODIFICAR PRECIOS
		 ***************************************************************/
		lblModificarPrecios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(lblModificarPrecios.isEnabled())
				{
					try
					{
						click_label_modificar_precios(dialogPadre);
						repaint();
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		
		/***************************************************************
		 * BOTON GENERAR
		 ***************************************************************/
		btnGenerar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	action_generar(dialogPadre);
	        	}});
		
		
		/***************************************************************
		 * BOTON ENVIAR
		 ***************************************************************/
		btnEnviar.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent evento)
	        {
	        	action_enviar(dialogPadre);
	        }
	    });
		
		/***************************************************************
		 * BOTON CERRAR
		 ***************************************************************/
		btnCerrar.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent evento)
	        {
	        	cerrar_salir();
	        }
	    });
		
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
			
			categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
			
			categoria.obtenerSubCategorias();
			
			cmbSubcategorias.completarDatos(
					controlador.seleccionarCategoria(categoria.getIdCategoria()));	
			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
						
			tblProductos.completarTabla(controlador.seleccionarSubcategoria(
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
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
			
			tblProductos.completarTabla(controlador.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	////////////////////////////////////////////////////////////////////////////
	
	

	/**
	 * 
	 * @param dialogPadre
	 */
	protected void action_generar(JDialog dialogPadre)
	{
    	if(txtAsunto.getText().equals(""))
    		JOptionPane.showMessageDialog(dialogPadre, 
    				"Debe completar el Asunto.", 
    				"ATENCIÓN",
    				JOptionPane.WARNING_MESSAGE);
    	else 
    		if(tblProductosAnuncio.getModel().getRowCount() == 0)
    			JOptionPane.showMessageDialog(dialogPadre, 
    					"Debe Agregar al menos un producto.", 
    					"ATENCIÓN",
    					JOptionPane.WARNING_MESSAGE);
        	else
	        {
        		eliminar_temporal();
        		
	        	setCursor(new Cursor(Cursor.WAIT_CURSOR));
	        	
	        	Collection<HashMap<String, String>> productos = new ArrayList<HashMap<String,String>>();
	        		        	
	        	for(int i=0; i<tblProductosAnuncio.getModel().getRowCount();++i)
	        	{
	        		HashMap<String, String> producto = new HashMap<String, String>();
	        		
	        		producto.put("ID", tblProductosAnuncio.getModel().getValueAt(i, 0).toString());
	        		producto.put("DESCRIPCION", tblProductosAnuncio.getModel().getValueAt(i, 1).toString());
	        		producto.put("VIGENTE", tblProductosAnuncio.getModel().getValueAt(i, 2).toString());
	        		producto.put("PROMOCIONAL", tblProductosAnuncio.getModel().getValueAt(i, 3).toString());
	        		
	        		productos.add(producto);
	        	}
	        		        		        	
				@SuppressWarnings("unused")
				EditorHTML editorHTML = new EditorHTML(dialogPadre, productos, txtAsunto.getText());
	        	if(txtAsunto.getText().equals(""))
	        		txtAsunto.setEnabled(false);
	        	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        }
	}
	///////////////////////////////////////////////////
	
	
	
	/**
	 * 
	 * @param dialogPadre
	 */
	protected void action_enviar(GenerarAnuncio dialogPadre)
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
    	boolean enviado = false;
		
    	
		PrevisualizadorHTML guiPrevisualizadorHTML = new PrevisualizadorHTML(dialogPadre);

    	String mailsClientes[] = new String[tblDestinatarios.getModel().getRowCount()];
    	
    	for(int i=0; i<tblDestinatarios.getModel().getRowCount();++i)
    		mailsClientes[i] = tblDestinatarios.getModel().getValueAt(i, 3).toString();
    	
		ControladorPrevisualizarHTML controladorPrevisualizarHTML = 
    			new ControladorPrevisualizarHTML(guiPrevisualizadorHTML,dialogPadre,controlador,"temporal.html",mailsClientes);
	    guiPrevisualizadorHTML.frmPrevisualizacion.setVisible(true);

		
		enviado = controladorPrevisualizarHTML.seEnvio();

    	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    	
    	if(enviado)
    	{    		
            limpiar_formulario();
            eliminar_temporal();
            
    		controlador.finalizarCargaProducto();
    		controlador.guardarAnuncio();   
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
		DefaultTableModel modeloTblProductosAnuncio = (DefaultTableModel) tblProductosAnuncio.getModel();
		DefaultTableModel modeloTblProductos = (DefaultTableModel) tblProductos.getModel();

		
		int filaSeleccionada = tblProductos.getSelectedRow();
		Vector fila = new Vector(1);
		fila = (Vector) modeloTblProductos.getDataVector().elementAt(filaSeleccionada);
		
		boolean aux = false;

		for(int i=0; i<tblProductosAnuncio.getRowCount(); ++i)
		{
			if(tblProductosAnuncio.getValueAt(i, 0) == tblProductos.getValueAt(filaSeleccionada,0))
			{ 
				JOptionPane.showMessageDialog(null, 
						"No puede agregar dos veces el mismo producto al anuncio.", 
						"ATENCIÓN",
						JOptionPane.WARNING_MESSAGE);
				aux = true;
			}
		}
		
		if(!aux && filaSeleccionada >= 0)
			{
				modeloTblProductosAnuncio.addRow(fila);
												
				int idProducto = Integer.parseInt(fila.elementAt(0).toString());
				
				negocio.Producto producto = controlador.getCatalogoProductos().buscarProducto(idProducto);
				
				Thread hiloTrabajoAniadir = new Thread( new TabajoAniadirProducto(producto.getIdProducto()));
				hiloTrabajoAniadir.start();		    	
		    	
				new Thread(new interfaces.software.HiloBarraProgreso(hiloTrabajoAniadir, this, prgProgresoAniadir, 500, false)).start();   
			}	
	}
	////////////////////////////////////////
	
	
	
	/**
	 * 
	 */
	protected void click_eliminar_producto()
	{
		DefaultTableModel tableModel = (DefaultTableModel) tblProductosAnuncio.getModel();
		int filaSeleccionada = tblProductosAnuncio.getSelectedRow();

	    if (filaSeleccionada >= 0)
	    {
	    	controlador.eliminarProducto(Integer.parseInt(tblProductosAnuncio.getModel().getValueAt(filaSeleccionada,0).toString()));
	    	tableModel.removeRow(filaSeleccionada);	
	    }	    
	}
	/////////////////////////////////////////
	
	
	
	/**
	 * 
	 * @param dialogPadre
	 */
	protected void click_label_modificar_destinatarios(interfaces.GenerarAnuncio dialogPadre)
	{
		interfaces.ModificarDestinatarios modif = new interfaces.ModificarDestinatarios(dialogPadre);
		modif.setVisible(true);	
	}
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * 
	 * @param dialogPadre
	 * @throws Exception
	 */
	protected void click_label_modificar_precios(interfaces.GenerarAnuncio dialogPadre) throws Exception
	{
		Collection<Integer> productosAgregados = new ArrayList<Integer>();
		
		for(int i = 0; i < tblProductosAnuncio.getRowCount(); i++)
		{
			productosAgregados.add((Integer) tblProductosAnuncio.getModel().getValueAt(i, 0));
		}
		
		interfaces.ModificarPrecios precios = new interfaces.ModificarPrecios(dialogPadre, controlador, productosAgregados);
		precios.setVisible(true);
		
		tblProductos.limpiar_tabla();
		negocio.SubCategoria subAux = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			tblProductos.completarTabla(controlador.seleccionarSubcategoria(
					subAux.getIdcategoria(), 
					subAux.getIdSubcategoria()));
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
		

	/**
	 * 
	 */
	protected void cerrar_salir()
	{
		super.cerrar_salir();
		limpiar_formulario();
		limpiar_objetos_temporales();
		controlador = new negocio.ControladorConfeccionarAnuncio();
	}
	//////////////////////////////
	
	

	/**
	 * 
	 */
	protected void limpiar_formulario()
	{
		cmbCategorias.setSelectedIndex(0);
		cmbSubcategorias.setSelectedIndex(0);
		txtAsunto.setText("");
		lblModificarDestinatarios.setEnabled(false);
		
		tblProductosAnuncio.limpiar_tabla();
		tblDestinatarios.limpiar_tabla();
		prgProgresoAniadir.setValue(0);
	}
	////////////////////////////////////
	
	

	/**
	 * 
	 */
	private void limpiar_objetos_temporales()
	{
		controlador.getArrClientesInteresados().clear();
		controlador.getArrProductosPublicación().clear();
		controlador.setAnuncioActual(new negocio.Anuncio()); 
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
		setEnabled(false);
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		btnCerrar.setEnabled(false);
		btnEnviar.setEnabled(false);
		btnGenerar.setEnabled(false);
		lblModificarDestinatarios.setEnabled(false);
		lblModificarPrecios.setEnabled(false);
	}
	//////////////////////////////////
	
	
	/**
	 * 
	 */
	private void activar_botones()
	{
		btnCerrar.setEnabled(true);
		btnEnviar.setEnabled(true);
		btnGenerar.setEnabled(true);
		lblModificarDestinatarios.setEnabled(true);
		lblModificarPrecios.setEnabled(true);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		setEnabled(true);
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
	        	
	        	controlador.seleccionarProducto(this.idProducto);		
	        	
	        	tblDestinatarios.completarDatos(controlador.getArrClientesInteresados());

	        	Thread.sleep( 1000 );
	        }
	        catch (InterruptedException e)
	        {
	            System.err.println( e.getMessage() );
	        } 
	        catch (Exception e) 
	        {
				e.printStackTrace();
			}
	        finally
	        {
				if(tblDestinatarios.getModel().getRowCount()>0)
					lblModificarDestinatarios.setEnabled(true);
				
				activar_botones();
	        }
	    }
	} 
	///////////////////////////////////////////////////////
}
