package com.poo.controllers;

import com.poo.enums.ModalidadClase;
import com.poo.enums.TipoPersona;
import com.poo.models.Persona;
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
}
