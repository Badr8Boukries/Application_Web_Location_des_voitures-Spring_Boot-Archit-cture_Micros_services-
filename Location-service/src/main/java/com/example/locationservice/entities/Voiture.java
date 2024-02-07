package com.example.locationservice.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor @ToString @Data @Builder
public class Voiture {
    private Integer idV;

    private String marque;
    private String modele;
    private int anneeFabrication;
    private Integer prix_par_jour;
}

