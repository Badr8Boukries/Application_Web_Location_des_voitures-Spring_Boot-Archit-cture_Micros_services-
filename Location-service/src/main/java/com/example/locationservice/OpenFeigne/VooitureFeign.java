package com.example.locationservice.OpenFeigne;

import com.example.locationservice.entities.Voiture;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "VOITURE-SERVICE")
public interface VooitureFeign {

    @GetMapping("/voiture/{id}")
    public Voiture getByIdVoiture(@PathVariable("id")Integer id);

    @GetMapping("/prise/{id}")
    Integer getPrix(@PathVariable("id") Integer id);


}