package com.example.notification.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Value("${rabbitmq.queue2.name}")
    private String queue2;
    @Value("${rabbitmq.exchange2.name}")
    private String exchange2;
    @Value("${rabbitmq.binding2.name}")
    private String routing_key2;

    @Bean
    public Queue queue2(){
        return new Queue(queue2);
    }
    @Bean
    public DirectExchange exchange2(){
        return new DirectExchange(exchange2);
    }
    @Bean
    public Binding binding2(){
        return BindingBuilder
                .bind(queue2())
                .to(exchange2())
                .with(routing_key2);
    }
}
