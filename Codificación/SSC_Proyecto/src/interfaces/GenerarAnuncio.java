package interfaces;

import interfaces.componentes.BotonesIconos;
import interfaces.componentes.ComboCategorias;
import interfaces.componentes.ComboSubcategorias;
import interfaces.componentes.JDialogBaseFormularios;
import interfaces.componentes.LabelBoton;
import interfaces.componentes.TablaClientesDestino;
import interfaces.componentes.TablaProductosAnuncio;
import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JProgressBar;



/**
 * PANTALLA CORRESPONDIENTE AL CU GENERAR ANUNCIO
 */
public class GenerarAnuncio
{
	//COMPONENTES
	public JDialogBaseFormularios frmGenerarAnuncio;
	public TablaProductosAnuncio tblProductosAnuncio;
	public TablaClientesDestino tblDestinatarios;
	public TablaProductosAnuncio tblProductos;
	public ComboCategorias cmbCategorias;
	public ComboSubcategorias cmbSubcategorias;
	public BotonesIconos btnGenerar;
	public BotonesIconos btnEnviar;
	public BotonesIconos btnCerrar;
	public LabelBoton lblModificarDestinatarios;
	public LabelBoton lblModificarPrecios;
	public JTextField txtAsunto;
	public JProgressBar prgProgresoAniadir;
	public JScrollPane scrollProductosAnuncio;
	public JScrollPane scrollProductos;
	

	
	
	
	/*******************************
	 * CONSTRUCTOR
	 * @param framePadre
	 * @param modal
	 * @param controladorAnuncios
	 * @throws Exception
	 *******************************/
	public GenerarAnuncio(JFrame framePadre, boolean modal)
	{
		//FORMULARIO BASE
		frmGenerarAnuncio = new JDialogBaseFormularios(framePadre, "Confeccionar Anuncio", "CONFECCIONAR.png", modal);
		frmGenerarAnuncio.setPantallaCompleta();
		frmGenerarAnuncio.setDimensionFormulario(1024, 668);
		frmGenerarAnuncio.setBotonAyuda(884,32);
        		
    		//TITULO
	    	JLabel lblTitulo = new JLabel("Generar Anuncio");
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblTitulo.setBounds(10, 11, 304, 23);
			frmGenerarAnuncio.getContentPane().add(lblTitulo);
	    	

			//CATEGORIAS 
			JLabel lblCategoria = new JLabel("Categor\u00EDa:");
			lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblCategoria.setBounds(10, 38, 77, 23);
			frmGenerarAnuncio.getContentPane().add(lblCategoria);
	
			cmbCategorias = new ComboCategorias();
			lblCategoria.setLabelFor(cmbCategorias);
			cmbCategorias.setBounds(87, 38, 200, 23);
			frmGenerarAnuncio.getContentPane().add(cmbCategorias);
			
			
			//SUBCATEGORIAS
			JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
			lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblSubcategoria.setBounds(310, 38, 97, 23);
			frmGenerarAnuncio.getContentPane().add(lblSubcategoria);
	
			cmbSubcategorias = new ComboSubcategorias();
			lblSubcategoria.setLabelFor(cmbSubcategorias);
			cmbSubcategorias.setBounds(410, 38, 196, 23);
			frmGenerarAnuncio.getContentPane().add(cmbSubcategorias);
			
			
			 //ASUNTO
			JLabel lblAsunto = new JLabel("Asunto:");
			lblAsunto.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblAsunto.setBounds(10, 72, 77, 23);
			frmGenerarAnuncio.getContentPane().add(lblAsunto);
			
			txtAsunto = new JTextField();
			lblAsunto.setLabelFor(txtAsunto);
			txtAsunto.setBounds(87, 73, 519, 20);
			txtAsunto.setText("");
			frmGenerarAnuncio.getContentPane().add(txtAsunto);
			txtAsunto.setColumns(10);
			
			
			//TABLA PRODUCTOS DEL ANUNCIO
			Box boxProductosAnuncio = Box.createHorizontalBox();
			boxProductosAnuncio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
			boxProductosAnuncio.setBounds(10, 106, 464, 244);
			frmGenerarAnuncio.getContentPane().add(boxProductosAnuncio);
			
			scrollProductosAnuncio = new JScrollPane();
			scrollProductosAnuncio.setAlignmentY(Component.TOP_ALIGNMENT);
			scrollProductosAnuncio.setAlignmentX(Component.LEFT_ALIGNMENT);
			boxProductosAnuncio.add(scrollProductosAnuncio);
		
			tblProductosAnuncio = new TablaProductosAnuncio();
			scrollProductosAnuncio.setViewportView(tblProductosAnuncio);
					
			//TABLA PRODUCTOS A AGREGAR
			Box boxProductos = Box.createHorizontalBox();
			boxProductos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
			boxProductos.setBounds(484, 106, 430, 446);
			frmGenerarAnuncio.getContentPane().add(boxProductos);
			
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
			frmGenerarAnuncio.getContentPane().add(boxDestinatarios);
			
			JScrollPane scrollDestinatarios = new JScrollPane();
			boxDestinatarios.add(scrollDestinatarios);
			
			tblDestinatarios = new TablaClientesDestino();
			scrollDestinatarios.setViewportView(tblDestinatarios);
	
			
			//BOTON MODIFICAR DESTINATARIOS
			lblModificarDestinatarios = new LabelBoton("Modificar Destinatarios");
			lblModificarDestinatarios.setBounds(324, 558, 150, 19);
			lblModificarDestinatarios.setEnabled(false);
			frmGenerarAnuncio.getContentPane().add(lblModificarDestinatarios);
			
			
			//BOTON MODIFICAR PRECIOS
			lblModificarPrecios = new LabelBoton("Modificar Precios");
			lblModificarPrecios.setBounds(324, 580, 150, 19);
			frmGenerarAnuncio.getContentPane().add(lblModificarPrecios);
	
			
			//BOTON GENERAR ANUNCIO
			btnGenerar = new BotonesIconos("Modificar Contenido","GENERAR.png");
			btnGenerar.setText("Generar");
			btnGenerar.setLocation(22, 608);
			frmGenerarAnuncio.getContentPane().add(btnGenerar);
				
			
			//BOTON ENVIAR
			btnEnviar = new BotonesIconos("Enviar Mail","ENVIAR.png");
			btnEnviar.setText("Enviar");
			btnEnviar.setLocation(145, 608);		
			frmGenerarAnuncio.getContentPane().add(btnEnviar);
		
					
			//BOTON CERRAR
			btnCerrar = new BotonesIconos("Cerrar","CERRAR.png");
			btnCerrar.setLocation(817, 609);				
			frmGenerarAnuncio.getContentPane().add(btnCerrar);		
			
			
			//BARRA DE PROGRESO
			prgProgresoAniadir = new JProgressBar();
			prgProgresoAniadir.setStringPainted(true);
			prgProgresoAniadir.setBounds(10, 558, 304, 19);
			frmGenerarAnuncio.getContentPane().add(prgProgresoAniadir);
		/////////////////////////////////////////////
	}
	/////////////////////////////////////////////////////////////////////////
}
