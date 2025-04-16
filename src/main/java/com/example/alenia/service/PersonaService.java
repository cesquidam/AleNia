package com.example.alenia.service;


import com.example.alenia.model.PersonaDTO;
import com.example.alenia.model.entities.PersonaEntity;
import com.example.alenia.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonasRepository personasRepository;


    public List<PersonaDTO> getAllPersonas() {
        return personasRepository.findAll()
                .stream()
                .map(PersonaDTO::new)
                .toList();
    }

    public PersonaDTO updatePersona(PersonaDTO personaDTO) {
        Optional<PersonaEntity> optional = personasRepository.findByCuit(personaDTO.getCuit());
        if(optional.isEmpty()){
            return null;
        }
        PersonaEntity persona = optional.get();
        setDatosPersona(persona, personaDTO);
        personasRepository.save(persona);

        return new PersonaDTO(persona);
    }

    private void setDatosPersona(PersonaEntity persona, PersonaDTO personaDTO){
        persona.setNombre(personaDTO.getNombre());
        persona.setApellido(personaDTO.getApellido());
        if(personaDTO.getEmail() != null){
            persona.setEmail(personaDTO.getEmail());
        }
        persona.setSexo(personaDTO.getSexo());
    }

    public PersonaDTO createPersona(PersonaDTO personaDTO) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNombre(personaDTO.getNombre());
        personaEntity.setCuit(personaDTO.getCuit());
        personaEntity.setEmail(personaDTO.getEmail());
        personaEntity.setActivo(false);
        personasRepository.save(personaEntity);
        return personaDTO;
    }
}
