package com.poo.controllers;

import com.poo.models.Universidad;

public class MateriasController extends UniversidadController{

    public MateriasController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void materias(){
        System.out.println("Seleccione la opicón que dese ejecutar \n" +
                "1- Dar de alta una materia \n" +
                "2- Mostrar alumnos de una materia \n" +
                "3- Mostrar al profesor de una materia \n" +
                "4- Dar de baja una materia  \n");
    }
}
