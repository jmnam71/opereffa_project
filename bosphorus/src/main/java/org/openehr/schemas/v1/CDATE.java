//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.20 at 11:04:04 AM BST 
//


package org.openehr.schemas.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C_DATE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_DATE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openehr.org/v1}C_PRIMITIVE">
 *       &lt;sequence>
 *         &lt;element name="pattern" type="{http://schemas.openehr.org/v1}DateConstraintPattern" minOccurs="0"/>
 *         &lt;element name="timezone_validity" type="{http://schemas.openehr.org/v1}VALIDITY_KIND" minOccurs="0"/>
 *         &lt;element name="range" type="{http://schemas.openehr.org/v1}IntervalOfDate" minOccurs="0"/>
 *         &lt;element name="assumed_value" type="{http://schemas.openehr.org/v1}Iso8601Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_DATE", propOrder = {
    "pattern",
    "timezoneValidity",
    "range",
    "assumedValue"
})
public class CDATE
    extends CPRIMITIVE
{

    protected String pattern;
    @XmlElement(name = "timezone_validity")
    protected BigInteger timezoneValidity;
    protected IntervalOfDate range;
    @XmlElement(name = "assumed_value")
    protected String assumedValue;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the timezoneValidity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimezoneValidity() {
        return timezoneValidity;
    }

    /**
     * Sets the value of the timezoneValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimezoneValidity(BigInteger value) {
        this.timezoneValidity = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalOfDate }
     *     
     */
    public IntervalOfDate getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalOfDate }
     *     
     */
    public void setRange(IntervalOfDate value) {
        this.range = value;
    }

    /**
     * Gets the value of the assumedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssumedValue() {
        return assumedValue;
    }

    /**
     * Sets the value of the assumedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssumedValue(String value) {
        this.assumedValue = value;
    }

}
