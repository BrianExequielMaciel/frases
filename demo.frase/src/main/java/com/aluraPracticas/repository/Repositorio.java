package com.aluraPracticas.repository;

import com.aluraPracticas.model.Frases;
import com.aluraPracticas.modelDTO.FraseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repositorio extends JpaRepository<Frases, Long> {
   @Query("SELECT f FROM Frases f order by function ('RANDOM') LIMIT 1")
    Frases obtenerFraseAleatoria ();

}
