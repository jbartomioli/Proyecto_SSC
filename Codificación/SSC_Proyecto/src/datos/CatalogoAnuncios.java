package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoAnuncios 
{
	//ATRIBUTOS
	private Collection<datos.Anuncio> anuncios;
	
	
	//CONSTRUCTOR
	public CatalogoAnuncios() 
	{
		this.anuncios = new ArrayList<datos.Anuncio>();
		this.obtenerAnuncios();
	}


	//GETTER & SETTER
	public Collection<datos.Anuncio> getAnuncios() {
		return anuncios;
	}


	public void setAnuncios(Collection<datos.Anuncio> anuncios) {
		this.anuncios = anuncios;
	}

	
	
	//METODOS
		//-------------------------------------------------------------
		public Collection<datos.Anuncio> obtenerAnuncios()
		{
			ResultSet conjuntoResult = null;
			datos.BDConector conector = null;
			
			
			try
			{
				
				conector = new datos.BDConector(datos.BDConstantes.URL_BD, 
						datos.BDConstantes.PORT, 
						datos.BDConstantes.DATABASE, 
						datos.BDConstantes.USER, 
						datos.BDConstantes.PASS);
				

				conjuntoResult = conector.ejecutaPeticion("CALL obtenerAnuncios");
						
				
				while( conjuntoResult.next())
				{
					datos.Anuncio a = new datos.Anuncio();
					
					a.setIdCliente(conjuntoResult.getInt("idCliente"));
					a.setIdProducto(conjuntoResult.getInt("idProducto"));
					a.setIdAnuncio(conjuntoResult.getInt("idAnuncio"));
					a.setTextoMensaje(conjuntoResult.getString("textoMensaje"));
					a.setFecha(conjuntoResult.getDate("fecha"));
					a.setEstado(conjuntoResult.getString("estado"));			
					anuncios.add(a);
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
			return anuncios;
		}
}


