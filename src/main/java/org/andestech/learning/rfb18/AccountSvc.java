package org.andestech.learning.rfb18;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Random;


@WebService(name = "AccSvc")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class AccountSvc {

    private String sname, fname;

    public AccountSvc(String sname, String fname) {
    this.sname = sname;
    this.fname = fname;
    }


    @WebMethod(operationName = "Info")
    public String getInfo()
    {return fname + " " + sname;}


   // @WebMethod(operationName = )
    public int generateInt(@WebParam(name = "intRange")
            int N)
    {
        return new Random().nextInt(N);
    }


}
