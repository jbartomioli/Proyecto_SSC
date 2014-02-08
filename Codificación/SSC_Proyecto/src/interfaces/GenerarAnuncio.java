package interfaces;


import interfaces.componentes.BotonesIconos;

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
import java.util.ArrayList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;





public class GenerarAnuncio extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4454249604145639442L;
	
	private JTable tblProductosAnuncio;
	private JTable tblDestinatarios;
	private JTable tblProductos;
	private interfaces.componentes.ComboCategorias cmbCategorias;
	private interfaces.componentes.ComboSubcategorias cmbSubcategorias;
	private negocio.Categoria categoria;
	private interfaces.componentes.BotonesIconos btnGenerar;
	private interfaces.componentes.BotonesIconos btnGuardar;
	private interfaces.componentes.BotonesIconos btnCerrar;
	

	/**
	 * Create the frame.
	 */
	public GenerarAnuncio(Frame padre, boolean modal, utilidades.Configuraciones configuraciones) {
		
		super(padre);

		//
		negocio.ControladorConfeccionarAnuncio ctrlAnuncio = new negocio.ControladorConfeccionarAnuncio();
		
		setTitle("Confeccionar Anuncio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(configuraciones.getIMG_ICONOS()+"CONFECCIONAR_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setSize(new Dimension(1366, 738));
		getContentPane().setLayout(null);
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(20, 39, 77, 23);
		getContentPane().add(lblCategoria);
		
		ArrayList<String> array = new  ArrayList<String>(); 
		for(negocio.Categoria cat : ctrlAnuncio.getCctg().getCategorias())
		{
			array.add(cat.getDescripcion());
		}
		


		cmbCategorias = new interfaces.componentes.ComboCategorias(ctrlAnuncio.getCctg().getCategorias());
		lblCategoria.setLabelFor(cmbCategorias);
		cmbCategorias.setBounds(97, 39, 200, 23);
		getContentPane().add(cmbCategorias);
		
		JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(320, 39, 97, 23);
		getContentPane().add(lblSubcategoria);

		categoria = (negocio.Categoria) cmbCategorias.getSelectedItem();
		categoria.obtenerSubCategorias();
		
		cmbSubcategorias = new interfaces.componentes.ComboSubcategorias(categoria.getSubCats());
		lblSubcategoria.setLabelFor(cmbSubcategorias);
		//cmbSubcategoria.setModel(new DefaultComboBoxModel(new String[] {"", "Jeringas", "Algodones y gasas", "Obturadores", "Barbijos"}));
		cmbSubcategorias.setBounds(420, 39, 196, 23);
		getContentPane().add(cmbSubcategorias);
		
		Box boxProductosAnuncio = Box.createHorizontalBox();
		boxProductosAnuncio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos Anuncio", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductosAnuncio.setBounds(10, 100, 700, 250);
		getContentPane().add(boxProductosAnuncio);
		
		JScrollPane scrollProductosAnuncio = new JScrollPane();
		scrollProductosAnuncio.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollProductosAnuncio.setAlignmentX(Component.LEFT_ALIGNMENT);
		boxProductosAnuncio.add(scrollProductosAnuncio);
		
		String[] columnNames = {"Producto",
                "Precio",
                "Stock",
                ""};
		
		Object[][] data = {
			    {"Barbijo", "$2.50", "500", new Boolean(false)},
			    {"Gasas", "$5.00", "1000", new Boolean(true)},
			    {"Pinza", "$50.00", "25", new Boolean(false)},
			    {"Amalgama", "$2.00", "650", new Boolean(true)},
			};
		
		tblProductosAnuncio = new JTable(data, columnNames);
		
		scrollProductosAnuncio.setViewportView(tblProductosAnuncio);
		
		TableColumn agregarColumn;
		agregarColumn = tblProductosAnuncio.getColumnModel().getColumn(3);
		agregarColumn.setCellEditor(new myeditor(tblProductosAnuncio));
		agregarColumn.setCellRenderer(new myrenderer(true));
		
		Box boxProductos = Box.createHorizontalBox();
		boxProductos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Productos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxProductos.setBounds(850, 100, 400, 400);
		getContentPane().add(boxProductos);
		
		JScrollPane scrollProductos = new JScrollPane();
		scrollProductos.setAlignmentY(0.0f);
		scrollProductos.setAlignmentX(0.0f);
		boxProductos.add(scrollProductos);
		
		tblProductos = new JTable(data, columnNames);
		scrollProductos.setViewportView(tblProductos);
		
		TableColumn agregarColumna;
		agregarColumna = tblProductos.getColumnModel().getColumn(3);
		agregarColumna.setCellEditor(new myeditor(tblProductos));
		agregarColumna.setCellRenderer(new myrenderer1(true));
		
		Box boxDestinatarios = Box.createHorizontalBox();
		boxDestinatarios.setBorder(new TitledBorder(null, "Destinatarios", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		boxDestinatarios.setBounds(10, 380, 600, 230);
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
		lblModificarDestinatarios.setBounds(650, 590, 144, 14);
		getContentPane().add(lblModificarDestinatarios);
		
		
		btnGenerar = new BotonesIconos("Generar", configuraciones.getIMG_ICONOS()+"GENERAR_32.png");
		btnGenerar.setLocation(10, 629);
		getContentPane().add(btnGenerar);
		
		
		btnGuardar = new BotonesIconos("Guardar", configuraciones.getIMG_ICONOS()+"GUARDAR_32.png");
		btnGuardar.setLocation(1131, 629);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getContentPane().add(btnGuardar);
		
		
		btnCerrar = new BotonesIconos("Cerrar", configuraciones.getIMG_ICONOS()+"CERRAR_32.png");
		btnCerrar.setLocation(1250, 629);
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
					if(categoria.getSubCats().isEmpty())
					{
						categoria.obtenerSubCategorias();
					}
					cmbSubcategorias.actualizarModelo(categoria.getSubCats());					
				}
			}
		});
	}
}
