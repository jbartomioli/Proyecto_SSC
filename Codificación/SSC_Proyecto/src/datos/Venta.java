package datos;

import java.security.Timestamp;
import java.util.Collection;

public class Venta 
{
	Timestamp fechaVenta;
	private Collection<datos.LineaDeVenta> lineasDeVenta;
	double total;
}
