package com.example.voitureservice.repository;

import com.example.voitureservice.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Integer> {
}
