package datos.OLD;

import java.util.Date;

public class Anuncio 
{
	//ATRIBUTOS
	private int idAnuncio;
	private int idProducto;
	private int idCliente;
	private String textoMensaje;
	private String membrete;
	private String estado;
	private Date fecha;
	
	
	//CONSTRUCTOR
	public Anuncio() 
	{
		this.idAnuncio = 0;
		this.idProducto = 0;
		this.idCliente = 0;
		this.textoMensaje = "";
		this.membrete = "";
		this.estado = "";
		this.fecha = new Date();
	}


	//GETTERS & SETTERS
	public int getIdProducto() 
	{
		return idProducto;
	}


	public void setIdProducto(int idProducto) 
	{
		this.idProducto = idProducto;
	}


	public int getIdCliente() 
	{
		return idCliente;
	}


	public void setIdCliente(int idCliente) 
	{
		this.idCliente = idCliente;
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


