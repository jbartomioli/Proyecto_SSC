package interfaces;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Ayuda{

	public Ayuda() 
	{
		
	}
		

	public void openURL(String url) 
	{
		String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) 
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            }
            else 
            	if (osName.startsWith("Mac OS X")) 
            	{
	                // Runtime.getRuntime().exec("open -a safari " + url);
	                // Runtime.getRuntime().exec("open " + url + "/index.html");
	                Runtime.getRuntime().exec("open " + url);
            	} 
            	else 
            	{
            		JOptionPane.showMessageDialog(null,"Error al abrir la url de la ayuda del sistema: "+url);
            	}
        } 
        catch (IOException e)
        {
    		JOptionPane.showMessageDialog(null,"Error al abrir la url de la ayuda del sistema: "+url);
            e.printStackTrace();
        }
	 }
}

