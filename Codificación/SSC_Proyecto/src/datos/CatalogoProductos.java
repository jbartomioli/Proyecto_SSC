package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoProductos 
{
	//ATRIBUTOS
	private Collection <datos.Producto> productos;
	
	
	//CONSTRUCTOR
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<datos.Producto>();
		this.obtenerProductos();
	}


	//GETTER & SETTER
	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}


	//METODOS
	//-------------------------------------------------------------

	public Collection<datos.Producto> obtenerProductos()
	{
		ResultSet conjuntoResult = null;
		utilidades.BDConector conector = null;
		
		
		try
		{
			
			conector = new utilidades.BDConector(utilidades.BDConstantes.URL_BD, 
					utilidades.BDConstantes.PORT, 
					utilidades.BDConstantes.DATABASE, 
					utilidades.BDConstantes.USER, 
					utilidades.BDConstantes.PASS);
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerProductos");
					
			
			while( conjuntoResult.next())
			{
				datos.Producto pr = new datos.Producto();
				
				pr.setIdProducto(conjuntoResult.getInt("idProducto"));
				pr.setCodProducto(conjuntoResult.getString("codProducto"));
				pr.setNombre(conjuntoResult.getString("nombre"));
				pr.setExistenciaStock(conjuntoResult.getInt("stock"));
				pr.setIdSubCategoria(conjuntoResult.getInt("idSubCategoria"));
				pr.setPrecios(conjuntoResult.getInt("idPrecio"));
				
				productos.add(pr);
			}			
		}
		catch ( SQLException excepcionSql)
		{
			excepcionSql.printStackTrace();
		}
		finally
		{
			try
			{
				conjuntoResult.close();
				conector.cierraConexion();
			}
			catch (Exception excepcion)
			{
				excepcion.printStackTrace();
			}
		}
		return productos;
	}
}