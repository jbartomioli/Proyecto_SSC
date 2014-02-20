package interfaces.componentes;

import java.util.Collection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaClientesDestino extends JTable {
	
	
	private DefaultTableModel modeloTablaClientes;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	
	public TablaClientesDestino()
	{
		
	}
	
	public void completarDatos(Collection<negocio.Cliente> clientes)
	{
		modeloTablaClientes = new DefaultTableModel(); 
		modeloTablaClientes.addColumn("Nombre"); 
		modeloTablaClientes.addColumn("Apellido"); 
		modeloTablaClientes.addColumn("E-mail");
		
		modeloTablaClientes.setNumRows(clientes.size()); 
		
		setModel(modeloTablaClientes);

		int i = 0;
		for(negocio.Cliente clienteActual : clientes)
		{
			modeloTablaClientes.setValueAt(clienteActual.getNombre(), i, 0); 
			modeloTablaClientes.setValueAt(clienteActual.getApellido(), i, 1);
			modeloTablaClientes.setValueAt(clienteActual.getEmail(), i, 2);
			i++;
		} 
	}
}
