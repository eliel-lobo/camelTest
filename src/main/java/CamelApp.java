import com.github.tomakehurst.wiremock.WireMockServer;
import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

/**
 * Created by eliel on 19/03/16.
 */
public class CamelApp {

    private static Logger log = LoggerFactory.getLogger(CamelApp.class);

    public static void main(String[] args) throws Exception {

        //setup wiremock
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));
        wireMockServer.start();

        configureFor("localhost", 8089);

        log.info("wiremock started");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CamelContext camelContext = (CamelContext) context.getBean("camel-context");

        camelContext.start();
        Thread.sleep(10000);

        camelContext.stop();

    }
}
