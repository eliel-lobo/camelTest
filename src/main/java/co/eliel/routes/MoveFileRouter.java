package co.eliel.routes;

import co.eliel.processors.EchoProcessor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by eliel on 19/03/16.
 */
public class MoveFileRouter extends RouteBuilder {
    public void configure() throws Exception {
        from("file:data/inbox?noop=true")
                .process(new EchoProcessor("File to File"))
                .to("file:data/outbox");
    }
}
