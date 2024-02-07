package com.example.clientservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor @ToString
@Builder @Data

public class ClientResponses {
    private Integer idC;
    private String name;
    private String email;
    private String adresse;

}
