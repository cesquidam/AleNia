package com.example.alenia.Controller;

import com.example.alenia.model.Persona;
import com.example.alenia.service.SaludoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {


    @Autowired
    SaludoServicio saludoServicio;

    @PostMapping("/holaPersonal")
    public ResponseEntity<String> holaPersonal(@RequestBody Persona persona) {
        if(persona.getNombre() == null){
            return ResponseEntity.badRequest().body("Nombre no valido");
        }

        return ResponseEntity.ok(saludoServicio.holaPersonal(persona));
    }

    @GetMapping("/hola")
    public String hola(@RequestParam(required = false) String name) {
        return saludoServicio.hola(name);
    }

    @GetMapping("/chau")
    public String chau(@RequestParam(required = false, defaultValue = "tontín") String name,
                       @RequestParam(required = false) String apellido) {
        return "Chau " + name + apellido;
    }
}
