package com.poo.models;

import java.util.Date;

import com.poo.enums.TipoPersonal;


public class PersonalApoyo extends Persona {
    private int id;
    TipoPersonal tipoPersonal;

    public PersonalApoyo(String curp, String nombre, String direccion, Date fechaNac, int id, TipoPersonal tipo ){
        super(curp,nombre,direccion,fechaNac);
        this.id=id;
        tipoPersonal=tipo;

    }
    public int getId(){
        return id;
    }


    public String toString(){

        return "Id: "+id+super.toString()+"\tTipo de personal de apoyo: "+tipoPersonal;

    }

    
    
    
}
