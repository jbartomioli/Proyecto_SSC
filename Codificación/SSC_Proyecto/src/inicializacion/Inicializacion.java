package inicializacion;
/*
 * INICIALIZACION DE LA APLICACION
 */

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Inicializacion 
{
	public Inicializacion() 
	{
					
		try
		{
			@SuppressWarnings("unused")
			utilidades.Configuraciones configuraciones = new utilidades.Configuraciones();

			//
			@SuppressWarnings("unused")
			interfaces.PantallaBienvenida pantallaInicio = new interfaces.PantallaBienvenida();
			
			
		}
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al leer el archivo de configuraciones.\n\n"
					+ "El sistema no puede continuar...\n",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al leer el archivo de configuraciones.\n\n"
					+ "El sistema no puede continuar...\n",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
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
