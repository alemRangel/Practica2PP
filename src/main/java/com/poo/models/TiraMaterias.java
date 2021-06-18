package com.poo.models;

import java.util.ArrayList;

public class TiraMaterias {
    private int id;
    private Alumno alumno;
    private ArrayList<InscripcionMaterias> inscripcionMaterias;

    public TiraMaterias(int id, Alumno alumno,ArrayList <InscripcionMaterias> inscMat){
        this.id=id;
        this.alumno=alumno;
        inscripcionMaterias=inscMat;
    }

    public TiraMaterias(){
        inscripcionMaterias = new ArrayList<InscripcionMaterias>();
    }


    public int getIdTiraMaterias(){
        return this.id;
    }
    public Alumno getAlumno(){
        return this.alumno;
    }
    public ArrayList<InscripcionMaterias> getInscripcionMaterias(){

        return inscripcionMaterias;
    }
}
