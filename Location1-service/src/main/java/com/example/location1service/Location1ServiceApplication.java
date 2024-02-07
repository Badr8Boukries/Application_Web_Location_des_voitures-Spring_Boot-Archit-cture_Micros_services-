package com.example.location1service;

import com.example.locationservice.entities.Location;
import com.example.locationservice.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients

@SpringBootApplication
public class Location1ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Location1ServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(LocationRepository locationRepository) {
		return args -> {

			Location v1 = Location.builder()
					.nbj(10)
					.idClient(1)
					.idVoiture(1)
					.build();
			locationRepository.save(v1);
			Location v2 = Location.builder()
					.nbj(2)
					.idClient(2)
					.idVoiture(2)
					.build();
			locationRepository.save(v2);





		};
	}
}
