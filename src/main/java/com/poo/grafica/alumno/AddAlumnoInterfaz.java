package com.poo.grafica.alumno;

import com.poo.models.Universidad;

import javax.swing.*;
import java.awt.*; // Class Container
import java.awt.event.*;

public class AddAlumnoInterfaz extends JDialog{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;

	private JLabel curpL, nombreL, direccionL, fechaNacL,idL,fechaMatL,modalidadL;
	private JTextField curpTF, nombreTF, direccionTF, fechaNacTF,idTF,fechaMatTF,modalidadTF;
	private JButton calculateB, exitB;
	private Universidad miUniversidad;
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	public AddAlumnoInterfaz(Universidad miUniversidad){
		this.miUniversidad = miUniversidad;
	}
	public AddAlumnoInterfaz(){

	}


	
	public void showAlumnoMenu(){

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
		
		
		
		


		JDialog dialog = new JDialog();
		dialog.setLayout(new GridLayout(8, 2));
		dialog.add(curpL);     // Renglon = 1, Columna = 1
		dialog.add(curpTF);    // Renglon = 1, Columna = 2
		dialog.add(nombreL);      // Renglon = 2, Columna = 1
		dialog.add(nombreTF);	   // Renglon = 2, Columna = 2
		dialog.add(direccionL);       // Renglon = 3, Columna = 1
		dialog.add(direccionTF);      // Renglon = 3, Columna = 2
		dialog.add(fechaNacL);  // Renglon = 4, Columna = 1
		dialog.add(fechaNacTF); // Renglon = 4, Columna = 2
		dialog.add(idL);  // Renglon = 5, Columna = 1
		dialog.add(idTF); // Renglon = 5, Columna = 2
		dialog.add(fechaMatL);  // Renglon = 6, Columna = 1
		dialog.add(fechaMatTF); // Renglon = 6, Columna = 2
		dialog.add(modalidadL);  // Renglon = 7, Columna = 1
		dialog.add(modalidadTF); // Renglon = 7, Columna = 2

		dialog.add(calculateB);
		dialog.add(exitB);
				
	
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
		dialog.setSize(WIDTH, HEIGHT);
		dialog.setVisible(true);
		dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}


	/*private*/ class CalculateButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){

            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
		}
	}
	
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
		
	
}