package interfaces.componentes;


import java.util.Collection;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TablaImportacionDatos extends JTable {
	
	
	private DefaultTableModel modeloTablaImportacion;

	private TableColumn columnaBoton;

	/**
	 * 
	 */
	private static final long serialVersionUID = -6350468692762393156L;

	
	public TablaImportacionDatos()
	{
		modeloTablaImportacion = new DefaultTableModel(); 
		modeloTablaImportacion.addColumn("ID");
		modeloTablaImportacion.addColumn("Tabla"); 
		modeloTablaImportacion.addColumn("Ruta de Archivo de Origen de Datos"); 
		modeloTablaImportacion.addColumn("");
	}
	
	public void completarDatos(Collection<String> nombresTablas)
	{
		
		modeloTablaImportacion.setNumRows(nombresTablas.size()); 
		
		setModel(modeloTablaImportacion);

		int i=0;
		
		for(String elemento : nombresTablas)
		{
			modeloTablaImportacion.setValueAt(i, i, 0);
			modeloTablaImportacion.setValueAt(elemento, i, 1);
			modeloTablaImportacion.setValueAt("C:\\Escritorio\\Clientes.csv", i, 2);		
			modeloTablaImportacion.setValueAt(new Boolean(false), i, 3);
			++i;
		} 
		
		getColumn("ID").setWidth(0);
		getColumn("ID").setMaxWidth(0);
		getColumn("ID").setMinWidth(0);
		getColumn("ID").setPreferredWidth(0);
		
		columnaBoton = new TableColumn();
		columnaBoton = getColumnModel().getColumn(3);
		columnaBoton.setCellEditor(new interfaces.componentes.EditorCeldas(this));
		columnaBoton.setPreferredWidth(16);
		columnaBoton.setMaxWidth(16);
		
//		TableColumn columnaNombre;
//		columnaNombre = getColumn("Apellido");
//		columnaNombre.setPreferredWidth(100);
//		
//		TableColumn columnaNombre1;
//		columnaNombre1 = getColumn("Nombre");
//		columnaNombre1.setPreferredWidth(100);
		
//		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
//			getColumnModel().getColumn(j).setResizable(false);
		
//		getTableHeader().setReorderingAllowed(false);
		
	}
	
	
	
	//
	public void definirTablaImportacion() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaModificar(
						true));
	}
	
	
	
//	public void limpiar_tabla()
//	{
//		DefaultTableModel modelo_temp = (DefaultTableModel) this.getModel();
//        int cant_filas = this.getRowCount()-1;
//        for(int i=0; i<=cant_filas; i++)
//        	modelo_temp.removeRow(0);
//	}
	
	//No permite editar las celdas de la tabla
	public boolean isCellEditable(int rowIndex, int vColIndex)
	{
		return false;
	}
}
