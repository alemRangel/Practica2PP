package com.poo.models;

import java.util.ArrayList;
import java.util.Date;

enum modalidad{
    enLinea,presencial;
}

public class Docente extends Persona {
    private int id;
    private Date fechaContratacion;
    private String modalidadContrato;
    public Docente(String curp, String nombre, String direccion, Date fechaNac, int id, Date fechaContratacion,
                   String modalidadContrato){
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

    //public ModalidadContrato getModalidadContrato(){return modalidadContrato;}

    public Docente buscarDocentePorNombre(ArrayList<Docente> docentes,String nombre){
        for(Docente docente : docentes){
            if(docente.getNombre()==nombre) return docente;
        }
        return null;

    }
    public String toString(){
        return "Nombre:"+nombre+"Curp: "+curp+" Direccion: "+direccion+" Fecha de nacimietno: "+
        fechaNac+" iD: "+id+" Fecha contratacion: "+fechaContratacion;
    }

    
}
