
package com.deitel.jhtp7.ch28.blackjackclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "BlackjackService", targetNamespace = "http://blackjack.ch28.jhtp7.deitel.com/", wsdlLocation = "http://localhost:8080/Blackjack/BlackjackService?WSDL")
public class BlackjackService
    extends Service
{

    private final static URL BLACKJACKSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Blackjack/BlackjackService?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BLACKJACKSERVICE_WSDL_LOCATION = url;
    }

    public BlackjackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BlackjackService() {
        super(BLACKJACKSERVICE_WSDL_LOCATION, new QName("http://blackjack.ch28.jhtp7.deitel.com/", "BlackjackService"));
    }

    /**
     * 
     * @return
     *     returns Blackjack
     */
    @WebEndpoint(name = "BlackjackPort")
    public Blackjack getBlackjackPort() {
        return (Blackjack)super.getPort(new QName("http://blackjack.ch28.jhtp7.deitel.com/", "BlackjackPort"), Blackjack.class);
    }

}
