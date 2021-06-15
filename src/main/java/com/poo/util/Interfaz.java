package com.poo.util;

import com.poo.controllers.AlumnosController;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import com.poo.models.Universidad;

//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;

import com.poo.Interfaces.AlumnoInterfaz;

import java.awt.*;
class gui {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Gestion Escolar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar menus = new JMenuBar();
        JMenu menu_Alumno = new JMenu("Alumnos");
        JMenu menu_Docente = new JMenu("Docente");
        JMenu menu_Materias = new JMenu("Materias");        
        JMenu menu_PApoyo = new JMenu("PApoyo");
       

        menus.add(menu_Alumno);
        menus.add(menu_Docente);
        menus.add(menu_Materias);
        menus.add(menu_PApoyo);


        JMenuItem mA1 = new JMenuItem("Añadir alumno");
        JMenuItem mA2 = new JMenuItem("Añadir alumno a materia");
        JMenuItem mA3 = new JMenuItem("Mostrar todos los alumnos");
        JMenuItem mA4 = new JMenuItem("Buscar alumno por id");
        JMenuItem mA5 = new JMenuItem("Buscar alumno por nombre");
        JMenuItem mA6 = new JMenuItem("Dar de baja alumno");
        
        menu_Alumno.add(mA1);
        mA1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AlumnoInterfaz addAlumnoI= new AlumnoInterfaz();
            }
        });
        menu_Alumno.add(mA2);
        menu_Alumno.add(mA3);
        menu_Alumno.add(mA4);
        menu_Alumno.add(mA5);
        menu_Alumno.add(mA6);

        

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

        //Adding Components to the frame.
        //frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menus);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

    protected static void addAlumno() {
    }
}