package com.example.alenia.service;

import com.example.alenia.model.PersonaDTO;
import org.springframework.stereotype.Service;

@Service
public class SaludoServicio {

    public String holaPersonal(PersonaDTO personaDTO) {
        if (personaDTO.getEdad() < 18) {
            return "hola niño";
        }
        return "hola " + personaDTO.getNombre();
    }

    public String hola(String name){
        if(name == null) {
            return "Hola";
        }
        return "Hola " + name;
    }

}
