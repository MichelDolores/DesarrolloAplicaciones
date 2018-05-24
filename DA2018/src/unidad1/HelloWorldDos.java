package unidad1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldDos extends JFrame
{
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	
	public HelloWorldDos()
	{
		super("¡¡¡Hello World Dos!!!");
		setLayout(null);//el programador los acomoda no el Layout
		setSize(400,400); //el comando pack quita todo el comando no utilizado dentro de las ventanas
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_mensaje=new JLabel("Aqui esta la etiqueta");
		lbl_mensaje.setBounds(10,10,150,30);//cordenadas de x,y y el tamaño
		add(lbl_mensaje);
		
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.setBounds(70, 40, 100, 30);
		add(btn_aceptar);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HelloWorldDos ventana=new HelloWorldDos();


	}

}
