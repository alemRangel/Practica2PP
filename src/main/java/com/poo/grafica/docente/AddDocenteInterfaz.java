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


public class AddDocenteInterfaz extends JDialog implements InterfaceUniversidad {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	private ArrayList<Docente> docentes = new ArrayList<>();;

	private JLabel curpL, nombreL, direccionL, fechaNacL,idL,fechaConL,modalidadL,idTF;
	private JTextField curpTF, nombreTF, direccionTF, fechaNacTF,fechaConTF,modalidadTF;
	private JComboBox<String> modalidades;
	private JButton calculateB, exitB;
	private Universidad miUniversidad;
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	private JDialog dialog;
	public AddDocenteInterfaz(Universidad miUniversidad){
		this.miUniversidad = miUniversidad;
	}
	public AddDocenteInterfaz(){

	}


	
	public void showDocenteMenu(){

		curpL= new JLabel("CURP: ", SwingConstants.RIGHT);
		nombreL = new JLabel("Nombre: ", SwingConstants.RIGHT);
		direccionL = new JLabel("Direccion ", SwingConstants.RIGHT);
		fechaNacL = new JLabel("Fecha de nacimiento: ", SwingConstants.RIGHT);
        idL = new JLabel("ID: ", SwingConstants.RIGHT);
        fechaConL= new JLabel("Fecha de contratacion: ", SwingConstants.RIGHT);
        modalidadL= new JLabel("Modalidad: ", SwingConstants.RIGHT);

		curpTF = new JTextField(10);
		nombreTF = new JTextField(10);
		direccionTF = new JTextField(10);
		fechaNacTF = new JTextField(10);
        //idTF = new JTextField(10);
		idTF = new JLabel("",SwingConstants.RIGHT);
        fechaConTF = new JTextField(10);
		//JMenu menu_Modalidad = new JMenu("Modalidad");
		modalidades=new JComboBox<String>();
		modalidades.setBounds(10,10,80,20);
        add(modalidades);
		modalidades.addItem("Presencial");
		modalidades.addItem("En linea");
		modalidades.addItem("Mixto");
		//modalidades.addItemListener(this);
		//modalidades=JComboBox(new Object[]{"Presencial", "En linea", "Mixto"})
        
		
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
		dialog.add(fechaConL);  // Renglon = 6, Columna = 1
		dialog.add(fechaConTF); // Renglon = 6, Columna = 2
		dialog.add(modalidadL);
		dialog.add(modalidades);
		
		dialog.add(calculateB);
		dialog.add(exitB);				
	
		dialog.setSize(WIDTH, HEIGHT);
		dialog.setVisible(true);
		dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}


	/*private*/ class CalculateButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			SimpleDateFormat dFormatter = new SimpleDateFormat("dd-MM-yyyy");
			String curp,nombre,direccion,modalidad;//, fechaNac, fechaCon;			
			//Date fechaNac= new Date(),fechaCon=new Date();
			int id_;
			curp=curpTF.getText();
			nombre=nombreTF.getText();
			direccion=curpTF.getText();
			//Date dReportDate = dFormatter.format(myStringDate);
			Date fechaNac= null;
			try {
				fechaNac = dFormatter.parse(fechaNacTF.getText());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Date fechaCon=null;
			try {
				fechaCon = dFormatter.parse(fechaNacTF.getText());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//fechaCon="18-06-2021";
			//idTF.setText(docentes.size()+1);
			idTF.setText(String.valueOf(docentes.size()+1));
			id_=Integer.parseInt(idTF.getText());
			modalidad=(String)modalidades.getSelectedItem();
			
			Docente d= new Docente(curp,nombre,direccion,fechaNac,id_,fechaCon,modalidad);
			docentes.add(d);
			
			//AddDocenteInterfaz controlDocentes = new AddDocenteInterfaz(miUniversidad);
			System.out.println(docentes);
			
			
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
		}
	}
	
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){

			//System.exit(0);
		 dialog.dispose();

		}
	}
	public Universidad getMiUniversidad(){
		return miUniversidad;
	}
	
}