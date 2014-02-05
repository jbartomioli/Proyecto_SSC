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
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.descripcion = "";
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
	// 	OBTIENE LOS PRODUCTOS DE UNA SUBCATEGORIA ESPECIFICA	   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerProductos(int idSubcategoria) 
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("select sc.productoses from Subcategorias sc where sc.id.idSubcategoria = :idSC");
            query.setParameter("idSC", idSubcategoria);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA A LA BD
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO PRODUCTO DE DATOS PARA LUEGO AGREGARLO AL ARRAY
            	datos.Producto productoDatos = new datos.Producto();
            	
            	//SE RECUPERAN DATOS DEL PRODUCTO DE LA BD
            	entidades.Productos entProducto = (entidades.Productos) it.next();
            	
            	//SE SETEA EL PRODUCTO DE DATOS
            	productoDatos.setCodProducto(entProducto.getCodProducto());
            	productoDatos.setExistenciaStock(entProducto.getStock());
            	productoDatos.setIdProducto(entProducto.getIdProducto());
            	productoDatos.setNombre(entProducto.getNombre());
            
            	//SE AGREGA EL PRODUCTO AL ARRAY
            	this.productos.add(productoDatos);
            }
            
            //SE CONFIRMA LA TRANSACCION
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
