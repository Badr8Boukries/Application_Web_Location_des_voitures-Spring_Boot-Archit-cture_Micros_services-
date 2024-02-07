package com.example.voitureservice.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class VoitureResponse {
    private Integer idV;
    private String marque;
    private Integer prix_par_jour;
}
