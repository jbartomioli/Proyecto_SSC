package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableColumn;
import javax.swing.JTable;

public class modificarDestinatarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;
	private JTable tblDestinatariosNuevos;
	private Box boxDestinatariosBuscados;
	private JScrollPane scrollDestinatariosBuscados;
	private JTable tblDestinatariosBuscados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificarDestinatarios frame = new modificarDestinatarios();
					frame.setVisible(true);
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
	public modificarDestinatarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtBuscarDestinatarios = new JTextField();
		txtBuscarDestinatarios.setForeground(Color.GRAY);
		txtBuscarDestinatarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBuscarDestinatarios.setText("ingrese apellido o nombre...");
		txtBuscarDestinatarios.setBounds(283, 104, 141, 20);
		txtBuscarDestinatarios.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(31, 106, 86, 14);
		contentPane.setLayout(null);
		contentPane.add(lblEspecialidad);
		contentPane.add(txtBuscarDestinatarios);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Endodentista", "Ortodoncistas", "Pedodentista", "Periodentista"}));
		comboBox.setBounds(113, 104, 111, 20);
		contentPane.add(comboBox);
		
		lblBuscarDestinatarios = new JLabel("Buscar destinatarios");
		lblBuscarDestinatarios.setForeground(Color.DARK_GRAY);
		lblBuscarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBuscarDestinatarios.setBounds(31, 29, 341, 29);
		contentPane.add(lblBuscarDestinatarios);
		
		Box boxDestinatariosNuevos = Box.createHorizontalBox();
		boxDestinatariosNuevos.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosNuevos.setBounds(31, 165, 500, 250);
		contentPane.add(boxDestinatariosNuevos);
		
		JScrollPane scrollDestinatariosNuevos = new JScrollPane();
		boxDestinatariosNuevos.add(scrollDestinatariosNuevos);
		
		String[] columnNames = {"Apellido",
                "Nombre",
                "Especialidad",
                ""};
		
		Object[][] data = {
			    {"Diaz", "Carolina", "Endodoncista", new Boolean(false)},
			    {"Hulter", "Antonio", "Ortodoncista", new Boolean(true)},
			    {"Ríos", "Damián", "Ortodoncista", new Boolean(false)}
		};
		
		tblDestinatariosNuevos = new JTable(data, columnNames);
		scrollDestinatariosNuevos.setViewportView(tblDestinatariosNuevos);
		
		TableColumn agregarColumn;
		agregarColumn = tblDestinatariosNuevos.getColumnModel().getColumn(3);
		agregarColumn.setCellEditor(new myeditor(tblDestinatariosNuevos));
		agregarColumn.setCellRenderer(new myrenderer(true));
		
		boxDestinatariosBuscados = Box.createHorizontalBox();
		boxDestinatariosBuscados.setBorder(new TitledBorder(null, "Destinatarios Anuncio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		boxDestinatariosBuscados.setBounds(700, 165, 500, 250);
		contentPane.add(boxDestinatariosBuscados);
		
		scrollDestinatariosBuscados = new JScrollPane();
		boxDestinatariosBuscados.add(scrollDestinatariosBuscados);
		
		tblDestinatariosBuscados = new JTable(data, columnNames);
		scrollDestinatariosBuscados.setViewportView(tblDestinatariosBuscados);
		
		TableColumn agregarColumna;
		agregarColumna = tblDestinatariosBuscados.getColumnModel().getColumn(3);
		agregarColumna.setCellEditor(new myeditor(tblDestinatariosBuscados));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(1150, 645, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(1250, 645, 89, 23);
		contentPane.add(btnAceptar);
		agregarColumna.setCellRenderer(new myrenderer1(true));
		
		
		
	}
}
