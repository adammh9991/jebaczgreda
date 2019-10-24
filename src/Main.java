import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ob=new JFrame();
		Gra gra =new Gra();
		
		ob.setBounds(10,10,905,700);
		ob.setBackground(Color.DARK_GRAY);
		ob.setResizable(false);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.add(gra);
		
		
		
	}

}
