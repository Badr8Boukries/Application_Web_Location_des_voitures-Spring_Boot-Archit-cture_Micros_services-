package com.example.voitureservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Entity
public class Voiture {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idV;

    private String marque;
    private String modele;
    private int anneeFabrication;
    private Integer prix_par_jour;
    private String imagePath;
}
