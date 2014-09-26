package interfaces.componentes;

import java.util.Collection;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TablaProductos extends JTable {

	private TableColumn columnaBoton;
	private TableColumn columnaPrecio;
	private TableColumn columnaPrecioPromocional;
	private DefaultTableModel modeloTablaProductos;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	public TablaProductos() 
	{
		modeloTablaProductos = new DefaultTableModel();
		modeloTablaProductos.addColumn("Id");
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
			modeloTablaProductos.setValueAt(productoActual.getIdProducto(), i, 0);
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 1);
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(),i, 2);
			modeloTablaProductos.setValueAt(productoActual.getPrecioPromocional(),i, 3);
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 4);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 5);
			i++;
		}

		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(5);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);
		

		TableColumn columnaNombre;
		columnaNombre = getColumn("Producto");
		columnaNombre.setPreferredWidth(275);
		
		columnaPrecio = getColumn("Precio");
		columnaPrecioPromocional = getColumn("Precio promocional");
		
		columnaPrecio.setCellEditor(new interfaces.componentes.EditorCeldasMonto(this));
		columnaPrecioPromocional.setCellEditor(new interfaces.componentes.EditorCeldasMonto(this));


		columnaPrecioPromocional.setPreferredWidth(150);
		
		this.ocultar_columna(0);
		
		
		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
			getColumnModel().getColumn(j).setResizable(false);
		
		getTableHeader().setReorderingAllowed(false);
	}

	
	//
	public void ocultar_columna(int nroColumna)
	{
		this.getColumn(this.getColumnName(nroColumna)).setWidth(0);
		this.getColumn(this.getColumnName(nroColumna)).setMinWidth(0);
		this.getColumn(this.getColumnName(nroColumna)).setMaxWidth(0);
	}
	

	
	
	
	//
	public void definirTablaProductos() 
	{
		columnaBoton.setCellRenderer(new interfaces.componentes.RendererBotonCeldaModificar(true));
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
//	    //Solo permite editar las columnas Precio y Precio promocional 
//		switch (col) 
//		{
//	         case 5:
//	             return true;
//	         default:
	             return false;
//	      }
	}
}
