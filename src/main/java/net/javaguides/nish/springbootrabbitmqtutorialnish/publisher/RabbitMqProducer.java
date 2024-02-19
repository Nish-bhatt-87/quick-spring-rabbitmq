package net.javaguides.nish.springbootrabbitmqtutorialnish.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        this.rabbitTemplate.convertAndSend("javaguides_exchange","routing_key",message);

    }

}
