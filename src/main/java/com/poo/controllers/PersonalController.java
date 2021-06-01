package com.poo.controllers;
import com.poo.models.Universidad;

public class PersonalController {
    private Universidad universidad;


    public PersonalController(Universidad miUniversidad){
        universidad = miUniversidad;
    }


    public void personal(){
        System.out.println("Seleccione la opción que desee ejecutar \n" +
                "1- Contratar Personal de apoyo \n" +
                "2- Asignar Personal de Apoyo a una materia \n" +
                "3- Ver todo el Personal de Apoyo \n" +
                "4- Buscar Personal de Apoyo por ID \n" +
                "5- Buscar Personal de Apoyo por Nombre \n" +
                "6- Despedir Personal de Apoyo \n");

    }


}
