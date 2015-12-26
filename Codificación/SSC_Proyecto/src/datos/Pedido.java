package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class Pedido 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idPedido;
	private float total;
	private datos.Cliente cliente;
	private Date fecha;
	private Collection<datos.LineaDePedido> lineasDePedido;
	private String estado;
	private String codPedido;
	//---------------------------------------------------------------
	


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Pedido() 
	{
		this.idPedido = 0;
		this.total = 0;
		this.cliente = new datos.Cliente();
		this.fecha = new Date();
		this.lineasDePedido = new ArrayList<datos.LineaDePedido>();
		this.estado = "";
		this.codPedido = "";
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdPedido()
	{
		return idPedido;
	}

	public void setIdPedido(int idPedido) 
	{
		this.idPedido = idPedido;
	}

	public float getTotal() 
	{
		return total;
	}

	public void setTotal(float total) 
	{
		this.total = total;
	}

	public datos.Cliente getCliente() 
	{
		return cliente;
	}

	public void setCliente(datos.Cliente cliente) 
	{
		this.cliente = cliente;
	}

	public Date getFecha() 
	{
		return fecha;
	}

	public void setFecha(Date fecha) 
	{
		this.fecha = fecha;
	}

	public Collection<datos.LineaDePedido> getLineas() 
	{
		return lineasDePedido;
	}

	public void setLineas(Collection<datos.LineaDePedido> lineas) 
	{
		this.lineasDePedido = lineas;
	}

	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	
	public String getCodPedido() 
	{
		return codPedido;
	}

	public void setCodPedido(String codPedido) 
	{
		this.codPedido = codPedido;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
//	public void agregarProducto(datos.Producto producto, int cantidad)
//	{
//		
//	}
//	//---------------------------------------------------------------
//	
//	public datos.LineaDePedido buscarLinea(datos.LineaDePedido linea)
//	{
//		datos.LineaDePedido linea1 = new datos.LineaDePedido();
//		
//		return linea1;
//	}
//	
//	public boolean buscarLinea(int idProductoViejo)
//	{
//		boolean flag = false;
//		
//		return flag;
//	}
	
	
	
	public void obtenerLineasDePedido(int idPedido) throws Exception
	{
		Session session = null;	
			
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Pedidos p where p.idPedido = :idP");
            query.setParameter("idP", idPedido);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA A LA BD
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  	           
	        	//SE CREA OBJETO VENTA DE ENTIDADES
	        	entidades.Pedidos entPedido = (entidades.Pedidos) it.next();
	        	
	        	//SE RECORRE CADA LINEA DE LA VENTA ACTUAL
	            for(entidades.LineaDePedido entLinea: entPedido.getLineaDePedidos())
	            {
	            	//SE CREA OBJETO LINEA DE VENTA DE DATOS PARA
	            	//SETEARLE LOS DATOS Y AGREGARLO AL ARRAY
		        	datos.LineaDePedido lineaDatos = new datos.LineaDePedido();
		        	
		        	//SE SETEAN LOS DATOS DE LA LINEA
	            	lineaDatos.setCantidadPedida(entLinea.getCantidad()); 
//	            	lineaDatos.setSubTotal(entLinea.get);
//	            	lineaDatos.setIdVenta(entLinea.getId().getIdVenta());
	        	
	            	{//SETEO DEL PRODUCTO DE LA LINEA
	            		//SE CREA OBJETO PRODUCTO DE ENTIDADES
		            	entidades.Productos entProducto = entLinea.getProductos();
			        	
			        	//SE CREA OBJETO PRODUCTO DE DATOS PARA SETEO
			        	datos.Producto productoDato = new datos.Producto();
			        	
			        	//SE SETEAN DATOS DEL PRODUCTO
			        	productoDato.setCodProducto(entProducto.getCodProducto());
			        	productoDato.setExistenciaStock(entProducto.getStock());
			        	productoDato.setIdProducto(entProducto.getIdProducto());
			        	productoDato.setNombre(entProducto.getNombre());
			        	
			        	//SE SETEA EL PRODUCTO EN LA LINEA
			        	lineaDatos.setProducto(productoDato);
	            	}
	            	
		        	//SE AGREGA LA LINEA EN EL ARRAY
		           	this.lineasDePedido.add(lineaDatos);
	            }
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
