package com.poo;

/**
 * Hello world!
 *
 */
import com.poo.grafica.Menu;
import com.poo.controllers.AlumnosController;
import com.poo.controllers.DocentesController;
import com.poo.controllers.PersonalController;
import com.poo.controllers.MateriasController;
import com.poo.models.Universidad;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Universidad miUniversidad = new Universidad();
        AlumnosController controladorAlumnos;
        DocentesController controladorDocentes;
        PersonalController controladorPersonal;
        MateriasController controladorMaterias;
        Menu menu = new Menu(miUniversidad);
        Scanner scan = new Scanner(System.in);
        int controlOperacion;
        do{
            System.out.println( "Hola, este es su sistema de gestión escolar. Por favor, seleccione una acción: \n " +
                    "1- Alumnos  \n" +
                    "2- Materias \n" +
                    "3- Docentes  \n" +
                    "4- Personal Auxiliar \n" +
                    "5- Salir del sistema \n");
            controlOperacion = scan.nextInt();
            switch(controlOperacion){
                case 1:
                    controladorAlumnos = new AlumnosController(miUniversidad);
                    controladorAlumnos.alumnos();
                    miUniversidad = controladorAlumnos.getMiUniversidad();
                    break;
                case 2:
                    controladorMaterias = new MateriasController(miUniversidad);
                    controladorMaterias.materias();
                    miUniversidad = controladorMaterias.getMiUniversidad();
                    break;
                case 3:
                    controladorDocentes = new DocentesController(miUniversidad);
                    controladorDocentes.docente();
                    miUniversidad = controladorDocentes.getMiUniversidad();
                    break;
                case 4:
                    controladorPersonal = new PersonalController(miUniversidad);
                    controladorPersonal.personal();
                    miUniversidad = controladorPersonal.getMiUniversidad();
                    break;
                case 5:
                    System.out.println("Terminando el programa \n ");
                    System.exit(0);
                default:
                    System.out.println("Por favor escriba una opción válida \n");
            }
        }while(true);
    }


}
