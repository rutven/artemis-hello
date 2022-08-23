package name.legkodymov.spring.artemis.simpleconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import name.legkodymov.spring.artemis.simpleconsumer.model.SimpleMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SimpleMessageListener {

    @JmsListener(destination = "test-1")
    public void processMessage(SimpleMessage message) {
        log.info("=== Received: " + message);
    }
}
