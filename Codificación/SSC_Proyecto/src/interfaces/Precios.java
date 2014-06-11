package interfaces;
//PANTALLA CORRESPONDIENTE AL CU CONFECCIONAR ANUNCIOS

import interfaces.componentes.BotonesIconos;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Precios extends JDialog {
	
	private static final long serialVersionUID = 1L;

	private JTextField txtBuscarProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private negocio.Categoria categoria;
	private interfaces.componentes.TablaProductos tblProductos;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private interfaces.componentes.BotonesIconos btnCancelar;
	private negocio.ControladorConfeccionarAnuncio controladorAux;
	//private negocio.CatalogoClientes catClie;


	//CONSTRUCTOR
	public Precios(Frame padre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorAnuncios) 
	{
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
		setMaximumSize(new Dimension(1366, 768));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);	
		setTitle("Modificar Precios");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CLIENTES_32.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
	
		JLabel lblPrecios = new JLabel("Modificar Precios");
		lblPrecios.setForeground(Color.DARK_GRAY);
		lblPrecios.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPrecios.setBounds(10, 30, 341, 29);
		getContentPane().add(lblPrecios);
		
				
		JLabel lblCategoria = new JLabel("Categoría:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCategoria.setBounds(20, 87, 77, 23);
		getContentPane().add(lblCategoria);
				
		
		cmbCategorias = new interfaces.componentes.ComboCategorias();
		cmbCategorias.completarDatos(controladorAux.getCatalogoCategorias().getCategorias());
		
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				clickComboCategorias(evento);
				}});
		
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(97, 87, 200, 23);
		getContentPane().add(cmbCategorias);
		
		JLabel lblSubcategoria = new JLabel("Subcategoria:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(324, 87, 97, 23);
		getContentPane().add(lblSubcategoria);
		
		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		
		cmbSubcategorias = new interfaces.componentes.ComboSubcategorias();
		cmbSubcategorias.completarDatos(
				controladorAux.seleccionarCategoria(categoria.getIdCategoria()));
		
		cmbSubcategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				clickComboSubcategorias(evento);
			}
		});
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		cmbSubcategorias.setBounds(424, 87, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
		txtBuscarProductos = new JTextField();
		txtBuscarProductos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evento) {
				//Busca productos si el usuario presiona enter
				if(evento.getKeyCode() == KeyEvent.VK_ENTER)
				{
					negocio.CatalogoProductos catProd = new negocio.CatalogoProductos();
					
					catProd.obtenerProductos();
							
					tblProductos.completarTabla(catProd.buscarProducto(txtBuscarProductos.getText()));
					//tblProductos.definirTablaProductos();
				}
			}
		});
		
		txtBuscarProductos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				txtBuscarProductos.setText("");
				txtBuscarProductos.setForeground(SystemColor.black);
			}
		});
		txtBuscarProductos.setForeground(Color.GRAY);
		txtBuscarProductos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarProductos.setText("ingrese descripcion...");
		txtBuscarProductos.setBounds(677, 87, 141, 20);
		txtBuscarProductos.setColumns(10);
		getContentPane().add(txtBuscarProductos);
			
		Box boxPrecios = Box.createHorizontalBox();
		boxPrecios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Precios Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxPrecios.setBounds(10, 134, 500, 250);
		getContentPane().add(boxPrecios);
		
		JScrollPane scrollPrecios = new JScrollPane();
		boxPrecios.add(scrollPrecios);
		
		scrollPrecios.setViewportView(tblProductos);	
						
		btnAceptar = new BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	clickBotonAceptar(evento);}});
		
		btnAceptar.setLocation(324, 569);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new BotonesIconos("Cancelar",utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
	        	clickBotonCancelar(evento);}});
		
		btnCancelar.setLocation(424, 569);
		getContentPane().add(btnCancelar);
		
		JButton btnBuscarProducto = new JButton("");
		btnBuscarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) 
			{
				//Evento para buscar destinatarios que coincidan con el string ingresado
				clickBotonBuscar(evento);
			}
		});
		btnBuscarProducto.setIcon(new ImageIcon(Precios.class.getResource("/resources/images/x16/find.png")));
		btnBuscarProducto.setBounds(818, 87, 30, 19);
		getContentPane().add(btnBuscarProducto);
	}	
	
	// EVENTOS
	public void clickComboCategorias(ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{
			categoria = new negocio.Categoria();
			
			categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
			
			categoria.obtenerSubCategorias();
			
			cmbSubcategorias.completarDatos(
					controladorAux.seleccionarCategoria(categoria.getIdCategoria()));	
			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
						
			tblProductos.completarTabla(controladorAux.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}
	
	
	protected void clickComboSubcategorias(ItemEvent evento)
	{		
		if(evento.getStateChange() == ItemEvent.SELECTED)
		{			
			negocio.SubCategoria subcategoriaSeleccionada = new negocio.SubCategoria();
			
			subcategoriaSeleccionada = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
			subcategoriaSeleccionada.obtenerProductos();
			
			tblProductos.completarTabla(controladorAux.seleccionarSubcategoria(
					subcategoriaSeleccionada.getIdcategoria(),
					subcategoriaSeleccionada.getIdSubcategoria()));
		}
	}

	
	public void clickBotonCancelar(ActionEvent evento)
	{
		int rta = JOptionPane.showConfirmDialog(
				this, 
				"¿Desea salir y volver a la pantalla Generar Anuncio?\n"
					+ "Todo cambio que no haya guardado se perderá.",
				"ATENCIÓN",
				JOptionPane.YES_NO_OPTION);
			
		switch(rta)
		{
		case(1): //finalizarEdicion();
			break;
		case(0): limpiar_formulario();
			 dispose();
			 break;
		}
	}
	
	public void clickBotonAceptar(ActionEvent evento)
	{
		//Evento para guardar los datos
		dispose();
	}
	
	public void clickBotonBuscar(ActionEvent evento)
	{
		//Evento para llenar la tabla de productos buscados desde la lupa
		negocio.CatalogoProductos catProd = new negocio.CatalogoProductos();
		
		catProd.obtenerProductos();
		tblProductos.completarTabla(catProd.buscarProducto(txtBuscarProductos.getText()));
		tblProductos.definirTablaProductos();
	}
	
		
	//-----------------------------------------------------------------
	protected void limpiar_formulario()
	{
		cmbCategorias.setSelectedIndex(0);
		txtBuscarProductos.setText("");
			
		tblProductos.limpiar_tabla();
	}
}