package com.example.location1service.entities;

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
