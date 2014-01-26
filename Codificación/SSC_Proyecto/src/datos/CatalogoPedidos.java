package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class CatalogoPedidos 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<datos.Pedido> pedidos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoPedidos() 
	{
		this.pedidos = new ArrayList<datos.Pedido>();
		this.obtenerPedidos();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.Pedido> getPedidos() 
	{
		return pedidos;
	}


	public void setPedidos(Collection<datos.Pedido> pedidos) 
	{
		this.pedidos = pedidos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS PEDIDOS DE LA BD						   //
	/////////////////////////////////////////////////////////////////
	public void obtenerPedidos()
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Pedidos");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
          
            //SE RECORRE CADA PEDIDO DE LA CONSULTA
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA PEDIDO TEMPORAL DE DATOS PARA SETEOS
	        	datos.Pedido pedidoDatos = new datos.Pedido();
	           
	        	//SE CREA PEDIDO TEMPORAL DE ENTIDADES PARA OBTENER DATOS
	        	entidades.Pedidos entPedido = (entidades.Pedidos) it.next();  
	                   	
	        	//SETEOS DE DATOS DEL PEDIDO
	        	pedidoDatos.setIdPedido(entPedido.getIdPedido());
	        	pedidoDatos.setFecha(entPedido.getFecha());
	        	pedidoDatos.setTotal(entPedido.getTotal());
	        	pedidoDatos.setEstado(entPedido.getEstado());
	        				
	        	//SE AGREGA EL PEDIDO SETEADO EN EL ARRAY DEL CATALOGO
				pedidos.add(pedidoDatos);
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
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// GUARDA EL NUEVO PEDIDO EN LA BD							   //
	/////////////////////////////////////////////////////////////////
	//FALTA COMPLETAR DATOS
	public void agregarPedido(datos.Pedido pedidoDatos)
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		    
		    //SE CREA PEDIDO DE ENTIDADES PARA SETEO DE DATOS
		    entidades.Pedidos entPedido = new entidades.Pedidos();
		    
		    //SE SETEAN LOS DATOS DEL PEDIDO
		    entPedido.setFecha(pedidoDatos.getFecha());
		    entPedido.setEstado(pedidoDatos.getEstado());
		    entPedido.setTotal(entPedido.getTotal());
		   
		    //FALTAN LAS LINEAS
		    //FALTA EL CLIENTE
	         
		    //SE GUARDA EN BD - INSERT
	        session.save(entPedido);
	        
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
	//---------------------------------------------------------------
}
