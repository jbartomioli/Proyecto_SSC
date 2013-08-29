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
		this.clientes = new ArrayList<datos.Cliente>();;
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
            List list = query.list();  
            System.out.println("List Size " +list.size());  

            
            for(Iterator it=list.iterator();it.hasNext();)
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
	           	//clienteDatos.setVentas(entCliente.getVentases());
          
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
