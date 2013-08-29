public class Prueba {

	//static SessionFactory sessionFactory;
	
	public Prueba()
	{
	}

	
	public static void main(String [] args)
	{ 

		try
		{
			negocio.CatalogoClientes cc = new negocio.CatalogoClientes();
			for(negocio.Cliente C : cc.getClientes())
			{
				System.out.println(C.getApellido() + " " +C.getNombre());
			}
			
			
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 finally
		 {
		 }	
   }
	
}