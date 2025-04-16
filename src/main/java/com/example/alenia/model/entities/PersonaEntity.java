package com.example.alenia.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Getter
@Setter
@NoArgsConstructor
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "cuit")
    private Long cuit;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "sexo")
    private Character sexo;

    @Column(name = "habilitado", nullable = false)
    private Boolean activo;

    @Column(name = "email")
    private String email;

}
