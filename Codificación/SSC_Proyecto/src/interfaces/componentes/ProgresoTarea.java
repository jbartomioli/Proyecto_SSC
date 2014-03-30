package interfaces.componentes;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ProgresoTarea extends JDialog{
	
	private static final long serialVersionUID = -7991242526986252658L;
	private JProgressBar progressBar;
	
	
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
		
		JLabel lblNewLabel = new JLabel(mensajeProceso);
		lblNewLabel.setBounds(10, 100, 280, 15);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 124, 280, 30);
		panel.add(progressBar);
		setVisible(true);
	}	
	
	
	//-----------------------------------------------------------
	public void avanceProgreso(int avance)
	{
		progressBar.setValue(avance);
	}
}
