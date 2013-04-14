import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Primary {
	
	public static void main(String[] args) {

		JFrame go = new JFrame("Title");
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display Display = new Display();
		go.setContentPane(Display);
		
		go.setBackground(Color.BLACK);
		go.setSize(350,600);
		go.setResizable(false);
		go.setVisible(true);
		
		Level.print();
		

		try{
			Thread.sleep(2000);
		}catch(Exception ex){}
		
		Display.displayText = "Screen has updated! \n Fairie attacks!";
		Display.repaint();
		
		try{
			Thread.sleep(2000);
		}catch(Exception ex){}

		Display.repaint();
		
		
	}

}
