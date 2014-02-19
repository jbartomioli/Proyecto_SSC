import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.swing.JOptionPane;

import java.sql.Connection;

import negocio.Anuncio;
import negocio.CatalogoCategorias;
import negocio.CatalogoProductos;
import negocio.Categoria;
import negocio.Cliente;
import negocio.ControladorConfeccionarAnuncio;
import negocio.Pedido;
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
		
			ControladorConfeccionarAnuncio ctrl = new ControladorConfeccionarAnuncio();
			
			ctrl.inicializarCatalogos();
			
			//negocio.CatalogoCategorias ccc = new CatalogoCategorias();
			for(negocio.Categoria C : ctrl.getCatalogoCategorias().getCategorias())
			{
				System.out.println("Categoria: "+C.getIdCategoria()+"-"+C.getDescripcion());
				C.obtenerSubCategorias();
				
				for(negocio.SubCategoria sub : C.getSubCats())
				{
					System.out.print("\tSub: ");
					System.out.println(sub.getIdSubcategoria()+" "+sub.getDescripcion());
					sub.obtenerProductos();
					
					for(negocio.Producto p : sub.getProductos())
					{
						System.out.println("\t\tProducto: "+p.toString());
					}
				}		
				System.in.read();
			}
			
			
		 
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
			
			System.out.println(param.getUltIdPedido()+" - "+param.getMembrete());
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
						
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbssc","sscacceso", "zLvSUVUaDnWFNKzG");
			//System.out.print(con);
			
			//maxId();
			
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
	
	
	
	
	
	
	
	public static void maxId()
	{
		Connection conexion = null;
		Statement instruccion = null;
		ResultSet conjuntoResultPers = null;
		
		
		int max = 0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/dbssc","sscacceso", "zLvSUVUaDnWFNKzG");
			
			instruccion = conexion.createStatement();
			
			conjuntoResultPers = instruccion.executeQuery(
					"select * from clientes");
				  
			while( conjuntoResultPers.next())
			{
				max = conjuntoResultPers.getInt("idCLiente");
				System.out.println(max);
			}
			
			
		}
		catch ( SQLException excepcionSql)
		{
			excepcionSql.printStackTrace();
		}
		catch (ClassNotFoundException noEncontroClase)
		{
			noEncontroClase.printStackTrace();
		}
		finally
		{
			try
			{
				conjuntoResultPers.close();
				instruccion.close();
				conexion.close();
			}
			catch (Exception excepcion)
			{
				excepcion.printStackTrace();
			}
		}
		//return max;
	}
}