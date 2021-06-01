package com.poo.models;

import java.util.Date;

enum tipoPersonal{
    contador,secretario,coordinador//etc.

}

public class PersonalApoyo extends Persona {
    private int id;

    public PersonalApoyo(String curp, String nombre, String direccion, Date fechaNac, int id){
        super(curp,nombre,direccion,fechaNac);
        this.id=id;

    }
    public int getId(){
        return id;
    }

    
    
    
}
