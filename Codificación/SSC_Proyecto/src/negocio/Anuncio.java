package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Anuncio 
{
	//ATRIBUTOS
	private Collection<negocio.Producto> productos;
	private Collection<negocio.Cliente> clientes;
	private String textoMensaje;
	private String membrete;
	private String estado;
	private Date fecha;
	private int idAnuncio;
	
	
	//CONSTRUCTOR
	public Anuncio() 
	{
		this.productos = new ArrayList<negocio.Producto>();
		this.clientes = new ArrayList<negocio.Cliente>();
		this.textoMensaje = "";
		this.membrete = "";
		this.estado = "";
		this.fecha = new Date();
		this.idAnuncio = 0;
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
	//METODOS
	//----------------------------------------------------------
	public negocio.Producto modificarPrecioProducto(int idProducto)
	{
		negocio.Producto productoModif = new negocio.Producto();
		
		for(negocio.Producto p : this.productos)
		{
			if(idProducto==p.getIdProducto())
			{
				productoModif.setCodProducto(p.getCodProducto());
				productoModif.setIdProducto(p.getIdProducto());
				productoModif.setNombre(p.getNombre());
				productoModif.setSubCategoria(p.getSubCategoria());
				productoModif.setPrecio(p.getPrecio());
				productoModif.setExistenciaStock(p.getExistenciaStock());
				
				return productoModif;
			}	
		}
		
		return null;
	}
	
	//----------------------------------------------------------
	//DSD 1.5.2
	public void actualizarProducto(negocio.Producto productoModificar)
	{
		for(negocio.Producto p : this.productos)
		{
			if(p.getIdProducto()==productoModificar.getIdProducto())
			{
				p=productoModificar;
				
				break;
			}
		}
		//Busca el producto dentro del array de anuncios que coincida con el producto pasado como parametro e insertar el nuevo precio
	}
	
	
	//----------------------------------------------------------
	public Collection<negocio.Cliente> seleccionarClientes(String [] idCliente)
	{
		Collection<negocio.Cliente> arrClientesSeleccionados = new ArrayList<negocio.Cliente>();
		
		for(String id : idCliente)
		{
			for(negocio.Cliente c : this.clientes)
			{
				if(c.getIdCliente()==Integer.parseInt(id))
				{
					arrClientesSeleccionados.add(c);
					continue;				
				}
			}
		}
		return arrClientesSeleccionados;
	}
}
