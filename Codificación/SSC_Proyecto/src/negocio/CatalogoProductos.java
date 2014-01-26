package negocio;

import java.util.ArrayList;
import java.util.Collection;



public class CatalogoProductos 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection <negocio.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<negocio.Producto>();
		this.obtenerProductos();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Producto> getProductos() 
	{
		return productos;
	}

	public void setProductos(Collection<negocio.Producto> productos) 
	{
		this.productos = productos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// Setea los productos y sus datos en el array del catalogo    //
	/////////////////////////////////////////////////////////////////
	//AL FINAL CONSIDERE USAR EL ESQUEMA DEL HISTORICO DE PRECIOS
	//YA QUE EN SI ES MAS FACIL OBTENER LOS DATOS
	//HIBERNATE RECUPERA UN ARRAY DE PRECIOS PARA EL CADA PRODUCTO
	//JAVI
	public void obtenerProductos()
	{
		//SE CREA INSTANCIA DEL CATALOGO DE DATOS
		datos.CatalogoProductos ctgDatos = new datos.CatalogoProductos();				
			
        //SE RECORRE CADA PRODUCTO DEL CATALOGO DE DATOS
		for(datos.Producto productoDato: ctgDatos.getProductos())
        {  
        	//SE CREA PRODUCTO TEMPORAL DE NEGOCIO PARA SETEOS
        	negocio.Producto productoNegocio = new negocio.Producto();
                            	
        	//SETEOS DE DATOS DEL PRODUCTO
        	productoNegocio.setIdProducto(productoDato.getIdProducto());
        	productoNegocio.setCodProducto(productoDato.getCodProducto());
        	productoNegocio.setNombre(productoDato.getNombre());
        	productoNegocio.setExistenciaStock(productoDato.getExistenciaStock());
        	
        	{//SETEO DE LA SUBCATEGORIA DEL PRODUCTO
        		
        		//SE CREA SUBCATEGORIA TEMPORAL DE DATOS PARA SETEOS
        		negocio.SubCategoria subCatTemp = new negocio.SubCategoria();
        	
        		//SE CREA SUBCATEGORIA DE DATOS PARA OBTENER DATOS
        		datos.SubCategoria subcatDato = new datos.SubCategoria();
        		
        		//SE RECUPERA INFORMACION DE LA SUBCATEGORIA
        		subcatDato = productoDato.getSubcategoria();
        		
        		//SE SETEAN DATOS DE LA SUBCATEGORIA
        		subCatTemp.setDescripcion(subcatDato.getDescripcion());
        		subCatTemp.setIdSubcategoria(subcatDato.getIdSubcategoria());
        	
        		//SE SETEA LA SUBCATEGORIA EN EL PRODUCTO
        		productoNegocio.setSubCategoria(subCatTemp);
        	}
        	
        	{//SETEO DE LOS PRECIOS DEL PRODUCTO
        		
        		//ARRAY TEMPORAL DE PRECIOS
        		Collection<negocio.Precio> preciosArrTemp = new ArrayList<negocio.Precio>();
        		
        		//SE OBTIENE CADA PRECIO DEL PRODUCTO
        		for(datos.Precio precioDato : productoDato.getPrecios())
        		{	
        			//PRECIO TEMPORAL PARA SETEO DE DATOS
        			negocio.Precio precioProducto = new negocio.Precio();
        			
        			//SETEO DE DATOS DE PRECIO
        			precioProducto.setIdPrecio(precioDato.getIdPrecio());
        			precioProducto.setFechaDesde(precioDato.getFechaDesde());
        			precioProducto.setFechaHasta(precioDato.getFechaHasta());
        			precioProducto.setPrecio(precioDato.getPrecio());
        			precioProducto.setPrecioPromocional(precioDato.getPrecioPromocional());
        			
        			//SE AGREGA EL PRECIO AL ARRAY TEMPORAL
        			preciosArrTemp.add(precioProducto);
        		}
        		
        		//SE SETEAN LOS PRECIOS EN EL PRODUCTO
        		productoNegocio.setPrecios(preciosArrTemp);
        	}
        				
        	//SE AGREGA EL PRODUCTO SETEADO EN EL ARRAY DEL CATALOGO
			productos.add(productoNegocio);
        }
	}
	//---------------------------------------------------------------
	
	
	
	
	/////////////////////////////////////////////////////////////////
	//Busca producto por id										   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Producto buscarProducto(int idProducto)
	{
		for(negocio.Producto P: this.getProductos())
		{
			if(P.getIdProducto() == idProducto)
				return P;
		}
		return null;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	// Busca producto por descripcion parcial 					   //
	/////////////////////////////////////////////////////////////////
	//VER TEMA DESCRIPCION PARCIAL
	public negocio.Producto buscarProducto(String descParcial)
	{
		for(negocio.Producto P: this.getProductos())
		{
			if(P.getNombre().equals(descParcial))
				return P;
		}
		return null;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//Actualiza la cantidad de productos en stock				   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void actualizarStock(negocio.Producto productoParametro, int cantidad)
	{
		for(negocio.Producto productoActual: this.productos)
		{
			if (productoActual.getIdProducto() == productoParametro.getIdProducto())
			{
				int stock = 0;
				int nuevoStock = 0;
				
				//SE OBTIENE EL STOCK ACTUAL
				stock = productoActual.getExistenciaStock();
				
				//SE CALCULA EL NUEVO STOCK
				nuevoStock = stock - cantidad;
				
				//SE ACTUALIZA EL STOCK EN MEMORIA
				productoActual.setExistenciaStock(nuevoStock);
				
				//SE CREA OBJETO CATALOGO PRODUCTOS DE DATOS PARA ACTUALIZAR STOCK EN BD
				datos.CatalogoProductos ctgProductoDatos = new datos.CatalogoProductos();
				
				//SE CREA OBJETO PRODUCTO DE DATOS PARA SETEO DE DATOS
				datos.Producto productoDatos = new datos.Producto();
				
				//SE SETEAN DATOS NECESARIOS
				productoDatos.setIdProducto(productoActual.getIdProducto());
				productoDatos.setExistenciaStock(nuevoStock);
				
				//SE ACTUALIZA STOCK EN BD
				ctgProductoDatos.actualizarStock(productoDatos);				
			}
		}
	}
	//---------------------------------------------------------------


	/////////////////////////////////////////////////////////////////
	//Actualizar precio promocional de un producto				   //
	/////////////////////////////////////////////////////////////////
	//VA EN EL CATALOGO???
	public void actualizarPrecioPromProducto(negocio.Producto productoModificar,float nuevoPrecio)
	{
		for(negocio.Producto P : this.productos)
		{
			if(P.getIdProducto()==productoModificar.getIdProducto())
				P.setPrecioPromocional(nuevoPrecio);
		}
	}
	//---------------------------------------------------------------

}