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
	private int idCategoria;
	private String descripcion;
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.idCategoria = 0;
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

	public int getIdcategoria() 
	{
		return idCategoria;
	}

	public void setIdcategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
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
	public void obtenerProductos(int idSubcategoria, int idCategoria) 
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("select sc.productoses from Subcategorias sc "
            		+ "where sc.id.idSubcategoria = :idSC"
            		+ " and sc.id.idCategoria = :idC");
            query.setParameter("idSC", idSubcategoria);
            query.setParameter("idC", idCategoria);
            
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
            	productoDatos.setNombre(utilidades.Utilidades.utf8_decode(entProducto.getNombre()));
            
            	//SE CREA ARRAY DE PRECIOS DE DATOS PARA AGREGAR CADA PRECIO
            	//Collection<datos.Precio> preciosProductoDatos = new ArrayList<datos.Precio>();

            	//SE RECORRE CADA PRECIO
            	/*for(entidades.Precios entPreciosProducto : entProducto.getPrecioses())
            	{
            		//SE CREA OBJETO PRECIO DE DATOS PARA SETEOS
            		datos.Precio precioDatos = new datos.Precio();
            		
            		//SE SETEAN LOS DATOS
            		precioDatos.setFechaDesde(entPreciosProducto.getFechaDesde());
            		precioDatos.setFechaHasta(entPreciosProducto.getFechaHasta());
            		precioDatos.setIdPrecio(entPreciosProducto.getId().getIdPrecio());
            		precioDatos.setPrecio(entPreciosProducto.getPrecio());
            		precioDatos.setPrecioPromocional(entPreciosProducto.getPrecioPromocional());
            		
            		//SE AGREGA EL PRECIO EN EL ARRAY
            		preciosProductoDatos.add(precioDatos);
            	}
            	
            	//SE SETEAN LOS PRECIOS EN EL PRODUCTO
            	productoDatos.setPrecios(preciosProductoDatos);*/
            	
            	datos.Precio precioDatos = new datos.Precio();
        		entidades.Precios entPreciosProducto = new entidades.Precios();
        		
        		//SE SETEAN LOS DATOS
        		precioDatos.setFechaDesde(entPreciosProducto.getFechaDesde());
        		precioDatos.setFechaHasta(entPreciosProducto.getFechaHasta());
        		precioDatos.setIdPrecio(entPreciosProducto.getId().getIdPrecio());
        		precioDatos.setPrecio(entPreciosProducto.getPrecio());
        		precioDatos.setPrecioPromocional(entPreciosProducto.getPrecioPromocional());
        		
        		//SE SETEAN LOS PRECIOS EN EL PRODUCTO
        		productoDatos.setPrecios(precioDatos);
            	
            	
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
