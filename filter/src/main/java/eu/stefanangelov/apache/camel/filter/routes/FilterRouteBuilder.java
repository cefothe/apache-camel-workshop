package eu.stefanangelov.apache.camel.filter.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FilterRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:///home/cefothe/workspace/apache-camel-workshop/data/input?noop=true&recursive=true")
                .filter()
                    .simple("${headers.CamelFileName} not contains 'test'")
                    .log("${headers.CamelFileName}")
                    .to("file:///home/cefothe/workspace/apache-camel-workshop/data/output/message");
    }
}
