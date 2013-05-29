package negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoAnuncios 
{
	// ATRIBUTOS
	private Collection<negocio.Anuncio> anuncios;

	// CONSTRUCTOR
	public CatalogoAnuncios() 
	{
		this.anuncios = new ArrayList<negocio.Anuncio>();
		this.obtenerAnuncios();
	}

	// GETTER & SETTER
	public Collection<negocio.Anuncio> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(Collection<negocio.Anuncio> anuncios) {
		this.anuncios = anuncios;
	}

	// METODOS
	// -------------------------------------------------------------
	public Collection<negocio.Anuncio> obtenerAnuncios() 
	{
		/* ESTO NO CORRESPONDE A NEGOCIO
		ResultSet conjuntoResult = null;
		datos.BDConector conector = null;

		try 
		{
			conector = new datos.BDConector(datos.BDConstantes.URL_BD,
					datos.BDConstantes.PORT, datos.BDConstantes.DATABASE,
					datos.BDConstantes.USER, datos.BDConstantes.PASS);

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerAnuncios");

			while (conjuntoResult.next()) 
			{
				negocio.Anuncio a = new negocio.Anuncio();

				a.setClientes(null); //VER
				a.setProductos(null); //VER
				a.setIdAnuncio(conjuntoResult.getInt("idAnuncio"));
				a.setTextoMensaje(conjuntoResult.getString("textoMensaje"));
				a.setFecha(conjuntoResult.getDate("fecha"));
				a.setEstado(conjuntoResult.getString("estado"));
				anuncios.add(a);
			}
		} catch (SQLException excepcionSql) {
			excepcionSql.printStackTrace();
		} finally {
			try {
				conjuntoResult.close();
				conector.cierraConexion();
			} catch (Exception excepcion) {
				excepcion.printStackTrace();
			}
		}*/
		return anuncios;
	}
	
	
	
	public void guardarAnuncio(negocio.Anuncio anuncioActual)
	{
		
	}
	
	public void guardarCambioClientesAnuncio(negocio.Anuncio anuncioActual, negocio.Cliente arrClientesSeleccionados)
	{
		
	}
}
