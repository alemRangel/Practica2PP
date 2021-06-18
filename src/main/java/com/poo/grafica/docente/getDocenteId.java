package com.poo.grafica.docente;
import com.poo.interfaces.InterfaceUniversidad;
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

public class getDocenteId extends JDialog implements InterfaceUniversidad {
    private JPanel controlPanel;
    private Universidad miUniversidad;
    private JLabel IdL;
    private JTextField IdTF;
    
    private JButton getDocenteButton, exitB;
    private getDocenteIdButtonHandler gbHandlerd;
	//private ExitButtonHandler_ ebHandlerd;

    
    private JDialog dialog;

    public getDocenteId(Universidad universidad){
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
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        IdL = new JLabel("ID del Docente a buscar: ", SwingConstants.RIGHT);
        IdTF = new JTextField(10);

        getDocenteButton = new JButton("Buscar");
        gbHandlerd = new getDocenteIdButtonHandler();
        getDocenteButton.addActionListener(gbHandlerd);
        dialog.add(IdL);
        dialog.add(IdTF);
        dialog.add(getDocenteButton);
        dialog.add(controlPanel);
        dialog.setVisible(true);

    }

    private void showDocenteId(){     
         
       
        String[] columnNames = { "Id", "Nombre", "CURP","Fecha de Nacimiento","Direccion","Modalidad","Fecha de Matricula" };
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        
        JTable table = new JTable(tableModel);
        
            int id=Integer.parseInt(IdTF.getText());
            Docente d= new Docente();
            d=miUniversidad.buscarDocentePorId((miUniversidad.getDocentes()),id);
            int id_ = d.getId();
            String nombre = d.getNombre();
            String curp = d.getCurp();
            Date fechaNac = d.getFechaNac();
            String direccion = d.getDireccion();
            String modalidad = d.getModalidad();
            Date fechaMod = d.getFechaContratacion();
            
         
            Object[] data = {id_, nombre, curp, fechaNac, direccion, modalidad,fechaMod};
         
            tableModel.addRow(data);

            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setSize(600, 300);
            table.setFillsViewportHeight(true);
            controlPanel.add(scrollPane);
            dialog.setVisible(true);
    }

        /*private void mostrarDocente(){  
       
        String[] columnNames = { "Id", "Nombre", "CURP","Fecha de Nacimiento","Direccion","Modalidad","Fecha de Matricula" };
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        
        JTable table = new JTable(tableModel);
            int id=Integer.parseInt(IdTF.getText());
            Docente d= new Docente();
            d=miUniversidad.buscarDocentePorId((miUniversidad.getDocentes()),id);
            int id_ = d.getId();
            String nombre = d.getNombre();
            String curp = d.getCurp();
            Date fechaNac = d.getFechaNac();
            String direccion = d.getDireccion();
            String modalidad = d.getModalidad();
            Date fechaMod = d.getFechaContratacion();
            
         
            Object[] data = {id_, nombre, curp, fechaNac, direccion, modalidad,fechaMod};
         
            tableModel.addRow(data);
            System.out.println(d);
            }*/

        

        private class getDocenteIdButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e){

                showDocenteId();
            }
        }


        
    

        public Universidad getMiUniversidad() {
            return miUniversidad;
        }
    
    
}

    

