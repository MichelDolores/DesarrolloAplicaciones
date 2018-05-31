package unidad1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class GirdLayout1 extends Frame
{
	
		void forma() { GridLayout g;
		Label uno=new Label("uno");
		Label dos=new Label("dos");
		Label tres=new Label("tres");
		Label cuatro=new Label("cuatro");
		Label cinco=new Label("cinco");
		Label seis=new Label("seis");
		setLayout(g=new GridLayout(3,2));
		uno.setBackground(Color.pink);
		dos.setBackground(Color.lightGray);
		tres.setBackground(Color.cyan);
		cuatro.setBackground(Color.orange);
		cinco.setBackground(Color.yellow);
		seis.setBackground(new Color(100,185,25) );
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
		add(cinco);
		add(seis);
		setSize(400,200);
		//pack();
		setVisible(true);
		}
		
		
		public static void main( String args[]){
			GirdLayout1 layout =new GirdLayout1();
		layout.forma();
		}
}
