//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.20 at 11:04:04 AM BST 
//


package org.openehr.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C_PRIMITIVE_OBJECT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_PRIMITIVE_OBJECT">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openehr.org/v1}C_DEFINED_OBJECT">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://schemas.openehr.org/v1}C_PRIMITIVE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_PRIMITIVE_OBJECT", propOrder = {
    "item"
})
public class CPRIMITIVEOBJECT
    extends CDEFINEDOBJECT
{

    protected CPRIMITIVE item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link CPRIMITIVE }
     *     
     */
    public CPRIMITIVE getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPRIMITIVE }
     *     
     */
    public void setItem(CPRIMITIVE value) {
        this.item = value;
    }

}
