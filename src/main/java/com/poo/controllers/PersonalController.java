package com.poo.controllers;
import com.poo.enums.TipoPersona;
import com.poo.enums.TipoPersonal;
import com.poo.models.Materia;
import com.poo.models.Persona;
import com.poo.models.PersonalApoyo;
import com.poo.models.Universidad;

import java.util.Date;
import java.util.Scanner;

public class PersonalController extends UniversidadController{

    private Scanner scan = new Scanner(System.in);

    public  PersonalController(Universidad miUniversidad) {
        super(miUniversidad);
    }


    public void personal(){

        String opc;

        do{

            System.out.println("Seleccione la opción que desee ejecutar \n" +
                "1- Contratar Personal de apoyo \n" +
                "2- Asignar Personal de Apoyo a una materia \n" +
                "3- Ver todo el Personal de Apoyo \n" +
                "4- Buscar Personal de Apoyo por ID \n" +
                "5- Buscar Personal de Apoyo por Nombre \n" +
                "6- Despedir Personal de Apoyo \n" +
                "7- Regresar \n ");
        
        opc=scan.nextLine();
        




            switch(opc){
                case "1":
                    addPApoyo();
                    break;
                case "2":
                    asignarPApoyo();
                    break;
                case "3":
                    getAllPApoyo();
                    break;
                case "4":
                    getByIdPApoyo();
                    break;
                case "5":
                    getByNombrePApoyo();
                    break;
                case "6":
                    deletePApoyo();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Inserte una opción válida \n");


            }

        }while(true);
    }
    public void addPApoyo(){
        PersonalApoyo Personal;
        Persona persona;
        TipoPersonal tipoPersonal = null;
        Date  fechaMatricula = new Date();
        int opctipoPersonaldValido = 0;
        persona = capturarDatosPersona(TipoPersona.Personal);
        do{
            System.out.println("Seleccione el tipo de personal a contratar:\n" +
                    "1-Laboratorio \n" +
                    "2-Analista \n" +
                    "3-Ayudante\n");
            opctipoPersonaldValido = scan.nextInt();
            switch(opctipoPersonaldValido){
                case 1:
                    tipoPersonal = tipoPersonal.Laboratorio;
                    break;
                case 2:
                    tipoPersonal = tipoPersonal.Analista;
                    break;
                case 3:
                    tipoPersonal = tipoPersonal.Ayudante;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    opctipoPersonaldValido = 0;
            }
        }while(opctipoPersonaldValido == 0);
        PersonalApoyo personalNuevo = new PersonalApoyo(persona.getCurp(), persona.getNombre(), persona.getDireccion(),
                persona.getFechaNac(), universidad.getPersonalId()+1,tipoPersonal);
        universidad.getPersonal().add(personalNuevo);
        universidad.setPersonalApoyoId(universidad.getPersonalId()+1);

    }
    public void asignarPApoyo(){
        int idMateriaAux,idPersonalAux;
        System.out.println("Elija la materia por id, a la que le quiera añadir personal de apoyo \n");
        idMateriaAux = scan.nextInt();
        for(Materia materia : universidad.getMaterias()){
            if(materia.getId() == idMateriaAux){
                System.out.println("Ingrese el número de Id del personal de apoyo al que desea asignar " +
                        "a la materia: "+materia.getNombreMateria()+"\n");
                idPersonalAux = scan.nextInt();
                for(PersonalApoyo personal : universidad.getPersonal()){
                    if(personal.getId() == idPersonalAux){
                        universidad.getMaterias().get(idMateriaAux).setPersonalApoyo(personal);
                        System.out.println("Se designó al miembro del personal de apoyo "+personal.getNombre()+"" +
                                "como ayuda de la materia "+materia.getNombreMateria()+"\n");
                    }
                }
                System.out.println("No se encontró el profesor buscado \n");
                return;
            }
        }
        System.out.println("No se encontró la materia buscada \n");
    }
    public void getAllPApoyo(){
        for(int i=0;i<universidad.getPersonal().size();i++){
            System.out.println(universidad.getPersonal().get(i));
        }

    }
    public void getByIdPApoyo(){
        int idPersonal;
        System.out.println("Introduzca el Id del Personal de apoyo que desea visualizar su infomacion \n");
        idPersonal = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<universidad.getPersonal().size();i++){
            if(universidad.getPersonal().get(i).getId()==idPersonal){
                System.out.println(universidad.getPersonal().get(i));
                return;
            }
        }
        System.out.println("No se encontró ningún personal de apoyo con ese id \n");
    }
    public void getByNombrePApoyo(){
        String nombrePersonal;
        System.out.println("Introduzca el nombre del Personal de apoyo que desea visualizar su infomacion \n");
        nombrePersonal = scan.nextLine();
        scan.nextLine();
        for(int i=0;i<universidad.getPersonal().size();i++){
            if(universidad.getPersonal().get(i).getNombre().equals(nombrePersonal)){
                System.out.println(universidad.getPersonal().get(i));
                return;
            }
            System.out.println("No se encontró ningún personal de apoyo con ese nombre \n");

        }

    }
    public void deletePApoyo(){
        int idPersonal;
        System.out.println("Introduzca el Id del Personal de apoyo que desea visualizar su infomacion \n");
        idPersonal = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<universidad.getPersonal().size();i++){
            if(universidad.getPersonal().get(i).getId()==idPersonal){
                System.out.println("El sistema encontró al personal de apoyo buscado y lo eliminó \n");
                universidad.getPersonal().remove(i);
                return;
            }
        }
        System.out.println("No se encontró ningún personal de apoyo con ese id \n");

    }


}