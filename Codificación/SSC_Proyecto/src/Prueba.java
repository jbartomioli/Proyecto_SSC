import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import negocio.Anuncio;
import negocio.CatalogoCategorias;
import negocio.Categoria;
import negocio.Cliente;
import negocio.ControladorConfeccionarAnuncio;
import negocio.ControladorConfeccionarAnuncio.SalidaDatos;
import negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos;
import negocio.ParametrosNegocio;


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
			
		//	negocio.ControladorConfeccionarAnuncio ctrl = new ControladorConfeccionarAnuncio();
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
			/*JOptionPane.showMessageDialog(null, "Antes del ...");
			
			negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos salida2;// = new negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos();
			
			salida2 = ctrl.seleccionarProducto(557);
			
			int i = 0;
			
			JOptionPane.showMessageDialog(null, "Antes del FOR");
			
			
			for(String[] datosClientes: salida2.getClientes())
			{
				
				//se setean datos de los clientes en array temporal
				System.out.print(datosClientes[0][i]+" ");
				System.out.print(datosClientes[1][i]+" ");
				System.out.println(datosClientes[2][i]);
				
				System.out.print(datosClientes[i]);
				JOptionPane.showMessageDialog(null, "Prueba");
				i++;
			}
			/*
			Anuncio a = new Anuncio();
			a.enviarAnuncio();
			 */
			/*
			negocio.ParametrosNegocio param = new negocio.ParametrosNegocio();
			
			param.obtenerParametrosNegocio();
			
			System.out.println(param.getUltIdPedido()+" + "+param.getMembrete());
			*/
			

			
			negocio.CatalogoProductos ctg = new negocio.CatalogoProductos();
			
			for(negocio.Producto P : ctg.getProductos())
			{
				System.out.print(P.getCodProducto()+" \t\t\t "+
						P.getNombre()+" \t\t\t\t "+
						P.getExistenciaStock()+" \t\t\t "+
						P.getIdProducto()+" \t\t\t "+
						P.getSubCategoria().getDescripcion()+" \t ");
				for(negocio.Precio pre : P.getPrecios())	
				{
					System.out.print(pre.getIdPrecio()+" \t\t\t "+
							pre.getPrecio()+" \t\t\t "+
							pre.getPrecioPromocional()+" \t\t\t "+
							pre.getFechaDesde()+" \t\t\t "+
							pre.getFechaHasta());
				}
				System.out.print("\n");
				
			}
			
			
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 finally
		 {
			 //limpieza de memoria
				Runtime garbage = Runtime.getRuntime();
				garbage.gc();
		 }	
   }
	
}