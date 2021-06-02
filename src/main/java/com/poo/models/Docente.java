package com.poo.models;

import java.util.Date;

enum modalidad{
    enLinea,presencial;
}

public class Docente extends Persona {
    private int id;
    private Date fechaContratacion;

    public Docente(String curp, String nombre, String direccion, Date fechaNac, int id, Date fechaContratacion){
        super(curp,nombre,direccion,fechaNac);
        this.id=id;
        this.fechaContratacion=fechaContratacion;

    }

    public int getId(){
        return id;
    }

    public Date getFechaContratacion(){
        return fechaContratacion;
    }

    
}