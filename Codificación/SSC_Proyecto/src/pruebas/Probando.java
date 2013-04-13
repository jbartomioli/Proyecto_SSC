package pruebas;

import java.util.ArrayList;
import java.util.Collection;

import utilidades.XMLConvertor;

import datos.Cliente;


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
		String xml;
		Collection<datos.Cliente> clientes = new ArrayList<datos.Cliente>();
		
		xml = XMLConvertor.objectToXML(prueba.getClientes());
		
		clientes = (Collection<Cliente>) XMLConvertor.XMLToObject(xml);
		
		
		
		System.out.println("ID CLIENTE\tNOMBRE Y APELLIDO\tEMAIL");

		
		for(datos.Cliente c: clientes){
			System.out.println(c.getIdCliente()+"\t"+c.getNombre()+" "+c.getApellido()+"\t"+c.getEmail());
			}
		
		
	}

}
