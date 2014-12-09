package utilidades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jdom.Document;         
import org.jdom.Element;         
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;


public class HibernateCFG
{
	private HashMap<String,String> elementos;
	private File xmlFile;
	private String urlFile = "bin\\main\\resources\\hibernate.cfg.xml";
	
	
	public HibernateCFG()
	{
		this.elementos = new HashMap<String, String>();
	}
	
	
	//-----------------------------------------------------------
	public HashMap<String, String> getElementos()
	{
		return this.elementos;
	}
	
	
	//-----------------------------------------------------------
	public void leerConfiguraciones()
	{
		xmlFile = new File(urlFile);
	    SAXBuilder builder = new SAXBuilder();
  
		try
	    {
	        Document document = (Document) builder.build( xmlFile );
	 
	        Element hibernateConfig = document.getRootElement();
	        
	        Element sessionFactory = (Element) hibernateConfig.getChild("session-factory");
	 
	        @SuppressWarnings("rawtypes")
			List propiedades = sessionFactory.getChildren("property");
	        	        
	        for (int i = 0; i < propiedades.size(); i++)
	        {
	        	Element propiedad = (Element) propiedades.get(i);
	        	elementos.put(propiedad.getAttributeValue("name").toString(), Utilidades.utf8_decode(propiedad.getValue().toString()));
	        }
	    }
	    catch ( IOException io )
	    {
	        System.out.println( io.getMessage() );
	    }
	    catch ( JDOMException jdomex )
	    {
	        System.out.println( jdomex.getMessage() );
	    }
	}
	
	
	//-------------------------------------------------------------
	@SuppressWarnings("rawtypes")
	public void guardarConfiguraciones(HashMap<String, String> propiedadesNuevas)
	{
		xmlFile = new File(urlFile);
	    SAXBuilder builder = new SAXBuilder();
  
		try
	    {	
			Document document = (Document) builder.build(xmlFile);
			Element hibernateConfig = document.getRootElement();
	 
			Element sessionFactory = hibernateConfig.getChild("session-factory");			

			List propiedades = (List) sessionFactory.getChildren("property");
			
			for (int i = 0; i < propiedades.size(); i++)
	        {
	        	Element propiedad = (Element) propiedades.get(i);
	        	
	        	String contenido = Utilidades.utf8_encode(propiedadesNuevas.get(propiedad.getAttributeValue("name")));
	        		
	        	propiedad.setText(contenido);
	        }
			
			XMLOutputter xmlOutput = new XMLOutputter();
	 
			xmlOutput.output(document, new FileWriter(urlFile)); 
			
	    }
	    catch ( IOException io )
	    {
	        System.out.println( io.getMessage() );
	    }
	    catch ( JDOMException jdomex )
	    {
	        System.out.println( jdomex.getMessage() );
	    }

	}
}