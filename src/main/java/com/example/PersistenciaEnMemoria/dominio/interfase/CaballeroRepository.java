package com.example.PersistenciaEnMemoria.dominio.interfase;
import com.example.PersistenciaEnMemoria.dominio.entidades.Caballero;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CaballeroRepository  extends JpaRepository<Caballero, Long> {

}
