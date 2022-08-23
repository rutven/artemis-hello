package name.legkodymov.spring.artemis.simpleproducer.controller;

import name.legkodymov.spring.artemis.simpleproducer.model.SimpleMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private static long id = 1;

    private final JmsTemplate jmsTemplate;

    @Value("${DESTINATION}")
    private String destination;

    public ProducerController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostMapping("/send")
    public SimpleMessage send(@RequestBody SimpleMessage message) {
        if (message.getId() == null) {
            message.setId(id++);
        }
        jmsTemplate.convertAndSend(destination, message);
        return message;
    }
}
