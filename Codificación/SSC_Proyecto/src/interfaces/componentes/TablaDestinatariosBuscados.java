package interfaces.componentes;

import java.util.Collection;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class TablaDestinatariosBuscados extends JTable {

	private TableColumn columnaBoton;
	private DefaultTableModel modeloTablaDestinatarios;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	/**
	 * Create the frame.
	 */
	public TablaDestinatariosBuscados() {
		modeloTablaDestinatarios = new DefaultTableModel(); 
		modeloTablaDestinatarios.addColumn("Apellido"); 
		modeloTablaDestinatarios.addColumn("Nombre"); 
		modeloTablaDestinatarios.addColumn("Especialidad"); 
		modeloTablaDestinatarios.addColumn(""); 
	}
	
	
	//
	public void completarTabla(Collection<negocio.Cliente> clientes)
	{					
		
		while(modeloTablaDestinatarios.getRowCount() > 0) 
				modeloTablaDestinatarios.removeRow(0);
		
		modeloTablaDestinatarios.setNumRows(clientes.size()); 

		setModel(modeloTablaDestinatarios);
		
		/*int i = 0;
		for(negocio.Producto productoActual : productos)
		{
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 0); 
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(), i, 1); 
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 2);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 3);
			i++;
		} */
		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(3);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(10);
		columnaBoton.setMaxWidth(10);
		
		TableColumn columnaNombre;
		columnaNombre = getColumn("Apellido");
		columnaNombre.setPreferredWidth(100);
		
		TableColumn columnaNombre1;
		columnaNombre1 = getColumn("Nombre");
		columnaNombre1.setPreferredWidth(100);
	}
	
	
	//Agrega filas a la tabla de clientes buscados cuando se selecciona una especialidad
	public void agregarFila(Object [] fila)
	{
		modeloTablaDestinatarios.addRow(fila);
	}
	
	public void definirTablaDestinatariosAnuncio() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(
						true));
	}

	//
	public void definirTablaDestinatariosBuscados() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaAniadir(
						true));
	}

}