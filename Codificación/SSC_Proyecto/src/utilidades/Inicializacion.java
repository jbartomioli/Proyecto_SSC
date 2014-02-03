package utilidades;

public class Inicializacion 
{

	public Inicializacion() 
	{
	}
	
	public static void main(String [] args)
	{
		utilidades.Configuraciones configuraciones;
		
		configuraciones = new utilidades.Configuraciones();
		configuraciones.obtenerConfiguraciones();
		
		interfaces.PantallaInicial pantallaInicio = new interfaces.PantallaInicial(configuraciones);
		
		
		
	}

}
