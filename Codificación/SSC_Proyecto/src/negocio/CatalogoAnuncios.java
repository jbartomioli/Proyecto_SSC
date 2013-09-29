package negocio;


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
		
		return anuncios;
	}
	
	
	//-----------------------------------------------------------------------------
	public void guardarAnuncio(negocio.Anuncio anuncioActual)
	{
		
	}
	
	//-----------------------------------------------------------------------------
	public void guardarCambioClientesAnuncio(negocio.Anuncio anuncioActual)
	{
		for(negocio.Anuncio a : this.anuncios)
		{
			if(anuncioActual.getIdAnuncio()==a.getIdAnuncio())
				a=anuncioActual;
		}
	}
}
