
package com.poo.grafica.docente;

import com.poo.models.Docente;
import com.poo.models.Universidad;

import javax.swing.*;
import java.awt.*; // Class Container
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class getDocentes {
    private Universidad miUniversidad;

    public getDocentes(Universidad miUniversidad)
    {
        this.miUniversidad = miUniversidad;
    }
    public void showDocentes(){
    // frame
    JFrame f;
    // Table
    JTable j;
  
    // Constructor
    
        // Frame initiallization
        f = new JFrame();
  
        // Frame Title
        f.setTitle("Docentes");
  
       
        String[] columnNames = { "Id", "Nombre", "CURP","Fecha de Nacimiento","Direccion","Modalidad","Fecha de Matricula" };
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        
        JTable table = new JTable(tableModel);

        for (int i = 0; i < miUniversidad.getDocentes().size(); i++){
            int id = miUniversidad.getDocentes().get(i).getId();
            String nombre = miUniversidad.getDocentes().get(i).getNombre();
            String curp = miUniversidad.getDocentes().get(i).getCurp();
            Date fechaNac = miUniversidad.getDocentes().get(i).getFechaNac();
            String direccion = miUniversidad.getDocentes().get(i).getDireccion();
            String modalidad = miUniversidad.getDocentes().get(i).getModalidad();
            Date fechaMod = miUniversidad.getDocentes().get(i).getFechaContratacion();
            
         
            Object[] data = {id, nombre, curp, fechaNac, direccion, modalidad,fechaMod};
         
            tableModel.addRow(data);
         
         }
       
  
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        // Frame Size
        f.setSize(700, 300);
        // Frame Visible = true
        f.setVisible(true);
        
    
}

   
}
