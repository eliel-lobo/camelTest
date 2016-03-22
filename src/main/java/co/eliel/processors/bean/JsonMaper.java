package co.eliel.processors.bean;

import co.eliel.data.Client;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Maps the a JSON HTTP response to a Java class
 * Created by eliel on 21/03/16.
 */
public class JsonMaper {

    private static Logger log = LoggerFactory.getLogger(JsonMaper.class);

    public static String map(String original) {
        log.trace("about to map: {}", original);

        ObjectMapper mapper = new ObjectMapper();

        String strClient = null;
        try {
            Client client = mapper.readValue(original, Client.class);
            log.info("successfully mapped client {} from {}", client.getName(), client.getAddress().getCountry());
            strClient = mapper.writeValueAsString(client);
        } catch (IOException e) {
            log.error("Couldn't map the client object");
            e.printStackTrace();
        }

        return strClient;
    }

}
