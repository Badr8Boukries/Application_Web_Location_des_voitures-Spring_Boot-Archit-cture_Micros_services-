package com.example.voitureservice.mapper;

import com.example.voitureservice.dto.VoitureRequest;
import com.example.voitureservice.dto.VoitureResponse;
import com.example.voitureservice.entities.Voiture;

public interface VoitureMapper {


    public Voiture REQ_TO_VOITURE(VoitureRequest request);

    public VoitureResponse VOITURE_TO_RESPONSE(Voiture v);
}
