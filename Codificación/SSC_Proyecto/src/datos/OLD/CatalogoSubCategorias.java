package datos.OLD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoSubCategorias 
{
	//ATRIBUTOS
	private Collection<datos.OLD.SubCategoria> subcategorias;

	
	//CONSTRUCTOR
	public CatalogoSubCategorias() 
	{
		this.subcategorias = new ArrayList<datos.OLD.SubCategoria>();
		
	}


	//GETTERS & SETTERS
	public Collection<datos.OLD.SubCategoria> getSubcategorias() 
	{
		return subcategorias;
	}


	public void setSubcatgorias(Collection<datos.OLD.SubCategoria> subcategorias) 
	{
		this.subcategorias = subcategorias;
	}
	
	
	//METODOS
	//----------------------------------------------------------
	public Collection<datos.OLD.SubCategoria> obtenerSubCategorias()
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
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerSubCategorias");
					
			
			while( conjuntoResult.next() )
			{
				//se define categoria temporal
				datos.OLD.SubCategoria sctg = new datos.OLD.SubCategoria();
				
				//se setean atributos de subcategoria
							
				sctg.setIdSubcategoria(conjuntoResult.getInt("idSubCategoria"));
				sctg.setDescripcion(conjuntoResult.getString("descripcion"));
				sctg.setIdCategoria(conjuntoResult.getInt("idCategoria"));
				sctg.setProducto(conjuntoResult.getInt("idProducto"));
					
				subcategorias.add(sctg);
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
		return subcategorias;
	}
}
