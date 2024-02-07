package com.example.location1service.web;

import com.example.locationservice.OpenFeigne.ClientFeign;
import com.example.locationservice.OpenFeigne.VooitureFeign;
import com.example.locationservice.entities.Client;
import com.example.locationservice.entities.Location;
import com.example.locationservice.entities.Voiture;
import com.example.locationservice.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LocationController {
    Location l;
    Voiture v;

    LocationRepository locationRepository;
    VooitureFeign vooitureFeign;
    ClientFeign clientFeign;

    @Autowired
    public LocationController(LocationRepository locationRepository, VooitureFeign vooitureFeign, ClientFeign clientFeign) {
        this.locationRepository = locationRepository;
        this.vooitureFeign = vooitureFeign;
        this.clientFeign = clientFeign;
    }



    @GetMapping("/location")
    public List<Location> getAllLoc() {
        List<Location> lv = locationRepository.findAll();

        for (Location v : lv) {
            Client c = clientFeign.getByIdClient(v.getIdClient());
            Voiture vo = vooitureFeign.getByIdVoiture(v.getIdVoiture());

            v.setVoiture(vo);
            v.setClient(c);
        }

        return lv;
    }



    @PostMapping("/location")
    public void AjoutLocation(@RequestBody Location location){
       Integer bn= vooitureFeign.getPrix(v.getPrix_par_jour());
       l.setBenefice(bn*l.getNbj());
       locationRepository.save(location);




    }


}
