package main;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import base.Dice;

public class DiceListModel extends DefaultListModel<Dice>{
	private static final long serialVersionUID = -4423398454645315883L;

	public DiceListModel(ArrayList<Dice> list) {
		super();
		populateModel(list);
	}
	
	public DiceListModel() {
		super();
	}
	
	public void populateModel(ArrayList<Dice> list) {
		for(Dice dice : list) {
			this.addElement(dice);
		}
	}
	
	public Dice getDiceFromString(String name) {
		for(int index = 0; index < this.getSize(); index++) {
			if(this.getElementAt(index).content.name.equals(name)) {
				return this.getElementAt(index);
			}
		}
		
		return null;
	}
	
	public Dice addNewDice() {
		Dice dice = Dice.newInstance();
		
		Boolean keepgoing = false;
		int counter = 0;
		do{
			keepgoing = false;
			for(int index = 0; index < this.getSize(); index++) {
				if(dice.content.name.equals(this.getElementAt(index).content.name)) {
					keepgoing = true;
				}
			}
			
			if(keepgoing) {
				counter++;
				dice.content.name = dice.content.name + counter; 
			}

		}while(keepgoing);
		
		
		this.addElement(dice);
		return dice;
	}
	
	public void removeDice(String name) {
		Dice dice = null;
		for(int index = 0; index < this.size(); index++){
			if(name.equals(this.getElementAt(index).toString())) {
				dice = this.getElementAt(index);
			}
		}
		
		if(dice != null) {
			this.removeElement(dice);	
		}
			
	}
}
