package com.poo.controllers;

import com.poo.enums.ModalidadClase;
import com.poo.enums.TipoPersona;
import com.poo.enums.TipoPersonal;
import com.poo.models.Docente;
import com.poo.models.Materia;
import com.poo.models.Persona;
import com.poo.models.PersonalApoyo;
import com.poo.models.Universidad;
import com.poo.util.Util;

import java.util.Date;
import java.util.Scanner;

public class UniversidadController {
    protected Universidad universidad;
    protected Scanner scan = new Scanner(System.in);
    protected Util util = new Util();
    public UniversidadController(Universidad miUniversidad){
        universidad = miUniversidad;
    }
    public Universidad getMiUniversidad(){
        return universidad;
    }

    public Persona capturarDatosPersona(TipoPersona tipoPersona){
        Persona persona;
        String curp, nombre, direccion, fecAux;
        ModalidadClase modalidadClase;
        Date fechaNacimiento;
        int opcFechaMatricula = 0;
        System.out.println("Va a dar de alta un nuevo" +tipoPersona+": \n");
        System.out.println("Introduzca el nombre del " +tipoPersona+" \n");
        nombre = scan.nextLine();
        System.out.println("Introduzca la curp del " +tipoPersona+"\n");
        curp = scan.nextLine();
        System.out.println("Introduzca la dirección del " +tipoPersona+" \n");
        direccion =  scan.nextLine();
        do{
            System.out.println("Introduzca la fecha de nacimiento (dd/MM/yyyy) del " +tipoPersona+"\n");
            fecAux = scan.nextLine();
            fechaNacimiento = util.validarFecha(fecAux);
        }while(fechaNacimiento == null);
        persona = new Persona(curp, nombre, direccion, fechaNacimiento);

        return persona;
    }

   /* public Materia capturarDatosMateria(){
        Materia materia;
        String nombreMateria, claveGrupo,nombreDocente;
        Docente docente;
        int id;

        System.out.println("Introduzca el nombre de la nueva materia \n");
        nombreMateria = scan.nextLine();
        System.out.println("Introduzca el ID de la nueva materia\n");
        id = scan.nextInt();
        System.out.println("Introduzca la clave del grupo donde se impartira la nueva materia\n");
        claveGrupo =  scan.nextLine();
        System.out.println("Introduzca los datos del docente que impartira la nueva materia\n");
        nombreDocente =  scan.nextLine();
        

    
    materia = new Materia(id,nombreMateria,claveGrupo,docente);

    return materia;
    }*/

    public PersonalApoyo capturarDatosPersonal(TipoPersonal tipoPersonal){
        PersonalApoyo personal;
        String curp, nombre, direccion, fecAux;
        int id;
        Date fechaNacimiento;        
        System.out.println("Va a dar de alta un nuevo" +tipoPersonal+": \n");
        System.out.println("Introduzca el nombre del " +tipoPersonal+" \n");
        nombre = scan.nextLine();
        System.out.println("Introduzca la curp del " +tipoPersonal+"\n");
        curp = scan.nextLine();
        System.out.println("Introduzca la dirección del " +tipoPersonal+" \n");
        direccion =  scan.nextLine();
        System.out.println("Introduzca el Id del " +tipoPersonal+" \n");
        id =  scan.nextInt();
        do{
            System.out.println("Introduzca la fecha de nacimiento (dd/MM/yyyy) del " +tipoPersonal+"\n");
            fecAux = scan.nextLine();
            fechaNacimiento = util.validarFecha(fecAux);
        }while(fechaNacimiento == null);
        personal = new PersonalApoyo(curp, nombre, direccion, fechaNacimiento,id);

        return personal;
    }

    


    


}
