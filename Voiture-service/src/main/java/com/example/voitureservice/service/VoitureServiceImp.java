package com.example.voitureservice.service;

import com.example.voitureservice.dto.VoitureRequest;
import com.example.voitureservice.dto.VoitureResponse;
import com.example.voitureservice.entities.Voiture;
import com.example.voitureservice.mapper.VoitureMapper;
import com.example.voitureservice.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class VoitureServiceImp implements VoitureService{

    @Autowired
    VoitureMapper voitureMapper;
    @Autowired
    VoitureRepository voitureRepository;
    @Override
    public void ajouter(VoitureRequest req) {
        Voiture voiture=new Voiture();
       voiture= voitureMapper.REQ_TO_VOITURE(req);
       voitureRepository.save(voiture);

    }

    @Override
    public List<VoitureResponse> getAll() {
        List<Voiture>lv=new ArrayList<>();
        lv=voitureRepository.findAll();
        List<VoitureResponse>lr=new ArrayList<>();

        for(Voiture v:lv){
            VoitureResponse res=new VoitureResponse();
            res=voitureMapper.VOITURE_TO_RESPONSE(v);
            lr.add(res);


        }
        return lr;

    }

    @Override
    public VoitureResponse getById(Integer id) {
        Voiture v=voitureRepository.findById(id).get();
       return voitureMapper.VOITURE_TO_RESPONSE(v);

    }

    @Override
    public void update(VoitureRequest req, Integer id) {
        Voiture v=voitureRepository.findById(id).get();
       v= voitureMapper.REQ_TO_VOITURE(req);
       voitureRepository.save(v);


    }

    @Override
    public void supprimer(Integer id) {

        voitureRepository.deleteById(id);

    }
}
