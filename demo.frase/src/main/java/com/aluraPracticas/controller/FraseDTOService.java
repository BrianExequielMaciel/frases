package com.aluraPracticas.controller;

import com.aluraPracticas.model.Frases;
import com.aluraPracticas.modelDTO.FraseDTO;
import com.aluraPracticas.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseDTOService {
    @Autowired
   private Repositorio repositorio;

    public FraseDTO obtenerFraseAleatoria() {
       Frases frase =  repositorio.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }
}
