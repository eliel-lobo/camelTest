package co.eliel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by eliel on 21/03/16.
 */
public class EchoProcessor implements Processor {

    private Logger log = LoggerFactory.getLogger(getClass());
    private String name;

    public EchoProcessor(String name) {
        this.name = name;
    }

    public void process(Exchange exchange) throws Exception {
        log.info("route invoked: {}", name);
    }
}
