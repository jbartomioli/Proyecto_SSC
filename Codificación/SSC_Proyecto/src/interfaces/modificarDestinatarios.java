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

public class modificarDestinatarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscarDestinatarios;
	private JLabel lblBuscarDestinatarios;

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
		txtBuscarDestinatarios.setBounds(283, 91, 141, 20);
		txtBuscarDestinatarios.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspecialidad.setBounds(33, 93, 86, 14);
		contentPane.setLayout(null);
		contentPane.add(lblEspecialidad);
		contentPane.add(txtBuscarDestinatarios);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Endodentista", "Ortodoncistas", "Pedodentista", "Periodentista"}));
		comboBox.setBounds(115, 91, 111, 20);
		contentPane.add(comboBox);
		
		lblBuscarDestinatarios = new JLabel("Buscar destinatarios");
		lblBuscarDestinatarios.setForeground(Color.DARK_GRAY);
		lblBuscarDestinatarios.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBuscarDestinatarios.setBounds(31, 22, 341, 29);
		contentPane.add(lblBuscarDestinatarios);
	}
}
