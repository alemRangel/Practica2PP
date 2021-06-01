package com.poo.models;

public class InscripcionMaterias {

    private int id;
    private Alumno alumno;
    private Materia materia;
    private float calificacion;
    
    public InscripcionMaterias(int id, Alumno alumno, Materia materia, float calificacion){
        this.id=id;
        this.alumno=alumno;
        this.materia=materia;
        this.calificacion=calificacion;
    }

}
