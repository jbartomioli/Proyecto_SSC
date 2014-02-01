package interfaces;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

import com.hexidec.ekit.Ekit;


public class EditorHTML extends Ekit {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6981385008491942654L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorHTML frame = new EditorHTML();
					frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public EditorHTML() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
	}

}
