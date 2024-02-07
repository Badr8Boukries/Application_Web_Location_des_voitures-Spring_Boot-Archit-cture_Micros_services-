package com.example.locationservice.OpenFeigne;

import com.example.locationservice.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CLIENT-SERVICE")
public interface ClientFeign {

    @GetMapping("/client/{id}")
    public Client getByIdClient(@PathVariable("id")Integer id);


}
