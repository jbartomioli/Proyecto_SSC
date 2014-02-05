package utilidades;


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
		configuraciones.obtenerConfiguraciones();
		
		//
		@SuppressWarnings("unused")
		interfaces.PantallaBienvenida pantallaInicio = new interfaces.PantallaBienvenida(configuraciones);
		
		//
		@SuppressWarnings("unused")
		interfaces.Principal principal = new interfaces.Principal(configuraciones);
		
		
	}

}
