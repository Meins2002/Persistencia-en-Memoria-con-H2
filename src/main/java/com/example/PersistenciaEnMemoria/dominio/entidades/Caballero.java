package com.example.PersistenciaEnMemoria.dominio.entidades;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Caballero {
    private Long id;
    private String name;
    private String zodiac ;

}
