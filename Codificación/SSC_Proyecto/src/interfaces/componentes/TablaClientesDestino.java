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
		modeloTablaClientes.addColumn("Apellido"); 
		modeloTablaClientes.addColumn("Nombre"); 
		modeloTablaClientes.addColumn("E-mail");
		
		modeloTablaClientes.setNumRows(clientes.size()); 
		
		setModel(modeloTablaClientes);

		int i = 0;
		for(negocio.Cliente clienteActual : clientes)
		{
			modeloTablaClientes.setValueAt(clienteActual.getApellido(), i, 0);
			modeloTablaClientes.setValueAt(clienteActual.getNombre(), i, 1);
			modeloTablaClientes.setValueAt(clienteActual.getEmail(), i, 2);
			i++;
		} 
		
		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
			getColumnModel().getColumn(j).setResizable(false);
		
		getTableHeader().setReorderingAllowed(false);
	}
	
	public void limpiar_tabla()
	{
		DefaultTableModel modelo_temp = (DefaultTableModel) this.getModel();
        int cant_filas = this.getRowCount()-1;
        for(int i=0; i<=cant_filas; i++)
        	modelo_temp.removeRow(0);
	}
	
	//No permite editar las celdas de la tabla
	public boolean isCellEditable(int rowIndex, int vColIndex)
	{
		return false;
	}
}
