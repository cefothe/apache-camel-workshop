package eu.stefanangelov.apache.camel.copyfileswithcamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * This route is responsible to copy files from one directory to another directory
 */
@Component
public class FileCopier extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:////home/cefothe/workspace/apache-camel-workshop/data/input?noop=true&recursive=true")
                .log("${headers.CamelFileName}")
                .to("file:////home/cefothe/workspace/apache-camel-workshop/data/output");
    }
}
