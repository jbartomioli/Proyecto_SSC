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
	// OBTIENE TODAS LAS VENTAS EFECTUADAS A UN CLIENTE ESPECIFICO  //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerVentas()
	{
		//SE CREA OBJETO CLIENTE DE DATOS PARA RECUPERAR
		//VENTAS DE LA BD
		datos.Cliente clienteDato = new datos.Cliente();
		
		//SE RECUPERAN LAS VENTAS DE LA BD
		clienteDato.obtenerVentas(this.getIdCliente());
		
		//SI EL OBJETO CLIENTE DE NEGOCIO YA TIENE SUS VENTAS
		//CARGADAS SE LAS VUELVE A SETEAR CON EL FIN DE MANTENER
		//ACTUALIZADO EL ARRAY AL MOMENTO DE LLAMAR ESTE METODO
		if(this.ventas != null)
		{
			//SE RECORRE CADA VENTA DE LA BD
			for(datos.Venta ventaDato: clienteDato.getVentas())
			{
				//SE CREA OBJETO VENTA DE NEGOCIO PARA SETEARLO Y DESPUES
				//AGREGARLO AL ARRAY
				negocio.Venta ventaNegocio = new negocio.Venta();
				
				//SE SETEAN LOS DATOS DE LA VENTA
				ventaNegocio.setIdVenta(ventaDato.getIdVenta());
				ventaNegocio.setFechaVenta(ventaDato.getFechaVenta());
				ventaNegocio.setTotal(ventaDato.getTotal());
				
				//SE AGREGA LA VENTA AL ARRAY
				this.ventas.add(ventaNegocio);
			}
		}
		
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// VERIFICA SI EL CLIENTE COMPRO O NO UN PRODUCTO			   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean comproProducto(negocio.Producto productoActual)
	{
		//SE RECORRE CADA VENTA DEL CLIENTE
		for(negocio.Venta ventaNegocio: this.ventas)
		{
			//SE RECUPERAN LAS LINEAS DE VENTA DE LA VENTA ACTUAL
			ventaNegocio.obtenerLineasDeVenta();
			
			//SI EL CLIENTE COMPRO EL PRODUCTO DEVUELVE VERDADERO
			//Y CORTA LA ITERACION
			if (ventaNegocio.comproProducto(productoActual))
				return true;
		}
		//EN CASO DE QUE EL CLIENTE NO HAYA COMPRADO EL PRODUCTO DEVUELVE FALSO
		return false;
	}
	//---------------------------------------------------------------
	
	
	///////////////////////////////////////////////////
	// OBTIENE IMPORTE TOTAL DE VENTAS DEL CLIENTE  //
	//////////////////////////////////////////////////
	//LISTO
	public double obtenerTotalVentas()
	{
		double totalVentas = 0;
		for(negocio.Venta ventaNegocio: this.ventas)
		{
			totalVentas = totalVentas + ventaNegocio.getTotal();
		}
		
		return totalVentas;
	}
}
