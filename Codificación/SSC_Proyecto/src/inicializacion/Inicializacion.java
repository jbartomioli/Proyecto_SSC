package inicializacion;
/*
 * INICIALIZACION DE LA APLICACION
 */

import java.io.IOException;

import javax.swing.JOptionPane;


public class Inicializacion 
{
	/**
	 * CONSTRUCTOR
	 */
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
			/**
			 * LIMPIEZA DE VARIABLES
			 */
			Runtime garbage = Runtime.getRuntime();
			garbage.gc();
		}
	}
	
	/**
	 * 
	 * PRINCIPAL
	 * @param args
	 */
	public static void main(String [] args)
	{		
		new Inicializacion();
	}

}
