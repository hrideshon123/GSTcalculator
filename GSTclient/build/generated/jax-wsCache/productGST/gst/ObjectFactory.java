
package gst;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gst package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetGST_QNAME = new QName("http://gst/", "getGST");
    private final static QName _GetGSTResponse_QNAME = new QName("http://gst/", "getGSTResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gst
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGST }
     * 
     */
    public GetGST createGetGST() {
        return new GetGST();
    }

    /**
     * Create an instance of {@link GetGSTResponse }
     * 
     */
    public GetGSTResponse createGetGSTResponse() {
        return new GetGSTResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gst/", name = "getGST")
    public JAXBElement<GetGST> createGetGST(GetGST value) {
        return new JAXBElement<GetGST>(_GetGST_QNAME, GetGST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGSTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gst/", name = "getGSTResponse")
    public JAXBElement<GetGSTResponse> createGetGSTResponse(GetGSTResponse value) {
        return new JAXBElement<GetGSTResponse>(_GetGSTResponse_QNAME, GetGSTResponse.class, null, value);
    }

}
