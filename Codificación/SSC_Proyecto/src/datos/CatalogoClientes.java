package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class CatalogoClientes 
{
	//ATRIBUTOS
	private Collection<datos.Cliente> clientes;
	
	
	//CONSTRUCTOR
	public CatalogoClientes() 
	{
		this.clientes = new ArrayList<datos.Cliente>();
		this.obtenerClientes();
	}


	//GETTER & SETTER
	public Collection<datos.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<datos.Cliente> clientes) 
	{
		this.clientes = clientes;
	}
	
	
	
	
	
	//METODOS
	//-------------------------------------------------------------
	public void obtenerClientes()
	{
		Session session = null;	
		//List result = null;
		

		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Clientes");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.Cliente clienteDatos = new datos.Cliente();
	           
	        	entidades.Clientes entCliente = (entidades.Clientes) it.next();  
	           
	           	clienteDatos.setApellido(entCliente.getApellido()); 
	           	clienteDatos.setNombre(entCliente.getNombre());
	           	clienteDatos.setDireccion(entCliente.getDireccion());
	           	clienteDatos.setEmail(entCliente.getEmail());
	           	clienteDatos.setEspecialidad(entCliente.getEspecialidad());
	           	clienteDatos.setIdCliente(entCliente.getIdCliente());
	           	clienteDatos.setNombre(entCliente.getNombre());
	           	clienteDatos.setTelefono(entCliente.getTelefono());
	           	
	           	Collection<datos.Venta> ventas = new ArrayList<datos.Venta>();
	           	
	           	for(entidades.Ventas V: entCliente.getVentases())
	           	{
	           		datos.Venta venta = new datos.Venta();
	           		
	           		venta.setFechaVenta(V.getFecha());
	           		
	           		Collection<datos.LineaDeVenta> lineas = new ArrayList<datos.LineaDeVenta>();
	           		
	           		for(entidades.LineasDeVentas LDV: V.getLineasDeVentases())
	           		{
	           			datos.LineaDeVenta linea = new datos.LineaDeVenta();
	           			
	           			linea.setCantidad(LDV.getCantidad());
	           			
	           			datos.Producto producto = new datos.Producto();
	           			
	           			producto.setCodProducto(LDV.getProductos().getCodProducto());
	           			producto.setExistenciaStock(LDV.getProductos().getStock());
	           			producto.setNombre(LDV.getProductos().getNombre());
	           			//producto.setPrecios(LDV.getProductos().getPrecioses());
	           			
	           			linea.setProductoLinea(producto);
	           			
	           			//linea.setSubTotal(LDV.getSubtotal());
	           			
	           			lineas.add(linea);
	           			
	           		}
	           		
	           		venta.setLineas(lineas);
	           		//venta.setTotal(V.getTotal());
	           		ventas.add(venta);
	           	}
	           	clienteDatos.setVentas(ventas);	           	

	           	clientes.add(clienteDatos);
            }

	        session.getTransaction().commit();
		}
		 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		 
		finally
		{
		 	session.close();
		}	
	}
}
