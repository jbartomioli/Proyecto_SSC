package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class SubCategoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idSubcategoria;
	private String descripcion;
	private datos.Categoria categoria;
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.descripcion = "";
		this.categoria = new datos.Categoria();
		this.productos = new ArrayList<datos.Producto>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(int idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public datos.Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(datos.Categoria categoria) {
		this.categoria = categoria;
	}

	public Collection<datos.Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<datos.Producto> productos) {
		this.productos = productos;
	}
	//---------------------------------------------------------------


	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 			   //
	/////////////////////////////////////////////////////////////////
	public void obtenerProductos(int idSubcategoria) 
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Productos p where p.subcategorias.idSubcategoria = :idSC");
            query.setParameter("idSC", idSubcategoria);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	datos.Producto productoDatos = new datos.Producto();
            	
            	entidades.Productos entProducto = (entidades.Productos) it.next();
            	
            	//seteos
            	productoDatos.setCodProducto(entProducto.getCodProducto());
            	productoDatos.setExistenciaStock(entProducto.getStock());
            	productoDatos.setIdProducto(entProducto.getIdProducto());
            	productoDatos.setNombre(entProducto.getNombre());

            	this.productos.add(productoDatos);
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

}
