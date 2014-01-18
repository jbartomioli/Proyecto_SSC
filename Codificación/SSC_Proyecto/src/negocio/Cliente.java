package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idCliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String especialidad;
	private String telefono;
	private boolean tipoCliente;
	private Collection<negocio.Venta> ventas;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Cliente() 
	{
		this.idCliente = 0;
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.email = "";
		this.especialidad = "";
		this.telefono = "";
		this.tipoCliente = false;
		this.ventas = new ArrayList<negocio.Venta>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdCliente() 
	{
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) 
	{
		this.idCliente = idCliente;
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
	
	public boolean getTipoCliente() 
	{
		return tipoCliente;
	}
	
	public void setTipoCliente(boolean tipoCliente) 
	{
		this.tipoCliente = tipoCliente;
	}
	
	public Collection<negocio.Venta> getVentas()
	{		
		return ventas;
	}
	
	public void setVentas(Collection<negocio.Venta> ventas) 
	{
		this.ventas = ventas;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getEspecialidad() 
	{
		return especialidad;
	}

	public void setEspecialidad(String especialidad) 
	{
		this.especialidad = especialidad;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// Se utiliza para solicitar al cliente sus ventas			   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void obtenerVentas()
	{
		//se crea una instancia de cliente de datos
		datos.Cliente clienteDato = new datos.Cliente();
		
		//se setean las ventas del cliente de datos
		clienteDato.obtenerVentas(this.getIdCliente());
		
		//se obtiene cada venta del cliente de datos
		//para luego agregarlas al cliente de negocio
		
		//esta opcion o volver a crear el array y setear siempre los datos
		if(this.ventas != null)
		{
			for(datos.Venta VD: clienteDato.getVentas())
			{
				negocio.Venta ventaNegocio = new negocio.Venta();
				
				ventaNegocio.setIdVenta(VD.getIdVenta());
				ventaNegocio.setFechaVenta(VD.getFechaVenta());
				ventaNegocio.setTotal(VD.getTotal());
				
				this.ventas.add(ventaNegocio);
			}
		}
		
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean comproProducto(negocio.Producto productoActual)
	{
		for(negocio.Venta V: this.ventas)
		{
			//
			V.obtenerLineasDeVenta();
			
			if (V.comproProducto(productoActual))
				return true;
		}
		
		return false;
	}
	//---------------------------------------------------------------
}
