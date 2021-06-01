package com.poo.controllers;

import com.poo.models.Universidad;

import java.util.Scanner;

public class DocentesController extends UniversidadController{
    private Scanner scan = new Scanner(System.in);

    public DocentesController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void docente(){
        int opc;
        System.out.println("Seleccione la opción que desee ejecutar \n" +
                "1- Contratar Profesor \n" +
                "2- Asignar Profesor a una materia \n" +
                "3- Ver todos los profesores \n" +
                "4- Buscar profesor por id \n" +
                "5- Buscar por Nombre \n" +
                "6- Despedir profesor \n" +
                "7- Regresar \n ");

    }

    public void addDocente(){
        
    }
}
