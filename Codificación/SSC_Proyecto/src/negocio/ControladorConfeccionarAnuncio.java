package negocio;

import java.util.ArrayList;
import java.util.Collection;


public class ControladorConfeccionarAnuncio 
{
	//ATRIBUTOS
	datos.CatalogoCategorias cctg;
	datos.CatalogoSubCategorias csctg;
	datos.CatalogoProductos cp;
	datos.CatalogoAnuncios ca;
	private Collection<datos.Producto> productos;
	private Collection<datos.SubCategoria> subCats;
	datos.Producto productoActual;
	private Collection<datos.Cliente> arrClientesInteresados;
	private Collection<datos.Producto> arrProductosPublicación;
	datos.Anuncio anuncioActual;
	datos.Producto productoModificar;
	
	
	//CONSTRUCTOR
	public ControladorConfeccionarAnuncio() 
	{
		this.cctg = new datos.CatalogoCategorias();
		this.csctg = new datos.CatalogoSubCategorias();
		this.cp = new datos.CatalogoProductos();
		this.ca = new datos.CatalogoAnuncios();
		this.productos = new ArrayList<datos.Producto>();
		this.subCats = new ArrayList<datos.SubCategoria>();
		this.productoActual = new datos.Producto();
		this.arrClientesInteresados = new ArrayList<datos.Cliente>();
		this.arrProductosPublicación = new ArrayList<datos.Producto>();
		this.anuncioActual = new datos.Anuncio();
		this.productoModificar = new datos.Producto();
	}


	//GETTER & SETTER
	public datos.CatalogoCategorias getCctg() 
	{
		return cctg;
	}


	public void setCctg(datos.CatalogoCategorias cctg) 
	{
		this.cctg = cctg;
	}


	public datos.CatalogoSubCategorias getCsctg() 
	{
		return csctg;
	}


	public void setCsctg(datos.CatalogoSubCategorias csctg) 
	{
		this.csctg = csctg;
	}


	public datos.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(datos.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public datos.CatalogoAnuncios getCa() 
	{
		return ca;
	}


	public void setCa(datos.CatalogoAnuncios ca) 
	{
		this.ca = ca;
	}


	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}


	public Collection<datos.SubCategoria> getSubCats() 
	{
		return subCats;
	}


	public void setSubCats(Collection<datos.SubCategoria> subCats) 
	{
		this.subCats = subCats;
	}


	public datos.Producto getProductoActual() 
	{
		return productoActual;
	}


	public void setProductoActual(datos.Producto productoActual) 
	{
		this.productoActual = productoActual;
	}


	public Collection<datos.Cliente> getArrClientesInteresados() 
	{
		return arrClientesInteresados;
	}


	public void setArrClientesInteresados(
			Collection<datos.Cliente> arrClientesInteresados) 
	{
		this.arrClientesInteresados = arrClientesInteresados;
	}


	public Collection<datos.Producto> getArrProductosPublicación() 
	{
		return arrProductosPublicación;
	}


	public void setArrProductosPublicación(
			Collection<datos.Producto> arrProductosPublicación) 
	{
		this.arrProductosPublicación = arrProductosPublicación;
	}


	public datos.Anuncio getAnuncioActual() 
	{
		return anuncioActual;
	}


	public void setAnuncioActual(datos.Anuncio anuncioActual) 
	{
		this.anuncioActual = anuncioActual;
	}


	public datos.Producto getProductoModificar() 
	{
		return productoModificar;
	}


	public void setProductoModificar(datos.Producto productoModificar) 
	{
		this.productoModificar = productoModificar;
	}
}
