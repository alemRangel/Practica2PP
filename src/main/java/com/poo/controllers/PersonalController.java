package com.poo.controllers;
import com.poo.enums.TipoPersona;
import com.poo.enums.TipoPersonal;
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

        int opc;

        do{

        System.out.println("Seleccione la opción que desee ejecutar \n" +
                "1- Contratar Personal de apoyo \n" +
                "2- Asignar Personal de Apoyo a una materia \n" +
                "3- Ver todo el Personal de Apoyo \n" +
                "4- Buscar Personal de Apoyo por ID \n" +
                "5- Buscar Personal de Apoyo por Nombre \n" +
                "6- Despedir Personal de Apoyo \n" +
                "7- Regresar \n ");
        
        opc=scan.nextInt();

        switch(opc){
            case 1: 
                addPApoyo();
                break;
            case 2:
                asignarPApoyo();
                break;
            case 3:
                getAllPApoyo();
                break;
            case 4:
                getByIdPApoyo();
                break;
            case 5:
                getByNombrePApoyo();
                break;
            case 6:
                deletePApoyo();
                break;
            case 7:
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
        persona.getFechaNac(), universidad.getPersonal().size()+1,tipoPersonal);
        universidad.getPersonal().add(personalNuevo);       

    }
    public void asignarPApoyo(){

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
            }
        }
    }
    public void getByNombrePApoyo(){
        String nombrePersonal;
        System.out.println("Introduzca el nombre del Personal de apoyo que desea visualizar su infomacion \n");
        nombrePersonal = scan.nextLine();
        scan.nextLine();
        for(int i=0;i<universidad.getPersonal().size();i++){
            if(universidad.getPersonal().get(i).getNombre().equals(nombrePersonal)){
                System.out.println(universidad.getPersonal().get(i));
            }

        }

    }
    public void deletePApoyo(){
        String nombrePersonal;
        System.out.println("Introduzca el nombre del Personal de apoyo que desea despedir \n");
        nombrePersonal = scan.nextLine();
        scan.nextLine();
        for(int i=0;i<universidad.getPersonal().size();i++){
            if(universidad.getPersonal().get(i).getNombre().equals(nombrePersonal)){
                universidad.getPersonal().remove(i);
            }

        }
        
    }


}
