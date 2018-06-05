package unidad1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Examen extends JFrame implements ActionListener

{
	private JLabel mensaje1;
	private JLabel mensaje2;
	private JLabel mensaje3;
	private JLabel mensaje4;
	private JLabel labelText;
	private JLabel mensaje5;
	private JTextField ft1;
	private JTextField ft2;
	private JTextField ft3;
	private JButton boton;
	
	
	public Examen()
	{
		super("Índice de Masa Corporal");
		setLayout( null);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon ico=new ImageIcon("descarga.jpg");
		
		mensaje1=new JLabel("Ingresar Datos:");
		mensaje1.setBounds(20, 10, 100, 60);
		add(mensaje1);
		
		mensaje2=new JLabel("Nombre:");
		add(mensaje2);
		mensaje2.setBounds(20, 40, 100, 60);
		ft1=new JTextField(20);
		add(ft1);
		ft1.setBounds(90, 60, 100, 20);
		
		mensaje3=new JLabel("Peso:");
		add(mensaje3);
		mensaje3.setBounds(20, 80, 100, 60);
		ft2=new JTextField(20);
		add(ft2);
		ft2.setBounds(90, 100, 100, 20);
		
		mensaje4=new JLabel("Estatura:");
		add(mensaje4);
		mensaje4.setBounds(20, 120, 100, 60);
		ft3=new JTextField(20);
		add(ft3);
		ft3.setBounds(90, 140, 100, 20);
		
		boton=new JButton("Aceptar");
		boton.addActionListener(this);
		add(boton);
		boton.setBounds(200, 350, 100, 30);
		
		mensaje5=new JLabel("");
		add(mensaje5);
		mensaje5.setBounds(200, 200, 150, 150);
		
		setVisible(true);
	}


	public static void main(String[] args) 
	{
		
		Examen ventana=new Examen();


	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==boton)
		{
			double peso=Double.parseDouble(ft2.getText());
			double esta=Double.parseDouble(ft3.getText());
			 double form=peso/(esta*esta);
			 form=(int)form;
			
			 if(form>17&&form<26)
			 {
				mensaje5.setText("saludable "+form);
			
			 }
			 else if(form<18)
			 {
				 mensaje5.setText("delgadez "+form);
			
			 }
			 else if(form>25&&form<30)
			 {
				 mensaje5.setText("sobrepeso " +form);
					
			 }
			 else
			 {
				 mensaje5.setText("obesidad leve "+form);
					
			
			 }
		
		}
	}
}
		