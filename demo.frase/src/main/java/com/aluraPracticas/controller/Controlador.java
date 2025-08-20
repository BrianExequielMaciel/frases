package com.aluraPracticas.controller;

import com.aluraPracticas.modelDTO.FraseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @Autowired
    FraseDTOService servicio;
    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatorua(){
        return servicio.obtenerFraseAleatoria();
    }

}
