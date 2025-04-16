package com.example.alenia.Controller;

import com.example.alenia.model.PersonaDTO;
import com.example.alenia.model.entities.PersonaEntity;
import com.example.alenia.repository.PersonasRepository;
import com.example.alenia.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/getPersonas")
    public ResponseEntity<List<PersonaDTO>> getAllPersonas() {
        return ResponseEntity.ok(personaService.getAllPersonas());
    }

    @PatchMapping("/updatePersona")
    public ResponseEntity<PersonaDTO> updatePersona(@RequestBody PersonaDTO personaDTO) {
        return ResponseEntity.ok(personaService.updatePersona(personaDTO));
    }

    @PostMapping("/createPersona")
    public ResponseEntity<PersonaDTO> createPersona(@RequestBody PersonaDTO personaDTO) {
        if(personaDTO == null || personaDTO.getEmail() == null || personaDTO.getCuit() == null){
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(personaService.createPersona(personaDTO));

    }
}
