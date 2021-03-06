package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class CatalogoProductos 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection <datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<datos.Producto>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}

	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS PRODUCTOS Y SU SUBCATEGORIA Y PRECIOS     //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<datos.Producto> obtenerProductos() throws Exception
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Productos");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
          
            //SE RECORRE CADA PRODUCTO DE LA CONSULTA
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA PRODUCTO TEMPORAL DE DATOS PARA SETEOS
	        	datos.Producto productoDatos = new datos.Producto();
	           
	        	//SE CREA PRODUCTO TEMPORAL DE ENTIDADES PARA OBTENER DATOS
	        	entidades.Productos entProducto = (entidades.Productos) it.next();  
	                   	
	        	//SETEOS DE DATOS DEL PRODUCTO
	        	productoDatos.setIdProducto(entProducto.getIdProducto());
	        	productoDatos.setCodProducto(entProducto.getCodProducto());
	        	productoDatos.setNombre(entProducto.getNombre());
	        	productoDatos.setExistenciaStock(entProducto.getStock());
	        	
	        	{//SETEO DE LA SUBCATEGORIA DEL PRODUCTO
	        		
	        		//SE CREA SUBCATEGORIA TEMPORAL DE DATOS PARA SETEOS
	        		datos.SubCategoria subCatTemp = new datos.SubCategoria();
	        	
	        		//SE CREA SUBCATEGORIA DE ENTIDADES PARA OBTENER DATOS
	        		entidades.Subcategorias entSubcat = new entidades.Subcategorias();
	        		
	        		//SE RECUPERA INFORMACION DE LA SUBCATEGORIA
	        		entSubcat = entProducto.getSubcategorias();
	        		
	        		//SE SETEAN DATOS DE LA SUBCATEGORIA
	        		subCatTemp.setDescripcion(utilidades.Utilidades.utf8_decode(entSubcat.getDescripcion()));
	        		subCatTemp.setIdcategoria(entSubcat.getId().getIdCategoria());
	        		subCatTemp.setIdSubcategoria(entSubcat.getId().getIdSubcategoria());
	        	
	        		//SE SETEA LA SUBCATEGORIA EN EL PRODUCTO
	        		productoDatos.setSubcategoria(subCatTemp);
	        	}
	        	
	        	{//SETEO DE LOS PRECIOS DEL PRODUCTO
	        		
	        		//ARRAY TEMPORAL DE PRECIOS
	        		Collection<datos.Precio> preciosArrTemp = new ArrayList<datos.Precio>();
	        		
	        		//SE OBTIENE CADA PRECIO DEL PRODUCTO
	        		for(entidades.Precios entPrecio: entProducto.getPrecioses())
	        		{	
	        			//PRECIO TEMPORAL PARA SETEO DE DATOS
	        			datos.Precio precioDato = new datos.Precio();
	        			
	        			//SETEO DE DATOS DE PRECIO
	        			precioDato.setIdPrecio(entPrecio.getId().getIdPrecio());
	        			precioDato.setFechaDesde(entPrecio.getFechaDesde());
	        			precioDato.setFechaHasta(entPrecio.getFechaHasta());
	        			precioDato.setPrecio(entPrecio.getPrecio());
	        			precioDato.setPrecioPromocional(entPrecio.getPrecioPromocional());
	        			
	        			
	        			//SE AGREGA EL PRECIO AL ARRAY TEMPORAL
	        			preciosArrTemp.add(precioDato);
	        		}
	        		
	        		//SE SETEAN LOS PRECIOS EN EL PRODUCTO
	        		productoDatos.setPrecios(preciosArrTemp);
	        		
	        		//PRECIO TEMPORAL PARA SETEO DE DATOS
        			/*datos.Precio precioDato = new datos.Precio();
	        		entidades.Precios entPrecio = new entidades.Precios();
	        		
	        		//SETEO DE DATOS DE PRECIO
        			precioDato.setIdPrecio(entPrecio.getId().getIdPrecio());
        			precioDato.setFechaDesde(entPrecio.getFechaDesde());
        			precioDato.setFechaHasta(entPrecio.getFechaHasta());
        			precioDato.setPrecio(entPrecio.getPrecio());
        			precioDato.setPrecioPromocional(entPrecio.getPrecioPromocional());
        			
        			//SE SETEAN LOS PRECIOS EN EL PRODUCTO
	        		productoDatos.setPrecios(precioDato);*/
	        	}
	        				
	        	//SE AGREGA EL PRODUCTO SETEADO EN EL ARRAY DEL CATALOGO
				productos.add(productoDatos);
			}			
        session.getTransaction().commit();
	}
	finally
	{
	 	session.close();
	}	
		
		return productos;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// ACTUALIZA LA CANTIDAD DE PRODUCTOS EN STOCK				   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void actualizarStock(datos.Producto prodActualizarStock) throws Exception
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		    
		    //SE CREA OBJETO PRODUCTO DE ENTIDADES PARA SETEO DE DATOS
		    entidades.Productos entProducto = new entidades.Productos();	         

		    //SE BUSCA EL PRODUCTO A ACTUALIZAR
		    entProducto = (entidades.Productos) 
		    		session.get(entidades.Productos.class, prodActualizarStock.getIdProducto()); 
		    
		    //SE SETEA EL NUEVO STOCK
		    entProducto.setStock(prodActualizarStock.getExistenciaStock());
		   
		    //SE ACTUALIZA EL PRODUCTO EN BD
			session.update(entProducto); 
		    
			//SE CONFIRMA TRANSACCION
			session.getTransaction().commit();
		   
		} 
		finally
		{
		 	session.close();
		}	
	}
}