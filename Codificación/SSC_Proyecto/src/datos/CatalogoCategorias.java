package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoCategorias 
{
	//ATRIBUTOS
	private Collection<datos.Categoria> categorias;

	
	//CONSTRUCTOR
	public CatalogoCategorias() 
	{
		this.categorias = new ArrayList<datos.Categoria>();
		this.obtenerCategorias();
	}


	//GETTER & SETTERS
	public Collection<datos.Categoria> getCategorias() 
	{
		return categorias;
	}

	public void setCategorias(Collection<datos.Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	

	
	//METODOS
	//-------------------------------------------------------------
	public Collection<datos.Categoria> obtenerCategorias()
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
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerCategorias");
					
			
			while( conjuntoResult.next() )
			{
				//se define categoria temporal
				datos.Categoria ctg = new datos.Categoria();
				
				//se setean atributos de categoria
				ctg.setIdCategoria(conjuntoResult.getInt("idCategoria"));
				ctg.setDescripcion(conjuntoResult.getString("descripcion"));
				ctg.setSubCat(conjuntoResult.getInt("idSubcategoria"));
				ctg.setProducto(conjuntoResult.getInt("idProducto"));
					
				categorias.add(ctg);
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
		return categorias;
	}
	//****************************************************************************
}
