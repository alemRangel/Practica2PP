package com.poo.grafica.alumno;

import com.poo.enums.ModalidadClase;
import com.poo.interfaces.InterfaceUniversidad;
import com.poo.models.Alumno;
import com.poo.models.TiraMaterias;
import com.poo.models.Universidad;
import com.sun.deploy.panel.ControlPanel;
import jdk.nashorn.internal.scripts.JD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class ShowAllAlumnosInterfaz extends JDialog implements InterfaceUniversidad {
    private Universidad miUniversidad;
    private JLabel titulo;
    private JDialog dialog;
    private JPanel controlPanel;
    public  static final int WIDTH = 600;
    public static final int HEIGHT = 300;

    public ShowAllAlumnosInterfaz(Universidad miUniversidad){
        this.miUniversidad = miUniversidad;
        dialog = new JDialog();
        dialog.setSize(WIDTH,HEIGHT);
        dialog.setLayout(new GridLayout(2,1));
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                dialog.dispose();
            }
        });

        titulo = new JLabel("Todos los alumnos:", SwingConstants.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        dialog.add(titulo);
        dialog.add(controlPanel);
        dialog.setVisible(true);
    }

    public void showAllAlumnos(){
      String[] columnNames = {"Curp","Nombre","Direccion","Fecha Nacimiento", "Id",
      "Fecha Matricula", "Modalidad", "Tira Materias"};
      DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
      JTable jTable = new JTable(tableModel);
      for(Alumno alumno : miUniversidad.getAlumnos()){
          Object [] aux = {
                  alumno.getCurp(),alumno.getNombre(), alumno.getDireccion()
                  ,alumno.getFechaNac(), alumno.getId(), alumno.getFechaMatricula(),
                  alumno.getModalidadString(), alumno.getTiraMaterias().toString()
          };
          tableModel.addRow(aux);
      }
        JScrollPane scrollPane = new JScrollPane(jTable);
        scrollPane.setSize(600, 300);
        jTable.setFillsViewportHeight(true);
        controlPanel.add(scrollPane);
        dialog.setVisible(true);
    }
    @Override
    public Universidad getMiUniversidad() {
        return miUniversidad;
    }
}
