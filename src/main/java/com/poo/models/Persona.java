package com.poo.models;

import java.util.Date;

public class Persona{
    protected String curp;
    protected String nombre;
    protected String direccion;
    protected Date fechaNac; //No estoy seguura si así se declara el tipo date


    public Persona(String curp, String nombre, String direccion, Date fechaNac){
        this.curp=curp;
        this.nombre=nombre;
        this.direccion=direccion;
        this.fechaNac=fechaNac;
    }

    public String getCurp(){
        return curp;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public Date getFechaNac(){
        return fechaNac;
    }

    /*public Persona buscarPersonaCurp(String curp){

        if (curp.equals(user.getCurp()) {
        return user;
    }

        return Persona;
    }

    public Persona buscarPersonaNombre(String nombre){

        return Persona;
    }

    public Persona buscarPersonaEdad(int edad){

        return Persona;
    }*/

    public String toString(){
        return "Nombre:"+nombre+"Curp: "+curp+" Direccion: "+direccion+" Fecha de nacimietno: "+
        fechaNac;
    }




}
