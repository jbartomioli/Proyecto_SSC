package interfaces;
/**
 * PANTALLA CORRESPONDIENTE AL CU GENERAR ANUNCIO
 */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.Box;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.SwingConstants;

import net.atlanticbb.tantlinger.shef.EditorHTML;

import javax.swing.JTextField;

import utilidades.Configuraciones;

import javax.swing.JProgressBar;


public class GenerarAnuncio extends JDialog {
	/****************
	 * SERIALIZABLE
	 ****************/
	private static final long serialVersionUID = 4454249604145639442L;
	
	
	/**************
	 * COMPONENTES
	 **************/
	private negocio.ControladorConfeccionarAnuncio controladorAux;
	private negocio.Categoria categoria;
	private interfaces.componentes.TablaProductosAnuncio tblProductosAnuncio;
	private interfaces.componentes.TablaClientesDestino tblDestinatarios;
	private interfaces.componentes.TablaProductosAnuncio tblProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private interfaces.componentes.BotonesIconos btnGenerar;
	private interfaces.componentes.BotonesIconos btnEnviar;
	private interfaces.componentes.BotonesIconos btnCerrar;
	private JLabel lblModificarDestinatarios;
	private JLabel lblModificarPrecios;
	private JTextField txtAsunto;
	private JProgressBar prgProgresoAniadir;
	private JScrollPane scrollProductosAnuncio;
	private JScrollPane scrollProductos;

	

	/***********
	 * METODOS
	 * @return
	 ***********/
	//-------------------------------------------------------------------
	public negocio.ControladorConfeccionarAnuncio getControlador()
	{
		return controladorAux;
	}

	
	//-------------------------------------------------------------------
	public void actualizarClientesDestinatarios(TableModel nuevoModelo)
	{			
		String[] idClientesModif = new String[nuevoModelo.getRowCount()];
		
		controladorAux.getArrClientesInteresados().clear();
		
		for(int j=0; j<nuevoModelo.getRowCount(); j++)
			idClientesModif[j] = nuevoModelo.getValueAt(j,0).toString();
		
		for(int i=0; i<idClientesModif.length; i++)
		{
			negocio.Cliente clienteActual = new negocio.Cliente();
			
			clienteActual = controladorAux.getCatalogoClientes().buscarCliente(Integer.parseInt(idClientesModif[i]));
			
			controladorAux.getArrClientesInteresados().add(clienteActual);
		}
		
		tblDestinatarios.completarDatos(controladorAux.getArrClientesInteresados());
		
	}
	
	
	/*******************************
	 * CONSTRUCTOR
	 * @param framePadre
	 * @param modal
	 * @param controladorAnuncios
	 * @throws Exception
	 *******************************/
	public GenerarAnuncio(Frame framePadre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorAnuncios) throws Exception
	{
		/***************************************************************
		 * FORMULARIO BASE
		 ***************************************************************/
		super(framePadre);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
		setMaximumSize(new Dimension(1366, 768));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
		setLocationRelativeTo(null);
		setTitle("Confeccionar Anuncio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CONFECCIONAR_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
    	addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
    	
    	
    	addEscapeListenerWindowDialog();
    	
		
    	/*********
    	 * TITULO
    	 *********/
    	JLabel lblTitulo = new JLabel("Generar Anuncio");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 304, 23);
		getContentPane().add(lblTitulo);
    	
    	/*************
    	 * CATEGORIAS 
    	 *************/
		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(10, 38, 77, 23);
		getContentPane().add(lblCategoria);

		cmbCategorias = new interfaces.componentes.ComboCategorias();
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(87, 38, 200, 23);
		getContentPane().add(cmbCategorias);
		
		
		/****************
		 * SUBCATEGORIAS
		 ****************/
		JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(310, 38, 97, 23);
		getContentPane().add(lblSubcategoria);

		cmbSubcategorias = new interfaces.componentes.ComboSubcategorias();
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		cmbSubcategorias.setBounds(410, 38, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
		
		/*********
		 * ASUNTO
		 *********/
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
		
		
		/*******************************
		 * TABLA PRODUCTOS DEL ANUNCIO
		 *******************************/
		Box boxProductosAnuncio = Box.createHorizontalBox();
		boxProductosAnuncio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductosAnuncio.setBounds(10, 106, 464, 244);
		getContentPane().add(boxProductosAnuncio);
		
		scrollProductosAnuncio = new JScrollPane();
		scrollProductosAnuncio.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollProductosAnuncio.setAlignmentX(Component.LEFT_ALIGNMENT);
		boxProductosAnuncio.add(scrollProductosAnuncio);
	
				
		/****************************
		 * TABLA PRODUCTOS A AGREGAR
		 ****************************/
		Box boxProductos = Box.createHorizontalBox();
		boxProductos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductos.setBounds(484, 106, 430, 446);
		getContentPane().add(boxProductos);
		
		scrollProductos = new JScrollPane();
		scrollProductos.setAlignmentY(0.0f);
		scrollProductos.setAlignmentX(0.0f);
		boxProductos.add(scrollProductos);
		
		tblProductos = new interfaces.componentes.TablaProductosAnuncio();
		scrollProductos.setViewportView(tblProductos);
	
		
		/**********************
		 * TABLA DESTINATARIOS
		 **********************/
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 361, 464, 192);
		getContentPane().add(boxDestinatarios);
		
		JScrollPane scrollDestinatarios = new JScrollPane();
		boxDestinatarios.add(scrollDestinatarios);
		
		tblDestinatarios = new interfaces.componentes.TablaClientesDestino();
		scrollDestinatarios.setViewportView(tblDestinatarios);

		
		/*********************************
		 * BOTON MODIFICAR DESTINATARIOS
		 *********************************/
		lblModificarDestinatarios = new JLabel("Modificar Destinatarios");
		lblModificarDestinatarios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModificarDestinatarios.setForeground(SystemColor.inactiveCaptionText);
		lblModificarDestinatarios.setBorder(new BevelBorder(0));
		
		// Cambia el tipo de cursor al posarlo sobre el link
		lblModificarDestinatarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModificarDestinatarios.setBackground(UIManager.getColor("Button.disabledForeground"));
		lblModificarDestinatarios.setForeground(new Color(8,98,235));
		lblModificarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModificarDestinatarios.setBounds(324, 558, 150, 19);
		lblModificarDestinatarios.setEnabled(false);
		getContentPane().add(lblModificarDestinatarios);
		
		
		/****************************
		* BOTON MODIFICAR PRECIOS
		****************************/
		lblModificarPrecios = new JLabel("Modificar Precios");
		lblModificarPrecios.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarPrecios.setForeground(SystemColor.inactiveCaptionText);
		lblModificarPrecios.setBorder(new BevelBorder(0));
				
		// Cambia el tipo de cursor al posarlo sobre el link
		lblModificarPrecios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModificarPrecios.setBackground(UIManager.getColor("Button.disabledForeground"));
		lblModificarPrecios.setForeground(new Color(8,98,235));
		lblModificarPrecios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModificarPrecios.setBounds(324, 580, 150, 19);
		lblModificarPrecios.setEnabled(true);
		getContentPane().add(lblModificarPrecios);

		
		/*************************
		 * BOTON GENERAR ANUNCIO
		 *************************/
		btnGenerar = new interfaces.componentes.BotonesIconos("Modificar Contenido", utilidades.Configuraciones.IMG_ICONOS+"GENERAR_32.png");
		btnGenerar.setText("Generar");
		btnGenerar.setLocation(22, 608);
		getContentPane().add(btnGenerar);
			
		
		/****************
		 * BOTON ENVIAR
		 ****************/
		btnEnviar = new interfaces.componentes.BotonesIconos("Enviar Mail", utilidades.Configuraciones.IMG_ICONOS+"ENVIAR_32.png");
		btnEnviar.setText("Enviar");
		btnEnviar.setLocation(145, 608);		
	    getContentPane().add(btnEnviar);
	
				
		/****************
		 * BOTON CERRAR
		 ****************/
		btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(817, 609);				
		getContentPane().add(btnCerrar);		
		
		
		/*********************
		 * BARRA DE PROGRESO
		 *********************/
		prgProgresoAniadir = new JProgressBar();
		prgProgresoAniadir.setStringPainted(true);
		prgProgresoAniadir.setBounds(10, 558, 304, 19);
		getContentPane().add(prgProgresoAniadir);
		
		
		/************************
		 * INICIALIZAR CONTROLES
		 ************************/
		inicializar(controladorAnuncios);		
	}

	
	/*********************************
	 * INICIALIZACION DE COMPONENTES
	 * @param controladorAnuncios
	 * @throws Exception
	 *********************************/
	protected void inicializar(negocio.ControladorConfeccionarAnuncio controladorAnuncios) throws Exception
	{
		controladorAux = controladorAnuncios;
		final GenerarAnuncio dialogPadre = this;

		/***************************************************************
		 * COMBO CATEGORIAS
		 ***************************************************************/
		cmbCategorias.completarDatos(controladorAux.getCatalogoCategorias().getCategorias());
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				try {
					click_combo_categorias(evento);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}});
		

		/***************************************************************
		 * COMBO SUBCATEGORIAS
		 ***************************************************************/
		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
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
		
		
		/***************************************************************
		 * TABLA PRODUCTOS ANUNCIO
		 ***************************************************************/
		negocio.SubCategoria subcategoriaActual = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
		Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
		
		tblProductosAnuncio = new interfaces.componentes.TablaProductosAnuncio();
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
		tblProductos.completarTabla(controladorAux.seleccionarSubcategoria(
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
		btnEnviar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	action_enviar(dialogPadre);
	        }});
		
		
		/***************************************************************
		 * BOTON CERRAR
		 ***************************************************************/
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	cerrar_salir();
	        	}});
	}


	
	//
	//
	protected void addEscapeListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 cerrar_salir();
		 }
	 };
	 getRootPane().registerKeyboardAction(
			 escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
	/********************
	 * EVENTOS
	 * @param evento
	 * @throws Exception
	 ********************/
	//-------------------------------------------------------------------
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
		}
	}
	

	
	//-------------------------------------------------------------------
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

	
	
	//-------------------------------------------------------------------
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
	
	
	
	//-------------------------------------------------------------------
	protected void action_enviar(GenerarAnuncio dialogPadre)
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		interfaces.PrevisualizadorHTML previsualizadorHTML = 
    			new interfaces.PrevisualizadorHTML(dialogPadre);
    	
    	boolean enviado = false;
    	
    	String mailsClientes[] = new String[tblDestinatarios.getModel().getRowCount()];
    	
    	for(int i=0; i<tblDestinatarios.getModel().getRowCount();++i)
    		mailsClientes[i] = tblDestinatarios.getModel().getValueAt(i, 3).toString();

    	enviado = previsualizadorHTML.inicializar("temporal.html", mailsClientes);
    	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    	
    	if(enviado)
    	{    		
    		FileReader fr = null;
    		BufferedReader br = null;
    		
    		try
    		{      			
    			File archivoHTML = new File(Configuraciones.DIR_MAILS+"temporal.html");
    			
    		   	fr = new FileReader(archivoHTML);
    		   	br = new BufferedReader(fr);
    		   	
    		   	String contenidoMailHTML = "";    		   		
    		   	String renglon = "";
    			 
    		   	while((renglon=br.readLine())!=null)
    		       		contenidoMailHTML += renglon;
    		   	
    		   	controladorAux.redactarMensaje(contenidoMailHTML);
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		finally
    		{
            	try
            	{                    
            		if( null != fr )   
            			fr.close();
            		limpiar_formulario();
            		eliminar_temporal();
            	}
            	catch (IOException e2)
            	{ 
            		e2.printStackTrace();
            	}
    		}
    		
    		controladorAux.finalizarCargaProducto();
    		controladorAux.guardarAnuncio();   
    		limpiar_objetos_temporales();
    	}
	}
	
	

	//-------------------------------------------------------------------
	@SuppressWarnings("rawtypes")
	protected void click_aniadir_producto() 
	{
		DefaultTableModel modeloTblProductosAnuncio = (DefaultTableModel) tblProductosAnuncio.getModel();
		DefaultTableModel modeloTblProductos = (DefaultTableModel) tblProductos.getModel();

		
		int filaSeleccionada = tblProductos.getSelectedRow();
		Vector fila = new Vector(1);
		fila = (Vector) modeloTblProductos.getDataVector().elementAt(filaSeleccionada);

		if(modeloTblProductosAnuncio.getDataVector().contains(fila))
			JOptionPane.showMessageDialog(null, 
					"No puede agregar dos veces el mismo producto al anuncio.", 
					"ATENCIÓN",
					JOptionPane.WARNING_MESSAGE);
		else 
			if(filaSeleccionada >= 0)
			{
				
				modeloTblProductosAnuncio.addRow(fila);
												
				int idProducto = Integer.parseInt(fila.elementAt(0).toString());
				
				negocio.Producto producto = controladorAux.getCatalogoProductos().buscarProducto(idProducto);
				
				Thread hiloTrabajoAniadir = new Thread( new TabajoAniadirProducto(producto.getIdProducto()));
				hiloTrabajoAniadir.start();		    	
		    	
				new Thread(new interfaces.interfaces_software.HiloBarraProgreso(hiloTrabajoAniadir, this, prgProgresoAniadir, 500, false)).start();   
			}		
	}
	
	
	
	//-------------------------------------------------------------------
	protected void click_eliminar_producto() 
	{
		DefaultTableModel tableModel = (DefaultTableModel) tblProductosAnuncio.getModel();
		int filaSeleccionada = tblProductosAnuncio.getSelectedRow();

	    if (filaSeleccionada >= 0)
	    {
	    	controladorAux.eliminarProducto(Integer.parseInt(tblProductosAnuncio.getModel().getValueAt(filaSeleccionada,0).toString()));
	    	tableModel.removeRow(filaSeleccionada);	
	    }	    
	}
	
	
	
	//-------------------------------------------------------------------
	protected void click_label_modificar_destinatarios(interfaces.GenerarAnuncio dialogPadre) 
	{
		interfaces.ModificarDestinatarios modif = new interfaces.ModificarDestinatarios(dialogPadre);
		modif.setLocationRelativeTo(dialogPadre);
		modif.setVisible(true);	
	}
	
	
	
	//-------------------------------------------------------------------
	protected void click_label_modificar_precios(interfaces.GenerarAnuncio dialogPadre) throws Exception
	{
		interfaces.Precios precios = new interfaces.Precios(dialogPadre, controladorAux);
		precios.setLocationRelativeTo(dialogPadre);
		precios.setVisible(true);
	}
	
	
	
	//-------------------------------------------------------------------
	protected void cerrar_salir()
	{
		limpiar_formulario();
		limpiar_objetos_temporales();
		dispose();
	}
	
	
	
	//-------------------------------------------------------------------
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
	
	
	
	//-------------------------------------------------------------------
	private void limpiar_objetos_temporales()
	{
		controladorAux.getArrClientesInteresados().clear();
		controladorAux.getArrProductosPublicación().clear();
		controladorAux.setAnuncioActual(new negocio.Anuncio()); 
	}
	
	
	
	//-------------------------------------------------------------------
	private void eliminar_temporal() 
	{
		try
			{
				File archivoHTML = new File(Configuraciones.DIR_MAILS+"temporal.html");
				if(archivoHTML.exists())
					archivoHTML.delete();
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}	
	}
	
	
	//-------------------------------------------------------------------
	private void desactivar_botones()
	{
		setEnabled(false);
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		btnCerrar.setEnabled(false);
		btnEnviar.setEnabled(false);
		btnGenerar.setEnabled(false);
		lblModificarDestinatarios.setEnabled(false);
	}
	
	
	
	//-------------------------------------------------------------------
	private void activar_botones()
	{
		btnCerrar.setEnabled(true);
		btnEnviar.setEnabled(true);
		btnGenerar.setEnabled(true);
		lblModificarDestinatarios.setEnabled(true);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		setEnabled(true);
	}
	
	
	
	//-------------------------------------------------------------------
	public class TabajoAniadirProducto implements Runnable{
		
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
	        	
	        	controladorAux.seleccionarProducto(this.idProducto);		
	        	
	        	tblDestinatarios.completarDatos(controladorAux.getArrClientesInteresados());

	        	Thread.sleep( 1000 );
	        }
	        catch (InterruptedException e)
	        {
	            System.err.println( e.getMessage() );
	        }
	        finally
	        {
				if(tblDestinatarios.getModel().getRowCount()>0)
					lblModificarDestinatarios.setEnabled(true);
				
				activar_botones();
	        }
	    }
	}    
}
