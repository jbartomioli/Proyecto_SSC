package datos;

import java.util.Collection;

public class Cliente 
{
	int idCliente;
	String nombre;
	String apellido;
	String direccion;
	String telefono;
	Boolean tipoCliente;
	private Collection<datos.Venta> ventas;
}
