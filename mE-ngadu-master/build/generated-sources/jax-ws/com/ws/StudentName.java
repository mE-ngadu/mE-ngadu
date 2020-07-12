
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for studentName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentName", propOrder = {
    "inName"
})
public class StudentName {

    protected String inName;

    /**
     * Gets the value of the inName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInName() {
        return inName;
    }

    /**
     * Sets the value of the inName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInName(String value) {
        this.inName = value;
    }

}
