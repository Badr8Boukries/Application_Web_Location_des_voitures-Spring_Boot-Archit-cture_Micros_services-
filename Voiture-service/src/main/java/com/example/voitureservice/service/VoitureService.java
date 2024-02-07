package com.example.voitureservice.service;

import com.example.voitureservice.dto.VoitureRequest;
import com.example.voitureservice.dto.VoitureResponse;

import java.util.List;

public interface VoitureService {


    //ADD
    public void ajouter(VoitureRequest req);

    public List<VoitureResponse> getAll();

    public VoitureResponse getById( Integer id);

    public void update(VoitureRequest req,Integer id);

    public void supprimer(Integer id);

}
