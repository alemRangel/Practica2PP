package com.poo.models;

public class Materia {
    private int id;
    private String nombreMateria;
    private String claveGrupo;
    private Docente docente;
    private PersonalApoyo personalApoyo;
    
    public Materia(int id, String nombreMateria, String claveGrupo, Docente docente){
        this.id=id;
        this.nombreMateria=nombreMateria;
        this.claveGrupo=claveGrupo;
        this.docente=docente;
    }

    public int getId(){
        return id;
    }
    public String getNombreMateria(){
        return nombreMateria;
    }
    public String getClaveGrupo(){
        return claveGrupo;
    }
    public Docente getDocente(){
        return docente;
    }
    public void setDocente(Docente docente){this.docente = docente;}
    public void setPersonalApoyo(PersonalApoyo personaApoyo){
        this.personalApoyo = personaApoyo;
    }

    public String toString(){
        return "Id: " + id + " Nombre de la materia: " + nombreMateria +
         " Clave del grupo donde se imparte la materia: "+ claveGrupo +" Docente que la imparte: " + docente;
    }

}
