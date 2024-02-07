package com.example.location1service.entities;

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

