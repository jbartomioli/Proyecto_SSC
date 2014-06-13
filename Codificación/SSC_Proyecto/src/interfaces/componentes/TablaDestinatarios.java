package interfaces.componentes;

import java.util.Collection;

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
	
	
	public void completarTabla(Collection<negocio.Cliente> arrClientes)
	{						
		while (modeloTablaDestinatarios.getRowCount() > 0)
			modeloTablaDestinatarios.removeRow(0);
		
		modeloTablaDestinatarios.setNumRows(arrClientes.size());

		setModel(modeloTablaDestinatarios);
		int i = 0;
		for (negocio.Cliente clienteActual : arrClientes) {
			modeloTablaDestinatarios.setValueAt(clienteActual.getApellido(), i, 0);
			modeloTablaDestinatarios.setValueAt(clienteActual.getNombre(),	i, 1);
			modeloTablaDestinatarios.setValueAt(clienteActual.getEspecialidad(), i, 2);
			modeloTablaDestinatarios.setValueAt(new Boolean(false), i, 3);
			i++;
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
		
		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
			getColumnModel().getColumn(j).setResizable(false);
		
		getTableHeader().setReorderingAllowed(false);
		
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
	
	public void limpiar_tabla()
	{
		DefaultTableModel modelo_temp = (DefaultTableModel) this.getModel();
        int cant_filas = this.getRowCount()-1;
        for(int i=0; i<=cant_filas; i++)
        	modelo_temp.removeRow(0);
	}

}