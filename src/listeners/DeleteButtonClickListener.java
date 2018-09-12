package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.Dice;
import database.DatabaseHandler;
import main.DiceListModel;
import main.MainPanel;

public class DeleteButtonClickListener implements ActionListener{

	DiceListModel model;
	DatabaseHandler database;
	MainPanel mainPanel;
	
	public DeleteButtonClickListener(DiceListModel model, DatabaseHandler handler, MainPanel mainPanel) {
		this.model = model;
		this.database = handler;
		this.mainPanel = mainPanel;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Dice dice = mainPanel.getSelectedDice();
		boolean keepgoing = true;
		for(int index = 0; index < model.size() && keepgoing; index++) {
			if(model.get(index).content.name.equals(dice.content.name)) {
				keepgoing = false;
				model.remove(index);
				mainPanel.setFirstElementActive();
			}
		}
		
		
	}

}
