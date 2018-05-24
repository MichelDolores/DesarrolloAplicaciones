package unidad1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame
{
	private JLabel lbl_hello;//JLabel sirve para poner una etiqueta o texto
	
	public HelloWorld()//Metodo Constructor
	{ 
		super("¡¡¡Hello World!!!");
		setLayout(new FlowLayout());
		setSize(400,400); //el comando pack quita todo el comando no utilizado dentro de las ventanas
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_hello=new JLabel("¡¡¡Hello World!!!");
		add(lbl_hello);//agregar etiqueta
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		HelloWorld ventana=new HelloWorld();

	}

}
