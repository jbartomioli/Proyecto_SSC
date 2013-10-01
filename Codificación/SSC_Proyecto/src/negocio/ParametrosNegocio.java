package negocio;

public class ParametrosNegocio 
{
	
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************	
	private String membrete;
	private int ultIdPedido;
	//---------------------------------------------------------------
	

	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************	
	public ParametrosNegocio() 
	{
		datos.ParametrosNegocio parametrosDatos = new datos.ParametrosNegocio();
		
		this.membrete = parametrosDatos.getMembrete();
		this.ultIdPedido = parametrosDatos.getUltIdPedido();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public String getMembrete() 
	{
		return membrete;
	}

	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	//Devuelve el numero del ultimo pedido y guarda el proximo     //
	/////////////////////////////////////////////////////////////////
	//Reveer si conviene tener un metodo aparte para que haga el autoincremento
	//porque después hay que guardar el valor en la BD
	public int getUltIdPedido() 
	{
		this.ultIdPedido++;
		return ultIdPedido;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	public void setUltIdPedido(int ultIdPedido)
	{
		this.ultIdPedido = ultIdPedido;
	}
	//---------------------------------------------------------------
}
