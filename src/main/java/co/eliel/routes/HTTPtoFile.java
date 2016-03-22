package co.eliel.routes;

import co.eliel.processors.EchoProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by eliel on 21/03/16.
 */
public class HTTPtoFile extends RouteBuilder {
    private Logger log = LoggerFactory.getLogger(getClass());
    public void configure() throws Exception {

        from("timer://foo?fixedRate=true&period=5000")
                .process(new EchoProcessor("HTTP to File"))
                .to("http://localhost:8089/client")
                .to("file:data/outbox?fileName=data-${date:now:yyyyMMdd-HHmm}.json");
    }
}
