package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

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
	private Collection<datos.Venta> ventas;
	private Collection<datos.Pedido> pedidos;
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
		this.ventas = new ArrayList<datos.Venta>();
		this.pedidos = new ArrayList<datos.Pedido>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(boolean tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Collection<datos.Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Collection<datos.Venta> ventas) {
		this.ventas = ventas;
	}
	
	public Collection<datos.Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Collection<datos.Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE LA VENTAS HECHAS A UN CLIENTE DESDE LA BD		   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerVentas(int idCliente) throws Exception
	{
		Session session = null;	
			
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("select c.ventases from Clientes c where c.idCliente = :idC");
            query.setParameter("idC", idCliente);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA A LA BD
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO VENTA DE DATOS PARA SETEARLO Y AGREGARLO AL ARRAY
	        	datos.Venta ventaDatos = new datos.Venta();
	           
	        	//SE CREA OBJETO VENTA DE ENTIDADES PARA RECUPERAR DATOS 
	        	//DE LA BD Y SETEAR EL OBJETO DE VENTA DATOS
	        	entidades.Ventas entVenta = (entidades.Ventas) it.next();  
	           
	        	//SE SETEA EL OBJETO VENTA DE DATOS
	        	ventaDatos.setIdVenta(entVenta.getIdVenta());
	        	ventaDatos.setFechaVenta(entVenta.getFecha()); 
	        	ventaDatos.setTotal(entVenta.getTotal());
	        	
	        	//SE AGREGA LA VENTA AL ARRAY
	           	this.ventas.add(ventaDatos);
            }

	        session.getTransaction().commit();
		}
		finally
		{
		 	session.close();
		}	
	}
	//---------------------------------------------------------------
	
	
	
	
	
	
	
	public void obtenerPedidos(int idCliente) throws Exception
	{
		Session session = null;	
			
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("select c.pedidoses from Clientes c where c.idCliente = :idC");
            query.setParameter("idC", idCliente);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA A LA BD
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO VENTA DE DATOS PARA SETEARLO Y AGREGARLO AL ARRAY
	        	datos.Pedido pedidoDatos = new datos.Pedido();
	           
	        	//SE CREA OBJETO VENTA DE ENTIDADES PARA RECUPERAR DATOS 
	        	//DE LA BD Y SETEAR EL OBJETO DE VENTA DATOS
	        	entidades.Pedidos entPedido = (entidades.Pedidos) it.next();  
	           
	        	//SE SETEA EL OBJETO VENTA DE DATOS
	        	pedidoDatos.setIdPedido(entPedido.getIdPedido());
	        	pedidoDatos.setFecha(entPedido.getFecha()); 
	        	//pedidoDatos.setTotal(entPedido.getTotal());
	        	
	        	//SE AGREGA LA VENTA AL ARRAY
	           	this.pedidos.add(pedidoDatos);
            }

	        session.getTransaction().commit();
		}
		finally
		{
		 	session.close();
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
