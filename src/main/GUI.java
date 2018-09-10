package main;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import base.Dice;

public class GUI {
	
	public ArrayList<Dice> pool;
	
	public GUI(ArrayList<Dice> pool) {
		this.pool = pool;
	}
	
	public void CreateGui() {
		JFrame main = new JFrame("Dice Creator");
		main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		main.setSize(950, 700);
		
		MainPanel mainPanel = new MainPanel();
		mainPanel.createGui();
		
		main.add(mainPanel);
		
		
		main.setVisible(true);
	}
}
