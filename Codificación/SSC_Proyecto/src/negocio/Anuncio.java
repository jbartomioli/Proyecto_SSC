package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Anuncio 
{
	//ATRIBUTOS
	private int idAnuncio;
	private Collection<negocio.Producto> productos;
	private Collection<negocio.Cliente> clientes;
	private String textoMensaje;
	private String membrete;
	private String estado;
	private Date fecha;
	private datos.Anuncio anuncioDatos;
	
	
	//CONSTRUCTOR
	public Anuncio() 
	{
		this.idAnuncio = 0;
		this.productos = null;
		this.clientes = null;
		this.textoMensaje = "";
		this.membrete = "";
		this.estado = "";
		this.fecha = new Date();
		
		this.anuncioDatos = new datos.Anuncio();
	}

	
	//GETTERS & SETTERS
	public Collection<negocio.Producto> getProductos()
	{
		return productos;
	}


	public void setProductos(Collection<negocio.Producto> arrProductosPublicacion) 
	{
		this.productos = arrProductosPublicacion;
	}


	public Collection<negocio.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<negocio.Cliente> arrClientesPublicacion) 
	{
		this.clientes = arrClientesPublicacion;
	}


	public String getTextoMensaje() 
	{
		return textoMensaje;
	}


	public void setTextoMensaje(String textoMensaje) 
	{
		this.textoMensaje = textoMensaje;
	}


	public String getMembrete() 
	{
		return membrete;
	}


	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}


	public String getEstado() 
	{
		return estado;
	}


	public void setEstado(String estado) 
	{
		this.estado = estado;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getIdAnuncio() {
		return idAnuncio;
	}


	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}
	
	public datos.Anuncio getAnuncioDatos() 
	{
		return anuncioDatos;
	}

	public void setAnuncioDatos(datos.Anuncio anuncioDatos) 
	{
		this.anuncioDatos = anuncioDatos;
	}


	//METODOS
	//----------------------------------------------------------
	
	public negocio.Producto modificarPrecioProducto(int idProducto)
	{
		return null;
	}
	
	
	//DSD 1.5.2
	public void actualizarProducto(negocio.Producto productoModificar)
	{
		//Buscar el producto dentro del array de anuncios que coincida con el producto pasado como parametro e insertar el nuevo precio
	}
	
	public Collection<negocio.Cliente> seleccionarClientes(ArrayList<String>idCliente)
	{
		return null;
	}
}
