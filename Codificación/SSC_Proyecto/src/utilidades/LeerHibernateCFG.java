package utilidades;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jdom.Document;         
import org.jdom.Element;         
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;


public class LeerHibernateCFG
{
	HashMap<String,String> elementos;
	
	
	public LeerHibernateCFG()
	{
	    SAXBuilder builder = new SAXBuilder();
	    File xmlFile = new File( "C:\\Proyecto_SSC\\Codificación\\SSC_Proyecto\\src\\main\\resources\\hibernate.cfg.xml" );
	    try
	    {
	        Document document = (Document) builder.build( xmlFile );
	 
	        Element hibernateConfig = document.getRootElement();
	        
	        Element sessionFactory = (Element) hibernateConfig.getChild("session-factory");
	 
	        @SuppressWarnings("rawtypes")
			List propiedades = sessionFactory.getChildren("property");
	        
	        elementos = new HashMap<String,String>();
	        	        
	        for (int i = 0; i < propiedades.size(); i++)
	        {
	        	Element propiedad = (Element) propiedades.get(i);
	        	elementos.put(propiedad.getAttributeValue("name").toString(), propiedad.getValue().toString());
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
	
	//-----------------------------------------------------------
	public HashMap<String, String> getElementos()
	{
		return this.elementos;
	}
}