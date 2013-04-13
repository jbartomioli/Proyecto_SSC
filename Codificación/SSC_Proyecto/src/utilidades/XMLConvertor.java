package utilidades;

import java.io.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

public class XMLConvertor {
    public XMLConvertor() {
    }
     
    public static void main(String args[]){
          
     
    }
     public static String objectToXML(Object voObj)
    {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            XMLEncoder xmlEncoder = null;
            try
            {
                xmlEncoder = new XMLEncoder(new BufferedOutputStream(stream));
                xmlEncoder.writeObject(voObj);
                xmlEncoder.close();
                return stream.toString("UTF-8"); 
            }catch(Exception e)
            {                
                System.out.println("Inside exception from pymtHistToXML : " + e.getMessage());
            }
            return null;
    }

    public static Object XMLToObject(String dataXML) {
           XMLDecoder d = null;
           try {
               d = new XMLDecoder(new ByteArrayInputStream(dataXML.getBytes("UTF-8")));
               Object voObj = d.readObject();
               d.close();
               return voObj;
           } catch (Exception e) {
               System.out.println("Error while Converting XML to VO : " + e);
           }
           return null;
       }

}
