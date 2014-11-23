package interfaces;

import interfaces.componentes.BotonesIconos;
import interfaces.componentes.JDialogBaseFormularios;
import interfaces.componentes.TablaImportacionDatos;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;


/**
 * PANTALLA DE IMPORTACION DE DATOS
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class ImportarDatos
{	
	//COMPONENTES
	public JDialogBaseFormularios frmImportarDatos;
	private JLabel lblImportarDatos;
	public TablaImportacionDatos tblImportacion;
	public BotonesIconos btnProcesar;
	public BotonesIconos btnAceptar;


	
	/**
	 * CONSTRUCTOR
	 * @param dialogPadre
	 * @throws Exception 
	 */
	public ImportarDatos(JFrame dialogPadre)
	{
		//FORMULARIO BASE
		frmImportarDatos = new JDialogBaseFormularios(dialogPadre, "Importar Datos","IMPORTAR.png",true);
		frmImportarDatos.setDimensionFormulario(800, 460);
		frmImportarDatos.setBotonAyuda(750,17);
		
		
			//TITULO
			lblImportarDatos = new JLabel("Importar Datos al Sistema");
			lblImportarDatos.setForeground(Color.DARK_GRAY);
			lblImportarDatos.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblImportarDatos.setBounds(10, 11, 266, 29);
			frmImportarDatos.getContentPane().add(lblImportarDatos);
			
		
			//TABLAS
			Box boxTablas = Box.createHorizontalBox();
			boxTablas.setBorder(new TitledBorder(null, "Tablas a Importar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			boxTablas.setBounds(10, 52, 772, 292);
			frmImportarDatos.getContentPane().add(boxTablas);
			
			JScrollPane scrollTablas = new JScrollPane();
			boxTablas.add(scrollTablas);
			
			tblImportacion = new TablaImportacionDatos();
			scrollTablas.setViewportView(tblImportacion);
			
					
			//BOTON PROCESAR
			btnProcesar = new BotonesIconos("Procesar","IMPORTAR.png");
			btnProcesar.setBounds(590, 356, 90, 60);
			frmImportarDatos.getContentPane().add(btnProcesar);
			
			
			//BOTON PROCESAR
			btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");		
			btnAceptar.setLocation(692, 356);
			frmImportarDatos.getContentPane().add(btnAceptar);		
	}
	//////////////////////////////////////////////////////////
}
