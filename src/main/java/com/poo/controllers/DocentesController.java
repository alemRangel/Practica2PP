package com.poo.controllers;

import com.poo.enums.ModalidadContrato;
import com.poo.models.Universidad;
import com.poo.enums.ModalidadClase;
import com.poo.enums.TipoPersona;
import com.poo.models.Alumno;
import com.poo.models.Docente;
import com.poo.models.Persona;

import java.util.Scanner;
import java.util.Date;

public class DocentesController extends UniversidadController{
    public DocentesController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void docente(){
        int opc;
        do{
            System.out.println("Seleccione la opción que desee ejecutar \n" +
                    "1- Contratar Profesor \n" +
                    "2- Asignar Profesor a una materia \n" +
                    "3- Ver todos los profesores \n" +
                    "4- Buscar profesor por id \n" +
                    "5- Buscar por Nombre \n" +
                    "6- Despedir profesor \n" +
                    "7- Regresar \n ");
                    opc = scan.nextInt();
                    switch(opc) {
                        case 1:
                            addProfesor();
                            break;
                        case 2:
                            addMateria();
                            break;
                        case 3:
                            getAllProfesores();
                            break;
                        case 4:
                            getProfesorById();
                            break;
                        case 5:
                            getProfesorByNombre();
                            break;
                        case 6:
                            deleteProfesor();
                            break;
                        case 7:
                            return;
                        default:
                            System.out.println("Inserte una opción válida \n");
                }           
        }while(true);
    }

    public void addDocente(){
        Docente Docente;
        Persona persona;
        //FechaCont fechaCont;
        ModalidadContrato ModalidadDocente;
        Date  fechaMatricula = null;
        int opcModalidadValida = 0;

        persona = capturarDatosPersona(TipoPersona.Docente);

        do{
            System.out.println("Seleccione la modalidad en la que desee dar clases:\n" +
                    "1-Presencial \n" +
                    "2-Distancia \n" +
                    "3-Mixta\n");
            opcModalidadValida = scan.nextInt();
            switch(opcModalidadValida){
                case 1:
                    ModalidadDocente = ModalidadContrato.Titular;
                    break;
                case 2:
                    ModalidadDocente = ModalidadContrato.MedioTiempo;
                    break;
                case 3:
                    ModalidadDocente = ModalidadContrato.Invitado;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    opcModalidadValida = 0;
            }
        }while(opcModalidadValida == 0);
        do{
            System.out.println("");
        }while(fechaMatricula == null);
    }

    private void deleteProfesor() {
    }

    private void getProfesorByNombre() {
    }

    private void getProfesorById() {
    }

    private void getAllProfesores() {
    }

    private void addMateria() {
    }

    private void addProfesor() {
    }
}
