//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.21 at 11:02:21 AM CET 
//


package nl.overheid.standaarden.product.terms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * 
 *                 
 *             
 * 
 * <p>Java class for TripleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripleType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="scheme" type="{http://standaarden.overheid.nl/product/terms/}SchemeName" /&gt;
 *       &lt;attribute name="resourceIdentifier" type="{http://standaarden.overheid.nl/product/terms/}URI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripleType", propOrder = {
    "value"
})
public class TripleType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "scheme")
    protected QName scheme;
    @XmlAttribute(name = "resourceIdentifier")
    protected String resourceIdentifier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setScheme(QName value) {
        this.scheme = value;
    }

    /**
     * Gets the value of the resourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * Sets the value of the resourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceIdentifier(String value) {
        this.resourceIdentifier = value;
    }

}
