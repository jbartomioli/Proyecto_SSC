package interfaces;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GenerarAnuncio extends JFrame {
	private JTable tblProductosAnuncio;
	private JTable tblDestinatarios;
	private String LABEL_TEXT = "Modificar destiatarios";
	private JTable tblProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarAnuncio frame = new GenerarAnuncio();
					frame.setVisible(true);
					//Maximiza el JFrame
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GenerarAnuncio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
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
		
		//tblProductos.setModel(new DefaultTableModel(
			//new Object[][] {
			//},
			//new String[] {
				//"Producto", "Precio", "Stock", ""
			//}
		//));
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
		
		tblProductos = new JTable();
		
		scrollProductos.setViewportView(tblProductos);
		
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
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(1250, 645, 89, 23);
		getContentPane().add(btnCerrar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(1150, 645, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(20, 645, 89, 23);
		getContentPane().add(btnGenerar);
		
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
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa:");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(20, 39, 77, 23);
		getContentPane().add(lblCategoria);
		
		JComboBox comboCategoria = new JComboBox();
		comboCategoria.setModel(new DefaultComboBoxModel(new String[] {"", "Descartables", "Anestesias", "Pinzas", "Moldes"}));
		comboCategoria.setBounds(107, 42, 97, 20);
		getContentPane().add(comboCategoria);
		
		JLabel lblSubcategoria = new JLabel("Subcategor\u00EDa:");
		lblSubcategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubcategoria.setBounds(272, 39, 97, 23);
		getContentPane().add(lblSubcategoria);
		
		JComboBox comboSubCategoria = new JComboBox();
		comboSubCategoria.setModel(new DefaultComboBoxModel(new String[] {"", "Jeringas", "Algodones y gasas", "Obturadores", "Barbijos"}));
		comboSubCategoria.setBounds(380, 42, 97, 20);
		getContentPane().add(comboSubCategoria);
	}
}
