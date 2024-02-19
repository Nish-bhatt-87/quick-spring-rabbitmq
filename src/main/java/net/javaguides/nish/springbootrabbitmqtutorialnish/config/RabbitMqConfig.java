package net.javaguides.nish.springbootrabbitmqtutorialnish.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue queue() {
        return new Queue("javaguides");
    }

    @Bean
    public TopicExchange topicExcahnge() {
        return new TopicExchange("javaguides_exchange");
    }


    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(topicExcahnge()).with("routing_key");
    }




}
