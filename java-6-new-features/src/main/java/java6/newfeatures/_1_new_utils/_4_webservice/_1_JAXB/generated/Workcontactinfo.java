//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.20 at 02:47:00 PM SGT 
//
package java6.newfeatures._1_new_utils._4_webservice._1_JAXB.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for workcontactinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workcontactinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Location"/>
 *         &lt;element ref="{}Postal"/>
 *         &lt;element ref="{}tel"/>
 *         &lt;element ref="{}Appellation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workcontactinfo", propOrder = {
    "location",
    "postal",
    "tel",
    "appellation"
})
public class Workcontactinfo {

    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "Postal", required = true)
    protected String postal;
    @XmlElement(required = true)
    protected Tel tel;
    @XmlElement(name = "Appellation", required = true)
    protected String appellation;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostal() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostal(String value) {
        this.postal = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link Tel }
     *     
     */
    public Tel getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tel }
     *     
     */
    public void setTel(Tel value) {
        this.tel = value;
    }

    /**
     * Gets the value of the appellation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppellation() {
        return appellation;
    }

    /**
     * Sets the value of the appellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppellation(String value) {
        this.appellation = value;
    }

}