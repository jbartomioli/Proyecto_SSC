package interfaces;
/*
 * PANTALLA CORRESPONDIENTE AL CU GENERAR ANUNCIO
 */

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.UIManager;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class GenerarAnuncio extends JDialog {
	//SERIALIZABLE
	private static final long serialVersionUID = 4454249604145639442L;
	
	//COMPONENTES
	private JTable tblProductosAnuncio;
	private JTable tblDestinatarios;
	private JTable tblProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private negocio.Categoria categoria;
	private interfaces.componentes.BotonesIconos btnGenerar;
	private interfaces.componentes.BotonesIconos btnGuardar;
	private interfaces.componentes.BotonesIconos btnCerrar;
	
	private negocio.ControladorConfeccionarAnuncio controladorAux;

	/**
	 * Create the frame.
	 */
	public GenerarAnuncio(Frame padre, boolean modal, negocio.ControladorConfeccionarAnuncio controladorAnuncios) {
		
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(1024, 768));
		getContentPane().setMinimumSize(new Dimension(1024, 768));
		getContentPane().setMaximumSize(new Dimension(1366, 768));
		setMaximumSize(new Dimension(1366, 768));
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-40);
		setLocationRelativeTo(null);
		setTitle("Confeccionar Anuncio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CONFECCIONAR_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(20, 39, 77, 23);
		getContentPane().add(lblCategoria);
		
		controladorAux = controladorAnuncios;

		cmbCategorias = new interfaces.componentes.ComboCategorias(controladorAux.getCatalogoCategorias().getCategorias());
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(97, 39, 200, 23);
		getContentPane().add(cmbCategorias);
		
		JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(320, 39, 97, 23);
		getContentPane().add(lblSubcategoria);

		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		
		cmbSubcategorias = new interfaces.componentes.ComboSubcategorias(controladorAux.seleccionarCategoria(categoria.getIdCategoria()));
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		cmbSubcategorias.setBounds(420, 39, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
		Box boxProductosAnuncio = Box.createHorizontalBox();
		boxProductosAnuncio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductosAnuncio.setBounds(10, 106, 464, 244);
		getContentPane().add(boxProductosAnuncio);
		
		JScrollPane scrollProductosAnuncio = new JScrollPane();
		scrollProductosAnuncio.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollProductosAnuncio.setAlignmentX(Component.LEFT_ALIGNMENT);
		boxProductosAnuncio.add(scrollProductosAnuncio);
		
		String[] columnNames = {"Producto", "Precio", "Stock", "Elimina"};
		
		
		negocio.SubCategoria subcategoriaActual = (negocio.SubCategoria) cmbSubcategorias.getSelectedItem();
		

		Object[][] data = {
			    {"Barbijo", "$2.50", "500", new Boolean(false)},
			    {"Gasas", "$5.00", "1000", new Boolean(true)},
			    {"Pinza", "$50.00", "25", new Boolean(false)},
			    {"Amalgama", "$2.00", "650", new Boolean(true)},
			};
		
		tblProductosAnuncio = new JTable(data,columnNames);
		
		scrollProductosAnuncio.setViewportView(tblProductosAnuncio);
		
		TableColumn agregarColumn = new TableColumn();
		agregarColumn = tblProductosAnuncio.getColumnModel().getColumn(3);
		agregarColumn.setCellEditor(new interfaces.componentes.EditorCeldas(tblProductosAnuncio));
		agregarColumn.setCellRenderer(new interfaces.componentes.RendererBotonCeldaEliminar(true));
		
		
		
		
		
		Box boxProductos = Box.createHorizontalBox();
		boxProductos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductos.setBounds(504, 106, 400, 466);
		getContentPane().add(boxProductos);
		
		JScrollPane scrollProductos = new JScrollPane();
		scrollProductos.setAlignmentY(0.0f);
		scrollProductos.setAlignmentX(0.0f);
		boxProductos.add(scrollProductos);
		
		
		DefaultTableModel modeloTablaProductos = new DefaultTableModel(); 
		modeloTablaProductos.addColumn("Producto"); 
		modeloTablaProductos.addColumn("Precio"); 
		modeloTablaProductos.addColumn("Stock"); 
		modeloTablaProductos.addColumn("A�ade"); 
		modeloTablaProductos.setNumRows(controladorAux.seleccionarSubcategoria(subcategoriaActual.getIdSubcategoria()).size()); 
		
		
		int i = 0;
		for(negocio.Producto productoActual : controladorAux.seleccionarSubcategoria(subcategoriaActual.getIdSubcategoria()) )
		{
			modeloTablaProductos.setValueAt(productoActual.getNombre(), i, 0); 
			modeloTablaProductos.setValueAt(productoActual.getPrecioActual(), i, 1); 
			modeloTablaProductos.setValueAt(productoActual.getExistenciaStock(), i, 2);
			modeloTablaProductos.setValueAt(new Boolean(false), i, 3);
			i++;
		} 
		
		tblProductos = new JTable();
		tblProductos.setModel(modeloTablaProductos);
		scrollProductos.setViewportView(tblProductos);
		
		TableColumn agregarColumna;
		agregarColumna = tblProductos.getColumnModel().getColumn(3);
		agregarColumna.setCellEditor(new interfaces.componentes.EditorCeldas(tblProductos));
		agregarColumna.setCellRenderer(new interfaces.componentes.RendererBotonCeldaAniadir(true));
		
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatarios del Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 380, 464, 192);
		getContentPane().add(boxDestinatarios);
		
		JScrollPane scrollDestinatarios = new JScrollPane();
		boxDestinatarios.add(scrollDestinatarios);
		
		tblDestinatarios = new JTable();
		tblDestinatarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Apellido", "Nombre"
			}
		));
		scrollDestinatarios.setViewportView(tblDestinatarios);
		

		
		JLabel lblModificarDestinatarios = new JLabel("Modificar destinatarios");
		lblModificarDestinatarios.setForeground(SystemColor.inactiveCaptionText);
		lblModificarDestinatarios.setBorder(new BevelBorder(0));
		// Cambia el tipo de cursor al posarlo sobre el link
		lblModificarDestinatarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblModificarDestinatarios.setBackground(UIManager.getColor("Button.disabledForeground"));
		lblModificarDestinatarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				System.out.println("Hola mundo");
			}
		});
		lblModificarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModificarDestinatarios.setBounds(330, 577, 144, 14);
		getContentPane().add(lblModificarDestinatarios);
		
		
		btnGenerar = new interfaces.componentes.BotonesIconos("Generar", utilidades.Configuraciones.IMG_ICONOS+"GENERAR_32.png");
		btnGenerar.setLocation(10, 609);
		getContentPane().add(btnGenerar);
		
		
		btnGuardar = new interfaces.componentes.BotonesIconos("Guardar", utilidades.Configuraciones.IMG_ICONOS+"GUARDAR_32.png");
		btnGuardar.setLocation(698, 609);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getContentPane().add(btnGuardar);
		
		
		btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(817, 609);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		getContentPane().add(btnCerrar);
		
		
		
		cmbCategorias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();					
					cmbSubcategorias.actualizarModelo(controladorAux.seleccionarCategoria(categoria.getIdCategoria()));					
				}
			}
		});
	}
}
