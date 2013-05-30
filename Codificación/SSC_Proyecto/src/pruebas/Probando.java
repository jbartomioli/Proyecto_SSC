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
		//negocio.CatalogoClientes prueba = new negocio.CatalogoClientes();
	
		//System.out.println("ID CLIENTE\tNOMBRE Y APELLIDO\tEMAIL");
	
		//for(negocio.Cliente c: prueba.getClientes()){
			//System.out.println(c.getIdCliente()+"\t\t"+c.getNombre()+" "+c.getApellido()+"\t\t"+c.getEmail());
			//}
		
		
		negocio.CatalogoCategorias prueba = new negocio.CatalogoCategorias();
		
		System.out.println("ID Categoria\tDescripcion");
	
		for(negocio.Categoria c: prueba.getCategorias())
		{
		 System.out.println(c.getIdCategoria()+"\t\t"+c.getDescripcion());
		}
		
		
	}
}
