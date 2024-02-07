package com.example.clientservice.dto;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor @ToString @Builder @Data
public class ClientRequest {

    private String name;
    private String adresse;
    private String email;


}
