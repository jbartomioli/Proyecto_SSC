
public class Prueba {
	
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
				C.obtenerVentas();
				for(negocio.Venta V: C.getVentas())
					System.out.print(V.getFechaVenta()+"\n");
				System.out.println("\n\n");
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