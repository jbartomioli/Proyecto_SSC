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

	public TablaProductos() 
	{
		modeloTablaProductos = new DefaultTableModel();
		modeloTablaProductos.addColumn("Producto");
		modeloTablaProductos.addColumn("Precio");
		modeloTablaProductos.addColumn("Precio promocional");
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
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(),i, 1);
			modeloTablaProductos.setValueAt(productoActual.getPrecioPromocional(),i, 2);
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 3);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 4);
			i++;
		}

		
			columnaBoton = new TableColumn();
			columnaBoton = getColumnModel().getColumn(4);
			columnaBoton
					.setCellEditor(new interfaces.componentes.EditorCeldas(this));
			columnaBoton.setPreferredWidth(16);
			columnaBoton.setMaxWidth(16);
		

		TableColumn columnaNombre;
		columnaNombre = getColumn("Producto");
		columnaNombre.setPreferredWidth(275);
		
		TableColumn columnaPrecio;
		columnaPrecio = getColumn("Precio promocional");
		columnaPrecio.setPreferredWidth(150);
		
		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
			getColumnModel().getColumn(j).setResizable(false);
		
		getTableHeader().setReorderingAllowed(false);
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
	
	public boolean isCellEditable(int row, int col) 
	{
	    //Solo permite editar las columnas Precio y Precio promocional 
		switch (col) 
		{
	         case 1:
	         case 2:
	             return true;
	         default:
	             return false;
	      }
	}
}
