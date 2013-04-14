package testPackage;

import javax.swing.*;
import java.awt.*;

public class apples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame go = new JFrame("Title");
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display p = new Display();
		go.setContentPane(p);
		go.setSize(600,500);
		go.setResizable(false);
		go.setVisible(true);
		

	}

}
