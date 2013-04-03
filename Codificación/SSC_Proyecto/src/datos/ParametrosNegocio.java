package datos;

public class ParametrosNegocio 
{
	//ATRIBUTOS
	String membrete;
	int ultIdPedido;

	
	
	//CONSTRUCTOR
	public ParametrosNegocio() 
	{
		this.membrete = "";
		this.ultIdPedido = 0;
	}


	//GETTER & SETTERS
	public String getMembrete() 
	{
		return membrete;
	}



	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}



	public int getUltIdPedido() 
	{
		return ultIdPedido;
	}



	public void setUltIdPedido(int ultIdPedido) 
	{
		this.ultIdPedido = ultIdPedido;
	}
	
	
	//METODOS
	//----------------------------------------------------------
	
}