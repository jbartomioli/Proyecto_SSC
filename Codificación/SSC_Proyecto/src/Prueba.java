import java.util.ArrayList;
import java.util.Collection;

import negocio.CatalogoCategorias;
import negocio.Categoria;
import negocio.ControladorConfeccionarAnuncio;
import negocio.ControladorConfeccionarAnuncio.SalidaDatos;


public class Prueba {
	
	public Prueba()
	{
	}

	
	public static void main(String [] args)
	{ 

		try
		{
		/*
			negocio.CatalogoClientes cc = new negocio.CatalogoClientes();
			for(negocio.Cliente C : cc.getClientes())
			{
				System.out.println(C.getApellido() + " " +C.getNombre()+" "+C.getVentas().toString());
				C.obtenerVentas();
				for(negocio.Venta V: C.getVentas())
					System.out.print(V.getFechaVenta()+"\n");
				System.out.println("\n\n");
			}
		*/
		/*
			negocio.CatalogoCategorias ccc = new CatalogoCategorias();
			for(negocio.Categoria C : ccc.getCategorias())
				System.out.println(C.getIdCategoria()+" " +C.getDescripcion());
		 */
			
			negocio.ControladorConfeccionarAnuncio ctrl = new ControladorConfeccionarAnuncio();
			
			Collection<negocio.ControladorConfeccionarAnuncio.SalidaDatos> salida = 
					new ArrayList<ControladorConfeccionarAnuncio.SalidaDatos>();
			
			salida = ctrl.seleccionarCategoria(2);
			
			for(SalidaDatos SD: salida)
			{
				System.out.println(SD.getId()+" - "+SD.getDescripcion());
			}
			
			//////////////////////////////////////////////////////////////////////////////
			salida = ctrl.seleccionarSubcategoria(3);
			
			for(SalidaDatos SD: salida)
			{
				System.out.println(SD.getId()+" - "+SD.getDescripcion());
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