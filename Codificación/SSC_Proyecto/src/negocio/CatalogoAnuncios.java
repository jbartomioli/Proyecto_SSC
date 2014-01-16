package negocio;


import java.util.ArrayList;
import java.util.Collection;

public class CatalogoAnuncios 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.Anuncio> anuncios;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoAnuncios() 
	{
		this.anuncios = new ArrayList<negocio.Anuncio>();
		this.obtenerAnuncios();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Anuncio> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(Collection<negocio.Anuncio> anuncios) {
		this.anuncios = anuncios;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// seteo de la coleccion de anuncios						   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void obtenerAnuncios() 
	{
		//se crea un objeto catalogoclientes de datos
		datos.CatalogoAnuncios ctgDatos = new datos.CatalogoAnuncios();				
			
		for(datos.Anuncio anuncioDato: ctgDatos.getAnuncios())
		{
			negocio.Anuncio anuncioNegocio = new negocio.Anuncio();
			
			anuncioNegocio.setIdAnuncio(anuncioDato.getIdAnuncio());
			anuncioNegocio.setFecha(anuncioDato.getFecha());
			anuncioNegocio.setEstado(anuncioDato.getEstado());
			anuncioNegocio.setTextoMensaje(anuncioDato.getTextoMensaje());
			anuncioNegocio.setMembrete(anuncioDato.getMembrete());
			
			anuncios.add(anuncioNegocio);
		}

	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//FALTA HACER
	public void guardarAnuncio(negocio.Anuncio anuncioActual)
	{
		//
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void guardarCambioClientesAnuncio(negocio.Anuncio anuncioActual)
	{
		for(negocio.Anuncio a : this.anuncios)
		{
			if(anuncioActual.getIdAnuncio()==a.getIdAnuncio())
				a=anuncioActual;
		}
	}
	//---------------------------------------------------------------
	
}
