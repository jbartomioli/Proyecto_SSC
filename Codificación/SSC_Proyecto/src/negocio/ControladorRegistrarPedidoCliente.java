package negocio;

import java.util.ArrayList;
import java.util.Date;


public class ControladorRegistrarPedidoCliente 
{
	//ATRIBUTOS
	private negocio.CatalogoClientes cc;
	private negocio.CatalogoProductos cp;
	private negocio.CatalogoPedidos cpe;
	private negocio.Pedido PCTemporal;
	
	
	//CONSTRUCTOR
	public ControladorRegistrarPedidoCliente() 
	{
		this.cc = new negocio.CatalogoClientes();
		this.cp = new negocio.CatalogoProductos();
		this.cpe = new negocio.CatalogoPedidos();
		this.PCTemporal = new negocio.Pedido();
	}


	//GETTER & SETTER
	public negocio.CatalogoClientes getCc() 
	{
		return cc;
	}


	public void setCc(negocio.CatalogoClientes cc) 
	{
		this.cc = cc;
	}


	public negocio.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(negocio.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public negocio.CatalogoPedidos getCpe() 
	{
		return cpe;
	}


	public void setCpe(negocio.CatalogoPedidos cpe) 
	{
		this.cpe = cpe;
	}


	public negocio.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(negocio.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
	
	
	//METODOS
	//////////////////
	//Metodo 3.1.1 ///
	//////////////////
	//LISTO
	public DatosCliente buscarCliente(int idCliente)
	{
		negocio.Pedido PCTemporal = new negocio.Pedido();
		
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		clienteActual=cc.buscarCliente(idCliente);
		
		DatosCliente datosCliente = new DatosCliente();
		
		if(clienteActual!= null)
		{	
			datosCliente.setNombre(clienteActual.getNombre());
			datosCliente.setApellido(clienteActual.getApellido());
			datosCliente.setDireccion(clienteActual.getDireccion());
			datosCliente.setTelefono(clienteActual.getTelefono());
			
			PCTemporal.setCliente(clienteActual);
			PCTemporal.setFecha(new Date());
			
			return datosCliente;		
		}
		else
			return null;

	}
	
	/////////////////
	//Metodo 3.1.2 //
	/////////////////
	//LISTO
	public DatosCliente buscarCliente(String apellido, String nombre)
	{
		
		negocio.Pedido PCTemporal = new negocio.Pedido();
		
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		clienteActual=cc.buscarCliente(apellido, nombre);
		
		DatosCliente datosCliente = new DatosCliente();
		
		if(clienteActual!= null)
		{	
			datosCliente.setNombre(clienteActual.getNombre());
			datosCliente.setApellido(clienteActual.getApellido());
			datosCliente.setDireccion(clienteActual.getDireccion());
			datosCliente.setTelefono(clienteActual.getTelefono());
			
			PCTemporal.setCliente(clienteActual);
			PCTemporal.setFecha(new Date());
			
			return datosCliente;	
		}
		else
			return null;
	}
	
	/////////////////
	//Metodo 3.2.1 //
	/////////////////
	//FALTA
	public ArrayList<String> seleccionarProducto(int idProducto, int cantidad)
	{
		negocio.Producto productoTemporal = new negocio.Producto();
		
		productoTemporal = cp.buscarProducto(idProducto);
		
		if(productoTemporal != null)
		{
			int stockActual = productoTemporal.getExistenciaStock();
			
			//Obtener datos del producto mediante subclase
			
			if(stockActual>=cantidad)
			{
				PCTemporal.setProducto(productoTemporal, cantidad);
				
				return null; //Devolver datos
			}
			else
				return null;
		}
		else
			return null;
	}
	
	
	/////////////////
	//Metodo 3.2.2 //
	/////////////////
	//FALTA
	public ArrayList<String> buscarProducto(String descParcial, int cantidad)
	{
		return null;
	}
	
	/////////////////
	//Metodo 3.3.1 //
	/////////////////
	//FALTA	
	public ArrayList<String> pedidoCompleto()
	{
		return null;
	}
	
	////////////////
	// Metodo 3.5 //
	////////////////
	//FALTA
	public boolean eliminarProducto(int idProducto)
	{
		return true;
	}	

	////////////////////////////
	// Metodo 3.6.1 - 3.6.3.1 //
	////////////////////////////
	//FALTA
	public ArrayList<String> seleccionarProducto(int idProducto)
	{
		return null;
	}
	
	//////////////////
	// Metodo 3.6.2 //
	//////////////////
	//FALTA
	public boolean modificarCantidad(int nuevaCantidad)
	{
		return true;
	}
	
	////////////////////
	// Metodo 3.6.3.2 //
	////////////////////
	//FALTA
	public ArrayList<String> seleccionarNuevoProducto(String descParcial)
	{
		return null;
	}
	
	//////////////////
	// Metodo 3.6.4 //
	//////////////////
	//FALTA
	public boolean ingresarCantidad(int cantidad)
	{
		return true;
	}
	
	
///////////////////////////////////////////////////////////////
//SUB CLASE PARA DEVOLVER DATOS DEL DSD 3.1 ///////////////////
///////////////////////////////////////////////////////////////
private class DatosCliente 
{
String nombre, apellido, direccion, telefono;


//CONSTRUCTOR
public DatosCliente() 
{
this.nombre = "";
this.apellido = "";
this.direccion = "";
this.telefono = "";
}


	public String getNombre() 
	{
	return nombre;
	}
	
	
	public void setNombre(String nombre) 
	{
	this.nombre = nombre;
	}
	
	
	public String getApellido() 
	{
	return apellido;
	}
	
	
	public void setApellido(String apellido) 
	{
	this.apellido = apellido;
	}
	
	
	public String getDireccion() 
	{
	return direccion;
	}
	
	
	public void setDireccion(String direccion) 
	{
	this.direccion = direccion;
	}
	
	
	public String getTelefono() 
	{
	return telefono;
	}
	
	
	public void setTelefono(String telefono) 
	{
	this.telefono = telefono;
	}

}
}
