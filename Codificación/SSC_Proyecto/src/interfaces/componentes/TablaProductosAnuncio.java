package interfaces.componentes;

import java.util.Collection;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TablaProductosAnuncio extends JTable 
{
	private TableColumn columnaBoton;
	private DefaultTableModel modeloTablaProductos;
	private TableColumn columnaPrecioPromocional;
	private TableColumn columnaPrecio;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	public TablaProductosAnuncio() 
	{
		modeloTablaProductos = new DefaultTableModel();
		modeloTablaProductos.addColumn("ID");
		modeloTablaProductos.addColumn("Producto");
		modeloTablaProductos.addColumn("Precio");
		modeloTablaProductos.addColumn("Precio promocional");
		modeloTablaProductos.addColumn("Stock");
		modeloTablaProductos.addColumn("");
	}


	public void completarTabla(Collection<negocio.Producto> productos)
	{

		while (modeloTablaProductos.getRowCount() > 0)
			modeloTablaProductos.removeRow(0);

		modeloTablaProductos.setNumRows(productos.size());

		setModel(modeloTablaProductos);

		int i = 0;
		for (negocio.Producto productoActual : productos) {
			modeloTablaProductos.setValueAt(productoActual.getIdProducto(), i, 0);
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 1);
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(),i, 2);
			modeloTablaProductos.setValueAt(productoActual.getPrecioPromocional(),i, 3);
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 4);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 5);
			i++;
		}

		
		getColumn("ID").setWidth(0);
		getColumn("ID").setMaxWidth(0);
		getColumn("ID").setMinWidth(0);
		getColumn("ID").setPreferredWidth(0);
		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(5);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);
		

		TableColumn columnaNombre;
		columnaNombre = getColumn("Producto");
		columnaNombre.setPreferredWidth(275);
		
		columnaPrecio = getColumn("Precio promocional");
		columnaPrecio.setPreferredWidth(150);
		
		columnaPrecio = getColumn("Precio");
		columnaPrecioPromocional = getColumn("Precio promocional");
		
		columnaPrecio.setCellEditor(new interfaces.componentes.EditorCeldasMonto(this));
		columnaPrecioPromocional.setCellEditor(new interfaces.componentes.EditorCeldasMonto(this));
		
		DefaultTableCellRenderer AlinearNumero = new DefaultTableCellRenderer();
		AlinearNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getColumn("Stock").setCellRenderer(AlinearNumero);
		
		
		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
			getColumnModel().getColumn(j).setResizable(false);
		
		getTableHeader().setReorderingAllowed(false);
	}

	//
	public void definirTablaProductosAnuncio() 
	{
		columnaBoton.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(true));
		columnaPrecio.setCellRenderer(new interfaces.componentes.RendererFormatoPrecioTabla(false));
		columnaPrecioPromocional.setCellRenderer(new interfaces.componentes.RendererFormatoPrecioTabla(false));
	}

	//
	public void definirTablaProductos() 
	{
		columnaBoton.setCellRenderer(new interfaces.componentes.RendererBotonCeldaAniadir(true));
		columnaPrecio.setCellRenderer(new interfaces.componentes.RendererFormatoPrecioTabla(false));
		columnaPrecioPromocional.setCellRenderer(new interfaces.componentes.RendererFormatoPrecioTabla(false));
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
	    //Solo permite editar la columna Precio promocional 
//		switch (col) 
//		{
//	         case 2:
//	             return true;
//	         default:
	             return false;
//	      }
	}
}
