package com.example.alenia.repository;

import com.example.alenia.model.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonasRepository extends JpaRepository<PersonaEntity, Integer> {
    Optional<PersonaEntity> findByCuit(Long cuit);
}
