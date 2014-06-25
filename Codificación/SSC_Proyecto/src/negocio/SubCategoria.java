package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class SubCategoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idSubcategoria;
	private int idCategoria;
	private String descripcion;
	private Collection<negocio.Producto> productos;
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.idCategoria = 0; 
		this.descripcion = "";
		this.productos = new ArrayList<negocio.Producto>();
	}
	//---------------------------------------------------------------


	
	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************	
	public int getIdSubcategoria() 
	{
		return idSubcategoria;
	}

	public void setIdSubcategoria(int idSubcategoria) 
	{
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

	public String getDescripcion() 
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}

	public Collection<Producto> getProductos() 
	{
		return productos;
	}

	public void setProductos(Collection<Producto> productos) 
	{
		this.productos = productos;
	}
	
	public String toString()
	{
		return descripcion;
	}
	//---------------------------------------------------------------

	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS PRODUCTOS DE UNA SUBCATEGORIA ESPECIFICA  //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerProductos() throws Exception
	{
		//SE CREA SUBCATEGORIA DE DATOS PARA OBTENER LOS DATOS LA BD
		datos.SubCategoria subcategoriaDatos = new datos.SubCategoria();
		
		
		if(this.getProductos().isEmpty())
		{
			//SE RECUPERAN TODOS LOS PRODUCTOS DE LA SUBCATEGORIA
			subcategoriaDatos.obtenerProductos(this.idSubcategoria, this.idCategoria);
			
			//SE RECORRE CADA ELEMENTO DE LA CONSULTA PARA LUEGO
			//SETEARLOS Y AGREGARLOS AL ARRAY
			for(datos.Producto productoDatos: subcategoriaDatos.getProductos())
			{
				//SE CREA OBJETO PRODUCTO DE NEGOCIO PARA SETEARLO
				//Y AGREGARLO AL ARRAY
				negocio.Producto productoNegocio = new negocio.Producto();
				
				//SE SETEAN LOS DATOS DEL PRODUCTO
	        	productoNegocio.setCodProducto(productoDatos.getCodProducto());
	        	productoNegocio.setExistenciaStock(productoDatos.getExistenciaStock());
	        	productoNegocio.setIdProducto(productoDatos.getIdProducto());
	        	productoNegocio.setNombre(productoDatos.getNombre());	
	        	
	        	//SE CREA ARRAY DE PRECIOS DE NEGOCIO PARA AGREGAR CADA PRECIO
	        	Collection<negocio.Precio> preciosProductoNegocio = new ArrayList<negocio.Precio>();
	        	
	        	//SE RECORRE CADA PRECIO
	        	for(datos.Precio precioProductoDatos : productoDatos.getPrecios())
	        	{
	        		//SE CREA OBJETO PRECIO DE NEGOCIO PARA SETEOS
	        		negocio.Precio precioNegocio = new negocio.Precio();
	        		
	        		//SE SETEAN LOS DATOS
	        		precioNegocio.setFechaDesde(precioProductoDatos.getFechaDesde());
	        		precioNegocio.setFechaHasta(precioProductoDatos.getFechaHasta());
	        		precioNegocio.setIdPrecio(precioProductoDatos.getIdPrecio());
	        		precioNegocio.setPrecio(precioProductoDatos.getPrecio());
	        		precioNegocio.setPrecioPromocional(precioProductoDatos.getPrecioPromocional());
	        		
	        		//SE AGREGA EL PRECIO EN EL ARRAY
	        		preciosProductoNegocio.add(precioNegocio);
	        	}
	        	
	        	//SE SETEAN LOS PRECIOS EN EL PRODUCTO
	        	productoNegocio.setPrecios(preciosProductoNegocio);
	        	
	        	/*negocio.Precio precioNegocio = new negocio.Precio();
        		datos.Precio precioProductoDatos = new datos.Precio();
        		
        		//SE SETEAN LOS DATOS
        		precioNegocio.setFechaDesde(precioProductoDatos.getFechaDesde());
        		precioNegocio.setFechaHasta(precioProductoDatos.getFechaHasta());
        		precioNegocio.setIdPrecio(precioProductoDatos.getIdPrecio());
        		precioNegocio.setPrecio(precioProductoDatos.getPrecio());
        		precioNegocio.setPrecioPromocional(precioProductoDatos.getPrecioPromocional());
	        	
        		//SE SETEAN LOS PRECIOS EN EL PRODUCTO
	        	productoNegocio.setPrecios(precioNegocio);*/
	        	
        		//SE AGREGA EL PRODUCTO AL ARRAY
				this.productos.add(productoNegocio);
			}
		}
		
	}
	//---------------------------------------------------------------
}