package pruebas;



public class Probando {

	public Probando() 
	{
		new Probando();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		negocio.CatalogoClientes prueba = new negocio.CatalogoClientes();
//		String xml;
//		Collection<datos.Cliente> clientes = new ArrayList<datos.Cliente>();
//		
//		xml = XMLConvertor.objectToXML(prueba.getClientes());
//		
//		clientes = (Collection<Cliente>) XMLConvertor.XMLToObject(xml);
	
		System.out.println("ID CLIENTE\tNOMBRE Y APELLIDO\tEMAIL");
	
		for(negocio.Cliente c: prueba.getClientes()){
			System.out.println(c.getIdCliente()+"\t\t"+c.getNombre()+" "+c.getApellido()+"\t\t"+c.getEmail());
			}	
	}
}
