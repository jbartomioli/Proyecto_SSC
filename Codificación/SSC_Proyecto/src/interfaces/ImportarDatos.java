package interfaces;

import interfaces.componentes.BotonesIconos;

import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;


public class ImportarDatos extends JDialog
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1861553205753683189L;
	private JLabel lblImportarDatos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.TablaImportacionDatos tblImportacion;
	private BotonesIconos btnProcesar;
	private String dirRaiz = "C:\\TMP\\";


	
	/**
	 * 
	 * @param dialogPadre
	 */
	public ImportarDatos(JFrame dialogPadre) 
	{
		/**
		 * FORMULARIO BASE
		 */
		super(dialogPadre);
		setResizable(false);
		setMinimumSize(new Dimension(800, 460));
		getContentPane().setMinimumSize(new Dimension(800, 460));
		getContentPane().setMaximumSize(new Dimension(800, 460));
		setMaximumSize(new Dimension(800, 460));
		setSize(800, 460);	
		setTitle("Importar Datos");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"IMPORTAR_32.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		/**
		 * TITULO
		 */
		lblImportarDatos = new JLabel("Importar Datos al Sistema");
		lblImportarDatos.setForeground(Color.DARK_GRAY);
		lblImportarDatos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblImportarDatos.setBounds(10, 11, 266, 29);
		getContentPane().add(lblImportarDatos);
	
		addEscapeListenerWindowDialog();
		
		
		/**
		 * TABLAS
		 */
		Box boxTablas = Box.createHorizontalBox();
		boxTablas.setBorder(new TitledBorder(null, "Tablas a Importar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxTablas.setBounds(10, 52, 772, 292);
		getContentPane().add(boxTablas);
		
		JScrollPane scrollTablas = new JScrollPane();
		boxTablas.add(scrollTablas);
		
		tblImportacion = new interfaces.componentes.TablaImportacionDatos();
		scrollTablas.setViewportView(tblImportacion);
		
		
				
		/**
		 * BOTON PROCESAR
		 */
		btnProcesar = new BotonesIconos("Procesar", utilidades.Configuraciones.IMG_ICONOS+"IMPORTAR_32.png");
		btnProcesar.setBounds(590, 356, 90, 60);
		getContentPane().add(btnProcesar);
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");		
		btnAceptar.setLocation(692, 356);
		getContentPane().add(btnAceptar);
		
		
		inicializar();
		
	}
	
	
	/**
	 * 
	 */
	protected void inicializar()
	{
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	       		click_boton_procesar();}});
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	       		click_boton_aceptar();}});
		
		
		utilidades.ListarTablas listarTablas = new utilidades.ListarTablas();
		Collection<String> tablas = listarTablas.obtenerNombresTablas(); 
		
		tblImportacion.completarNombreTablas(tablas);
		tblImportacion.definirTablaImportacion();

		
		Collection<String> archivos = new ArrayList<String>();
		utilidades.ArchivosDatos listarDir = new utilidades.ArchivosDatos();
		archivos = listarDir.obtenerArchivos(dirRaiz);
		
		try
		{			
			listarDir.leerArchivos(dirRaiz, archivos);
			tblImportacion.completarRutaArchivos(dirRaiz, tablas, archivos);
			
			@SuppressWarnings("unused")
			utilidades.LectorCSV lectorCSV = new utilidades.LectorCSV(dirRaiz,archivos);
			
			//Evento para eliminar productos del anuncio
			tblImportacion.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) 
				{
					if(tblImportacion.columnAtPoint(me.getPoint())==3)
					{
						click_editar_ruta();
					}
				}
			});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
	
	
	//
	protected void addEscapeListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 click_boton_aceptar();
		 }
	 };
	 getRootPane().registerKeyboardAction(
			 escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_procesar()
	{		
		dispose();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_aceptar()
	{		
		dispose();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_editar_ruta()
	{	
		int nroFila = tblImportacion.getSelectedRow();
		
		try
		{
			setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			JFileChooser buscarArchivo = new JFileChooser();
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("csv","CSV");
			buscarArchivo.setFileFilter(filter);
			
			@SuppressWarnings("unused")
			int seleccion = buscarArchivo.showOpenDialog(this);
						
			buscarArchivo.setVisible(true);
			String urlArchivo = buscarArchivo.getSelectedFile().getAbsolutePath();
			
			tblImportacion.setValueAt(urlArchivo, nroFila, 2);
		}
		catch(NullPointerException npe)
		{
			tblImportacion.setValueAt(tblImportacion.getValueAt(nroFila, 2), nroFila, 2);
		}
		finally
		{
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	
	}
}
