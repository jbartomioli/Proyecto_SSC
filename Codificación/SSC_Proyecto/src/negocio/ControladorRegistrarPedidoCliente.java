package negocio;


public class ControladorRegistrarPedidoCliente 
{
	//ATRIBUTOS
	datos.CatalogoClientes cc;
	datos.CatalogoProductos cp;
	datos.CatalogoPedidos cpe;
	datos.Pedido PCTemporal;
	
	
	//CONSTRUCTOR
	public ControladorRegistrarPedidoCliente() 
	{
		this.cc = new datos.CatalogoClientes();
		this.cp = new datos.CatalogoProductos();
		this.cpe = new datos.CatalogoPedidos();
		PCTemporal = new datos.Pedido();
	}


	//GETTER & SETTER
	public datos.CatalogoClientes getCc() 
	{
		return cc;
	}


	public void setCc(datos.CatalogoClientes cc) 
	{
		this.cc = cc;
	}


	public datos.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(datos.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public datos.CatalogoPedidos getCpe() 
	{
		return cpe;
	}


	public void setCpe(datos.CatalogoPedidos cpe) 
	{
		this.cpe = cpe;
	}


	public datos.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(datos.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
}
