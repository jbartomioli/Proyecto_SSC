package negocio;

public class MailDeposito
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private String estado;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public MailDeposito() 
	{
		this.setEstado("");
	}
	//---------------------------------------------------------------
	

	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	//---------------------------------------------------------------

	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************	
	
	/////////////////////////////////////////////////////////////////
	//Env�a el mail con el pedido al deposito					   //
	/////////////////////////////////////////////////////////////////
	//FALTA
	public boolean enviarPedido(negocio.Pedido PCTemporal)
	{
		return true;
	}
	//---------------------------------------------------------------



}
