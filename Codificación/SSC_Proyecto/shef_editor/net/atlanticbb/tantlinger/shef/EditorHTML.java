package net.atlanticbb.tantlinger.shef;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import utilidades.Configuraciones;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EditorHTML extends JDialog
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -523425622964525664L;
	
	private HTMLEditorPane editor = new HTMLEditorPane();
	
    public EditorHTML(JDialog dialogPadre)
    {
    	super(dialogPadre);

    	setModal(true);
    	setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);

    	addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrarEditor();
        	}
        });
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(editor.getEditMenu());
        menuBar.add(editor.getFormatMenu());
        menuBar.add(editor.getInsertMenu());
        setJMenuBar(menuBar);

        setTitle("HTML Editor Demo");
        setSize(800, 600);
        getContentPane().add(editor);
        
        JPanel panel = new JPanel();
        editor.add(panel, BorderLayout.SOUTH);
        panel.setLayout(new GridLayout(0, 2, 0, 0));
        
        JButton btnFinalizarEdicion = new JButton("Finalizar Edici\u00F3n");
        btnFinalizarEdicion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		finalizarEdicion();
        	}
        });
        panel.add(btnFinalizarEdicion);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cerrarEditor();
        	}
        });
        panel.add(btnCancelar);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
        
    }
    
    //-------------------------------------------------------------
    public void cerrarEditor()
    {
		int rta = JOptionPane.showConfirmDialog(
					this, 
					"Está a punto de salir sin guardar el contedido del mensaje.\n"
							+ "¿Desea salir guardando los cambios efectuados?",
					"ATENCIÓN",
					JOptionPane.YES_NO_CANCEL_OPTION);
				
		switch(rta)
		{
		case(0): finalizarEdicion();
				 break;
		case(1): setModal(false);
				 dispose();
				 break;
		}
    }
    
    //-------------------------------------------------------------
    public void finalizarEdicion()
    {
    	FileWriter file;
    	BufferedWriter writer;
    	
    	try
    	{
    		file = new FileWriter(Configuraciones.DIR_MAILS+"prueba.html");
    		writer = new BufferedWriter(file);
    		writer.write(editor.getText(), 0, editor.getText().length());
    	    
	        writer.close();
	        file.close();
    		
        	JOptionPane.showMessageDialog(
        			this,
        			"Los cambios han sido guardados con éxito",
        			"TAREA COMPLETA",
        			JOptionPane.INFORMATION_MESSAGE);
    	}
    	catch(IOException ioe)
    	{
    		JOptionPane.showMessageDialog(
    				this,
    				"Se ha producido un error al guardar los cambios",
    				"ERROR",
    				JOptionPane.ERROR_MESSAGE);
    	}
    	finally
    	{
        	setModal(false);
        	dispose();
    	}
    }
    

}
