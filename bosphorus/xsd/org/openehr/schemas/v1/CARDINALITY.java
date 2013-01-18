//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.12 at 12:10:04 PM BST 
//


package org.openehr.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CARDINALITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CARDINALITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is_ordered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_unique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="interval" type="{http://schemas.openehr.org/v1}IntervalOfInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CARDINALITY", propOrder = {
    "isOrdered",
    "isUnique",
    "interval"
})
public class CARDINALITY {

    @XmlElement(name = "is_ordered")
    protected boolean isOrdered;
    @XmlElement(name = "is_unique")
    protected boolean isUnique;
    @XmlElement(required = true)
    protected IntervalOfInteger interval;

    /**
     * Gets the value of the isOrdered property.
     * 
     */
    public boolean isIsOrdered() {
        return isOrdered;
    }

    /**
     * Sets the value of the isOrdered property.
     * 
     */
    public void setIsOrdered(boolean value) {
        this.isOrdered = value;
    }

    /**
     * Gets the value of the isUnique property.
     * 
     */
    public boolean isIsUnique() {
        return isUnique;
    }

    /**
     * Sets the value of the isUnique property.
     * 
     */
    public void setIsUnique(boolean value) {
        this.isUnique = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalOfInteger }
     *     
     */
    public IntervalOfInteger getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalOfInteger }
     *     
     */
    public void setInterval(IntervalOfInteger value) {
        this.interval = value;
    }

}
