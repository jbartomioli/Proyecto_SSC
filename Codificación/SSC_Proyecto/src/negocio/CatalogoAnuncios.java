package negocio;


import java.util.ArrayList;
import java.util.Collection;


public class CatalogoAnuncios 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.Anuncio> anuncios;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoAnuncios() 
	{
		this.anuncios = new ArrayList<negocio.Anuncio>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Anuncio> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(Collection<negocio.Anuncio> anuncios) {
		this.anuncios = anuncios;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS ANUNCIOS								   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerAnuncios() 
	{
		//SE CREA OBJETO CATALOGO ANUNCIO DE DATOS PARA RECUPERAR 
		//LOS ANUNCIOS DE LA BD
		datos.CatalogoAnuncios ctgDatos = new datos.CatalogoAnuncios();				
		
		ctgDatos.obtenerAnuncios();
		
		//SE RECORRE CADA ANUNCIO OBTENIDO DE LA CONSULTA A LA BD
		for(datos.Anuncio anuncioDato: ctgDatos.getAnuncios())
		{
			//SE CREA OBJETO AUNCIO DE NEGOCIO PARA SETEARLO
			//Y DESPUES AGREGARLO AL ARRAY
			negocio.Anuncio anuncioNegocio = new negocio.Anuncio();
			
			//SE SETEAN DATOS DEL ANUNCIO
			anuncioNegocio.setIdAnuncio(anuncioDato.getIdAnuncio());
			anuncioNegocio.setFecha(anuncioDato.getFecha());
			anuncioNegocio.setEstado(anuncioDato.getEstado());
			anuncioNegocio.setTextoMensaje(anuncioDato.getTextoMensaje());
			anuncioNegocio.setMembrete(anuncioDato.getMembrete());
			
			//SE AGREGA EL ANUNCIO AL ARRAY
			anuncios.add(anuncioNegocio);
		}

	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// GUARDA EL ANUNCIO EN LA BD								   //
	/////////////////////////////////////////////////////////////////
	//FALTA COMPLETAR DATOS
	public void guardarAnuncio(negocio.Anuncio anuncioActual)
	{
		//SE AGREGA EL NUEVO ANUNCIO EN EL ARRAY
		this.anuncios.add(anuncioActual);
		
		//SE CREA ANUNCIO TEMPORAL DE DATOS
		datos.Anuncio anuncioTempDatos = new datos.Anuncio();
		
		//SE SETEAN LOS DATOS DEL ANUNCIO
		anuncioTempDatos.setIdAnuncio(anuncioActual.getIdAnuncio());
		anuncioTempDatos.setFecha(anuncioActual.getFecha());
		anuncioTempDatos.setEstado(anuncioActual.getEstado());
		anuncioTempDatos.setMembrete(anuncioActual.getMembrete());
		anuncioTempDatos.setTextoMensaje(anuncioActual.getTextoMensaje());
		
		
		{//SETEO DE CLIENTES
			for(negocio.Cliente clienteNegocio : anuncioActual.getClientes())
			{
				datos.Cliente clienteDatos = new datos.Cliente();
				
				clienteDatos.setIdCliente(clienteNegocio.getIdCliente());
			}
		}
		
		
		{//SETEO DE PRODUCTOS
			for(negocio.Producto productoNegocio : anuncioActual.getProductos())
			{
				datos.Producto productoDatos = new datos.Producto();
				
				productoDatos.setIdProducto(productoNegocio.getIdProducto());;
			}
		}
		
		
		//SE CREA CATALOGO ANUNCIO DE DATOS PARA GUARDAR EL ANUNCIO
		datos.CatalogoAnuncios ctgAnunciosDatos = new datos.CatalogoAnuncios();
		
		//SE GUARDA EL ANUNCIO
		ctgAnunciosDatos.guardarAnuncio(anuncioTempDatos);
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void guardarCambioClientesAnuncio(negocio.Anuncio anuncioActual)
	{
		for(negocio.Anuncio a : this.anuncios)
		{
			if(anuncioActual.getIdAnuncio()==a.getIdAnuncio())
				a=anuncioActual;
		}
	}
	//---------------------------------------------------------------
	
}
