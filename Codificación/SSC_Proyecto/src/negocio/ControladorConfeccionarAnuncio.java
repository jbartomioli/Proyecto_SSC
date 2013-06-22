package negocio;

import java.util.ArrayList;
import java.util.Collection;


public class ControladorConfeccionarAnuncio 
{
	//ATRIBUTOS
	private negocio.CatalogoCategorias cctg;
	private negocio.CatalogoSubCategorias csctg;
	private negocio.CatalogoProductos cp;
	private negocio.CatalogoAnuncios ca;
	private Collection<negocio.Producto> productos;
	private Collection<negocio.SubCategoria> subCats;
	private negocio.Producto productoActual;
	private Collection<negocio.Cliente> arrClientesInteresados;
	private Collection<negocio.Producto> arrProductosPublicación;
	private negocio.Anuncio anuncioActual;
	private negocio.Producto productoModificar;
	
	
	//CONSTRUCTOR
	public ControladorConfeccionarAnuncio() 
	{
		this.cctg = new negocio.CatalogoCategorias();
		this.csctg = new negocio.CatalogoSubCategorias();
		this.cp = new negocio.CatalogoProductos();
		this.ca = new negocio.CatalogoAnuncios();
		this.productos = new ArrayList<negocio.Producto>();
		this.subCats = new ArrayList<negocio.SubCategoria>();
		this.productoActual = new negocio.Producto();
		this.arrClientesInteresados = new ArrayList<negocio.Cliente>();
		this.arrProductosPublicación = new ArrayList<negocio.Producto>();
		this.anuncioActual = new negocio.Anuncio();
		this.productoModificar = new negocio.Producto();
	}


	//GETTER & SETTER
	public negocio.CatalogoCategorias getCctg() 
	{
		return cctg;
	}


	public void setCctg(negocio.CatalogoCategorias cctg) 
	{
		this.cctg = cctg;
	}


	public negocio.CatalogoSubCategorias getCsctg() 
	{
		return csctg;
	}


	public void setCsctg(negocio.CatalogoSubCategorias csctg) 
	{
		this.csctg = csctg;
	}


	public negocio.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(negocio.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public negocio.CatalogoAnuncios getCa() 
	{
		return ca;
	}


	public void setCa(negocio.CatalogoAnuncios ca) 
	{
		this.ca = ca;
	}


	public Collection<negocio.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<negocio.Producto> productos) 
	{
		this.productos = productos;
	}


	public Collection<negocio.SubCategoria> getSubCats() 
	{
		return subCats;
	}


	public void setSubCats(Collection<negocio.SubCategoria> subCats) 
	{
		this.subCats = subCats;
	}


	public negocio.Producto getProductoActual() 
	{
		return productoActual;
	}


	public void setProductoActual(negocio.Producto productoActual) 
	{
		this.productoActual = productoActual;
	}


	public Collection<negocio.Cliente> getArrClientesInteresados() 
	{
		return arrClientesInteresados;
	}


	public void setArrClientesInteresados(
			Collection<negocio.Cliente> arrClientesInteresados) 
	{
		this.arrClientesInteresados = arrClientesInteresados;
	}


	public Collection<negocio.Producto> getArrProductosPublicación() 
	{
		return arrProductosPublicación;
	}


	public void setArrProductosPublicación(
			Collection<negocio.Producto> arrProductosPublicación) 
	{
		this.arrProductosPublicación = arrProductosPublicación;
	}


	public negocio.Anuncio getAnuncioActual() 
	{
		return anuncioActual;
	}


	public void setAnuncioActual(negocio.Anuncio anuncioActual) 
	{
		this.anuncioActual = anuncioActual;
	}


	public negocio.Producto getProductoModificar() 
	{
		return productoModificar;
	}


	public void setProductoModificar(negocio.Producto productoModificar) 
	{
		this.productoModificar = productoModificar;
	}
	
	
	//METODOS
	//Metodo DSD 1.1.1 - DSD 1.7.2
	public ArrayList<String> seleccionarCategoria(int idCategoria)
	{
		return null;
	}
	
	
	//Metodo DSD 1.1.2 - DSD 1.7.3  
	public ArrayList<String> seleccionarSubcategoria(int idSubCategoria)
	{
		return null;
	}
	
	
	//Metodo DSD 1.1.3 - DSD 1.7.4
	public ArrayList<String> seleccionarProducto(int idProducto)
	{
		return null;
	}
	
	
	//Metodo DSD 1.1.4
	public boolean finalizarCargaProducto()
	{
		this.anuncioActual = new negocio.Anuncio();
		
		this.anuncioActual.setEstado("PENDIENTE");
		
		
		return true;
	}
	
	
	//Metodo DSD 1.2.1
	public ArrayList<String> redactarMensaje(String mensaje)
	{
		return null;
	}
	
	
	//Metodo DSD 1.3.1
	public boolean guardarAnuncio()
	{
		return true;
	}
	
	
	//Metodo DSD 1.4.1
	public boolean enviarAnuncios()
	{
		return true;
	}
	
	
	//Metodo DSD 1.5.1
	public String modificarPrecioProducto(int idProducto)
	{
		negocio.Producto productoModificar;
		
		productoModificar=anuncioActual.modificarPrecioProducto(idProducto);
		
		if(productoModificar != null)
			return Double.toString(productoModificar.getPrecioActual());
		else
			return null;
	}
	
	
	//Metodo DSD 1.5.2
	public String cambiarPrecio(float nuevoPrecio)
	{
		return null;
	}
	
	
	//Metodo DSD 1.6.1
	public ArrayList<String> modificarClientesDestinatarios()
	{
		return null;
	}
	
	
	//Metodo DSD 1.6.2
	public  String [][] seleccionarClientes(String [] idCliente)
	{
		Collection<negocio.Cliente> arrClientesTemp=new ArrayList<negocio.Cliente>();
		
		
		arrClientesTemp=anuncioActual.seleccionarClientes(idCliente);
		
		anuncioActual.setClientes(arrClientesTemp);
		
		ca.guardarCambioClientesAnuncio(anuncioActual);
		
		String [][] arrDatos = new String[arrClientesTemp.size()][2]; //Revisar definicion
		
		int i=0;
		
		for(negocio.Cliente c : arrClientesTemp)
		{
			arrDatos[i][0]=Integer.toString(c.getIdCliente());
			arrDatos[i][1]=c.getNombre();
			arrDatos[i][2]=c.getApellido();
			i++;
		}
		
		return null;
	}
	
	
	//Metodo 1.7.1
	public ArrayList<String> eliminarProducto(int idProducto)
	{
		return null;
	}
	
}
