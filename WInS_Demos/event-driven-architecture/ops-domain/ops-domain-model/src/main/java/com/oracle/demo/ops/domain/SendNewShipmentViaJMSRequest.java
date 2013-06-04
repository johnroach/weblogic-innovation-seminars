//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.06 at 12:30:16 PM PST 
//


package com.oracle.demo.ops.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendNewShipmentViaJMSRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SendNewShipmentViaJMSRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://demo.oracle.com/ops/domain/services/common}WebServiceRequestHeaderType"/>
 *         &lt;element name="Shipment" type="{http://demo.oracle.com/ops/domain/schema/shipping}ShipmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNewShipmentViaJMSRequestType", propOrder = {
    "requestHeader",
    "shipment"
})
@XmlRootElement(name = "SendNewShipmentViaJMSRequest")
public class SendNewShipmentViaJMSRequest
    implements Serializable
{

  private final static long serialVersionUID = 678L;
  @XmlElement(name = "RequestHeader", required = true)
  protected WebServiceRequestHeader requestHeader;
  @XmlElement(name = "Shipment", required = true)
  protected Shipment shipment;

  /**
   * Gets the value of the requestHeader property.
   *
   * @return possible object is
   *         {@link WebServiceRequestHeader }
   */
  public WebServiceRequestHeader getRequestHeader()
  {
    return requestHeader;
  }

  /**
   * Sets the value of the requestHeader property.
   *
   * @param value allowed object is
   *              {@link WebServiceRequestHeader }
   */
  public void setRequestHeader(WebServiceRequestHeader value)
  {
    this.requestHeader = value;
  }

  /**
   * Gets the value of the shipment property.
   *
   * @return possible object is
   *         {@link Shipment }
   */
  public Shipment getShipment()
  {
    return shipment;
  }

  /**
   * Sets the value of the shipment property.
   *
   * @param value allowed object is
   *              {@link Shipment }
   */
  public void setShipment(Shipment value)
  {
    this.shipment = value;
  }

}
