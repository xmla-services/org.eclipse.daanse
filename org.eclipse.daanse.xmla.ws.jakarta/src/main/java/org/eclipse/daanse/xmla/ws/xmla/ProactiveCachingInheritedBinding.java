
package org.eclipse.daanse.xmla.ws.xmla;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProactiveCachingInheritedBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProactiveCachingInheritedBinding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:schemas-microsoft-com:xml-analysis}ProactiveCachingObjectNotificationBinding"&gt;
 *       &lt;all&gt;
 *         &lt;element name="NotificationTechnique" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Client"/&gt;
 *               &lt;enumeration value="Server"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProactiveCachingInheritedBinding", propOrder = {
    "notificationTechnique"
})
public class ProactiveCachingInheritedBinding
    extends ProactiveCachingObjectNotificationBinding
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NotificationTechnique")
    protected String notificationTechnique;

    /**
     * Gets the value of the notificationTechnique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationTechnique() {
        return notificationTechnique;
    }

    /**
     * Sets the value of the notificationTechnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationTechnique(String value) {
        this.notificationTechnique = value;
    }

    public boolean isSetNotificationTechnique() {
        return (this.notificationTechnique!= null);
    }

}