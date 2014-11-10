package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	//LISTO
	public void obtenerPedidos() throws Exception
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
	public void agregarPedido(datos.Pedido pedidoDatos) throws Exception
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
		   
			{//SETEO DEL CLIENTE
				
				//SE CREA UN CLIENTE DE DATOS PARA SETEOS DE
				//DE LOS DATOS NECESARIOS
				entidades.Clientes entCliente = new entidades.Clientes();
				
				//SE SETEAN LOS DATOS
				entCliente.setIdCliente(pedidoDatos.getCliente().getIdCliente());
			}
			
			{//SETEO DE LAS LINEAS DEL PEDIDO
				//SE CREA UN ARRAY DE LINEAS DE PEDIDO 
				//PARA SETEAR EL ARRAY 
				Collection<entidades.LineaDePedido> arrayEntLineas = new ArrayList<entidades.LineaDePedido>();
				
				//SE RECORRE CADA LINEA DE PEDIDO
				for(datos.LineaDePedido lineaDatos : pedidoDatos.getLineas())
				{
					//SE CREA UN OBJETO LINEA PARA DESPUES AGREGARLO 
					//AL ARRAY
					entidades.LineaDePedido entLineaDePedido = new entidades.LineaDePedido();
					
					//SE SETEAN LOS DATOS
					entLineaDePedido.setCantidad(lineaDatos.getCantidadPedida());
					
					//SE CREA UN PRODUCTO PARA SETEO
					entidades.Productos entProducto = new entidades.Productos();
					entProducto.setIdProducto(lineaDatos.getProducto().getIdProducto());
					
					entLineaDePedido.setProductos(entProducto);				
					//entLineaDePedido.setSubTotal();
					
					//SE AGREGA LA LINEA SETEDA AL ARRAY
					arrayEntLineas.add(entLineaDePedido);
				}
				
				//SE SETEA EL ARRAY DE LINEAS EN EL PEDIDO
				entPedido.setLineaDePedidos((Set<entidades.LineaDePedido>) arrayEntLineas);
			}
	         
		    //SE GUARDA EN BD - INSERT
	        session.save(entPedido);
	        
	        //SE CONFIRMA LA TRANSACCION
	        session.getTransaction().commit();
		   
		}
		finally
		{
		 	session.close();
		}	
	}
	//---------------------------------------------------------------
}
