package com.poo.controllers;

import com.poo.models.Universidad;

import java.util.Scanner;

public class AlumnosController  extends UniversidadController{
    private Scanner scan = new Scanner(System.in);
    public AlumnosController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void alumnos(){
        int opc;
        do{
            System.out.println("Seleccione la opción que desee ejecutar:\n" +
                    "1- Añadir Alumno \n" +
                    "2- Añadir Alumno a materia \n" +
                    "3- Mostrar Todos los alumnos \n" +
                    "4- Buscar alumno por id \n" +
                    "5- Buscar alumno por Nombre \n" +
                    "6- Dar de baja alumno \n" +
                    "7- Regresar \n " );
            opc = scan.nextInt();
            switch(opc) {
                case 1:
                    addAlumno();
                    break;
                case 2:
                    addMateria();
                    break;
                case 3:
                    getAllAlumnos();
                    break;
                case 4:
                    getByIdAlumno();
                    break;
                case 5:
                    getByNombreAlumno();
                    break;
                case 6:
                    deleteAlumno();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Inserte una opción válida \n");
            }
        }while(true);


    }
    public void addAlumno(){

    }
    public void addMateria(){

    }
    public void getAllAlumnos(){

    }
    public void getByIdAlumno(){

    }
    public void getByNombreAlumno(){

    }
    public void deleteAlumno(){}

}
