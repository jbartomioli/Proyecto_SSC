package controladores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

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
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
