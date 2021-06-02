package com.poo.models;

public class TiraMaterias {
    private int id;
    private Alumno alumno;
    private InscripcionMaterias inscripcionMaterias;
    
    public TiraMaterias(int id, Alumno alumno, InscripcionMaterias inscMat){
        this.id=id;
        this.alumno=alumno;
        inscripcionMaterias=inscMat;
    }

    public InscripcionMaterias getInscripcionMaterias(){
        return inscripcionMaterias;
    }
}
