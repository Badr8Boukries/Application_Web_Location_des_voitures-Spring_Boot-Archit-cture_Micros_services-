package com.example.voitureservice.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class VoitureRequest {

    private String marque;
    private String modele;
    private int anneeFabrication;
    private Integer prix_par_jour;
    private String imagePath;

}
