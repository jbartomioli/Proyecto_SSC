package interfaces;


import com.hexidec.ekit.Ekit;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class EditorHTML{


	public static void main(String[] args) 
	{
		new EditorHTML();
	}


	public EditorHTML(){
		Ekit editor = new Ekit("HTML","","",null,true,false,false,true,"es","ES",true,false,false,true,false);
		
		editor.setVisible(false);
		
		editor.setName("ekitEditor");
		editor.setVisible(true);
		editor.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
		editor.setMaximumSize(new Dimension(1366, 668));
		editor.setMinimumSize(new Dimension(1024, 668));
		editor.setTitle("Generaci\u00F3n de Contenido de E-Mail");
		editor.setResizable(false);
		editor.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		editor.setLocationRelativeTo(null);
		
		editor.getContentPane().setMinimumSize(new Dimension(1024, 668));
		editor.getContentPane().setMaximumSize(new Dimension(1366, 668));
		editor.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

}
