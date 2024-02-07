package com.example.voitureservice.web;

import com.example.voitureservice.dto.VoitureResponse;
import com.example.voitureservice.entities.Voiture;
import com.example.voitureservice.repository.VoitureRepository;
import com.example.voitureservice.service.VoitureService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    Voiture v;
    VoitureRepository voitureRepository;
    @Autowired
    VoitureService voitureService;

    @GetMapping("/voiture")
    public List<VoitureResponse> getALL(){

        return voitureService.getAll();
    }

    @GetMapping("/voiture/{id}")
    public VoitureResponse getByid(@PathVariable("id")Integer id){

        return voitureService.getById(id);
    }
    @GetMapping("/prise/{id}")
    public Integer getPrix(@PathVariable("id") Integer id) {
        VoitureResponse v= voitureService.getById(id);
        return v.getPrix_par_jour();
    }

}
