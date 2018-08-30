package org.andestech.learning.rfb18;

//import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;


public class App 
{
    public static void main( String[] args )

    {

       Endpoint ep = Endpoint.publish("http://localhost:80/svc1",
                new AccountSvc("Basil", "The Wolf"));

        System.out.println(ep);
        System.out.println("WS is running...");


    }
}
