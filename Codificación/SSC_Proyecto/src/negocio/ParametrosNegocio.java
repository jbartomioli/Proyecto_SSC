package negocio;

public class ParametrosNegocio {
	
	//ATRIBUTOS
	private String membrete;
	private int ultIdPedido;

	
	//CONSTRUCTOR
	public ParametrosNegocio() 
	{
		datos.OLD.ParametrosNegocio parametrosDatos = new datos.OLD.ParametrosNegocio();
		
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


	//Devuelve el numero del ultimo pedido y guarda el proximo
	//Reveer si conviene tener un metodo aparte para que haga el autoincremento
	//porque despu�s hay que guardar el valor en la BD
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
