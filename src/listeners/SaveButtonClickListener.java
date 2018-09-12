package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.Dice;
import database.DatabaseHandler;
import main.DiceListModel;
import main.Main;
import main.MainPanel;

public class SaveButtonClickListener implements ActionListener{

	DiceListModel model;
	DatabaseHandler database;
	MainPanel mainPanel;
	
	public SaveButtonClickListener(DiceListModel model, DatabaseHandler handler, MainPanel mainPanel) {
		this.model = model;
		this.database = handler;
		this.mainPanel = mainPanel;
		
	}
	
	public void saveCurrentDice(Dice current) {
		for(int index = 0; index < model.getSize(); index++) {
			if(model.get(index).content.name.equals(current.content.name)) {
				current = mainPanel.fillDice(current);
				model.set(index, current);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		saveCurrentDice(mainPanel.getSelectedDice());		
		this.database.modelToArrayList(model);	
		this.database.save();
	}

}
