package com.poo.controllers;

import com.poo.enums.ModalidadClase;
import com.poo.enums.TipoPersona;
import com.poo.interfaces.CrudMethods;
import com.poo.models.*;

import java.util.Date;

public class AlumnosController  extends UniversidadController implements CrudMethods {
    public AlumnosController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void alumnos(){
        int opc;
        do{
            System.out.println("Seleccione la opción que desee ejecutar:\n" +
                    "1- Añadir Alumno \n" +
                    "2- Añadir Alumno a materia \n" +
                    "3- Mostrar Todos los alumnos \n" +
                    "4- Buscar alumno por id \n" +
                    "5- Buscar alumno por Nombre \n" +
                    "6- Dar de baja alumno \n" +
                    "7- Regresar \n " );
            opc = scan.nextInt();
            switch(opc) {
                case 1:
                    addAlumno();
                    break;
                case 2:
                    addMateriaToAlumno();
                    break;
                case 3:
                    getAllAlumnos();
                    break;
                case 4:
                    getAlumnoById();
                    break;
                case 5:
                    getAlumnoByNombre();
                    break;
                case 6:
                    deleteAlumno();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Inserte una opción válida \n");
            }
        }while(true);


    }
    private void addAlumno(){
        Alumno alumno;
        Persona persona;
        ModalidadClase modalidadClase = null;
        Date  fechaMatricula = new Date();
        int opcModalidadValida = 0;
        persona = capturarDatosPersona(TipoPersona.Alumno);
        do{
            System.out.println("Seleccione la modalidad en la que desea estudiar:\n" +
                    "1-Presencial \n" +
                    "2-Distancia \n" +
                    "3-Mixta\n");
            opcModalidadValida = scan.nextInt();
            switch(opcModalidadValida){
                case 1:
                    modalidadClase = ModalidadClase.Presencial;
                    break;
                case 2:
                    modalidadClase = ModalidadClase.Distancia;
                    break;
                case 3:
                    modalidadClase = ModalidadClase.Mixta;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    opcModalidadValida = 0;
            }
        }while(opcModalidadValida == 0);
        Alumno alumnoNuevo = new Alumno(persona.getCurp(), persona.getNombre(), persona.getDireccion(),
                persona.getFechaNac(), universidad.getAlumnos().size()+1, fechaMatricula, modalidadClase, null );
        universidad.getAlumnos().add(alumnoNuevo);
    }
    private void addMateriaToAlumno(){

    }
    private void getAllAlumnos(){
        System.out.println("La lista de alumnos es la siguiente: \n");
        for(Alumno alumno: universidad.getAlumnos()){
            System.out.println("ID:"+alumno.getId()+"\t Nombre: "+alumno.getNombre()+"\t" +
                    "CURP:"+alumno.getCurp()+"\t Dirección: "+alumno.getDireccion()+"\t" +
                    "Fecha de nacimiento:"+alumno.getFechaNac()+"\t Modalidad: "+alumno.getModalidadClase()+"\n");
            System.out.println("La tira de materias de "+alumno.getNombre()+" es: \n");
            for(InscripcionMaterias inscripcionMaterias: alumno.getTiraMaterias().getInscripcionMaterias()){
                System.out.println("Nombre de la Materia:"+inscripcionMaterias.getMateriadeTira().getNombreMateria()+" \n");
            }
        }
    }
    private void getAlumnoById(){

    }
    private void getAlumnoByNombre(){

    }
    private void deleteAlumno(){}

    private void crearTiraMaterias(){

    }


    @Override
    public void createElement() {

    }

    @Override
    public void deleteElement() {

    }

    @Override
    public void updateElement() {

    }

    @Override
    public void getAllElements() {

    }

    @Override
    public void getElementById() {

    }

    @Override
    public Universidad getUniversidad() {
        return null;
    }


}
