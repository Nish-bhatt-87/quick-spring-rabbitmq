package net.javaguides.nish.springbootrabbitmqtutorialnish.controller;

import net.javaguides.nish.springbootrabbitmqtutorialnish.publisher.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerExample {


    @Autowired
    private RabbitMqProducer rabbitMqProducer;

    @GetMapping("/test123/{message}")
    public void sendMessage(@PathVariable String message) {
        this.rabbitMqProducer.sendMessage(message);
    }
}
