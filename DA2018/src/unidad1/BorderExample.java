package unidad1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderExample
{
	private JFrame f;//jFrame es contenedor 
	private JButton bn, bs, bw, be, bc;//componentes

	public BorderExample()//inicializamos el jfram y los botones
	{
		f=new JFrame("Border Layout");
		bn=new JButton("Button 1");
		bc=new JButton("Button 2");
		bw=new JButton("Button 3");
		bs=new JButton("Button 4");
		be=new JButton("Button 5");
	}
	
	public void launchFrame()//ubicacion de los botones
	{
		f.add(bn, BorderLayout.NORTH);//colocacion de la posicion de los botones 
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setSize(400,200);//tamaño de la ventana
		f.setVisible(true);//se hace visible
	}
	
	public static void main(String[] args)
	{
		BorderExample guiWindow2 = new BorderExample();//creamos un aventana
		guiWindow2.launchFrame();
	}

}
