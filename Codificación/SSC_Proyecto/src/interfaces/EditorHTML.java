package interfaces;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.hexidec.ekit.Ekit;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;


public class EditorHTML extends Ekit{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6981385008491942654L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
				//try {
					EditorHTML frame = new EditorHTML();					
					
					
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}
			}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public EditorHTML(){ //throws IOException {
		setLocale(new Locale("es", "AR"));
		
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
		setMaximumSize(new Dimension(1366, 668));
		setMinimumSize(new Dimension(1024, 668));
		setVisible(true);
		setTitle("Generaci\u00F3n de Contenido de E-Mail");
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);		
		
		getContentPane().setMinimumSize(new Dimension(1024, 668));
		getContentPane().setMaximumSize(new Dimension(1366, 668));
	}

}
