package inicializacion;
/*
 * INICIALIZACION DE LA APLICACION
 */

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import negocio.ControladorConfeccionarAnuncio;


public class Inicializacion 
{
	private utilidades.Configuraciones configuraciones;
	private negocio.ControladorConfeccionarAnuncio controladorAnuncio;
	private negocio.ControladorRealizarSeguimientoCliente controladorSeguimiento;
	private negocio.ControladorRegistrarPedidoCliente controladorPedido;

	public Inicializacion() 
	{
		
		controladorAnuncio = new negocio.ControladorConfeccionarAnuncio();
		
		try 
		{		
			configuraciones = new utilidades.Configuraciones();

			//
			@SuppressWarnings("unused")
			interfaces.PantallaBienvenida pantallaInicio = new interfaces.PantallaBienvenida(controladorAnuncio);
			
			//
			@SuppressWarnings("unused")
			interfaces.Principal principal = new interfaces.Principal(controladorAnuncio);
			
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al cargar el archivo de configuraciones\n"
					+ "Verifique que el mismo est� correctamente ubicado en el directorio\n"
					+ "de la aplicaci�n.\n\n"
					+ "El sistema no puede continuar...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		} 
		catch (IOException e) 
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al leer el archivo de configuraciones\n\n"
					+ "El sistema no puede continuar...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);		
		}
		finally
		{
			//limpieza de memoria
			Runtime garbage = Runtime.getRuntime();
			garbage.gc();
		}
	}
	
	public static void main(String [] args)
	{		
		new Inicializacion();
	}

}
