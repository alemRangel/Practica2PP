package com.poo.controllers;

import com.poo.models.Universidad;

public class UniversidadController {
    protected Universidad universidad;

    public UniversidadController(Universidad miUniversidad){
        universidad = miUniversidad;
    }
    public Universidad getMiUniversidad(){
        return universidad;
    }
}
