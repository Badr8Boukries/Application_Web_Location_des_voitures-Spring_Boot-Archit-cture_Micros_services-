package com.example.locationservice;

import com.example.locationservice.entities.Location;
import com.example.locationservice.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient


public class LocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(LocationRepository repository) {
        return args -> {

            Location v1 = Location.builder()
                    .nbj(10)
                    .idClient(1)
                    .idVoiture(1)
                    .build();
            repository.save(v1);
            Location v2 = Location.builder()
                    .nbj(2)
                    .idClient(2)
                    .idVoiture(2)
                    .build();
            repository.save(v2);





        };
    }
}
