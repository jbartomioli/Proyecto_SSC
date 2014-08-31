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
	
	public void completarNombreTablas(Collection<String> tablas)
	{
		
		modeloTablaImportacion.setNumRows(tablas.size()); 
		
		setModel(modeloTablaImportacion);

		int i=0;
		
		for(String elemento : tablas)
		{
			modeloTablaImportacion.setValueAt(i, i, 0);
			modeloTablaImportacion.setValueAt(elemento, i, 1);
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
		
		TableColumn columnaNombre;
		columnaNombre = getColumn("Tabla");
		columnaNombre.setPreferredWidth(30);
		
		TableColumn columnaArchivo;
		columnaArchivo = getColumn("Ruta de Archivo de Origen de Datos");
		columnaArchivo.setPreferredWidth(200);
		
		for(int j=0; j<getColumnModel().getColumnCount(); ++j)
			getColumnModel().getColumn(j).setResizable(false);
		
		getTableHeader().setReorderingAllowed(false);
		
	}
	
	
	
	//
	public void completarRutaArchivos(String dirRaiz, Collection<String> tablas, Collection<String> archivos)
	{
		int i=0;
		for(String tablaActual : tablas)
		{
			for(String archivoActual : archivos)
			{
				if(tablaActual.equals(archivoActual.substring(0, archivoActual.length()-4)))
				{
					modeloTablaImportacion.setValueAt(dirRaiz+archivoActual, i, 2);
				}
			}
			i++;
		}
	}
	
	
	//
	public void definirTablaImportacion() {
		columnaBoton
				.setCellRenderer(new interfaces.componentes.RendererBotonCeldaModificar(
						true));
	}
	
	

	//No permite editar las celdas de la tabla
	public boolean isCellEditable(int rowIndex, int vColIndex)
	{
		return false;
	}
}
