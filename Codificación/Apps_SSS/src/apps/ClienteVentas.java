package apps;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.LayoutManager;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;



public class ClienteVentas extends JFrame {
	

	//CTES BD
	static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	static final String USER = "ssc_acceso";
	static final String PASS = "zLvSUVUaDnWFNKzG";
	static final String PORT = "3306";
	static final String DATABASE = "BD_SSC";
	static final String URL_BD = "bartomserver.sytes.net:"+PORT+"/"+DATABASE; 

	
	
	//Consulta SQL
	static final String CONSULTA_SQL = "SELECT * FROM clientes";
	
	//----------------------------------------
	private ResultSetTableModel modeloTabla;
	
	private JTextField txtCliente, txtVenta;
	private JTable tabDatos;

	
	
	
	
	public ClienteVentas() {
		
		super("Visor de ventas");
			
		try 
		{
			modeloTabla = new ResultSetTableModel(CONTROLADOR,URL_BD, USER, PASS, CONSULTA_SQL);
			
			
			getContentPane().setLayout(null);
			
			//--
			JLabel lblCliente = new JLabel("Cliente");
			lblCliente.setBounds(23, 14, 46, 14);
			getContentPane().add(lblCliente);
			
			txtCliente = new JTextField();
			txtCliente.setEnabled(false);
			txtCliente.setBounds(68, 11, 194, 20);
			getContentPane().add(txtCliente);
			txtCliente.setColumns(10);
	
			//--
			JLabel lblVenta = new JLabel("Venta");
			lblVenta.setBounds(23, 45, 46, 14);
			getContentPane().add(lblVenta);
			
			txtVenta = new JTextField();
			txtVenta.setEnabled(false);
			txtVenta.setBounds(68, 42, 114, 20);
			getContentPane().add(txtVenta);
			txtVenta.setColumns(10);
			
			//--
			JLabel lblProductos = new JLabel("Productos");
			lblProductos.setBounds(23, 70, 57, 14);
			getContentPane().add(lblProductos);
			
			tabDatos = new JTable(modeloTabla);
			tabDatos.setBounds(23, 89, 484, 149);
			getContentPane().add(tabDatos);
			
			//--
			JButton btnAnterior = new JButton("<< Anterior");
			btnAnterior.setBounds(23, 249, 101, 23);
			getContentPane().add(btnAnterior);
			
			JButton btnSiguiente = new JButton("Siguiente >>");
			btnSiguiente.setBounds(134, 249, 101, 23);
			getContentPane().add(btnSiguiente);
			
			//--
			
			
			Button btnSalir = new Button("Salir");
			btnSalir.setBounds(406, 249, 101, 23);
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			getContentPane().add(btnSalir);
			// TODO Auto-generated constructor stub
		
		
		} 
		
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClienteVentas();
	}
}