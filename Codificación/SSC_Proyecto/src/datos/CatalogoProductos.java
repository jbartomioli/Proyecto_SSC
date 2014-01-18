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
		this.obtenerProductos();
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
	//   //
	/////////////////////////////////////////////////////////////////
	//FALTA
	public Collection<datos.Producto> obtenerProductos()
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Productos");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.Producto productoDatos = new datos.Producto();
	           
	        	entidades.Productos entProducto = (entidades.Productos) it.next();  
	           
	        	
	        	productoDatos.setIdProducto(entProducto.getIdProducto());
	        	productoDatos.setCodProducto(entProducto.getCodProducto());
	        	productoDatos.setNombre(entProducto.getNombre());
	        	productoDatos.setExistenciaStock(entProducto.getStock());
	        	
	        	{//seteo de la subcategoria
	        		datos.SubCategoria subCatTemp = new datos.SubCategoria();
	        	
	        		subCatTemp.setDescripcion(entProducto.getSubcategorias().getDescripcion());
	        		subCatTemp.setIdSubcategoria(entProducto.getSubcategorias().getIdSubcategoria());
	        	
	        		productoDatos.setSubcategoria(subCatTemp);
	        	}
	        	
	        	//productoDatos.setPrecios();
				
				productos.add(productoDatos);
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
		
		return productos;
	}
	//---------------------------------------------------------------

}