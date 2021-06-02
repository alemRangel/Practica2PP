package com.poo.controllers;

import com.poo.enums.ModalidadClase;
import com.poo.enums.TipoPersona;
import com.poo.models.*;

import java.util.Date;

public class AlumnosController  extends UniversidadController{
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
                persona.getFechaNac(), universidad.getAlumnosId(), fechaMatricula, modalidadClase, null );
        universidad.getAlumnos().add(alumnoNuevo);
        universidad.setAlumnosId(universidad.getAlumnosId()+1);
    }
    private void addMateriaToAlumno(){
        int idMateriaAux=0,idAlumnoAux=0;
        Alumno alumnoAux;
        Materia materiaAux;
        InscripcionMaterias inscripcionMateria;
        System.out.println("Ingrese el número de id de la materia que quiere añadir \n");
        idMateriaAux= scan.nextInt();
        for(Materia materia: universidad.getMaterias()){
            if(materia.getId() == idMateriaAux) {
                System.out.println("Se ha encontrado una materia con ese Id \n");
                materiaAux = materia;
                System.out.println("Ingrese el número de id del alumno al que desee" +
                        "añadir a esta materia \n");
                idAlumnoAux = scan.nextInt();
                for (Alumno alumno : universidad.getAlumnos()) {
                    if (alumno.getId() == idAlumnoAux) {
                        System.out.println("Se ha encontrado un alumno con ese id \n");
                        alumnoAux = alumno;
                        inscripcionMateria = new InscripcionMaterias(alumnoAux.getTiraMaterias().getInscripcionMaterias().size() + 1,
                                alumnoAux, materiaAux, 0);
                        universidad.getAlumnos().get(idAlumnoAux).getTiraMaterias().getInscripcionMaterias().add(inscripcionMateria);
                        return;
                    }
                    System.out.println("No se encontró el alumno buscado \n");
                    return;
                }
            }
        }
        System.out.println("No se encontró la materia buscada \n");
    }
    private void getAllAlumnos(){
        System.out.println("La lista de alumnos es la siguiente: \n");
        if(universidad.getAlumnos().size() > 0){
            for(Alumno alumno: universidad.getAlumnos()){
                imprimirAlumno(alumno);
            }
        }else{
            System.out.println("Aún no hay alumnos inscritos en la universidad \n");
        }

    }
    private void getAlumnoById(){
        int auxIdAlumno;
        System.out.println("Inserte el ID de alumno que desee buscar\n");
        auxIdAlumno = scan.nextInt();
        for(Alumno alumno: universidad.getAlumnos()){
            if(alumno.getId() == auxIdAlumno){
                imprimirAlumno(alumno);
                return;
            }
        }
        System.out.println("No se encontró ningún alumno con ese id \n");
    }
    private void getAlumnoByNombre(){
        String auxNombreAlumno;
        System.out.println("Inserte el nombre de alumno que desee buscar\n");
        scan.nextLine();
        auxNombreAlumno = scan.nextLine();
        for(Alumno alumno: universidad.getAlumnos()){
            if(alumno.getNombre().equals(auxNombreAlumno)){
                imprimirAlumno(alumno);
                return;
            }
        }
        System.out.println("No se encontró ningún alumno con ese nombre \n");
    }
    private void deleteAlumno(){
        int auxIdAlumno;
        System.out.println("Inserte el ID de alumno que desee eliminar \n");
        auxIdAlumno = scan.nextInt();
        for(Alumno alumno: universidad.getAlumnos()) {
            if (alumno.getId() == auxIdAlumno) {
                imprimirAlumno(alumno);
                System.out.println("El sistema encontró al alumno buscado y lo eliminó \n");
                universidad.getAlumnos().remove(alumno);
                return;
            }
        }
        System.out.println("No se encontró ningún alumno con ese id \n");
    }

    private void imprimirAlumno(Alumno alumno){
        System.out.println("ID:"+alumno.getId()+"\t Nombre: "+alumno.getNombre()+"\t" +
                "CURP:"+alumno.getCurp()+"\t Dirección: "+alumno.getDireccion()+"\t" +
                "Fecha de nacimiento:"+alumno.getFechaNac()+"\t Modalidad: "+alumno.getModalidadClase()+"\n");
        if(alumno.getTiraMaterias() != null) {
            System.out.println("La tira de materias de "+alumno.getNombre()+" es: \n");
            for (InscripcionMaterias inscripcionMaterias : alumno.getTiraMaterias().getInscripcionMaterias()) {
                System.out.println("Nombre de la Materia:" + inscripcionMaterias.getMateriadeTira().getNombreMateria() + " \n");
            }
        }
        else
            System.out.println("El alumno aún no tiene materias inscritas \n");
    }


}
