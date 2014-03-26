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
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
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
import javax.swing.SwingConstants;
import net.atlanticbb.tantlinger.shef.EditorHTML;


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
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(20, 39, 77, 23);
		getContentPane().add(lblCategoria);
		
		controladorAux = controladorAnuncios;

		cmbCategorias = new interfaces.componentes.ComboCategorias();
		cmbCategorias.completarDatos(controladorAux.getCatalogoCategorias().getCategorias());
		
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				clickComboCategorias(evento);}});
		
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(97, 39, 200, 23);
		getContentPane().add(cmbCategorias);
		
		JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(320, 39, 97, 23);
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
		cmbSubcategorias.setBounds(420, 39, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
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
		tblProductosAnuncio.completarTabla(
				controladorAux.seleccionarSubcategoria(
						subcategoriaActual.getIdcategoria(),
						subcategoriaActual.getIdSubcategoria()));
		tblProductosAnuncio.definirTablaProductosAnuncio();
		scrollProductosAnuncio.setViewportView(tblProductosAnuncio);
	
		
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
		

		
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 380, 464, 192);
		getContentPane().add(boxDestinatarios);
		
		JScrollPane scrollDestinatarios = new JScrollPane();
		boxDestinatarios.add(scrollDestinatarios);
		
		tblDestinatarios = new interfaces.componentes.TablaClientesDestino();
		//tblDestinatarios.completarDatos(controladorAnuncios.getArrClientesInteresados());
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
				//System.out.println("Hola mundo");
				setModal(false);
				interfaces.ModificarDestinatarios modif = new interfaces.ModificarDestinatarios(dialogPadre);
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
	        	EditorHTML editorHTML = new EditorHTML(dialogPadre);
	     	    }});
		getContentPane().add(btnGenerar);
		
		
		btnEnviar = new interfaces.componentes.BotonesIconos("Enviar Mail", utilidades.Configuraciones.IMG_ICONOS+"ENVIAR_32.png");
		btnEnviar.setText("Enviar");
		btnEnviar.setLocation(145, 608);
		btnEnviar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	interfaces.PrevisualizadorHTML previsualizadorHTML = 
	        			new interfaces.PrevisualizadorHTML("prueba.html", dialogPadre);
	        }});
		
	    getContentPane().add(btnEnviar);
	    

		
		btnGuardar = new interfaces.componentes.BotonesIconos("Guardar", utilidades.Configuraciones.IMG_ICONOS+"GUARDAR_32.png");
		btnGuardar.setLocation(698, 609);
		getContentPane().add(btnGuardar);
		
	
		btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(817, 609);	
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	clickBotonCerrar(evento);}});
			
		getContentPane().add(btnCerrar);
	}

	
	
	
	// EVENTOS
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
		
	

	public void clickBotonCerrar(ActionEvent evento)
	{
		dispose();
	}
}
