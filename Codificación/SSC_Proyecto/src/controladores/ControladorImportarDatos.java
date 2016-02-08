package controladores;

import interfaces.ImportarDatos;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 * CONTROLADOR IMPORTADOR DATOS A BD
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class ControladorImportarDatos implements ActionListener
{
	//ATRIBUTOS
	private ImportarDatos guiImportarDatos;
	
	
	/**
	 * CONSTRUCTOR
	 * @param guiImportarDatos
	 */
	public ControladorImportarDatos(ImportarDatos guiImportarDatos)
	{
		this.guiImportarDatos = guiImportarDatos;
		this.guiImportarDatos.btnAceptar.addActionListener(this);
		this.guiImportarDatos.btnProcesar.addActionListener(this);
		try
		{
			inicializar();
			this.guiImportarDatos.frmImportarDatos.setVisible(true);
		} 
		catch (SQLException sqe) 
		{
			JOptionPane.showMessageDialog(
					guiImportarDatos.frmImportarDatos, 
					"Error al conectarse a la Base de Datos.\nRevisar la configuración y volver a intentarlo.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			sqe.printStackTrace();
			guiImportarDatos.frmImportarDatos.dispose();
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(
					guiImportarDatos.frmImportarDatos,
					"Se ha producido un error grave. Comuníquese con los desarrolladores y exponga el caso.\n"
					+ "Gracias.",
					"ERROR GRAVE",
					JOptionPane.ERROR_MESSAGE);
			guiImportarDatos.frmImportarDatos.dispose();
			
			
			e.printStackTrace();
		}
	}
	////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA ACTION PERFORMED
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(guiImportarDatos.btnAceptar))
			click_aceptar();
		
		if(evento.getSource().equals(guiImportarDatos.btnProcesar))
			click_procesar();
	}
	////////////////////////////////////////////////
	
	
	
	/**
	 * INICIALIZACION DEL FORMULARIO
	 * @throws Exception
	 */
	private void inicializar() throws Exception
	{
		utilidades.MetadatosBD listarTablas = new utilidades.MetadatosBD();
		Collection<String> tablas = listarTablas.obtenerNombresTablas(); 
		
		guiImportarDatos.tblImportacion.completarNombreTablas(tablas);
		guiImportarDatos.tblImportacion.definirTablaImportacion();

		
		Collection<String> archivos = new ArrayList<String>();
		utilidades.ArchivosDatos listarDir = new utilidades.ArchivosDatos();
		archivos = listarDir.obtenerArchivos(utilidades.Configuraciones.DIR_IMPORTADOR);
					
		guiImportarDatos.tblImportacion.completarRutaArchivos(utilidades.Configuraciones.DIR_IMPORTADOR, tablas, archivos);
		
		guiImportarDatos.tblImportacion.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me) 
			{
				if(guiImportarDatos.tblImportacion.columnAtPoint(me.getPoint())==3)
				{
					click_editar_ruta();
				}
			}
		});
	}
	////////////////////////////////////////////
	
	
	
	/**
	 * ACCION BOTON PROCESAR
	 */
	private void click_procesar()
	{	
		guiImportarDatos.frmImportarDatos.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		HashMap<String, String> tablas_archivos = new HashMap<String, String>();
		
		int nulos = 0;
		
		for(int i=0; i<guiImportarDatos.tblImportacion.getRowCount();++i)
		{
			try
			{
				tablas_archivos.put(guiImportarDatos.tblImportacion.getValueAt(i, 1).toString().trim(),guiImportarDatos.tblImportacion.getValueAt(i, 2).toString().trim());
			}
			catch(NullPointerException npe)
			{
				tablas_archivos.put(guiImportarDatos.tblImportacion.getValueAt(i, 1).toString(),"");
				nulos++;
				npe.printStackTrace();
			}				
		}
		
		if(nulos == guiImportarDatos.tblImportacion.getRowCount())
		{
			JOptionPane.showMessageDialog(
					guiImportarDatos.frmImportarDatos,
					"No se realizarán cambios en la base de datos ya que no se han definido\n"
					+ "rutas de archivos de orígenes de datos.",
					"ATENCIÓN",
					JOptionPane.WARNING_MESSAGE);
		}
		
		@SuppressWarnings("unused")
		utilidades.Importador importador = new utilidades.Importador(tablas_archivos);
		
		guiImportarDatos.frmImportarDatos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	//////////////////////////////
	

	
	/**
	 * ACCION BOTON ACEPTAR
	 */
	private void click_aceptar()
	{
		guiImportarDatos.frmImportarDatos.dispose();
	}
	/////////////////////////////
	

	
	/**
	 * CLICK BOTON EDICION DE RUTA DE ARCHIVO
	 */
	private void click_editar_ruta()
	{	
		int nroFila = guiImportarDatos.tblImportacion.getSelectedRow();
		
		try
		{
			guiImportarDatos.frmImportarDatos.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			JFileChooser buscarArchivo = new JFileChooser();
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("csv","CSV");
			buscarArchivo.setFileFilter(filter);
			
			@SuppressWarnings("unused")
			int seleccion = buscarArchivo.showOpenDialog(guiImportarDatos.frmImportarDatos);
						
			buscarArchivo.setVisible(true);
			String urlArchivo = buscarArchivo.getSelectedFile().getAbsolutePath();
			
			guiImportarDatos.tblImportacion.setValueAt(urlArchivo, nroFila, 2);
		}
		catch(NullPointerException npe)
		{
			guiImportarDatos.tblImportacion.setValueAt(guiImportarDatos.tblImportacion.getValueAt(nroFila, 2), nroFila, 2);
			npe.printStackTrace();
		}
		finally
		{
			guiImportarDatos.frmImportarDatos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	
	}
	/////////////////////////////////
}
