package interfaces.componentes;

import java.util.Collection;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class TablaProductos extends JTable {
	
	private TableColumn columnaBoton;
	private DefaultTableModel modeloTablaProductos;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	public TablaProductos(Collection<negocio.Producto> productos)
	{
		modeloTablaProductos = new DefaultTableModel(); 
		modeloTablaProductos.addColumn("Producto"); 
		modeloTablaProductos.addColumn("Precio"); 
		modeloTablaProductos.addColumn("Stock"); 
		modeloTablaProductos.addColumn(""); 

		modeloTablaProductos.setNumRows(productos.size()); 
		
		setModel(modeloTablaProductos);

		
		int i = 0;
		for(negocio.Producto productoActual : productos)
		{
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 0); 
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(), i, 1); 
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 2);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 3);
			i++;
		} 
		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(3);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);
		
		TableColumn columnaNombre;
		columnaNombre = getColumn("Producto");
		columnaNombre.setPreferredWidth(275);
		
	}
	
	
	public void definirTablaProductosAnuncio()
	{
		columnaBoton.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(true));
	}
	
	
	
	
	public void definirTablaProductos()
	{
		columnaBoton.setCellRenderer(new interfaces.componentes.RendererBotonCeldaAniadir(true));
	}
	
	
	
	public void actualizarModelo(Collection<negocio.Producto> productos)
	{	
		modeloTablaProductos = new DefaultTableModel(); 
		modeloTablaProductos.addColumn("Producto"); 
		modeloTablaProductos.addColumn("Precio"); 
		modeloTablaProductos.addColumn("Stock"); 
		modeloTablaProductos.addColumn(""); 

		modeloTablaProductos.setNumRows(productos.size()); 
		
		setModel(modeloTablaProductos);

		
		int i = 0;
		for(negocio.Producto productoActual : productos)
		{
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 0); 
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(), i, 1); 
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 2);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 3);
			i++;
		} 
		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(3);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);
		
		TableColumn columnaNombre;
		columnaNombre = getColumn("Producto");
		columnaNombre.setPreferredWidth(275);
	}

}
