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
				System.out.println(C.getApellido() + " " +C.getNombre()+" "+C.getVentas().toString());
				//for(negocio.Venta V: C.getVentas())
				//	System.out.print(V.getFechaVenta()+" ");
				//System.out.println("");
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