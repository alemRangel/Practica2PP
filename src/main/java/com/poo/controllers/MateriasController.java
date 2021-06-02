package com.poo.controllers;
import java.util.ArrayList;

import java.util.Scanner;

import com.poo.models.Universidad;
import com.poo.models.Materia;
import com.poo.models.Persona;

public class MateriasController extends UniversidadController{
    
    private ArrayList<Materia> materias = new ArrayList<>();

    private Scanner scan = new Scanner(System.in);

    public MateriasController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void materias(){
        int opc;

        do{
        System.out.println("Seleccione la opicón que dese ejecutar \n" +
                "1- Dar de alta una materia \n" +
                "2- Mostrar alumnos de una materia \n" +
                "3- Mostrar al profesor de una materia \n" +
                "4- Dar de baja una materia  \n" +
                "5- Mostrar todas las materias \n" +
                "6- Regresar \n ");

    
        opc=scan.nextInt();

        switch(opc){
            case 1: 
                addMateria();
                break;
            case 2:
                getAlumnMateria();
                break;
            case 3:
                getProfesor();
                break;
            case 4:
                deleteMateria();
                break;
            case 5:
                return;
            default:
                System.out.println("Inserte una opción válida \n");


        }
        
        }while(true);
    }

    public void addMateria(){;
       // Materia NewMateria= capturarDatosMateria();
        //materias.add(NewMateria);


    }

    public void getAlumnMateria(){

    }

    public void getProfesor(){

    }

    public void deleteMateria(){

    }

}
