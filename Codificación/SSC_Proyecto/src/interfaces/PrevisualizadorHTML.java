package interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * A complete Java class that demonstrates how to create an HTML viewer with styles,
 * using the JEditorPane, HTMLEditorKit, StyleSheet, and JFrame.
 * 
 * @author alvin alexander, devdaily.com.
 *
 */
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
        // create jeditorpane
        JEditorPane jEditorPane = new JEditorPane();
        
        // make it read-only
        jEditorPane.setEditable(false);
        
        // create a scrollpane; modify its attributes as desired
        JScrollPane scrollPane = new JScrollPane(jEditorPane);
        
        // add an html editor kit
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);
        

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
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);

        // now add it all to a frame
        JFrame j = new JFrame("HtmlEditorKit Test");
        j.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // make it easy to close the application
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // display the frame
        j.setSize(new Dimension(300,200));
        
        // pack it, if you prefer
        //j.pack();
        
        // center the jframe, then make it visible
        j.setLocationRelativeTo(null);
        j.setVisible(true);
      }
    });
  }
}