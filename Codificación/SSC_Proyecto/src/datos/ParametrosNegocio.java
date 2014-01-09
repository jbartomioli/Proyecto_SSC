package datos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ParametrosNegocio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private String membrete;
	private int ultIdPedido;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ParametrosNegocio() 
	{
		this.membrete = "";
		this.ultIdPedido = 0;
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public String getMembrete() 
	{
		return membrete;
	}



	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}



	public int getUltIdPedido() 
	{
		return ultIdPedido;
	}



	public void setUltIdPedido(int ultIdPedido) 
	{
		this.ultIdPedido = ultIdPedido;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	//MODIFICAR PARA USAR HIBERNATE!!!!
	/////////////////////////////////////////////////////////////////
	// //
	/////////////////////////////////////////////////////////////////
	public datos.ParametrosNegocio getParametros()
	{
		ResultSet conjuntoResult = null;
		eliminar.BDConector conector = null;
		
		datos.ParametrosNegocio parametros = null;

		
		try
		{
			
			conector = new eliminar.BDConector(eliminar.BDConstantes.URL_BD, 
					eliminar.BDConstantes.PORT, 
					eliminar.BDConstantes.DATABASE, 
					eliminar.BDConstantes.USER, 
					eliminar.BDConstantes.PASS);
			

			conjuntoResult = conector.ejecutaPeticion("SELECT * FROM parametrosNegocio");
			

			
			while( conjuntoResult.next())
			{
				parametros = new datos.ParametrosNegocio();

				parametros.setMembrete(conjuntoResult.getString("membrete"));
				parametros.setUltIdPedido(conjuntoResult.getInt("ultIdPedido"));
			}			
		}
		catch ( SQLException excepcionSql)
		{
			excepcionSql.printStackTrace();
		}
		finally
		{
			try
			{
				conjuntoResult.close();
				conector.cierraConexion();
			}
			catch (Exception excepcion)
			{
				excepcion.printStackTrace();
			}
		}
		return parametros;
	}
	//---------------------------------------------------------------
}