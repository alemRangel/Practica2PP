package com.poo.models;

import java.util.Date;
import com.poo.enums.ModalidadClase;
/*enum modalidad{
    enLinea,presencial;
//No estuve segura de que poner así que cambialo si no te referias a ese tipo de modalidad plss
}*/
public class Alumno extends Persona {
    private int id;
    private Date fechaMatricula;
    private ModalidadClase modalidad;
    private TiraMaterias tiraMaterias;

    public Alumno(String curp, String nombre, String direccion, Date fechaNac, int id, Date fechaMatricula,
                  ModalidadClase modalidad, TiraMaterias tiraMaterias){
        super(curp,nombre,direccion,fechaNac);
        this.id=id;
        this.fechaMatricula=fechaMatricula;
        this.modalidad = modalidad;
        this.tiraMaterias = tiraMaterias;
    }

    public int getId(){
        return id;
    }

    public Date getFechaMatricula(){
        return fechaMatricula;
    }

    public ModalidadClase getModalidadClase(){return modalidad;}

    public TiraMaterias getTiraMaterias(){return tiraMaterias;}
    /*public Alumno buscarAlumnoId(int id){
        
        return Alumno;

    }*/

    /*public Alumno buscarAlumnoAnioMatricula(Date fecha){
        
        return Alumno;

    }*/
    


    
}
