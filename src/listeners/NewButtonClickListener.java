package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

import base.Dice;
import main.DiceListModel;

public class NewButtonClickListener implements ActionListener{

	private JList<Dice> diceList;
	private DiceListModel model;
	
	public NewButtonClickListener(JList<Dice> diceList, DiceListModel model) {
		this.diceList = diceList;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		model.addNewDice();	
		diceList.setModel(model);
	}

}
