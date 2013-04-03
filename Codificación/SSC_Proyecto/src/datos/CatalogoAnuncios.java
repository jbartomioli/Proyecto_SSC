package datos;

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
	}


	//GETTER & SETTER
	public Collection<datos.Anuncio> getAnuncios() {
		return anuncios;
	}


	public void setAnuncios(Collection<datos.Anuncio> anuncios) {
		this.anuncios = anuncios;
	}
}


