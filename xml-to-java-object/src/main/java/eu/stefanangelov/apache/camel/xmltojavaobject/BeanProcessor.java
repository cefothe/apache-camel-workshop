package eu.stefanangelov.apache.camel.xmltojavaobject;

import eu.stefanangelov.apache.camel.xmltojavaobject.to.PurchaseOrder;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class BeanProcessor {

    private static final  Logger LOGGER  = Logger.getLogger(BeanProcessor.class.getName());

    public void process(PurchaseOrder purchaseOrder){
        LOGGER.info(purchaseOrder.toString());
    }
}
