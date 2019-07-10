package eu.stefanangelov.apache.camel.xmltojavaobject.to;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class PurchaseOrder {

    @XmlElement
    public String name;

    @XmlElement
    public double price;

    @XmlElement
    public double amount;

}