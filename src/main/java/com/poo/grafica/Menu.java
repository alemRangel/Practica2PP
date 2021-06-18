package com.poo.grafica;

import com.poo.grafica.alumno.*;
import com.poo.grafica.docente.AddDocenteInterfaz;
import com.poo.grafica.docente.getDocenteId;
import com.poo.grafica.docente.getDocentes;
import com.poo.models.Universidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Menu{
    protected Universidad miUniversidad = new Universidad();

    public Menu(){
        //Creating the Frame
        final JFrame frame = new JFrame("Gestion Escolar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);

        //Creating the MenuBar and adding components
        JMenuBar menus = new JMenuBar();
        JMenu menu_Alumno = new JMenu("Alumnos");
        JMenu menu_Docente = new JMenu("Docente");
        JMenu menu_Materias = new JMenu("Materias");


        menus.add(menu_Alumno);
        menus.add(menu_Docente);
        menus.add(menu_Materias);


        JMenuItem mA1 = new JMenuItem("Añadir alumno");
        JMenuItem mA2 = new JMenuItem("Añadir alumno a materia");
        JMenuItem mA3 = new JMenuItem("Mostrar todos los alumnos");
        JMenuItem mA4 = new JMenuItem("Buscar alumno por id");
        JMenuItem mA5 = new JMenuItem("Buscar alumno por nombre");
        JMenuItem mA6 = new JMenuItem("Dar de baja alumno");


        menu_Alumno.add(mA1);
        mA1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Entrando a Añadir Alumno");
                AddAlumnoInterfaz addAlumnoInterfaz = new AddAlumnoInterfaz(miUniversidad);
                addAlumnoInterfaz.showAlumnoMenu();
                miUniversidad = addAlumnoInterfaz.getMiUniversidad();
            }
        });

        menu_Alumno.add(mA2);
        mA2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        menu_Alumno.add(mA3);
        mA3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame, "Entrando a Mostrar todos los Alumnos");
                ShowAllAlumnosInterfaz showAllAlumnosInterfaz = new ShowAllAlumnosInterfaz(miUniversidad);
                showAllAlumnosInterfaz.showAllAlumnos();
                miUniversidad = showAllAlumnosInterfaz.getMiUniversidad();
            }
        });

        menu_Alumno.add(mA4);
        mA4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame, "Entrando a Mostrar Alumno por ID");
                BuscarAlumnoByIdInterfaz buscarAlumnoByIdInterfaz = new BuscarAlumnoByIdInterfaz(miUniversidad);
                miUniversidad = buscarAlumnoByIdInterfaz.getMiUniversidad();
            }
        });


        menu_Alumno.add(mA5);
        mA5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame, "Entrando a Mostrar Alumno por Nombre");
                BuscarAlumnoByNombreInterfaz buscarAlumnoByNombreInterfaz = new BuscarAlumnoByNombreInterfaz(miUniversidad);
                miUniversidad = buscarAlumnoByNombreInterfaz.getMiUniversidad();
            }
        });

        menu_Alumno.add(mA6);
        mA6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame, "Entrando a Mostrar Dar de Baja Alumno");
                EliminarAlumnoInterfaz eliminarAlumnoInterfaz = new EliminarAlumnoInterfaz(miUniversidad);
                miUniversidad = eliminarAlumnoInterfaz.getMiUniversidad();
            }
        });

        JMenuItem mD1 = new JMenuItem("Contratar docente");
        JMenuItem mD2 = new JMenuItem("Asignar docente a una materia");
        JMenuItem mD3 = new JMenuItem("Ver todos los profesores");
        JMenuItem mD4 = new JMenuItem("Buscar profesor por Id");
        JMenuItem mD5 = new JMenuItem("Buscar profesor por Nombre");
        JMenuItem mD6 = new JMenuItem("Despedir Profesor");

        menu_Docente.add(mD1);
        menu_Docente.add(mD2);
        menu_Docente.add(mD3);
        menu_Docente.add(mD4);
        menu_Docente.add(mD5);
        menu_Docente.add(mD6);

        mD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Entrando a Añadir Docente");
                AddDocenteInterfaz addDocenteInterfaz = new AddDocenteInterfaz(miUniversidad);
                addDocenteInterfaz.showDocenteMenu();
                miUniversidad = addDocenteInterfaz.getMiUniversidad();
            }
        });

<<<<<<< HEAD
=======
        mD3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Entrando a Mostrar Docentes");
                getDocentes GetDocentes = new getDocentes(miUniversidad);
                GetDocentes.showDocentes();
            }

        });
        mD4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Mostrar Docente por Id");
                getDocenteId GetDocentesId = new getDocenteId(miUniversidad);
                //GetDocentesId.showDocenteId();
            }

        });

        JMenuItem mPA1 = new JMenuItem("Contratar personal de apoyo");
        JMenuItem mPA2 = new JMenuItem("Asignar Personal de apoyo a materia");
        JMenuItem mPA3 = new JMenuItem("Ver todo el personal de Apoyo");
        JMenuItem mPA4 = new JMenuItem("Buscar personal de apoyo por ID");
        JMenuItem mPA5 = new JMenuItem("Buscar personal de apoyo por Nombre");
        JMenuItem mPA6 = new JMenuItem("Despedir personal de apoyo");


        menu_PApoyo.add(mPA1);
        menu_PApoyo.add(mPA2);
        menu_PApoyo.add(mPA3);
        menu_PApoyo.add(mPA4);
        menu_PApoyo.add(mPA5);
        menu_PApoyo.add(mPA6);
>>>>>>> 57e823cd361a391abac6859707f90b381ffd69d9

        JMenuItem mM1 = new JMenuItem("Alta de materia");
        JMenuItem mM2 = new JMenuItem("Mostrar Alumnos de una materia");
        JMenuItem mM3 = new JMenuItem("Profesor de una materia");
        JMenuItem mM4 = new JMenuItem("Dar de baja una materia");
        JMenuItem mM5 = new JMenuItem("Mostrar todas las materias");

        menu_Materias.add(mM1);
        menu_Materias.add(mM2);
        menu_Materias.add(mM3);
        menu_Materias.add(mM4);
        menu_Materias.add(mM5);


        //Creating the panel at bottom and adding components
        /*JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);*/

        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.setText("Utilice el menú para navegar en el programa");

        frame.add(ta);
        //Adding Components to the frame.
        //frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menus);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

}
