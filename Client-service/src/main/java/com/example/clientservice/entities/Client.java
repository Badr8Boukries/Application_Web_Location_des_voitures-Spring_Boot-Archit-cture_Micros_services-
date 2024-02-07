package com.example.clientservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString @Data @Builder
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idC;
     private String name;
     private String adresse;
     private String email;





}
