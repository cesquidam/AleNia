package com.example.alenia.service;

import com.example.alenia.model.Persona;
import org.springframework.stereotype.Service;

@Service
public class SaludoServicio {

    public String holaPersonal(Persona persona) {
        if (persona.getEdad() < 18) {
            return "hola niño";
        }
        return "hola " + persona.getNombre();
    }

    public String hola(String name){
        if(name == null) {
            return "Hola";
        }
        return "Hola " + name;
    }

}
