package datos.OLD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoProductos 
{
	//ATRIBUTOS
	private Collection <datos.OLD.Producto> productos;
	
	
	//CONSTRUCTOR
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<datos.OLD.Producto>();
		this.obtenerProductos();
	}


	//GETTER & SETTER
	public Collection<datos.OLD.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<datos.OLD.Producto> productos) 
	{
		this.productos = productos;
	}


	//METODOS
	//-------------------------------------------------------------

	public Collection<datos.OLD.Producto> obtenerProductos()
	{
		ResultSet conjuntoResult = null;
		eliminar.BDConector conector = null;
		
		
		try
		{
			
			conector = new eliminar.BDConector(eliminar.BDConstantes.URL_BD, 
					eliminar.BDConstantes.PORT, 
					eliminar.BDConstantes.DATABASE, 
					eliminar.BDConstantes.USER, 
					eliminar.BDConstantes.PASS);
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerProductos");
					
			
			while( conjuntoResult.next())
			{
				datos.OLD.Producto pr = new datos.OLD.Producto();
				
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