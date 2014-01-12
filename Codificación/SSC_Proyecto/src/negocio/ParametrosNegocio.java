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
		
		parametrosDatos.obtenerParametrosNegocio();
		
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
	
	/////////////////////////////////////////////////////////////////
	//Devuelve el numero del ultimo pedido y guarda el proximo     //
	/////////////////////////////////////////////////////////////////
	public int getUltIdPedido() 
	{
		this.ultIdPedido++;
		
		datos.ParametrosNegocio parametrosDatos = new datos.ParametrosNegocio();
		
		parametrosDatos.setUltIdPedido(this.ultIdPedido);
		parametrosDatos.guardarDatos();
		
		return ultIdPedido;
	}
	
	public void setUltIdPedido(int ultIdPedido)
	{
		this.ultIdPedido = ultIdPedido;
	}
	//---------------------------------------------------------------
}
