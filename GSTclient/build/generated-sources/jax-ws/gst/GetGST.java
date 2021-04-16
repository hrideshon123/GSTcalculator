
package gst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gstRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGST", propOrder = {
    "proName",
    "proPrice",
    "gstRate"
})
public class GetGST {

    protected String proName;
    protected double proPrice;
    protected double gstRate;

    /**
     * Gets the value of the proName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProName() {
        return proName;
    }

    /**
     * Sets the value of the proName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProName(String value) {
        this.proName = value;
    }

    /**
     * Gets the value of the proPrice property.
     * 
     */
    public double getProPrice() {
        return proPrice;
    }

    /**
     * Sets the value of the proPrice property.
     * 
     */
    public void setProPrice(double value) {
        this.proPrice = value;
    }

    /**
     * Gets the value of the gstRate property.
     * 
     */
    public double getGstRate() {
        return gstRate;
    }

    /**
     * Sets the value of the gstRate property.
     * 
     */
    public void setGstRate(double value) {
        this.gstRate = value;
    }

}
