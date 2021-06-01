package com.poo.controllers;

import com.poo.models.Universidad;

public class AlumnosController  extends UniversidadController{

    public AlumnosController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void alumnos(){

        System.out.println("Seleccione la opción que desee ejecutar:\n" +
                "1- Añadir Alumno \n" +
                "2- Añadir Materia a alumno \n" +
                "3- Mostrar Todos los alumnos \n" +
                "4- Buscar alumno por id \n" +
                "5- Buscar alumno por Nombre \n" +
                "6- Dar de baja alumno \n");

    }


}
