package com.poo.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Docente> docentes = new ArrayList<>();;
    private ArrayList<PersonalApoyo> personalApoyo =  new ArrayList<>() ;
    private ArrayList<Materia> materias = new ArrayList<>();

    public Universidad(){

    }
    public Universidad(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos){
        this.alumnos = alumnos;
    }
    public ArrayList<Docente> getDocentes(){
        return docentes;
    }
    public void setDocentes(ArrayList<Docente> docentes){
        this.docentes = docentes;
    }
    public ArrayList<Alumno> getPersonal(){
        return alumnos;
    }
    public void setPersonalApoyo(ArrayList<PersonalApoyo> personalApoyo){
        this.personalApoyo = personalApoyo;
    }
    public ArrayList<Materia> getMaterias(){
        return materias;
    }
    
    public void setMaterias(ArrayList<Materia> materias){
        this.materias = materias;
    }
}
