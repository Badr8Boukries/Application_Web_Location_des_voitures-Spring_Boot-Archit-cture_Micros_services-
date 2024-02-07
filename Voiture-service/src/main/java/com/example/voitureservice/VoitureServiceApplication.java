package com.example.voitureservice;

import com.example.voitureservice.entities.Voiture;
import com.example.voitureservice.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VoitureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(VoitureRepository voitureRepository){

		return args -> {

			Voiture c=Voiture.builder()
					.prix_par_jour(200)
					.anneeFabrication(2012)
					.marque("Toyota")
					.modele("Yariss")
					.imagePath("assets/R.jpeg")
					.build();
			voitureRepository.save(c);


			Voiture c2=Voiture.builder()
					.prix_par_jour(600)
					.anneeFabrication(2021)
					.marque("Mercedes")
					.modele("Amg")
					.imagePath("assets/mg.jpeg")
					.build();
			voitureRepository.save(c2);





		};



	}
}
