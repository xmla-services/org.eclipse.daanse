
package org.eclipse.daanse.xmla.ws.xmla;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasureGroupDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureGroupDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureGroupDimension")
@XmlSeeAlso({
    ManyToManyMeasureGroupDimension.class,
    RegularMeasureGroupDimension.class,
    ReferenceMeasureGroupDimension.class,
    DegenerateMeasureGroupDimension.class,
    DataMiningMeasureGroupDimension.class
})
public abstract class MeasureGroupDimension
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
