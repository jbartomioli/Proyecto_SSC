package negocio;

public class Anuncio {
	
	//ATRIBUTOS
	private datos.Anuncio anuncioDatos; 

	
	//CONSTRUCTOR
	public Anuncio() 
	{
		this.anuncioDatos = new datos.Anuncio();
	}

	
	//GETTER & SETTERS
	public datos.Anuncio getAnuncioDatos() 
	{
		return anuncioDatos;
	}

	public void setAnuncioDatos(datos.Anuncio anuncioDatos) 
	{
		this.anuncioDatos = anuncioDatos;
	}

	//METODOS
	//----------------------------------------------------------
	
}
