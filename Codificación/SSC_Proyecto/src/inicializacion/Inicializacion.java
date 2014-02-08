package inicializacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Inicializacion 
{

	public Inicializacion() 
	{
	}
	
	public static void main(String [] args)
	{
		//
		utilidades.Configuraciones configuraciones;
		
		//
		configuraciones = new utilidades.Configuraciones();
		try 
		{
			configuraciones.obtenerConfiguraciones();
			
			//
			@SuppressWarnings("unused")
			interfaces.PantallaBienvenida pantallaInicio = new interfaces.PantallaBienvenida(configuraciones);
			
			//
			@SuppressWarnings("unused")
			interfaces.Principal principal = new interfaces.Principal(configuraciones);
			
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al cargar el archivo de configuraciones\n"
					+ "Verifique que el mismo esté correctamente ubicado en el directorio\n"
					+ "de la aplicación.\n\n"
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

}
