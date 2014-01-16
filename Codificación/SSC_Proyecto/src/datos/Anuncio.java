package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Anuncio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idAnuncio;
	private String textoMensaje;
	private String membrete;
	private String estado;
	private Date fecha;
	private Collection<datos.Cliente> clientes;
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Anuncio() 
	{
		this.idAnuncio = 0;
		this.textoMensaje = "";
		this.membrete = "";
		this.estado = "";
		this.fecha = new Date();
		this.productos = new ArrayList<datos.Producto>();
		this.clientes = new ArrayList<datos.Cliente>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
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


	public String getMembrete() 
	{
		return membrete;
	}


	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
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


	public Date getFecha() 
	{
		return fecha;
	}


	public void setFecha(Date fecha) 
	{
		this.fecha = fecha;
	}


	public int getIdAnuncio() 
	{
		return idAnuncio;
	}


	public void setIdAnuncio(int idAnuncio) 
	{
		this.idAnuncio = idAnuncio;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// //
	/////////////////////////////////////////////////////////////////
	
	//---------------------------------------------------------------
}


