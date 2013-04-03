package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Anuncio 
{
	//ATRIBUTOS
	private Collection<datos.Producto> productos;
	private Collection<datos.Cliente> clientes;
	String textoMensaje;
	String estado;
	Date fecha;
	int idAnuncio;
	
	
	//CONSTRUCTOR
	public Anuncio() 
	{
		this.productos = new ArrayList<datos.Producto>();
		this.clientes = new ArrayList<datos.Cliente>();
		this.textoMensaje = "";
		this.estado = "";
		this.fecha = new Date();
		this.idAnuncio = 0;
	}


	//GETTERS & SETTERS
	public Collection<datos.Producto> getProductos()
	{
		return productos;
	}


	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}


	public Collection<datos.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<datos.Cliente> clientes) 
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
	
	
	//METODOS
	//----------------------------------------------------------
}


