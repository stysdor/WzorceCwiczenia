package MVC;

import java.awt.*;

import javax.swing.*;

public class Aplikacja {

	public static void main(String[] args) {
		JFrame ramka = new JFrame("Aplikacja");
		JButton przycisk = new JButton("Hello");
		ramka.getContentPane().add(BorderLayout.CENTER, przycisk);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setSize(300, 300);
		ramka.setVisible(true);
		
	}

}
