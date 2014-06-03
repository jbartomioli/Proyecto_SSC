package interfaces.componentes;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgresoTarea extends JDialog{
	
	private static final long serialVersionUID = -7991242526986252658L;
	private JProgressBar progressBar;
	private JButton btnAceptar;
	private JLabel lblCompleto;
	
	
	public ProgresoTarea(JDialog padre, String mensajeProceso) 
	{
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(300,200));
		getContentPane().setMinimumSize(new Dimension(300, 200));
		getContentPane().setMaximumSize(new Dimension(300, 200));
		setMaximumSize(new Dimension(300, 200));
		setLocationRelativeTo(null);
		
		setUndecorated(true);
		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		setAlwaysOnTop(true);
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 300, 200);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblProceso = new JLabel(mensajeProceso);
		lblProceso.setBounds(10, 49, 280, 23);
		panel.add(lblProceso);
		lblProceso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblCompleto = new JLabel("");
		lblCompleto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompleto.setBounds(10, 83, 280, 14);
		panel.add(lblCompleto);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 124, 280, 30);
		panel.add(progressBar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setBounds(201, 166, 89, 23);
		btnAceptar.setEnabled(false);
		panel.add(btnAceptar);
				
		setVisible(true);

	}	
	
	
	//-----------------------------------------------------------
	public void avanceProgreso(int avance)
	{
		setModal(true);
		
		progressBar.setValue(avance);
		
		if(progressBar.getValue() == 100)
		{
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			btnAceptar.setEnabled(true);
			lblCompleto.setText("Tarea Completa");
		}	
		
		setModal(false);
	}
}
