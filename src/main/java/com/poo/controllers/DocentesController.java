package com.poo.controllers;

import com.poo.models.Universidad;

public class DocentesController {
    private Universidad universidad;

    public DocentesController(Universidad miUniversidad){
        universidad = miUniversidad;
    }

    public void docente(){
        System.out.println("Seleccione la opción que desee ejecutar \n" +
                "1- Contratar Profesor \n" +
                "2- Asignar Profesor a una materia \n" +
                "3- Ver todos los profesores \n" +
                "4- Buscar profesor por id \n" +
                "5- Buscar por Nombre \n" +
                "6- Despedir profesor \n");

    }
}
