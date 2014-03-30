package interfaces.componentes;

import javax.swing.JDialog;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import java.awt.Window.Type;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Cursor;

public class ProgresoTarea extends JDialog{
	
	private static final long serialVersionUID = -7991242526986252658L;
	private JProgressBar progressBar;
	
	
	public ProgresoTarea(JDialog dialogPadre, String mensajeProceso) 
	{
		super(dialogPadre);
		setLocation(dialogPadre.getX()+dialogPadre.getWidth()/2, dialogPadre.getY()+dialogPadre.getHeight()/2);
		setAlwaysOnTop(true);
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		setMinimumSize(new Dimension(300, 200));
		setMaximumSize(new Dimension(300, 200));
		getContentPane().setMinimumSize(new Dimension(300, 200));
		getContentPane().setMaximumSize(new Dimension(300, 200));
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(mensajeProceso);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 79, 280, 14);
		getContentPane().add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 104, 280, 26);
		getContentPane().add(progressBar);
		setVisible(true);
	}	
	
	
	//-----------------------------------------------------------
	public void avanceProgreso(int avance)
	{
		progressBar.setValue(avance);
	}

}
