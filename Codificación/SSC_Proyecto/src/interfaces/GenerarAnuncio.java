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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import javax.swing.SwingConstants;

import net.atlanticbb.tantlinger.shef.EditorHTML;

import javax.swing.JTextField;



public class GenerarAnuncio extends JDialog {
	//SERIALIZABLE
	private static final long serialVersionUID = 4454249604145639442L;
	
	//COMPONENTES
	private interfaces.componentes.TablaProductos tblProductosAnuncio;
	private interfaces.componentes.TablaClientesDestino tblDestinatarios;
	private interfaces.componentes.TablaProductos tblProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private negocio.Categoria categoria;
	private interfaces.componentes.BotonesIconos btnGenerar;
	private interfaces.componentes.BotonesIconos btnGuardar;
	private interfaces.componentes.BotonesIconos btnEnviar;
	private interfaces.componentes.BotonesIconos btnCerrar;
	private negocio.ControladorConfeccionarAnuncio controladorAux;
	private JTextField txtAsunto;

	/**
	 * Create the frame.
	 */
	public GenerarAnuncio(Frame padre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorAnuncios)
	{
		
		super(padre);
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
				clickComboCategorias(evento);}});
		
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
				clickComboSubcategorias(evento);
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
			public void mouseClicked(MouseEvent e) 
			{
				DefaultTableModel tableModel = (DefaultTableModel) tblProductosAnuncio.getModel();
				int filaSeleccionada = tblProductosAnuncio.getSelectedRow();
				//JOptionPane.showMessageDialog(null, "Fila presionada: " + filaSeleccionada);
			    if (filaSeleccionada >= 0)
			         tableModel.removeRow(filaSeleccionada);
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
					public void mouseClicked(MouseEvent arg0) 
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
								negocio.CatalogoProductos catProductos = new negocio.CatalogoProductos();
								String producto = fila.elementAt(0).toString().substring(10);
								///////VER
								System.out.println("Producto: " + producto);
								
								
								//ACA ACTUALIZARIAMOS LA TABLA DE CLIENTES PERO, HAY QUE REVEER EL METODO DE BUSQUEDA
								//YA QUE TARDA MUCHO Y NO ES MUY OPTIMO
								//controladorAux.seleccionarProducto(100);
								//tblDestinatarios.completarDatos(controladorAux.getArrClientesInteresados());		
							}
					}
				});
		
		
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 380, 464, 192);
		getContentPane().add(boxDestinatarios);
		
		JScrollPane scrollDestinatarios = new JScrollPane();
		boxDestinatarios.add(scrollDestinatarios);
		
		tblDestinatarios = new interfaces.componentes.TablaClientesDestino();
		
		scrollDestinatarios.setViewportView(tblDestinatarios);

		final JDialog dialogPadre = this;
		
		JLabel lblModificarDestinatarios = new JLabel("Modificar Destinatarios");
		lblModificarDestinatarios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModificarDestinatarios.setForeground(SystemColor.inactiveCaptionText);
		lblModificarDestinatarios.setBorder(new BevelBorder(0));
		
		// Cambia el tipo de cursor al posarlo sobre el link
		lblModificarDestinatarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModificarDestinatarios.setBackground(UIManager.getColor("Button.disabledForeground"));
		lblModificarDestinatarios.setForeground(new Color(8,98,235));
		lblModificarDestinatarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				interfaces.ModificarDestinatarios modif = new interfaces.ModificarDestinatarios(dialogPadre);
				modif.setLocationRelativeTo(dialogPadre);
				modif.setVisible(true);
			}
		});
		lblModificarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModificarDestinatarios.setBounds(324, 583, 150, 14);
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
	    

		
		btnGuardar = new interfaces.componentes.BotonesIconos("Guardar", utilidades.Configuraciones.IMG_ICONOS+"GUARDAR_32.png");
		btnGuardar.setLocation(698, 609);
		getContentPane().add(btnGuardar);
		
	
		btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(817, 609);	
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	cerrar_salir();
	        	}});
			
		getContentPane().add(btnCerrar);
			
	}

	
	
	// EVENTOS
	//-------------------------------------------------------------------------------------------------
	public void clickComboCategorias(ItemEvent evento)
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
	public void clickComboSubcategorias(ItemEvent evento)
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
	public void action_generar(JDialog dialogPadre)
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
	        	
	        	String productos[][] = new String[tblProductosAnuncio.getModel().getRowCount()][2];
	        	
	        	for(int i=0; i<tblProductosAnuncio.getModel().getRowCount();++i)
	        	{
	        		productos[i][0] = tblProductosAnuncio.getModel().getValueAt(i, 0).toString();
	        		productos[i][1] = tblProductosAnuncio.getModel().getValueAt(i, 1).toString();
	        	}
	        		        	
				@SuppressWarnings("unused")
				EditorHTML editorHTML = new EditorHTML(dialogPadre, productos, txtAsunto.getText());
	        	if(txtAsunto.getText().equals(""))
	        		txtAsunto.setEnabled(false);
	        	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        }
	}
	
	
	//-------------------------------------------------------------
	public void action_enviar(JDialog dialogPadre)
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
    	@SuppressWarnings("unused")
		interfaces.PrevisualizadorHTML previsualizadorHTML = 
    			new interfaces.PrevisualizadorHTML("temporal.html", dialogPadre);
    	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	//-------------------------------------------------------------
	public void cerrar_salir()
	{
		int rta = JOptionPane.showConfirmDialog(
					this, 
					"Está a punto de salir sin enviar el mensaje.\n"
						+ "¿Desea salir y volver al menu principal?\n"
						+ "Todo cambio que no haya guardado se perderá.",
					"ATENCIÓN",
					JOptionPane.YES_NO_OPTION);
				
		switch(rta)
		{
		case(1): //finalizarEdicion();
				 break;
		case(0): dispose();
				 break;
		}
	}
}
