package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class CatalogoClientes 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<datos.Cliente> clientes;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoClientes() 
	{
		this.clientes = new ArrayList<datos.Cliente>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.Cliente> getClientes() 
	{
		return clientes;
	}

	public void setClientes(Collection<datos.Cliente> clientes) 
	{
		this.clientes = clientes;
	}
	//---------------------------------------------------------------

	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS CLIENTES								   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerClientes() throws Exception
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Clientes");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE OBTIENEN LOS DATOS DE CADA CLIENTE A PARTIR DE LA
            //CONSULTA ANTERIOR
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA UN OBJETO CLIENTE DE DATOS PARA SETEAR Y AGREGAR
            	//AL ARRAY
	        	datos.Cliente clienteDatos = new datos.Cliente();
	           
	        	//SE CREA UN OBJETO CLIENTE ENTIDADES PARA OBTENER
	        	//LOS DATOS DEL CLIENTE DE LA CONSULTA A LA BD
	        	entidades.Clientes entCliente = (entidades.Clientes) it.next();  
	           
	        	//SE SETEAN LOS DATOS DEL CLIENTE
	           	clienteDatos.setApellido(utilidades.Utilidades.utf8_decode(entCliente.getApellido())); 
	           	clienteDatos.setNombre(utilidades.Utilidades.utf8_decode(entCliente.getNombre()));
	           	clienteDatos.setDireccion(utilidades.Utilidades.utf8_decode(entCliente.getDireccion()));
	           	clienteDatos.setEmail(utilidades.Utilidades.utf8_decode(entCliente.getEmail()));
	           	clienteDatos.setEspecialidad(utilidades.Utilidades.utf8_decode(entCliente.getEspecialidad()));
	           	clienteDatos.setIdCliente(entCliente.getIdCliente());
	           	clienteDatos.setTelefono(entCliente.getTelefono());
	           	clienteDatos.setTipoCliente(entCliente.getTipo());
	           	
	           	//SE AGREGA EL CLIENTE EN EL ARRAY
	           	clientes.add(clienteDatos);
            }

            //SE CONFIRMA LA TRANSACCION
	        session.getTransaction().commit();
		} 
		finally
		{
		 	session.close();
		}	
	}
}
