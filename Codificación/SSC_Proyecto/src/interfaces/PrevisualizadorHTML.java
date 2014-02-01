package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PrevisualizadorHTML
{
  public static void main(String[] args)
  {
    new PrevisualizadorHTML();
  }
  
  public PrevisualizadorHTML()
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        
        // add an html editor kit
        HTMLEditorKit kit = new HTMLEditorKit();
        

        // create some simple html as a string
        File archivoHtml = new File("D:\\Proyecto_Final_SSC\\Codificación\\SSC_Proyecto\\prueba.html");

        
        String htmlString = "";
        FileReader fr = null;
        BufferedReader br = null;
     
        try 
        {
			fr = new FileReader(archivoHtml);
			br = new BufferedReader(fr);
			 
			String renglon = "";
		 
		   while((renglon=br.readLine())!=null)
		        	htmlString += renglon;
		   
		} 
        catch (Exception e) 
        {
			e.printStackTrace();
		}
        finally
        {
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{                    
              if( null != fr ){   
                 fr.close();  
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
       
        
     
        
        // create a document, set it on the jeditorpane, then add the html
        Document doc = kit.createDefaultDocument();

        // now add it all to a frame
        JFrame frmPrevisualizador = new JFrame();
          
        frmPrevisualizador.setSize(600, 400);
        frmPrevisualizador.setLocationRelativeTo(null);
        frmPrevisualizador.setTitle("Vista Previa del Mensaje");
        frmPrevisualizador.getContentPane().setLayout(null);
        // create jeditorpane
        JEditorPane epnEditor = new JEditorPane();
        epnEditor.setLocation(13, 0);
        
        // make it read-only
        epnEditor.setEditable(false);
        
        // create a scrollpane; modify its attributes as desired
        JScrollPane scrEditor = new JScrollPane(epnEditor);
        scrEditor.setBounds(10, 10, 570, 270);
        epnEditor.setEditorKit(kit);
        epnEditor.setDocument(doc);
        epnEditor.setText(htmlString);
        frmPrevisualizador.getContentPane().add(scrEditor);
        
        JPanel pnlBotones = new JPanel();
        pnlBotones.setBounds(10, 320, 570, 35);
        frmPrevisualizador.getContentPane().add(pnlBotones);
        pnlBotones.setLayout(null);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(144, 5, 80, 25);
        pnlBotones.add(btnAceptar);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        btnCancelar.setBounds(354, 5, 85, 25);
        pnlBotones.add(btnCancelar);

        // make it easy to close the application
        frmPrevisualizador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // pack it, if you prefer
        //j.pack();
        
        // center the jframe, then make it visible
        frmPrevisualizador.setVisible(true);
      }
    });
  }
}