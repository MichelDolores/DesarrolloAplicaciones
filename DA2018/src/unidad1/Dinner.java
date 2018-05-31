package unidad1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dinner extends JFrame
{
	private Container  contents;
	private JLabel labelText;
	private JLabel labelImage;
	
	//Constructor
	public Dinner()
	{
		super("What's for dinner?");
		contents= getContentPane();
		//llamar a un constructor de JFrame
		//devolver un contenedor
		setLayout(new FlowLayout());
		//usar el constructor de JLabel con un String
		labelText= new JLabel("Sushi tonight?");
		//propiedades del LABEL que se cambian
		labelText.setForeground(java.awt.Color.BLACK);		
		labelText.setBackground(java.awt.Color.WHITE);	
		labelText.setOpaque(true);
		
		//usar el  constructor JLabel con un rgumento de ImageIcon
		labelImage=new JLabel(new ImageIcon("sushi.jpg"));
		
		//cambiar la heeramienta del tipo de texto
		labelImage.setToolTipText("Photo of sushi");
		//agregar dos contenedores label
		contents.add(labelText);
		contents.add(labelImage);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dinner dinner=new Dinner();
		dinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
