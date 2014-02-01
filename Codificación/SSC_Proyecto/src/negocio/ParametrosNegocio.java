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
		this.membrete = "";
		this.ultIdPedido = 0;
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

	public int getUltIdPedido() 
	{
		return ultIdPedido;
	}
	
	public void setUltIdPedido(int ultIdPedido)
	{
		this.ultIdPedido = ultIdPedido;
	}
	//---------------------------------------------------------------
	

	//***************************************************************
	//* METODOS														*
	//***************************************************************

	/////////////////////////////////////////////////////////////////
	// OBTIENE LOS DATOS DE PARAMETROS NEGOCIO                     //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerParametrosNegocio()
	{
		//SE CREA OBJETO PARAMETROSNEGOCIO DE DATOS PARA RECUPERAR DATOS
    	datos.ParametrosNegocio parametrosDatos = new datos.ParametrosNegocio();
    	
    	//SE OBTIENEN LOS DATOS DE LA BD
    	parametrosDatos.obtenerParametrosNegocio();
    	    	
    	//SE SETEAN LOS ATRIBUTOS
    	setMembrete(parametrosDatos.getMembrete());
    	setUltIdPedido(parametrosDatos.getUltIdPedido());
	}
	//----------------------------------------------------------------
}
