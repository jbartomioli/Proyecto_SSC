package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.mail.MessagingException;

import utilidades.MailPromocional;


public class Anuncio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.Producto> productos;
	private Collection<negocio.Cliente> clientes;
	private String textoMensaje;
	private String membrete;
	private String estado;
	private Date fecha;
	private int idAnuncio;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
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
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
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
	//---------------------------------------------------------------

	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE LOS PRODUCTOS DE UN ANUNCIO ESPECIFICO			   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerProductos()
	{
		//SE CREA OBJETO ANUNCIO DE DATOS PARA RECUPERAR
		//LOS DATOS DE LA BD
		datos.Anuncio anuncioDato = new datos.Anuncio();
		
		//SE RECUPERAN LOS PRODUCTOS DEL ANUNCIO
		anuncioDato.obtenerProductos(this.idAnuncio);
		
		//SE RECORRE CADA ELEMENTO DEL ARRAY PARA RECUPERAR DATOS
		for(datos.Producto productoDato: anuncioDato.getProductos())
		{
			//SE CREA OBJETO PRODUCTO DE NEGOCIO PARA SETEAR LOS DATOS
			//Y DESPUES AGREGARLO AL ARRAY DE PRODUCTOS DEL ANUNCIO
			negocio.Producto productoNegocio = new negocio.Producto();
				
			//SE SETEAN LOS DATOS DEL PRODUCTO DE NEGOCIO
			productoNegocio.setCodProducto(productoDato.getCodProducto());
			productoNegocio.setExistenciaStock(productoDato.getExistenciaStock());
			productoNegocio.setIdProducto(productoDato.getIdProducto());
			productoNegocio.setNombre(productoDato.getNombre());
			
			//SE AGREGA EL PRODUCTO AL ARRAY
			this.productos.add(productoNegocio);
		}
	}
	//--------------------------------------------------------------
	
	
	////////////////////////////////////////////////////////////////
	//OBTIENE LOS CLIENTES DESTINATARIOS DE UN ANUNCIO ESPECIFICO //
	////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerClientes()
	{
		//SE CREA OBJETO ANUNCIO DE DATOS PARA RECUPERAR
		//LOS DATOS DE LA BD
		datos.Anuncio anuncioDato = new datos.Anuncio();
		
		//SE RECUPERAN LOS CLIENTES DEL ANUNCIO
		anuncioDato.obtenerClientes(this.idAnuncio);
		
		//SE RECORRE CADA ELEMENTO DEL ARRAY PARA RECUPERAR DATOS

		for(datos.Cliente clienteDato: anuncioDato.getClientes())
		{
			//SE CREA OBJETO CLIENTE DE NEGOCIO PARA SETEAR LOS DATOS
			//Y DESPUES AGREGARLO AL ARRAY DE CLIENTES DESTINATARIOS DEL ANUNCIO
			negocio.Cliente clienteNegocio = new negocio.Cliente();
				
			//SE SETEAN LOS DATOS DEL CLIENTE DE NEGOCIO
			clienteNegocio.setApellido(clienteDato.getApellido());
			clienteNegocio.setDireccion(clienteDato.getDireccion());
			clienteNegocio.setEmail(clienteDato.getEmail());
			clienteNegocio.setEspecialidad(clienteDato.getEspecialidad());
			clienteNegocio.setIdCliente(clienteDato.getIdCliente());
			clienteNegocio.setNombre(clienteDato.getNombre());
			clienteNegocio.setTelefono(clienteDato.getTelefono());
			clienteNegocio.setTipoCliente(clienteDato.getTipoCliente());
			
			//SE AGREGA EL CLIENTE AL ARRAY
			this.clientes.add(clienteNegocio);
		}
	}
	//--------------------------------------------------------------
			
	
	/////////////////////////////////////////////////////////////////
	// 								 							   //
	/////////////////////////////////////////////////////////////////	
	//VER
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
				productoModif.setExistenciaStock(p.getExistenciaStock());
				
				return productoModif;
			}	
		}
		
		return null;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.5.2				 							   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void actualizarProducto(negocio.Producto productoModificar)
	{
		for(negocio.Producto p : this.productos)
		{
			if(p.getIdProducto()==productoModificar.getIdProducto())
			{
				p=productoModificar;
				
				//
				
				break;
			}
		}
		//Busca el producto dentro del array de productos que coincida con el 
		//producto pasado como parametro e inserta el nuevo precio
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	// SELECCIONA LOS CLIENTES DESTINATARIOS DEL ANUNCIO		   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> seleccionarClientes(String [] idCliente)
	{
		//SE CREA ARRAY TEMPORAL DE CLIENTES DESTINATARIOS
		Collection<negocio.Cliente> arrClientesSeleccionados = new ArrayList<negocio.Cliente>();
		
		//SE RECORRE CADA ID DE CLIENTE DEL ARREGLO RECIBIDO COMO PARAMETRO
		for(String id : idCliente)
		{
			//SE RECORRE CADA CLIENTE DEL ARRAY DE CLIENTES DEL ANUNCIO
			for(negocio.Cliente c : this.clientes)
			{
				//SE COMPARAN LOS ID
				if(c.getIdCliente()==Integer.parseInt(id))
				{
					//SI SON IGUALES SE AGREGA EL CLIENTE ACTUAL AL ARRAY TEMPORAL
					arrClientesSeleccionados.add(c);
					continue;				
				}
			}
		}
		//DEVUELVE EL ARRAY TEMPORAL DE CLIENTES SELECCIONADOS
		return arrClientesSeleccionados;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// 								 							   //
	/////////////////////////////////////////////////////////////////	
	//---------------------------------------------------------------


	/////////////////////////////////////////////////////////////////
	// METODO UTILIZADO PARA EL ENVIO DE MAIL DE ANUNCIO		   //
	/////////////////////////////////////////////////////////////////
	//FALTA
	public void enviarAnuncio()
	{
		try
		{
		utilidades.MailPromocional nuevoMail = new utilidades.MailPromocional();
		
		//nuevoMail.enviarMail(this.getTextoMensaje(), mailsDestinatarios, asuntoMail);
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			
		}
	}
	//---------------------------------------------------------------

}
