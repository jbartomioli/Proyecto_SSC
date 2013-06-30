package datos.OLD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoCategorias 
{
	//ATRIBUTOS
	private Collection<datos.OLD.Categoria> categorias;

	
	//CONSTRUCTOR
	public CatalogoCategorias() 
	{
		this.categorias = new ArrayList<datos.OLD.Categoria>();
		this.obtenerCategorias();
	}


	//GETTER & SETTERS
	public Collection<datos.OLD.Categoria> getCategorias() 
	{
		return categorias;
	}

	public void setCategorias(Collection<datos.OLD.Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	

	
	//METODOS
	//-------------------------------------------------------------
	public Collection<datos.OLD.Categoria> obtenerCategorias()
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
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerCategorias");
					
			
			while( conjuntoResult.next() )
			{
				//se define categoria temporal
				datos.OLD.Categoria ctg = new datos.OLD.Categoria();
				
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
