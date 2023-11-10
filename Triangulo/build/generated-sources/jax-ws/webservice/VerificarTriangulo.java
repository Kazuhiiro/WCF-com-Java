
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lado1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lado2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lado3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lado1",
    "lado2",
    "lado3"
})
@XmlRootElement(name = "verificarTriangulo")
public class VerificarTriangulo {

    @XmlElementRef(name = "lado1", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lado1;
    @XmlElementRef(name = "lado2", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lado2;
    @XmlElementRef(name = "lado3", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lado3;

    /**
     * Obtém o valor da propriedade lado1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLado1() {
        return lado1;
    }

    /**
     * Define o valor da propriedade lado1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLado1(JAXBElement<String> value) {
        this.lado1 = value;
    }

    /**
     * Obtém o valor da propriedade lado2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLado2() {
        return lado2;
    }

    /**
     * Define o valor da propriedade lado2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLado2(JAXBElement<String> value) {
        this.lado2 = value;
    }

    /**
     * Obtém o valor da propriedade lado3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLado3() {
        return lado3;
    }

    /**
     * Define o valor da propriedade lado3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLado3(JAXBElement<String> value) {
        this.lado3 = value;
    }

}
