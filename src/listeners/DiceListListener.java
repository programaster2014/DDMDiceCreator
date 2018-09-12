package listeners;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import base.Dice;
import main.DiceListModel;
import main.MainPanel;

public class DiceListListener implements ListSelectionListener{

	private DiceListModel model;
	private MainPanel mainPanel;
	
	public DiceListListener(DiceListModel model, MainPanel mainPanel) {
		this.model = model;
		this.mainPanel = mainPanel;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent event) {
		if(!event.getValueIsAdjusting()){
			@SuppressWarnings("unchecked")
			Dice selection = (Dice)((JList<Dice>)event.getSource()).getSelectedValue();
			if(selection != null){
				mainPanel.fillFields(selection);
			}
		}
	}
}
