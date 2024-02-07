package com.example.locationservice.consomer;


import com.example.locationservice.entities.Location;
import com.example.locationservice.publisher.RabbitProducer;
import com.example.locationservice.repository.LocationRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RabbitMQConsumer {
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    RabbitProducer rabbitProducer;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);
    @RabbitListener(queues = {"${rabbitmq.queue3.name}"})
    public void consume(Integer     id){
        LOGGER.info(String.format("Message consommé et vente supprimer -> %d", id));
        List<Location> ListeLocation=locationRepository.findAll();
        for(Location v: ListeLocation){
            int ia=v.getIdClient();
            int iv=v.getIdLoc();
            if(ia==id){

                locationRepository.deleteById(iv);


            }
        }
    }
}
