package datos.OLD;

public class MailDeposito 
{
	//ATRIBUTOS
	private datos.OLD.Pedido PCTemporal;
	
	
	//CONSTRUCTOR
	public MailDeposito() 
	{
		PCTemporal = new datos.OLD.Pedido();
	}


	//GETTER & SETTER
	public datos.OLD.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(datos.OLD.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
}
