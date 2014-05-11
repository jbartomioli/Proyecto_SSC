package interfaces.componentes;

import java.util.Collection;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TablaProductos extends JTable {

	private TableColumn columnaBoton;
	private DefaultTableModel modeloTablaProductos;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	public TablaProductos() {
		modeloTablaProductos = new DefaultTableModel();
		modeloTablaProductos.addColumn("Producto");
		modeloTablaProductos.addColumn("Precio");
		modeloTablaProductos.addColumn("Stock");
		modeloTablaProductos.addColumn("");
	}


	public void completarTabla(Collection<negocio.Producto> productos) {

		while (modeloTablaProductos.getRowCount() > 0)
			modeloTablaProductos.removeRow(0);

		modeloTablaProductos.setNumRows(productos.size());

		setModel(modeloTablaProductos);

		int i = 0;
		for (negocio.Producto productoActual : productos) {
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 0);
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(),
					i, 1);
			modeloTablaProductos.setValueAt(
					productoActual.getExistenciaStock(), i, 2);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 3);
			i++;
		}

		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(3);
		columnaBoton
				.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);

		TableColumn columnaNombre;
		columnaNombre = getColumn("Producto");
		columnaNombre.setPreferredWidth(275);
	}

	//
	public void definirTablaProductosAnuncio() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(
						true));
	}

	//
	public void definirTablaProductos() {
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
