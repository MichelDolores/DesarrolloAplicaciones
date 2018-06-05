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

public class A_examn extends JFrame implements ActionListener
{
	private JLabel lbl_mensaje, lbl_imagen, lbl_numero;
	private JTextField tf_numero;
	private JButton btn_calcular;


	public A_examn()
	{
		super("Matematicas Raíz Cubica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setLayout(new FlowLayout());
		 Image im=Toolkit.getDefaultToolkit().getImage("icon.png");
		 setIconImage(im);
		 
		 lbl_imagen=new JLabel(new ImageIcon("icon.png"));
		 add(lbl_imagen);
		 lbl_numero=new JLabel("Ingrese numero:");
		 add(lbl_numero);
		 tf_numero=new JTextField(10);
		 tf_numero.setToolTipText("Ingresa numero");
		 add(tf_numero);
		 lbl_mensaje=new JLabel ();
		 add(lbl_mensaje); 
		btn_calcular=new JButton("calcular");
		btn_calcular.addActionListener(this);
		 add(btn_calcular);
		 setVisible(true);
	}
	public static void main(String []args)
	{
		A_examn ventana=new A_examn();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_calcular)
		{
			double numero= Double.parseDouble(tf_numero.getText());
			
			lbl_mensaje.setText(String.valueOf(Math.cbrt(numero)));
			
		}
		
	}

}
