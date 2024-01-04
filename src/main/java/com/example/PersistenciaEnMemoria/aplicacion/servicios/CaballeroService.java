package com.example.PersistenciaEnMemoria.aplicacion.servicios;

import com.example.PersistenciaEnMemoria.dominio.interfase.CaballeroRepository;
import org.springframework.stereotype.Service;
@Service
public record CaballeroService (CaballeroRepository caballeroRepository){
    public void createCaballero(){

    }
}
