package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class SubCategoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idSubcategoria;
	private String descripcion;
	private Collection<negocio.Producto> productos;
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
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
	//---------------------------------------------------------------



	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS PRODUCTOS DE UNA SUBCATEGORIA ESPECIFICA  //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerProductos()
	{
		//SE CREA SUBCATEGORIA DE DATOS PARA OBTENER LOS DATOS LA BD
		datos.SubCategoria subcategoriaDatos = new datos.SubCategoria();
		
		//SE RECUPERAN TODOS LOS PRODUCTOS DE LA SUBCATEGORIA
		subcategoriaDatos.obtenerProductos(this.idSubcategoria);
		
		//SE RECORRE CADA ELEMENTO DE LA CONSULTA PARA LUEGO
		//SETEARLOS Y AGREGARLOS AL ARRAY
		for(datos.Producto P: subcategoriaDatos.getProductos())
		{
			//SE CREA OBJETO PRODUCTO DE NEGOCIO PARA SETEARLO
			//Y AGREGARLO AL ARRAY
			negocio.Producto productoNegocio = new negocio.Producto();
			
			//SE SETEAN LOS DATOS DEL PRODUCTO
        	productoNegocio.setCodProducto(P.getCodProducto());
        	productoNegocio.setExistenciaStock(P.getExistenciaStock());
        	productoNegocio.setIdProducto(P.getIdProducto());
        	productoNegocio.setNombre(P.getNombre());		
        	
        	//SE AGREGA EL PRODUCTO AL ARRAY
			this.productos.add(productoNegocio);
		}
		
	}
	//---------------------------------------------------------------
}

