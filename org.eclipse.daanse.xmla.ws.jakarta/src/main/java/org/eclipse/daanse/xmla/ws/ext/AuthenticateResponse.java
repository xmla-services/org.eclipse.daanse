
package org.eclipse.daanse.xmla.ws.ext;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SspiHandshake" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "AuthenticateResponse")
public class AuthenticateResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "return", required = true)
    protected AuthenticateResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateResponse.Return }
     *     
     */
    public AuthenticateResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateResponse.Return }
     *     
     */
    public void setReturn(AuthenticateResponse.Return value) {
        this._return = value;
    }

    public boolean isSetReturn() {
        return (this._return!= null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SspiHandshake" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sspiHandshake"
    })
    public static class Return
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "SspiHandshake", required = true)
        protected byte[] sspiHandshake;

        /**
         * Gets the value of the sspiHandshake property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getSspiHandshake() {
            return sspiHandshake;
        }

        /**
         * Sets the value of the sspiHandshake property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setSspiHandshake(byte[] value) {
            this.sspiHandshake = value;
        }

        public boolean isSetSspiHandshake() {
            return (this.sspiHandshake!= null);
        }

    }

}