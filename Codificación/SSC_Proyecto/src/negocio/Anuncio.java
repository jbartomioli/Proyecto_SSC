package negocio;

import java.util.Collection;
import java.util.Date;

public class Anuncio 
{
	//ATRIBUTOS
	private int idAnuncio;
	private Collection<negocio.Producto> productos;
	private Collection<negocio.Cliente> clientes;
	private String textoMensaje;
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
		this.estado = "";
		this.fecha = new Date();
		
		this.anuncioDatos = new datos.Anuncio();
	}

	
	//GETTERS & SETTERS
	public Collection<negocio.Producto> getProductos()
	{
		return productos;
	}


	public void setProducto(Collection<negocio.Producto> producto) 
	{
		this.productos = producto;
	}


	public Collection<negocio.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<negocio.Cliente> clientes) 
	{
		this.clientes = clientes;
	}


	public String getTextoMensaje() 
	{
		return textoMensaje;
	}


	public void setTextoMensaje(String textoMensaje) 
	{
		this.textoMensaje = textoMensaje;
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
	public void setProductos(Collection<negocio.Producto> arrProductosPublicacion)
	{
		this.setProductos(arrProductosPublicacion);
	}
}
