package com.example.locationservice.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@AllArgsConstructor @NoArgsConstructor
@ToString @Getter @Setter @Builder
@Entity
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLoc;

    private Integer nbj;

    private Integer benefice;
    private Integer idClient;
    private Integer idVoiture;

    @Transient
    private Client client;
    @Transient
    private Voiture voiture;


}
