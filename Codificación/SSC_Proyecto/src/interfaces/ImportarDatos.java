package interfaces;

import interfaces.componentes.BotonesIconos;

import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;



public class ImportarDatos extends interfaces.componentes.JDialogBaseFormularios
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1861553205753683189L;
	private JLabel lblImportarDatos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.TablaImportacionDatos tblImportacion;
	private BotonesIconos btnProcesar;

	
	/**
	 * 
	 * @param dialogPadre
	 * @throws Exception 
	 */
	public ImportarDatos(JFrame dialogPadre) throws Exception 
	{
		/**
		 * FORMULARIO BASE
		 */
		super(dialogPadre, "Importar Datos","IMPORTAR.png",true);
		setDimensionFormulario(800, 460);
		setBotonAyuda(750,17);
		
		
		/**
		 * TITULO
		 */
		lblImportarDatos = new JLabel("Importar Datos al Sistema");
		lblImportarDatos.setForeground(Color.DARK_GRAY);
		lblImportarDatos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblImportarDatos.setBounds(10, 11, 266, 29);
		getContentPane().add(lblImportarDatos);
			
		
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
		btnProcesar = new BotonesIconos("Procesar","IMPORTAR.png");
		btnProcesar.setBounds(590, 356, 90, 60);
		getContentPane().add(btnProcesar);
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");		
		btnAceptar.setLocation(692, 356);
		getContentPane().add(btnAceptar);
		

		
		inicializar();
		
	}
	
	
	/**
	 * 
	 */
	protected void inicializar() throws Exception
	{
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	       		click_boton_procesar();}});
		
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	       		click_boton_aceptar();}});
		
		
		utilidades.MetadatosBD listarTablas = new utilidades.MetadatosBD();
		Collection<String> tablas = listarTablas.obtenerNombresTablas(); 
		
		tblImportacion.completarNombreTablas(tablas);
		tblImportacion.definirTablaImportacion();

		
		Collection<String> archivos = new ArrayList<String>();
		utilidades.ArchivosDatos listarDir = new utilidades.ArchivosDatos();
		archivos = listarDir.obtenerArchivos(utilidades.Configuraciones.DIR_IMPORTADOR);
					
		tblImportacion.completarRutaArchivos(utilidades.Configuraciones.DIR_IMPORTADOR, tablas, archivos);
		
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
	
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_procesar()
	{	
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		HashMap<String, String> tablas_archivos = new HashMap<String, String>();
		
		for(int i=0; i<tblImportacion.getRowCount();++i)
		{
			try
			{
				tablas_archivos.put(tblImportacion.getValueAt(i, 1).toString(),tblImportacion.getValueAt(i, 2).toString());
			}
			catch(NullPointerException npe)
			{
				tablas_archivos.put(tblImportacion.getValueAt(i, 1).toString(),"");
			}				
		}
		
		
		
		@SuppressWarnings("unused")
		utilidades.Importador importador = new utilidades.Importador(tablas_archivos);
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	public void click_boton_aceptar()
	{
		super.cerrar_salir();
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
