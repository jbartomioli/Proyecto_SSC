package negocio;

public class ParametrosNegocio {
	
	//ATRIBUTOS
	private String membrete;
	private int ultIdPedido;

	
	//CONSTRUCTOR
	public ParametrosNegocio() 
	{
		datos.ParametrosNegocio parametrosDatos = new datos.ParametrosNegocio();
		
		this.membrete = parametrosDatos.getMembrete();
		this.ultIdPedido = parametrosDatos.getUltIdPedido();
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
		this.ultIdPedido++;
		return ultIdPedido;
	}


	public void setUltIdPedido(int ultIdPedido)
	{
		this.ultIdPedido = ultIdPedido;
	}
	
	

}
