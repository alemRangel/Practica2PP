package com.poo.grafica;

import com.poo.grafica.alumno.AddAlumnoInterfaz;
import com.poo.models.Universidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Menu extends JFrame implements WindowListener, ActionListener {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;
    private JLabel labelTitulo;
    private JButton buttonAlumno, buttonDocente, buttonMateria, buttonPersonalAuxiliar, buttonSalir;
    private Universidad universidad;
    private Container pane;
    public Menu(Universidad universidad){
        this.universidad = universidad;
        pane = getContentPane();
        showMenu();
    }
    public Menu(){

    }

    public void clearFrame(){
        pane.removeAll();
        repaint();
    }

    public void  showMenu(){
        pane.setLayout(new GridLayout(  6, 1));
        labelTitulo = new JLabel("Menú del sistema gestor de universidades, seleccione la opción que " +
                "desea consultar", SwingConstants.RIGHT);

        buttonAlumno = new JButton("Alumnos");
        buttonAlumno.addActionListener(this);

        buttonDocente = new JButton("Docentes");
        buttonDocente.addActionListener(this);

        buttonMateria = new JButton("Materias");
        buttonMateria.addActionListener(this);

        buttonPersonalAuxiliar = new JButton("Personal Auxiliar");
        buttonPersonalAuxiliar.addActionListener(this);

        buttonSalir = new JButton("Salir");
        buttonSalir.addActionListener(this);

        pane.add(labelTitulo);
        pane.add(buttonAlumno);
        pane.add(buttonDocente);
        pane.add(buttonMateria);
        pane.add(buttonPersonalAuxiliar);
        pane.add(buttonSalir);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showMenuAlumnos(){

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String opc = actionEvent.getActionCommand().toString();
        switch(opc){
            case "Alumnos":
                JOptionPane.showMessageDialog(this, opc);
                AddAlumnoInterfaz addAlumnoInterfaz = new AddAlumnoInterfaz();
                break;
            case "Docentes":
                JOptionPane.showMessageDialog(this, opc);
                break;
            case "Materias":
                JOptionPane.showMessageDialog(this, opc);
                break;
            case "Personal Auxiliar":
                JOptionPane.showMessageDialog(this, opc);
                break;
            case "Salir":
                JOptionPane.showMessageDialog(this, opc);
                clearFrame();
                break;
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
