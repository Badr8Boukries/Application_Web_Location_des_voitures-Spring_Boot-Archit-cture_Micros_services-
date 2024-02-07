package com.example.notification.consomer;

import com.example.notification.Entites.Notification;
import com.example.notification.Repository.NotificationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {
    @Autowired
    NotificationRepository notificationRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);
    @RabbitListener(queues = {"${rabbitmq.queue2.name}"})
    public void consume(String message){
        LOGGER.info(String.format("Message consommé -> %s", message));
        Notification notification = new Notification();
        notification.setBody(message);
        notificationRepository.save(notification);
    }
}
