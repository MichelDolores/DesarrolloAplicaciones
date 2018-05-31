package unidad1;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloWorldTres extends JFrame implements ActionListener// es una interfaz se utiliza para que la venta escuche un ruido y realice una accion
{
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	private JTextField tf_mensaje;//Ingresar datos
	public HelloWorldTres()
	{
		super("Hello World Tres!!!");//manda llamar un metodo constructir del metodo JFrame, tambien se utiliza setTitle("");
		setSize(400,200);
		setLayout(new FlowLayout());//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//darle clic a la x se cierre la aplicacion completa evitando que se quede en memoria
		
		ImageIcon ic=new ImageIcon("icon.png");//crear un icono
		
		lbl_mensaje=new JLabel(ic);//crear instancia
		add(lbl_mensaje);//agregar al contenedor
		
		tf_mensaje=new JTextField(20);
		add(tf_mensaje);
		
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.addActionListener(this);//se da de alta el action en la misma ventana por eso se pone el this, si esta en otra se pone el 
											//nombre de la clase y cada vez que se ejecute este boton lo manda a performed
		add(btn_aceptar);
		
		Image in =Toolkit.getDefaultToolkit().getImage("icon.png");//acceder a los recursos del proyecto
		setIconImage(in);
		
		
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method st
		HelloWorldTres ventana=new HelloWorldTres();
	}

	@Override //Sobre escritura, para poder modificar el action performed por default
	public void actionPerformed(ActionEvent e)
	{
		//se programan todos lo eventos dentro de la ventana
		if(e.getSource()==btn_aceptar)//el get source sirve para saber que control hizo la accion
		{
			String nombre=tf_mensaje.getText();
			lbl_mensaje.setText("Hello "+nombre);//get=obtener algo y el set=establecer o colocar
			tf_mensaje.setText("");//aparecer el espacio en blanco
			//tf_mensaje.setVisible(false);//no es visible
			//tf_mensaje.setEnabled(false);//inavilitado
		}
		
		
	}

}
