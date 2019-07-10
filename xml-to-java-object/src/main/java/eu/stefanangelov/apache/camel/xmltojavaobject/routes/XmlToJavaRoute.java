package eu.stefanangelov.apache.camel.xmltojavaobject.routes;

import eu.stefanangelov.apache.camel.xmltojavaobject.BeanProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class XmlToJavaRoute extends RouteBuilder {

    private final BeanProcessor processor;

    public XmlToJavaRoute(BeanProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void configure() throws Exception {

        from("file:///home/cefothe/workspace/apache-camel-workshop/data/input/purchaseorder?noop=true")
           .bean(processor);
    }
}
