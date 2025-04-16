package com.example.alenia.model;

import com.example.alenia.model.entities.PersonaEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {
    String nombre;
    String apellido;
    Long cuit;
    int edad;
    char sexo;
    String email;

    @Override
    public String toString() {
        return "PersonaDTO{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", email='" + email +
                '}';
    }

    public PersonaDTO(PersonaEntity entity){
        this.nombre = entity.getNombre();
        this.cuit = entity.getCuit();
        this.apellido = entity.getApellido();
        this.edad = entity.getEdad();
        this.sexo = entity.getSexo();
        this.email = entity.getEmail();
    }

}
