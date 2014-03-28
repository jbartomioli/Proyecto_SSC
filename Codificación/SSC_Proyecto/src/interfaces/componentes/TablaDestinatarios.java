package interfaces.componentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class TablaDestinatarios extends JTable {

	private TableColumn columnaBoton;
	private DefaultTableModel modeloTablaDestinatarios;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	/**
	 * Create the frame.
	 */
	public TablaDestinatarios() {
		modeloTablaDestinatarios = new DefaultTableModel(); 
		modeloTablaDestinatarios.addColumn("Apellido"); 
		modeloTablaDestinatarios.addColumn("Nombre"); 
		modeloTablaDestinatarios.addColumn("Especialidad"); 
		modeloTablaDestinatarios.addColumn(""); 
	}
	
	
	public void completarTabla(String especialidad)
	{						
		try 
		{					
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_SSC", "root", "root");
			Statement stm = conexion.createStatement();
			
			String SQL = "select apellido, nombre, especialidad from clientes where especialidad = " + "'" + especialidad + "'";
			System.out.println("SQL: " + SQL);
			ResultSet rst = stm.executeQuery(SQL);
			ResultSetMetaData rstMd = rst.getMetaData();
			
			int nroColumnas = rstMd.getColumnCount();
			
			while(rst.next())
			{
				Object [] fila = new Object [nroColumnas];
				
				for(int i = 0; i<nroColumnas; i++)
				{
					fila [i] = rst.getObject(i+1);
				}
				
				this.agregarFila(fila);
			}
			
		}
		
		catch(ClassNotFoundException ce) 
		{
			ce.printStackTrace();
		}
		
		catch(SQLException se) 
		{
			se.printStackTrace();
		}
		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(3);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);
		
		TableColumn columnaNombre;
		columnaNombre = getColumn("Apellido");
		columnaNombre.setPreferredWidth(100);
		
		TableColumn columnaNombre1;
		columnaNombre1 = getColumn("Nombre");
		columnaNombre1.setPreferredWidth(100);
	}
	
	
	//Agrega filas a la tabla de clientes buscados según la especialidad seleccionada
	public void agregarFila(Object [] fila)
	{
		modeloTablaDestinatarios.addRow(fila);
	}
	
	public void definirTablaDestinatariosAnuncio() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(
						true));
	}

	public void definirTablaDestinatariosBuscados() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaAniadir(
						true));
	}

}