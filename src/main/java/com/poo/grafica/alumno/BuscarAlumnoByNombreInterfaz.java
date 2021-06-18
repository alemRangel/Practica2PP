package com.poo.grafica.alumno;

import com.poo.interfaces.InterfaceUniversidad;
import com.poo.models.Alumno;
import com.poo.models.Universidad;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BuscarAlumnoByNombreInterfaz extends JDialog implements InterfaceUniversidad {
    private Universidad miUniversidad;
    private JLabel titulo;
    private JDialog dialog;
    private JPanel controlPanel;
    private JTextField nombreTF;
    private JButton buttonBuscar;
    public  static final int WIDTH = 600;
    public static final int HEIGHT = 300;
    private BuscarHandler buscarHandler;


    public BuscarAlumnoByNombreInterfaz(Universidad universidad){
        this.miUniversidad = universidad;
        dialog = new JDialog();
        dialog.setSize(WIDTH,HEIGHT);
        dialog.setLayout(new GridLayout(4,1));
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                dialog.dispose();
            }
        });

        titulo = new JLabel("Nombre del Alumno a buscar:", SwingConstants.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        nombreTF = new JTextField(10);

        buttonBuscar = new JButton("Buscar");
        buscarHandler = new BuscarHandler(); // La clase CalculateButoonHandler implementa la interface
        buttonBuscar.addActionListener(buscarHandler);

        dialog.add(titulo);
        dialog.add(nombreTF);
        dialog.add(buttonBuscar);
        dialog.add(controlPanel);
        dialog.setVisible(true);
    }
    private void mostrarEncontrado(Alumno alumno){
        String[] columnNames = {"Curp","Nombre","Direccion","Fecha Nacimiento", "Id",
                "Fecha Matricula", "Modalidad", "Tira Materias"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable jTable = new JTable(tableModel);
        Object [] aux = {
                alumno.getCurp(),alumno.getNombre(), alumno.getDireccion()
                ,alumno.getFechaNac(), alumno.getId(), alumno.getFechaMatricula(),
                alumno.getModalidadString(), alumno.getTiraMaterias().toString()
        };
        tableModel.addRow(aux);

        JScrollPane scrollPane = new JScrollPane(jTable);
        scrollPane.setSize(600, 300);
        jTable.setFillsViewportHeight(true);
        controlPanel.add(scrollPane);
        dialog.setVisible(true);
    }

    private class BuscarHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            boolean encontrado = false;
            String nombre = nombreTF.getText();

            for(Alumno alumno: miUniversidad.getAlumnos()){
                if(nombre.equals(alumno.getNombre())){
                    JOptionPane.showMessageDialog(dialog, "Alumno Encontrado");
                    mostrarEncontrado(alumno);
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(dialog, "No se encontró su búsqueda");
                dialog.dispose();
            }

        }
    }
    @Override
    public Universidad getMiUniversidad() {
        return miUniversidad;
    }
}
