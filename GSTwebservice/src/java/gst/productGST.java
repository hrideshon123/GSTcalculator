/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gst;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP-PC
 */
@WebService(serviceName = "productGST")
public class productGST {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getGST")
    public double getGST(@WebParam(name = "proName") String proName, @WebParam(name = "proPrice") double proPrice, @WebParam(name = "gstRate") double gstRate) {
        //TODO write your implementation code here:
        double gst = (proPrice * gstRate)/100;
        double gstamt = proPrice + gst;
        return gstamt;
    }
}
