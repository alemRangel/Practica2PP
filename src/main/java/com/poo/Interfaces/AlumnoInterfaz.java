package com.poo.Interfaces;

import javax.swing.*;
import java.awt.*; // Class Container
import java.awt.event.*;

public class AlumnoInterfaz extends JFrame {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel curpL, nombreL, direccionL, fechaNacL,idL,fechaMatL,modalidadL;
	private JTextField curpTF, nombreTF, direccionTF, fechaNacTF,idTF,fechaMatTF,modalidadTF;
	private JButton calculateB, exitB;
	
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	
	
	
	public AlumnoInterfaz(){
		setTitle("Ingresa los datos del Alumno");
		
		curpL= new JLabel("CURP: ", SwingConstants.RIGHT);
		nombreL = new JLabel("Nombre: ", SwingConstants.RIGHT);
		direccionL = new JLabel("Direccion ", SwingConstants.RIGHT);
		fechaNacL = new JLabel("Fecha de nacimiento: ", SwingConstants.RIGHT);
        idL = new JLabel("ID: ", SwingConstants.RIGHT);
        fechaMatL = new JLabel("Fecha de matricula: ", SwingConstants.RIGHT);
        modalidadL = new JLabel("Modalidad: ", SwingConstants.RIGHT);
		
		curpTF = new JTextField(10);
		nombreTF = new JTextField(10);
		direccionTF = new JTextField(10);
		fechaNacTF = new JTextField(10);
        idTF = new JTextField(10);
        fechaMatTF = new JTextField(10);
        modalidadTF = new JTextField(10);
		
		// Boton para calculos
		calculateB = new JButton("Dar de alta");
		cbHandler = new CalculateButtonHandler(); // La clase CalculateButoonHandler implementa la interface
		calculateB.addActionListener(cbHandler);  
		
		// Boton para salir
		exitB = new JButton("Regresar");
		ebHandler = new ExitButtonHandler(); // La clase ExitButoonHandler implementa la interface
		exitB.addActionListener(ebHandler);
		
		
		
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(8, 2)); // 8 renglones y dos columnas
	
		pane.add(curpL);     // Renglon = 1, Columna = 1
		pane.add(curpTF);    // Renglon = 1, Columna = 2
		pane.add(nombreL);      // Renglon = 2, Columna = 1
		pane.add(nombreTF);	   // Renglon = 2, Columna = 2	
		pane.add(direccionL);       // Renglon = 3, Columna = 1
		pane.add(direccionTF);      // Renglon = 3, Columna = 2
		pane.add(fechaNacL);  // Renglon = 4, Columna = 1
		pane.add(fechaNacTF); // Renglon = 4, Columna = 2
        pane.add(idL);  // Renglon = 5, Columna = 1
		pane.add(idTF); // Renglon = 5, Columna = 2
        pane.add(fechaMatL);  // Renglon = 6, Columna = 1
		pane.add(fechaMatTF); // Renglon = 6, Columna = 2
        pane.add(modalidadL);  // Renglon = 7, Columna = 1
		pane.add(modalidadTF); // Renglon = 7, Columna = 2

		pane.add(calculateB);
		pane.add(exitB);
				
	
		/* Otro orden
		pane.add(lengthL);
		pane.add(widthL);
		pane.add(areaL);
		pane.add(perimeterL);
		pane.add(lengthTF);
		pane.add(widthTF);
		pane.add(areaTF);
		pane.add(perimeterTF);
		*/
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*private*/ class CalculateButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			/*double width, length, area, perimeter;
			
			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			area = length * width;
			perimeter = 2 * (length + width);
			
			areaTF.setText("" + area);
			perimeterTF.setText("" + perimeter);*/
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
		}
	}
	
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
		
	
	public static void main(String []args ){
		AlumnoInterfaz rectProg = new AlumnoInterfaz();
	}
}