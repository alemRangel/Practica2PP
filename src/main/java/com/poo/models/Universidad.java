package com.poo.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Docente> docentes = new ArrayList<>();;
    private ArrayList<PersonalApoyo> personalApoyo =  new ArrayList<>() ;
    private ArrayList<Materia> materias = new ArrayList<>();
    private static int alumnosId = 1;
    private static int docentesId = 1;
    private static int personalApoyoId = 1;
    private static int materiasId = 1;



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
    public ArrayList<PersonalApoyo> getPersonal(){
        return personalApoyo;
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

    public int  getAlumnosId(){
        return alumnosId;
    }
    public int  getDocentesId(){
        return alumnosId;
    }
    public int  getPersonalId(){
        return alumnosId;
    }
    public int  getMateriasId(){
        return alumnosId;
    }
    public void setAlumnosId(int alumnosId){
        this.alumnosId =  alumnosId;
    }
    public void setDocentesId(int docentesId){
        this.docentesId =  docentesId;
    }
    public void setMateriasId(int materiasId){
        this.materiasId =  materiasId;
    }
    public void setPersonalApoyoId(int personalApoyoId){
        this.personalApoyoId =  personalApoyoId;
    }
}
