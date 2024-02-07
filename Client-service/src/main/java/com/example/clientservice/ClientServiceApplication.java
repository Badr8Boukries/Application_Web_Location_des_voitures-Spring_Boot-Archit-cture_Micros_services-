package com.example.clientservice;

import com.example.clientservice.entities.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ClientRepository clientRepository){

        return args -> {

            Client c=Client.builder()
                    .name("badr")
                    .adresse("rabat")
                    .email("badr8boukries@gmail.com")
                    .build();
            clientRepository.save(c);


            System.out.println(" nom est " +c.getName()+" habite a  "+c.getAdresse());


            Client c2=Client.builder()
                    .name("AIMAN")
                    .adresse("rabat")
                    .email("aiman@gmail.com")
                    .build();
            clientRepository.save(c2);


            System.out.println(" nom est " +c2.getName()+" habite a  "+c2.getAdresse());

            Client c3=Client.builder()
                    .name("zouhair")
                    .adresse("rabat")
                    .email("zouhair@gmail.com")
                    .build();
            clientRepository.save(c3);


            System.out.println(" nom est " +c3.getName()+" habite a  "+c3.getAdresse());

            Client c4=Client.builder()
                    .name("messi")
                    .adresse("Miami")
                    .email("Messi@gmail.com")
                    .build();
            clientRepository.save(c4);

            Client c5=Client.builder()
                    .name("hassan")
                    .adresse("casa")
                    .email("jihad@gmail.com")
                    .build();
            clientRepository.save(c5);


            System.out.println(" nom est " +c4.getName()+" habite a  "+c4.getAdresse());


        };



    }

}
