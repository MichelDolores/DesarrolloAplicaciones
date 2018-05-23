package unidad1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ventana01 extends JFrame
{

	public Ventana01()
	{
		super("Titulo de la Ventana");//jeraquia de clases
		setSize(500,500);
		setLayout(new FlowLayout());//como se acomodan los elementos en la ventanaCloseOperation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		//la clase mas alta en la jerarquia de java es: object
		/*
		 * polifromismo:cambia de forma 
		 * 
		 * como se acomodan os objetos dentro de la ventana
		 * 
		 * CRAR JIGJUD 
		 */
		Ventana01 ventana=new Ventana01();
	}

}
