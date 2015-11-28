package controladores;

import negocio.ModeloRegistrarPedidoCliente;
import negocio.Userdetail;



public class ControladorRegistrarPedidoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.ModeloRegistrarPedidoCliente modeloRegistrarPedido; 
	private negocio.Userdetail usuario;
		
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorRegistrarPedidoCliente() throws Exception 
	{
		this.modeloRegistrarPedido = new ModeloRegistrarPedidoCliente();
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
				
				modeloRegistrarPedido.inicializarCatalogos();
				
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
	public String buscarCliente(String nro_cliente, String nom_cliente, String ape_cliente)
	{
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		if(nro_cliente.matches("[0-9]{1,}") || ( nom_cliente.matches("[a-zA-z]{1,}") && ape_cliente.matches("[a-zA-z]{1,}") ) )
		{
			//BUSCAR POR NRO CLIENTE
			if(!nro_cliente.equals("") && ( nom_cliente.trim().equals("") || ape_cliente.trim().equals("") ) )
			{
				clienteActual = modeloRegistrarPedido.buscarCliente(Integer.parseInt(nro_cliente));
			}
			//BUSCAR POR NOMBRE APELLIDO CLIENTE
			else
			{
				if(nro_cliente.equals("") && !( nom_cliente.trim().equals("") && ape_cliente.trim().equals("") ) )
				{
					clienteActual = modeloRegistrarPedido.buscarCliente(nom_cliente.trim(), ape_cliente.trim());
				}
			}
			
			if(clienteActual != null)
			{
				String salidaResultados = "<table class=\"resultados\">"
						+ "	<tr>"
						+ "		<td class=\"labels\">Nombre:</td>"
						+ "		<td>"+clienteActual.getNombre()+"</td>"
						+ "	</tr>"
						+ "	<tr>"
						+ "		<td class=\"labels\">Apellido:</td>"
						+ "		<td>"+clienteActual.getApellido()+"</td>"
						+ "	</tr>"
						+ "	<tr>"
						+ "		<td class=\"labels\">Dirección:</td>"
						+ "		<td>"+clienteActual.getDireccion()+"</td>"
						+ "	</tr>"
						+ "	<tr>"
						+ "		<td class=\"labels\">Teléfono:</td>"
						+ "		<td>"+clienteActual.getTelefono()+"</td>"
						+ "	</tr>"
						+ "</table>"
						+ "<form action=\"confeccionPedido.jsp\"><input type=\"submit\" value=\"Confeccionar Pedido\" /></form>";
				
				return salidaResultados;
			}
			else
			{
				return "<h2 class=\"res_error\">No se ha encontrado el cliente buscado</h2>";
			}
			
		}
		else
		{
			//DATOS INGRESADOS ERRONEOS
			return "<h2 class=\"res_error\">Los datos ingresados son erróneos</h2>";
		}
	}
	
	
	
	
	/**
	 * 
	 */
	public String cerrarSesion()
	{
		this.modeloRegistrarPedido = null;
		this.usuario = null;
		
		return "<h2>Salida exitosa</h2>";
	}
	
}
