package controladores;



import java.util.Collection;

import negocio.ModeloTrackingPedidoCliente;
import negocio.Userdetail;



public class ControladorSeguimientoPedido
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.ModeloTrackingPedidoCliente modeloTrackingPedido; 
	private negocio.Userdetail usuario;
		
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorSeguimientoPedido() throws Exception 
	{
		this.modeloTrackingPedido = new ModeloTrackingPedidoCliente();
		this.usuario = new Userdetail();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.Userdetail getUsuario() {
		return usuario;
	}


	public void setUsuario(negocio.Userdetail usuario) {
		this.usuario = usuario;
	}
	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	
	
	




	/**
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean iniciarSesion(String user, String password)
	{
		negocio.Userdetail usuarioNegocio = new negocio.Userdetail();
		
		try
		{
			usuarioNegocio.obtenerUser(user, password);
			
			if(usuarioNegocio.getName().equals(""))
				return false;
			else
			{
				this.usuario.setName(usuarioNegocio.getName());
				this.usuario.setUsername(usuarioNegocio.getUsername());
				this.usuario.setPassword(usuarioNegocio.getPassword());
				
				modeloTrackingPedido.inicializarCatalogos();
				
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	/**
	 * 
	 * @param nro_cliente
	 * @param nomape_cliente
	 * @return
	 */
//	public String buscarCliente(String nro_cliente, String nom_cliente, String ape_cliente)
//	{
//		negocio.Cliente clienteActual = new negocio.Cliente();
//		
//		if(nro_cliente.matches("[0-9]{1,}") || ( nom_cliente.matches("[a-zA-z]{1,}") && ape_cliente.matches("[a-zA-z]{1,}") ) )
//		{
//			//BUSCAR POR NRO CLIENTE
//			if(!nro_cliente.equals("") && ( nom_cliente.trim().equals("") || ape_cliente.trim().equals("") ) )
//			{
//				clienteActual = modeloTrackingPedido.buscarCliente(Integer.parseInt(nro_cliente));
//			}
//			//BUSCAR POR NOMBRE APELLIDO CLIENTE
//			else
//			{
//				if(nro_cliente.equals("") && !( nom_cliente.trim().equals("") && ape_cliente.trim().equals("") ) )
//				{
//					clienteActual = modeloTrackingPedido.buscarCliente(nom_cliente.trim(), ape_cliente.trim());
//				}
//			}
//			
//			if(clienteActual != null)
//			{
//				String salidaResultados = "<table class=\"resultados\">"
//						+ "	<tr>"
//						+ "		<td class=\"labels\">Nombre:</td>"
//						+ "		<td>"+clienteActual.getNombre()+"</td>"
//						+ "	</tr>"
//						+ "	<tr>"
//						+ "		<td class=\"labels\">Apellido:</td>"
//						+ "		<td>"+clienteActual.getApellido()+"</td>"
//						+ "	</tr>"
//						+ "	<tr>"
//						+ "		<td class=\"labels\">Dirección:</td>"
//						+ "		<td>"+clienteActual.getDireccion()+"</td>"
//						+ "	</tr>"
//						+ "	<tr>"
//						+ "		<td class=\"labels\">Teléfono:</td>"
//						+ "		<td>"+clienteActual.getTelefono()+"</td>"
//						+ "	</tr>"
//						+ "</table>"
//						+ "<form action=\"confeccionPedido.jsp\" method=\"post\" ><input type=\"submit\" value=\"Confeccionar Pedido\" /></form>";
//				
//				return salidaResultados;
//			}
//			else
//			{
//				return "<h2 class=\"res_error\">No se ha encontrado el cliente buscado</h2>";
//			}
//			
//		}
//		else
//		{
//			//DATOS INGRESADOS ERRONEOS
//			return "<h2 class=\"res_error\">Los datos ingresados son erróneos</h2>";
//		}
//	}
//	
	
	
	
	public Collection<negocio.Pedido> obtenerPedidos(int idCliente)
	{
		
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		try {
			clienteActual.obtenerPedidos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public String cerrarSesion()
	{
		this.modeloTrackingPedido = null;
		this.usuario = null;
		
		return "<h2>Salida exitosa</h2>";
	}
	
}
