package com.example.locationservice.entities;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Client {
    private Integer idC;
    private String name;
    private String adresse;
    private String email;
}
