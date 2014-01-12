package negocio;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
	public Collection<negocio.Anuncio> obtenerAnuncios() 
	{		
		//se crea un objeto catalogoanuncios de datos
		datos.CatalogoAnuncios ctgDatos = new datos.CatalogoAnuncios();
		
		//
		anuncios = new ArrayList<negocio.Anuncio>();
			
		
		Iterator <datos.Anuncio> it = ctgDatos.getAnuncios().iterator();
		
		while(it.hasNext())
		{
			datos.Anuncio datosAnuncio = it.next();
			
			negocio.Anuncio anuncioNegocio = new negocio.Anuncio();			
			
			//categoriaNegocio.setIdCategoria(datosCategoria.getIdCategoria());
			//categoriaNegocio.setDescripcion(datosCategoria.getDescripcion());
			
			anuncios.add(anuncioNegocio);
		}
		return anuncios;
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
