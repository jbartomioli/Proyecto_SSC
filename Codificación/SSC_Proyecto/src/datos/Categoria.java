package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class Categoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idCategoria;
	private String descripcion;
	private Collection<datos.SubCategoria> subCategorias;
	//private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCategorias = new ArrayList<datos.SubCategoria>();
		//this.productos = new ArrayList<datos.Producto>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdCategoria() 
	{
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}
	
	public Collection<datos.SubCategoria> getSubCats() 
	{
		return subCategorias;
	}
	
	public void setSubCats(Collection<datos.SubCategoria> subCat) 
	{
		this.subCategorias = subCat;
	}
	
//	public Collection<datos.Producto> getProductos() 
//	{
//		return productos;
//	}
//	
//	public void setProductos(Collection<datos.Producto> productos) 
//	{
//		this.productos = productos;
//	}
	//---------------------------------------------------------------

	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	//   //
	/////////////////////////////////////////////////////////////////
	//
	public void obtenerSubCategorias(int idCategoria) 
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Subcategorias sc where sc.categorias.idCategoria = :idC");
            query.setParameter("idC", idCategoria);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	datos.SubCategoria subcategoriaDatos = new datos.SubCategoria();
            	
            	entidades.Subcategorias entSubcategoria = (entidades.Subcategorias) it.next();
            	
            	subcategoriaDatos.setIdSubcategoria(entSubcategoria.getIdSubcategoria());
            	subcategoriaDatos.setDescripcion(entSubcategoria.getDescripcion());

            	this.subCategorias.add(subcategoriaDatos);
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
