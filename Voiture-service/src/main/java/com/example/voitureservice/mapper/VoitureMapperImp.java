package com.example.voitureservice.mapper;

import com.example.voitureservice.dto.VoitureRequest;
import com.example.voitureservice.dto.VoitureResponse;
import com.example.voitureservice.entities.Voiture;
import org.springframework.stereotype.Component;

@Component
public class VoitureMapperImp implements VoitureMapper{
    @Override
    public Voiture REQ_TO_VOITURE(VoitureRequest request) {
        Voiture v=new Voiture();
        v.setMarque(request.getMarque());
        v.setPrix_par_jour(request.getPrix_par_jour());
        v.setModele(request.getModele());
        v.setAnneeFabrication(request.getAnneeFabrication());

        return v;
    }

    @Override
    public VoitureResponse VOITURE_TO_RESPONSE(Voiture v) {

        VoitureResponse voitureResponse=new VoitureResponse();
        voitureResponse.setMarque(v.getMarque());
        voitureResponse.setPrix_par_jour(v.getPrix_par_jour());
        voitureResponse.setIdV(v.getIdV());
        return voitureResponse;
    }
}
