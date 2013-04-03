package datos;

import java.sql.Timestamp;
import java.util.Collection;

public class Pedido 
{
	int idPedido;
	datos.Cliente cliente;
	Timestamp fecha;
	private Collection<datos.LineaDePedido> lineas;
	Boolean estado;
}
