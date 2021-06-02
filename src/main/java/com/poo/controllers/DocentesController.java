package com.poo.controllers;

import com.poo.enums.ModalidadContrato;
import com.poo.models.*;
import com.poo.enums.ModalidadClase;
import com.poo.enums.TipoPersona;

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

    public void addProfesor(){
        Persona persona;
        Date fechaCont = new Date();
        ModalidadContrato modalidadContrato = null;
        Date  fechaMatricula = null;
        int opcModalidadValida = 0;

        persona = capturarDatosPersona(TipoPersona.Docente);

        do{
            System.out.println("Seleccione la modalidad en la que desea contratar a este profesor:\n" +
                    "1-Titular \n" +
                    "2-Medio Tiempo \n" +
                    "3-Invitado\n");
            opcModalidadValida = scan.nextInt();
            switch(opcModalidadValida){
                case 1:
                    modalidadContrato = ModalidadContrato.Titular;
                    break;
                case 2:
                    modalidadContrato = ModalidadContrato.MedioTiempo;
                    break;
                case 3:
                    modalidadContrato = ModalidadContrato.Invitado;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    opcModalidadValida = 0;
            }
        }while(opcModalidadValida == 0);
        Docente nuevoDocente = new Docente(persona.getCurp(), persona.getNombre(), persona.getDireccion(),
                persona.getFechaNac(),universidad.getDocentesId(),fechaCont, modalidadContrato);
        universidad.getDocentes().add(nuevoDocente);
        universidad.setDocentesId(universidad.getDocentesId()+1);
    }

    private void deleteProfesor() {
        int auxIdDocente;
        System.out.println("Inserte el ID de Docente que desee eliminar \n");
        auxIdDocente = scan.nextInt();
        for(Docente docente: universidad.getDocentes()) {
            if (docente.getId() == auxIdDocente) {
                imprimirDocente(docente);
                System.out.println("El sistema encontró al docente buscado y lo eliminó \n");
                universidad.getAlumnos().remove(docente);
                return;
            }
        }
        System.out.println("No se encontró ningún docente con ese id \n");
    }

    private void getProfesorByNombre() {
        String auxNombreDocente;
        System.out.println("Inserte el nombre de docente que desee buscar\n");
        scan.nextLine();
        auxNombreDocente = scan.nextLine();
        for(Docente docente: universidad.getDocentes()){
            if(docente.getNombre().equals(auxNombreDocente)){
                imprimirDocente(docente);
                return;
            }
        }
        System.out.println("No se encontró ningún docente con ese nombre \n");
    }

    private void getProfesorById() {
        int auxIdDocente;
        System.out.println("Inserte el ID de docente que desee buscar\n");
        auxIdDocente = scan.nextInt();
        for(Docente docente: universidad.getDocentes()){
            if(docente.getId() == auxIdDocente){
                imprimirDocente(docente);
                return;
            }
        }
        System.out.println("No se encontró ningún docente con ese id \n");
    }

    private void getAllProfesores() {
        System.out.println("La lista de profesores es la siguiente: \n");
        if(universidad.getDocentes().size() > 0){
            for(Docente docente: universidad.getDocentes()){
                imprimirDocente(docente);
            }
        }else{
            System.out.println("Aún no hay alumnos inscritos en la universidad \n");
        }

    }
    private void imprimirDocente(Docente docente){
        System.out.println("ID:"+docente.getId()+"\t Nombre: "+ docente.getNombre()+"\t" +
                "CURP:"+docente.getCurp()+"\t Dirección: "+docente.getDireccion()+"\t" +
                "Fecha de nacimiento:"+docente.getFechaNac()+"\t Modalidad Contrato: "+docente.getModalidadContrato()+"\n");

    }

    private void addMateria() {
        System.out.println("Elija la materia por id, a la que le quiera añadir un docente");
    }


}
