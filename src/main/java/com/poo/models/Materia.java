package com.poo.models;

public class Materia {
    private int id;
    private String nombreMateria;
    private String claveGrupo;
    private Docente docente;
    
    public Materia(int id, String nombreMateria, String claveGrupo, Docente docente){
        this.id=id;
        this.nombreMateria=nombreMateria;
        this.claveGrupo=claveGrupo;
        this.docente=docente;
    }

    public String getNombreMateria(){
        return nombreMateria;
    }

    public String toString(){
        return "Id: " + id + " Nombre de la materia: " + nombreMateria +
         " Clave del grupo donde se imparte la materia: "+ claveGrupo +" Docente que la imparte: " + docente;
    }

}
