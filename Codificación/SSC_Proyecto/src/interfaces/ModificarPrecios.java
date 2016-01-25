package interfaces;

import interfaces.componentes.BotonesIconos;
import interfaces.componentes.ComboCategorias;
import interfaces.componentes.ComboSubcategorias;
import interfaces.componentes.JDialogBaseFormularios;
import interfaces.componentes.TablaProductos;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import java.awt.Component;

import javax.swing.UIManager;


/**
 * PANTALLA DE MODIFICACION DE PRECIOS
 */
public class ModificarPrecios
{
	//COMPONENTES
	public JDialogBaseFormularios frmModificarPrecios;
	public JTextField txtBuscarProductos;
	public ComboCategorias cmbCategorias;
	public ComboSubcategorias cmbSubcategorias;
	public TablaProductos tblProductos;
	public BotonesIconos btnBuscarProducto;
	public BotonesIconos btnAceptar;



	/**
	 * CONSTRUCTOR
	 * @param padre
	 * @throws Exception
	 */
	public ModificarPrecios(Object padre) 
	{	
		//FORMULARIO BASE
		if(padre.getClass().getSuperclass().toString().equals("class javax.swing.JFrame"))
			frmModificarPrecios = new JDialogBaseFormularios((JFrame) padre,"Modificar Precios","PRECIO.png",true);
		else
			frmModificarPrecios = new JDialogBaseFormularios((JDialog) padre,"Modificar Precios","PRECIO.png",true);

		frmModificarPrecios.setDimensionFormulario(650, 460);
		frmModificarPrecios.setBotonAyuda(600, 11);
		

		//TITULO
		JLabel lblPrecios = new JLabel("Modificar Precios");
		lblPrecios.setLabelFor(frmModificarPrecios.getContentPane());
		lblPrecios.setForeground(Color.DARK_GRAY);
		lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrecios.setBounds(10, 11, 341, 20);
		frmModificarPrecios.getContentPane().add(lblPrecios);
		
				
		//CATEGORIAS
		JLabel lblCategoria = new JLabel("Categoría:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(10, 43, 77, 23);
		frmModificarPrecios.getContentPane().add(lblCategoria);
		
		cmbCategorias = new ComboCategorias();
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(87, 43, 200, 23);
		frmModificarPrecios.getContentPane().add(cmbCategorias);
		
		
		//SUBCATEGORIAS
		JLabel lblSubcategoria = new JLabel("Subcategoria:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(334, 43, 97, 23);
		frmModificarPrecios.getContentPane().add(lblSubcategoria);
				
		cmbSubcategorias = new ComboSubcategorias();
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		cmbSubcategorias.setBounds(434, 43, 196, 23);
		frmModificarPrecios.getContentPane().add(cmbSubcategorias);
		
				
		//BUSCADOR
		txtBuscarProductos = new JTextField();
		txtBuscarProductos.setForeground(Color.GRAY);
		txtBuscarProductos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarProductos.setText("Ingrese Descripci\u00F3n...");
		txtBuscarProductos.setBounds(20, 88, 411, 20);
		txtBuscarProductos.setColumns(10);
		frmModificarPrecios.getContentPane().add(txtBuscarProductos);
		
		btnBuscarProducto = new BotonesIconos("BUSCAR.png");
		btnBuscarProducto.setBounds(444, 89, 30, 19);
		frmModificarPrecios.getContentPane().add(btnBuscarProducto);
		
		
		//TABLA PRODUCTOS
		Box boxPrecios = Box.createHorizontalBox();
		boxPrecios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Precios Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxPrecios.setBounds(10, 120, 622, 222);
		frmModificarPrecios.getContentPane().add(boxPrecios);
		
		JScrollPane scrollPrecios = new JScrollPane();
		scrollPrecios.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPrecios.setAlignmentX(Component.LEFT_ALIGNMENT);
		boxPrecios.add(scrollPrecios);
		
		scrollPrecios.setViewportView(tblProductos);
				
		tblProductos = new interfaces.componentes.TablaProductos();
		scrollPrecios.setViewportView(tblProductos);
		
		
		//BOTON ACEPTAR
		btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");
		btnAceptar.setLocation(540, 357);
		frmModificarPrecios.getContentPane().add(btnAceptar);
		/////////////////////////////////////////////////////
	}
}