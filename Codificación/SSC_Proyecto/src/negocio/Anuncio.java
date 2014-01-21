package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

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
	// 								 							   //
	/////////////////////////////////////////////////////////////////
	//FALTA - VER VENTA
	public void obtenerProductos()
	{
		//
		datos.Anuncio anuncioDato = new datos.Anuncio();
		
		//
		anuncioDato.obtenerProductos(this.idAnuncio);
		

		for(datos.Producto productoDato: anuncioDato.getProductos())
		{
			//
			negocio.Producto productoNegocio = new negocio.Producto();
				
			//se setea el producto de negocio
			productoNegocio.setCodProducto(productoDato.getCodProducto());
			productoNegocio.setExistenciaStock(productoDato.getExistenciaStock());
			productoNegocio.setIdProducto(productoDato.getIdProducto());
			productoNegocio.setNombre(productoDato.getNombre());
			
			this.productos.add(productoNegocio);
		}
	}
	//--------------------------------------------------------------

	
	
	////////////////////////////////////////////////////////////////
	//	//
	////////////////////////////////////////////////////////////////
	public void obtenerClientes()
	{
		//
		datos.Anuncio anuncioDato = new datos.Anuncio();
		
		//
		anuncioDato.obtenerClientes(this.idAnuncio);
		

		for(datos.Cliente clienteDato: anuncioDato.getClientes())
		{
			//
			negocio.Cliente clienteNegocio = new negocio.Cliente();
				
			//
			clienteNegocio.setApellido(clienteDato.getApellido());
			clienteNegocio.setDireccion(clienteDato.getDireccion());
			clienteNegocio.setEmail(clienteDato.getEmail());
			clienteNegocio.setEspecialidad(clienteDato.getEspecialidad());
			clienteNegocio.setIdCliente(clienteDato.getIdCliente());
			clienteNegocio.setNombre(clienteDato.getNombre());
			clienteNegocio.setTelefono(clienteDato.getTelefono());
			clienteNegocio.setTipoCliente(clienteDato.getTipoCliente());
			
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
				//productoModif.setPrecio(p.getPrecio());
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
				
				break;
			}
		}
		//Busca el producto dentro del array de anuncios que coincida con el producto pasado como parametro e insertar el nuevo precio
	}
	//---------------------------------------------------------------

	/////////////////////////////////////////////////////////////////
	// 								 							   //
	/////////////////////////////////////////////////////////////////
	//VER
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
	//---------------------------------------------------------------


	/////////////////////////////////////////////////////////////////
	// Metodo utilizado para el envio del email					   //
	/////////////////////////////////////////////////////////////////
	//FALTA - ADEMAS USAR UNA CLASE DIFERENTE SOLO FUE UNA PRUEBA
	public void enviarAnuncio() throws Exception
	{
		String smtpHost = "smtp.gmail.com";
		Properties props = System.getProperties();
		props.put("mail.smtp.host", smtpHost);
		
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.user", "sscproyecto@gmail.com");
		//props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		
		javax.mail.Authenticator authenticator = new javax.mail.Authenticator()
	    {
	    protected javax.mail.PasswordAuthentication getPasswordAuthentication() 
	        {
	        return new javax.mail.PasswordAuthentication("sscproyecto@gmail.com", "qweras123");
	        }
	    };       
		
		Session sesion = Session.getDefaultInstance(props, authenticator);
		sesion.setDebug(true);
		
		try
		{
			Message mensaje = new MimeMessage(sesion);
			
			mensaje.setSubject("Asunto");
			
			mensaje.setFrom(new InternetAddress("sscproyecto@gmail.com"));
			
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress("sscproyecto@gmail.com"));
			
			mensaje.setText("Probando Mail");
						
			Transport.send(mensaje);
			
		}
		catch(MessagingException me)
		{
			System.err.println(me.getMessage());
		}
		
		
	}
	//---------------------------------------------------------------

}
