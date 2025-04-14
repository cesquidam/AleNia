package com.example.alenia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    String nombre;
    String apellido;
    int edad;
    char sexo;
    boolean activo;
    String email;
    Long celular;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", activo=" + activo +
                ", email='" + email + '\'' +
                ", celular=" + celular +
                '}';
    }
}
