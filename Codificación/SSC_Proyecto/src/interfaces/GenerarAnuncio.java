package interfaces;
/*
 * PANTALLA CORRESPONDIENTE AL CU GENERAR ANUNCIO
 */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
import java.util.Vector;

import javax.swing.SwingConstants;

import net.atlanticbb.tantlinger.shef.EditorHTML;

import javax.swing.JTextField;

import utilidades.Configuraciones;

import javax.swing.JProgressBar;


public class GenerarAnuncio extends JDialog {
	//SERIALIZABLE
	private static final long serialVersionUID = 4454249604145639442L;
	
	//COMPONENTES
	private negocio.ControladorConfeccionarAnuncio controladorAux;
	private negocio.Categoria categoria;
	private interfaces.componentes.TablaProductos tblProductosAnuncio;
	private interfaces.componentes.TablaClientesDestino tblDestinatarios;
	private interfaces.componentes.TablaProductos tblProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private interfaces.componentes.BotonesIconos btnGenerar;
	private interfaces.componentes.BotonesIconos btnEnviar;
	private interfaces.componentes.BotonesIconos btnCerrar;
	private JLabel lblModificarDestinatarios;
	private JTextField txtAsunto;
	private JProgressBar prgProgresoAniadir;

	
	//------------------------------------------------------------------
	public negocio.ControladorConfeccionarAnuncio getControlador()
	{
		return controladorAux;
	}

	
	

	public void actualizarClientesDestinatarios(TableModel nuevoModelo)
	{
		//actualizar array interesados
		tblDestinatarios.setModel(nuevoModelo);
	}
	//------------------------------------------------------------------
	
	
	//------------------------------------------------------------------
	public GenerarAnuncio(Frame framePadre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorAnuncios)
	{
		
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
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(10, 24, 77, 23);
		getContentPane().add(lblCategoria);
		
		controladorAux = controladorAnuncios;

		cmbCategorias = new interfaces.componentes.ComboCategorias();
		cmbCategorias.completarDatos(controladorAux.getCatalogoCategorias().getCategorias());
		
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				click_combo_categorias(evento);
			}});
		
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(87, 24, 200, 23);
		getContentPane().add(cmbCategorias);
		
		JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(310, 24, 97, 23);
		getContentPane().add(lblSubcategoria);

		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		
		cmbSubcategorias = new interfaces.componentes.ComboSubcategorias();
		cmbSubcategorias.completarDatos(
				controladorAux.seleccionarCategoria(categoria.getIdCategoria()));
		
		cmbSubcategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				click_combo_subcategorias(evento);
			}
		});
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		cmbSubcategorias.setBounds(410, 24, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
		JLabel lblAsunto = new JLabel("T\u00EDtulo / Asunto:");
		lblAsunto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAsunto.setBounds(10, 72, 110, 23);
		getContentPane().add(lblAsunto);
		
		txtAsunto = new JTextField();
		lblAsunto.setLabelFor(txtAsunto);
		txtAsunto.setBounds(123, 73, 483, 20);
		txtAsunto.setText("");
		getContentPane().add(txtAsunto);
		txtAsunto.setColumns(10);
		
		Box boxProductosAnuncio = Box.createHorizontalBox();
		boxProductosAnuncio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductosAnuncio.setBounds(10, 106, 464, 244);
		getContentPane().add(boxProductosAnuncio);
		
		JScrollPane scrollProductosAnuncio = new JScrollPane();
		scrollProductosAnuncio.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollProductosAnuncio.setAlignmentX(Component.LEFT_ALIGNMENT);
		boxProductosAnuncio.add(scrollProductosAnuncio);
		
		negocio.SubCategoria subcategoriaActual = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
		
		
		tblProductosAnuncio = new interfaces.componentes.TablaProductos();
		Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
		tblProductosAnuncio.completarTabla(productos);
		tblProductosAnuncio.definirTablaProductosAnuncio();
		scrollProductosAnuncio.setViewportView(tblProductosAnuncio);
		
		//Evento para eliminar productos del anuncio
		tblProductosAnuncio.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(tblProductosAnuncio.columnAtPoint(me.getPoint())==3)
					click_eliminar_producto();
			}
		});
		
		
		Box boxProductos = Box.createHorizontalBox();
		boxProductos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductos.setBounds(504, 106, 400, 466);
		getContentPane().add(boxProductos);
		
		JScrollPane scrollProductos = new JScrollPane();
		scrollProductos.setAlignmentY(0.0f);
		scrollProductos.setAlignmentX(0.0f);
		boxProductos.add(scrollProductos);
		

		tblProductos = new interfaces.componentes.TablaProductos();
		tblProductos.completarTabla(
				controladorAux.seleccionarSubcategoria(
						subcategoriaActual.getIdcategoria(), 
						subcategoriaActual.getIdSubcategoria()));
		tblProductos.definirTablaProductos();
		scrollProductos.setViewportView(tblProductos);
		
		//Evento para agregar productos al anuncio
		tblProductos.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) 
					{
						if(tblProductos.columnAtPoint(me.getPoint())==3)
							click_aniadir_producto();
					}
				});
		
		
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 361, 464, 192);
		getContentPane().add(boxDestinatarios);
		
		JScrollPane scrollDestinatarios = new JScrollPane();
		boxDestinatarios.add(scrollDestinatarios);
		
		tblDestinatarios = new interfaces.componentes.TablaClientesDestino();
		
		scrollDestinatarios.setViewportView(tblDestinatarios);

		final GenerarAnuncio dialogPadre = this;
		
		lblModificarDestinatarios = new JLabel("Modificar Destinatarios");
		lblModificarDestinatarios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModificarDestinatarios.setForeground(SystemColor.inactiveCaptionText);
		lblModificarDestinatarios.setBorder(new BevelBorder(0));
		
		// Cambia el tipo de cursor al posarlo sobre el link
		lblModificarDestinatarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModificarDestinatarios.setBackground(UIManager.getColor("Button.disabledForeground"));
		lblModificarDestinatarios.setForeground(new Color(8,98,235));
		lblModificarDestinatarios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) 
			{
				if(lblModificarDestinatarios.isEnabled())
				{
					click_label_modificar_destinatarios(dialogPadre);
				}
			}
		});
		lblModificarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModificarDestinatarios.setBounds(324, 558, 150, 19);
		lblModificarDestinatarios.setEnabled(false);
		getContentPane().add(lblModificarDestinatarios);


		btnGenerar = new interfaces.componentes.BotonesIconos("Modificar Contenido", utilidades.Configuraciones.IMG_ICONOS+"GENERAR_32.png");
		btnGenerar.setText("Generar");
		btnGenerar.setLocation(22, 608);
		btnGenerar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	action_generar(dialogPadre);
	        	}});
		getContentPane().add(btnGenerar);
		
		
		btnEnviar = new interfaces.componentes.BotonesIconos("Enviar Mail", utilidades.Configuraciones.IMG_ICONOS+"ENVIAR_32.png");
		btnEnviar.setText("Enviar");
		btnEnviar.setLocation(145, 608);
		btnEnviar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	action_enviar(dialogPadre);
	        }});
		
	    getContentPane().add(btnEnviar);
	
		btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(817, 609);	
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	cerrar_salir();
	        	}});
			
		getContentPane().add(btnCerrar);
		
		prgProgresoAniadir = new JProgressBar();
		prgProgresoAniadir.setStringPainted(true);
		prgProgresoAniadir.setBounds(10, 558, 304, 19);
		getContentPane().add(prgProgresoAniadir);
			
	}





	// EVENTOS
	//-------------------------------------------------------------------------------------------------
	protected void click_combo_categorias(ItemEvent evento)
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
	

	
	//----------------------------------------------------------------------------------------------
	protected void click_combo_subcategorias(ItemEvent evento)
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

	
	//-------------------------------------------------------------
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
	        	setCursor(new Cursor(Cursor.WAIT_CURSOR));
	        	
	        	String productos[][] = new String[tblProductosAnuncio.getModel().getRowCount()][3];
	        	
	        	for(int i=0; i<tblProductosAnuncio.getModel().getRowCount();++i)
	        	{
	        		productos[i][0] = tblProductosAnuncio.getModel().getValueAt(i, 0).toString();
	        		productos[i][1] = tblProductosAnuncio.getModel().getValueAt(i, 1).toString();
	        		productos[i][2] = tblProductosAnuncio.getModel().getValueAt(i, 2).toString();
	        	}
	        		        	
				@SuppressWarnings("unused")
				EditorHTML editorHTML = new EditorHTML(dialogPadre, productos, txtAsunto.getText());
	        	if(txtAsunto.getText().equals(""))
	        		txtAsunto.setEnabled(false);
	        	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        }
	}
	
	
	//-------------------------------------------------------------
	protected void action_enviar(GenerarAnuncio dialogPadre)
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		interfaces.PrevisualizadorHTML previsualizadorHTML = 
    			new interfaces.PrevisualizadorHTML(dialogPadre);
    	
    	boolean enviado = false;
    	
    	String mailsClientes[] = new String[tblDestinatarios.getModel().getRowCount()];
    	
    	for(int i=0; i<tblDestinatarios.getModel().getRowCount();++i)
    		mailsClientes[i] = tblDestinatarios.getModel().getValueAt(i, 2).toString();

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
    	}
	}
	

	//---------------------------------------------------------------
	@SuppressWarnings("rawtypes")
	protected void click_aniadir_producto() 
	{
		DefaultTableModel modeloTblProductosAnuncio = (DefaultTableModel) tblProductosAnuncio.getModel();
		DefaultTableModel modeloTblProductos = (DefaultTableModel) tblProductos.getModel();
		//DefaultTableModel modeloTblDestinatarios = (DefaultTableModel) tblDestinatarios.getModel();
		
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
												
				String descProducto = fila.elementAt(0).toString().substring(0);
				
				negocio.Producto producto = controladorAux.getCatalogoProductos().obtenerProducto(descProducto);
				
				Thread hiloTrabajoAniadir = new Thread( new TabajoAniadirProducto(producto.getIdProducto()));
				hiloTrabajoAniadir.start();		    	
		    	
				new Thread(new interfaces.interfaces_software.HiloBarraProgreso(hiloTrabajoAniadir, this, prgProgresoAniadir, 500, false)).start();   
			}		
	}
	
	
	//-------------------------------------------------------------
	protected void click_eliminar_producto() 
	{
		DefaultTableModel tableModel = (DefaultTableModel) tblProductosAnuncio.getModel();
		int filaSeleccionada = tblProductosAnuncio.getSelectedRow();

	    if (filaSeleccionada >= 0)
	         tableModel.removeRow(filaSeleccionada);	
	    //habria que agregar la eliminacion del producto del array del controlador
	}
	
	
	//-------------------------------------------------------------
	protected void click_label_modificar_destinatarios(interfaces.GenerarAnuncio dialogPadre) 
	{
		interfaces.ModificarDestinatarios modif = new interfaces.ModificarDestinatarios(dialogPadre);
		modif.setLocationRelativeTo(dialogPadre);
		modif.setVisible(true);	
	}
	
	
	//-------------------------------------------------------------
	protected void cerrar_salir()
	{
		int rta = JOptionPane.showConfirmDialog(
					this, 
					"¿Desea salir y volver al menu principal?\n"
						+ "Todo cambio que no haya guardado se perderá.",
					"ATENCIÓN",
					JOptionPane.YES_NO_OPTION);
				
		switch(rta)
		{
		case(1): //finalizarEdicion();
				 break;
		case(0): limpiar_formulario();
				 dispose();
				 break;
		}
	}
	
	
	//-----------------------------------------------------------------
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

	//-----------------------------------------------------------------
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
	
	
	//------------------------------------------------------------------
	private void desactivar_botones()
	{
		setEnabled(false);
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		btnCerrar.setEnabled(false);
		btnEnviar.setEnabled(false);
		btnGenerar.setEnabled(false);
		lblModificarDestinatarios.setEnabled(false);
	}
	
	
	//------------------------------------------------------------------
	private void activar_botones()
	{
		btnCerrar.setEnabled(true);
		btnEnviar.setEnabled(true);
		btnGenerar.setEnabled(true);
		lblModificarDestinatarios.setEnabled(true);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		setEnabled(true);
	}
	
	
	
	//------------------------------------------------------------------------------------------
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
