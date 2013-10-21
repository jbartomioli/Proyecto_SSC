import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import negocio.CatalogoCategorias;
import negocio.Categoria;
import negocio.Cliente;
import negocio.ControladorConfeccionarAnuncio;
import negocio.ControladorConfeccionarAnuncio.SalidaDatos;
import negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos;


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
			/*
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
			
			*/
			//////////////////////////////////////////////////////////////////////////////
			JOptionPane.showMessageDialog(null, "Antes del ...");
			
			negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos salida2;// = new negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos();
			
			salida2 = ctrl.seleccionarProducto(557);
			
			int i = 0;
			
			JOptionPane.showMessageDialog(null, "Antes del FOR");
			
			/*
			for(String[] datosClientes: salida2.getClientes())
			{
				/*
				//se setean datos de los clientes en array temporal
				System.out.print(datosClientes[0][i]+" ");
				System.out.print(datosClientes[1][i]+" ");
				System.out.println(datosClientes[2][i]);
				
				System.out.print(datosClientes[i]);
				JOptionPane.showMessageDialog(null, "Prueba");
				i++;
			}*/
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