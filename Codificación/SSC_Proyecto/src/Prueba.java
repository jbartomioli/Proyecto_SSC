import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.swing.JOptionPane;

import negocio.Anuncio;
import negocio.CatalogoCategorias;
import negocio.CatalogoProductos;
import negocio.Categoria;
import negocio.Cliente;
import negocio.ControladorConfeccionarAnuncio;
import negocio.Pedido;
import negocio.ControladorConfeccionarAnuncio.SalidaDatos;
import negocio.ControladorConfeccionarAnuncio.SalidaDatosSeleccionaProductos;
import negocio.ParametrosNegocio;
import negocio.Producto;


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
			/*
			negocio.ControladorConfeccionarAnuncio ctrl = new ControladorConfeccionarAnuncio();
			
			Collection<negocio.ControladorConfeccionarAnuncio.SalidaDatos> salida = 
					new ArrayList<ControladorConfeccionarAnuncio.SalidaDatos>();
			
			salida = ctrl.seleccionarCategoria(2);
			
			for(SalidaDatos SD: salida)
			{
				System.out.println(SD.getId()+" - "+SD.getDescripcion());
			}
			*/
			
			//////////////////////////////////////////////////////////////////////////////
			/*
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
			

			/*
			negocio.CatalogoProductos ctg = new negocio.CatalogoProductos();
			
			for(negocio.Producto P : ctg.getProductos())
			{
				System.out.println(P.getCodProducto()+" \t "+
						P.getNombre()+" \t "+
						P.getExistenciaStock()+" \t "+
						P.getIdProducto()+" \t "+
						P.getSubCategoria().getDescripcion()+" \t "+
						P.getPrecioActual()+" \t "+
						P.getPrecioPromocional());
				}	
			*/
			/*
			for(int i=0; i<= 1000; i++)
			{
			negocio.Pedido pedido = new negocio.Pedido();
			
			pedido.setEstado("Pendiente");
			pedido.setFecha(new Date());
			pedido.setTotal(200);
			
			negocio.CatalogoPedidos ctg = new negocio.CatalogoPedidos();
			
			ctg.agregarPedido(pedido);
			}
			*/
			/*
			negocio.CatalogoProductos ctgProductos = new negocio.CatalogoProductos();
			
			negocio.Producto productoActual = new negocio.Producto();
			
			productoActual = ctgProductos.buscarProducto(2);
			
			System.out.println(productoActual.getCodProducto()+" - "+productoActual.getExistenciaStock());
			
			System.in.read();
			
			ctgProductos.actualizarStock(productoActual, 10);
			*/
						
			
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