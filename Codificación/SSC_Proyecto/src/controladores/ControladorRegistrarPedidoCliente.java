package controladores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import negocio.ModeloRegistrarPedidoCliente;



public class ControladorRegistrarPedidoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.ModeloRegistrarPedidoCliente modeloRegistrarPedido; 
		
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorRegistrarPedidoCliente() throws Exception 
	{
		this.modeloRegistrarPedido = new ModeloRegistrarPedidoCliente();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	
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
	public String iniciarSesion(String user, String password)
	{
		negocio.Userdetail usuarioNegocio = new negocio.Userdetail();
		
		try
		{
			usuarioNegocio.obtenerUser(user, password);
			
			if(usuarioNegocio.getName().equals(""))
				return null;
			else
				return "<p>Bienvenido "+usuarioNegocio.getName()+" .<a href=\"logout.jsp\">Cerrar sesión</a></p>";
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
