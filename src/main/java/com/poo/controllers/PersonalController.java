package com.poo.controllers;
import com.poo.models.Universidad;
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

    }
    public void asignarPApoyo(){

    }
    public void getAllPApoyo(){

    }
    public void getByIdPApoyo(){

    }
    public void getByNombrePApoyo(){

    }
    public void deletePApoyo(){
        
    }


}
