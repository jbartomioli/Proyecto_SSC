package datos;

public class MailDeposito 
{
	//ATRIBUTOS
	datos.Pedido PCTemporal;
	
	
	//CONSTRUCTOR
	public MailDeposito() 
	{
		PCTemporal = new datos.Pedido();
	}


	//GETTER & SETTER
	public datos.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(datos.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
}
