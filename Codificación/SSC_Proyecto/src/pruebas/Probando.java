package pruebas;

import java.util.ArrayList;
import java.util.Collection;


public class Probando {

	public Probando() 
	{
		new Probando();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		datos.CatalogoClientes prueba = new datos.CatalogoClientes();
				
		Collection<datos.Cliente> clientes = new ArrayList<datos.Cliente>();
		
		clientes = prueba.getClientes();
		
		for(datos.Cliente c: clientes){
			System.out.println(c.getIdCliente()+" - "+c.getNombre());
			}
	}

}
