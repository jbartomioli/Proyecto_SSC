<<<<<<< .mine
package explorador_bd;

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

	}
}
=======
package explorador_bd;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ClienteVentas extends JFrame {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	public ClienteVentas() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(202, 249, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(46, 249, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(79, 11, 194, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(23, 107, 484, 131);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(23, 14, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(23, 92, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 48, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 42, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(142, 42, 46, 14);
		getContentPane().add(lblNewLabel_3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
>>>>>>> .r28
