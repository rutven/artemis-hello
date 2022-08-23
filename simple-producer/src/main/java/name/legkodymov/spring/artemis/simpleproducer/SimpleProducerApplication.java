package name.legkodymov.spring.artemis.simpleproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SimpleProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProducerApplication.class, args);
    }

}
