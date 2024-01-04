package com.example.PersistenciaEnMemoria.aplicacion.controller;

import com.example.PersistenciaEnMemoria.dominio.entidades.Caballero;
import com.example.PersistenciaEnMemoria.dominio.interfase.CaballeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caballero")
public class CaballeroController {

    @Autowired
    private CaballeroRepository caballeroRepository;

    @PostMapping
    public Caballero createCaballero(@RequestBody Caballero caballero) {
        return caballeroRepository.save(caballero);
    }

    @GetMapping
    public List<Caballero> getAllCaballero() {
        return caballeroRepository.findAll();
    }
}
