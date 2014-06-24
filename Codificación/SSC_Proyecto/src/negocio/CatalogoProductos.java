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
	//LISTO
	public void obtenerProductos() throws Exception
	{
		//SE CREA INSTANCIA DEL CATALOGO DE DATOS
		datos.CatalogoProductos ctgDatos = new datos.CatalogoProductos();		
		
		ctgDatos.obtenerProductos();
			
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
        		
        		//PRECIO TEMPORAL PARA SETEO DE DATOS
    			/*negocio.Precio precioProducto = new negocio.Precio();
    			datos.Precio prodDato = new datos.Precio();
    			
    			prodDato = productoDato.getPrecios();
    			
    			//SETEO DE DATOS DE PRECIO
    			precioProducto.setIdPrecio(prodDato.getIdPrecio());
    			precioProducto.setFechaDesde(prodDato.getFechaDesde());
    			precioProducto.setFechaHasta(prodDato.getFechaHasta());
    			precioProducto.setPrecio(prodDato.getPrecio());
    			precioProducto.setPrecioPromocional(prodDato.getPrecioPromocional());
        		
        		//SE SETEAN LOS PRECIOS EN EL PRODUCTO
        		//productoNegocio.setPrecios(preciosArrTemp);
    			productoNegocio.setPrecios(precioProducto);*/
        	}
        				
        	//SE AGREGA EL PRODUCTO SETEADO EN EL ARRAY DEL CATALOGO
			productos.add(productoNegocio);
        }
	}
	//---------------------------------------------------------------
	
	
	
	
	/////////////////////////////////////////////////////////////////
	// BUSCA UN PRODUCTO POR SU ID								   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Producto buscarProducto(int idProducto)
	{
		//SE RECORRE CADA PRODUCTO DEL ARRAY
		for(negocio.Producto productoNegocio : this.getProductos())
		{
			//SE COMPARA POR EL ID INGRESADO
			//SI LOS ID SON IGUALES SE DEVUELVE EL PRODUCTO
			if(productoNegocio.getIdProducto() == idProducto)
				return productoNegocio;
		}
		//EN CASO DE NO ENCONTRAR EL PRODUCTO DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	// BUSCA UN PRODUCTO POR SU DESCRIPCION PARCIAL				   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Producto> buscarProducto(String descParcial)
	{
		//SE CREA COLECCION DE PRODUCTOS PARA AGREGAR LOS QUE TIENEN LA MISMA DESCRIPCION PARCIAL
		Collection<negocio.Producto> productosSimilares = new ArrayList<negocio.Producto>();
		
		//SE RECORRE CADA PRODUCTO DEL ARRAY
		for(negocio.Producto productoNegocio: this.getProductos())
		{
			//SE EVALUA SI EL NOMBRE DEL PRODUCTO CONTIENE LA CADENA
			if(productoNegocio.getNombre().toUpperCase().contains(descParcial.toUpperCase()))
				productosSimilares.add(productoNegocio);
		}
		//SE DEVUELVE EL ARRAY
		return productosSimilares;
	}
	//---------------------------------------------------------------
	
	public negocio.Producto obtenerProducto(String nombreProducto)
	{		
		//SE RECORRE CADA PRODUCTO DEL ARRAY
		for(negocio.Producto productoNegocio: this.getProductos())
		{
			//SE EVALUA SI EL NOMBRE DEL PRODUCTO CONTIENE LA CADENA
			if(productoNegocio.getNombre().contains(nombreProducto))
				return productoNegocio;	
		}
		return null;
	}

	
	/////////////////////////////////////////////////////////////////
	// ACTUALIZA LA CANTIDAD DE PRODUCTOS EN STOCK				   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void actualizarStock(negocio.Producto productoParametro, int cantidad)
	{
		//SE RECORRE CADA PRODUCTO
		for(negocio.Producto productoActual: this.productos)
		{
			//COMPARA EL PRODUCTO INGRESADO PARA MODIFICAR STOCK
			//CON EL PRODUCTO ACTUAL DEL ARRAY
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
	// ACTUALIZA EL PRECIO PROMOCIONAL MODIFICADO EN EL ARRAY PROD.//
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void actualizarPrecioPromProducto(negocio.Producto productoModificar,float nuevoPrecio)
	{
		//SE RECORRE CADA PRODUCTO DEL ARRAY
		for(negocio.Producto productoNegocio : this.productos)
		{
			//SE COMPARAN LOS PRODUCTOS POR SU ID
			//SI SON IGUALES DE ACTUALIZA EL PRECIO DEL PRODUCTO EN EL ARRAY
			if(productoNegocio.getIdProducto()==productoModificar.getIdProducto())
			{
				//SE SETEA EL PRECIO EN EL PRODUCTO ACTUAL
				productoNegocio.setPrecioPromocional(nuevoPrecio);
				
				//SE CREA OBJETO PRODUCTO DE DATOS PARA SETEO DE DATOS
				datos.Producto productoModifDatos = new datos.Producto();
				
				//SE SETEAN LOS DATOS NECESARIOS
				productoModifDatos.setIdProducto(productoNegocio.getIdProducto());
				
				{//SE CREA OBJETO PRECIO DE DATOS PARA SETEARLO EN EL PRODUCTO
					datos.Precio precioDatos = new datos.Precio();
					
					//SE SETEAN LOS DATOS NECESARIOS DEL PRECIO
					precioDatos.setPrecioPromocional(productoNegocio.getPrecioVigente().getPrecioPromocional());
					precioDatos.setIdPrecio(productoNegocio.getPrecioVigente().getIdPrecio());
					
					//SE GUARDA EN BD LA MODIFICACION DEL PRECIO DEL PRODUCTO
					productoModifDatos.setPrecioPromocional(precioDatos);
				}
			}
		}
	}
	//---------------------------------------------------------------

}