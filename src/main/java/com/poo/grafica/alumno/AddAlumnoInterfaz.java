package com.poo.grafica.alumno;

import com.poo.enums.ModalidadClase;
import com.poo.models.Alumno;
import com.poo.models.TiraMaterias;
import com.poo.models.Universidad;
import com.poo.util.Util;

import javax.swing.*;
import java.awt.*; // Class Container
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AddAlumnoInterfaz extends JDialog{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;

	private JLabel curpL, nombreL, direccionL, fechaNacL,idL,fechaMatL,modalidadL;
	private JTextField curpTF, nombreTF, direccionTF, fechaNacTF,idTF,fechaMatTF,modalidadTF;
	private JButton darAlta, exitB;
	private Universidad miUniversidad;
	private DarAltaHanlder darAltaHandler;
	private ExitButtonHandler ebHandler;
	private JDialog dialog;
	private Util util;

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
        modalidadL = new JLabel("Modalidad: ", SwingConstants.RIGHT);
		
		curpTF = new JTextField(10);
		nombreTF = new JTextField(10);
		direccionTF = new JTextField(10);
		fechaNacTF = new JTextField(10);
        modalidadTF = new JTextField(10);
		
		// Boton para calculos
		darAlta = new JButton("Dar de alta");
		darAltaHandler = new DarAltaHanlder(); // La clase CalculateButoonHandler implementa la interface
		darAlta.addActionListener(darAltaHandler);
		
		// Boton para salir
		exitB = new JButton("Regresar");
		ebHandler = new ExitButtonHandler(); // La clase ExitButoonHandler implementa la interface
		exitB.addActionListener(ebHandler);
		
		
		
		


		dialog = new JDialog();
		dialog.setLayout(new GridLayout(6, 2));
		dialog.add(curpL);     // Renglon = 1, Columna = 1
		dialog.add(curpTF);    // Renglon = 1, Columna = 2
		dialog.add(nombreL);      // Renglon = 2, Columna = 1
		dialog.add(nombreTF);	   // Renglon = 2, Columna = 2
		dialog.add(direccionL);       // Renglon = 3, Columna = 1
		dialog.add(direccionTF);      // Renglon = 3, Columna = 2
		dialog.add(fechaNacL);  // Renglon = 4, Columna = 1
		dialog.add(fechaNacTF); // Renglon = 4, Columna = 2
		dialog.add(modalidadL);  // Renglon = 7, Columna = 1
		dialog.add(modalidadTF); // Renglon = 7, Columna = 2

		dialog.add(darAlta);
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


	/*private*/ class DarAltaHanlder implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String nombre = nombreTF.getText();
			String curp = curpTF.getText();
			String fechaNacimiento = fechaNacTF.getText();
			String direccion = direccionTF.getText();
			String modalidadClase = modalidadTF.getText();
			Date fechaMatricula = new Date();
			Date fechaNacimientoDate = null;
			ModalidadClase modalidadClaseEnum = null;
			int opcEnum;
			try{
				fechaNacimientoDate = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
			}catch(Exception exception){
				JOptionPane.showMessageDialog(dialog, "No se insertó la fecha apropiadamente(dd/MM/yyyy)," +
						" intente de nuevo");
				dialog.dispose();
			}
			try {
				opcEnum = Integer.parseInt(modalidadClase);
			}catch(Exception exception){
				System.out.println(exception);
				JOptionPane.showMessageDialog(dialog, "Inserte un entero en el campo modalidad");
				dialog.dispose();
			}
			switch(Integer.parseInt(modalidadClase)) {
				case 1:
					modalidadClaseEnum = ModalidadClase.Presencial;
					break;
				case 2:
					modalidadClaseEnum = ModalidadClase.Distancia;
					break;
				case 3:
					modalidadClaseEnum = ModalidadClase.Mixta;
					break;
				default:
					System.out.println("Introduzca una opción válida");
					JOptionPane.showMessageDialog(dialog, "No se insertó la modalidad correctamente (1,2,3)");
					dialog.dispose();
			}
			try{
				Alumno alumnoNuevo = new Alumno(curp, nombre, direccion,
						fechaNacimientoDate, miUniversidad.getAlumnosId(), fechaMatricula, modalidadClaseEnum,
						new TiraMaterias() );
				miUniversidad.getAlumnos().add(alumnoNuevo);
				miUniversidad.setAlumnosId(miUniversidad.getAlumnosId()+1);
			}
			catch(Exception exception){
				JOptionPane.showMessageDialog(dialog,"Inserta todos los campos apropiadamente");
				dialog.dispose();
			}
            JOptionPane.showMessageDialog(dialog, "Operación realizada correctamente");
			dialog.dispose();
		}
	}
	
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			dialog.dispose();
		}
	}
	public Universidad getMiUniversidad(){
		return miUniversidad;
	}


}