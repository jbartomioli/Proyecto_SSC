package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoSubCategorias 
{
	//ATRIBUTOS
	private Collection<datos.SubCategoria> subcategorias;

	
	//CONSTRUCTOR
	public CatalogoSubCategorias() 
	{
		this.subcategorias = new ArrayList<datos.SubCategoria>();
		
	}


	//GETTERS & SETTERS
	public Collection<datos.SubCategoria> getSubcategorias() 
	{
		return subcategorias;
	}


	public void setSubcatgorias(Collection<datos.SubCategoria> subcategorias) 
	{
		this.subcategorias = subcategorias;
	}
	
	
	//METODOS
	//----------------------------------------------------------
	public Collection<datos.SubCategoria> obtenerSubCategorias()
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
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerSubCategorias");
					
			
			while( conjuntoResult.next() )
			{
				//se define categoria temporal
				datos.SubCategoria sctg = new datos.SubCategoria();
				
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
