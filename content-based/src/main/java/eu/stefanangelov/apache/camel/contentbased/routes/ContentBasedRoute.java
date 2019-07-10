package eu.stefanangelov.apache.camel.contentbased.routes;

import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:////home/cefothe/workspace/apache-camel-workshop/data/input?noop=true&recursive=true")
                .choice()
                    .when(header("CamelFileName").endsWith(".jpeg"))
                        .log("Image with file name ${headers.CamelFileName}")
                        .to("file:////home/cefothe/workspace/apache-camel-workshop/data/output/images")
                    .when(header("CamelFileName").endsWith(".xml"))
                        .log("Xml with file name ${headers.CamelFileName}")
                        .to("file:////home/cefothe/workspace/apache-camel-workshop/data/output/xml")
                    .otherwise()
                        .to("file:////home/cefothe/workspace/apache-camel-workshop/data/output/unknown")
                    .endChoice();
    }
}
