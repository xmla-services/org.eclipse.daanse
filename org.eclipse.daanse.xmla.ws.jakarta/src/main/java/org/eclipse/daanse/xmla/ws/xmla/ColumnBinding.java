
package org.eclipse.daanse.xmla.ws.xmla;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnBinding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:schemas-microsoft-com:xml-analysis}Binding"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TableID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ColumnID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnBinding", propOrder = {
    "tableID",
    "columnID"
})
public class ColumnBinding
    extends Binding
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TableID", required = true)
    protected String tableID;
    @XmlElement(name = "ColumnID", required = true)
    protected String columnID;

    /**
     * Gets the value of the tableID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableID() {
        return tableID;
    }

    /**
     * Sets the value of the tableID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableID(String value) {
        this.tableID = value;
    }

    public boolean isSetTableID() {
        return (this.tableID!= null);
    }

    /**
     * Gets the value of the columnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnID() {
        return columnID;
    }

    /**
     * Sets the value of the columnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnID(String value) {
        this.columnID = value;
    }

    public boolean isSetColumnID() {
        return (this.columnID!= null);
    }

}