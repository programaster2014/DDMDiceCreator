package main;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

import com.oracle.jrockit.jfr.ContentType;

import base.Dice;
import database.DatabaseHandler;
import enums.Attributes;
import enums.ContentTypes;
import enums.MonsterTypes;
import javafx.scene.chart.PieChart.Data;
import listeners.DeleteButtonClickListener;
import listeners.DiceListListener;
import listeners.NewButtonClickListener;
import listeners.SaveButtonClickListener;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = -7916058331506051141L;
	
	JButton addNewDiceButton;
	JButton saveDiceButton;
	JButton deleteDiceButton;
	
	JTextField diceNameTextField;
	
	JLabel diceNameLabel;
	JLabel contentTypeLabel;
	JLabel attackLabel;
	JLabel defenceLabel;
	JLabel hpLabel;
	JLabel contentAttributeLabel;
	JLabel monsterTypesLabel;
	JLabel diceLevelLabel;
	
	
	JSpinner attackSpinner;
	JSpinner defenceSpinner;
	JSpinner hpSpinner;
	
	JComboBox<ContentTypes> contentTypeDropdown;
	JComboBox<Attributes> attributeDropdown;
	JComboBox<MonsterTypes> monsterTypesDropdown;
	JComboBox<Integer> levelDropdown; 
	
	JScrollPane scrollPane;
	JList<Dice> diceList;
	DiceListModel diceListModel;
	
	DatabaseHandler handler;
	 
	
	public void createGui() {
		this.setLayout(new GridBagLayout());
		
		handler = new DatabaseHandler();
		handler.load();
		
		diceList = new JList<Dice>();
		diceListModel = handler.arrayListToModel();
		diceList.setPreferredSize(new Dimension(150, 300));
		diceList.setModel(diceListModel);
		diceList.addListSelectionListener(new DiceListListener(diceListModel, this));
		
		scrollPane = new JScrollPane(diceList);
		
		addNewDiceButton = new JButton("+ New Die");
		addNewDiceButton.addActionListener(new NewButtonClickListener(diceList, diceListModel));
		
		saveDiceButton = new JButton("Save");
		saveDiceButton.addActionListener(new SaveButtonClickListener(diceListModel, handler, this));
		
		deleteDiceButton = new JButton("Delete");
		deleteDiceButton.addActionListener(new DeleteButtonClickListener(diceListModel, handler, this));
		
		diceNameLabel = new JLabel("Name: ");
		
		diceNameTextField = new JTextField();	
		diceNameTextField.setPreferredSize(new Dimension(200, 20));
		
		contentTypeLabel = new JLabel("Content Type: ");
		contentAttributeLabel = new JLabel("Attribute: ");
		monsterTypesLabel = new JLabel("Type: ");
		
		contentTypeDropdown = new JComboBox<>(ContentTypes.values());
		attributeDropdown = new JComboBox<>(Attributes.values());
		monsterTypesDropdown = new JComboBox<>(MonsterTypes.values());
		
		Integer[] levelSelections = { 1, 2, 3, 4};
		levelDropdown = new JComboBox<Integer>(levelSelections);
		
		attackLabel = new JLabel("Atk: ");
		defenceLabel = new JLabel("Def: ");
		hpLabel = new JLabel("HP: ");
		diceLevelLabel = new JLabel("Level: ");
		
		attackSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 10));
		defenceSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 10));
		hpSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 10));
		
		this.add(scrollPane, Constraints.DICE_LIST_CONSTRAINTS);
		this.add(addNewDiceButton, Constraints.ADD_NEW_DICE_CONSTRAINTS);
		this.add(saveDiceButton, Constraints.SAVE_DICE_CONSTRAINTS);
		this.add(deleteDiceButton, Constraints.DELETE_DICE_CONSTRAINTS);
		this.add(diceNameLabel, Constraints.DICE_NAME_LABEL_CONSTRAINTS);
		this.add(diceNameTextField, Constraints.DICE_NAME_CONSTRAINTS);
		this.add(contentTypeLabel, Constraints.DICE_CONTENT_TYPE_LABEL_CONSTRAINTS);
		this.add(contentTypeDropdown, Constraints.DICE_CONTENT_TYPE_CONSTRAINTS);
		this.add(attackLabel, Constraints.ATTACK_LABEL_CONSTRAINTS);
		this.add(defenceLabel, Constraints.DEFENCE_LABEL_CONSTRAINTS);
		this.add(hpLabel, Constraints.HP_LABEL_CONSTRAINTS);
		this.add(attackSpinner, Constraints.ATTACK_SPINNER_CONSTRAINTS);
		this.add(defenceSpinner, Constraints.DEFENCE_SPINNER_CONSTRAINTS);
		this.add(hpSpinner, Constraints.HP_SPINNER_CONSTRAINTS);
		this.add(contentAttributeLabel, Constraints.CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS);
		this.add(monsterTypesLabel, Constraints.MONSTER_TYPE_LABEL_CONSTRAINTS);
		this.add(attributeDropdown, Constraints.ATTRIBUTE_CONSTRAINTS);
		this.add(monsterTypesDropdown, Constraints.MONSTER_TYPE_CONSTRAINTS);
		this.add(diceLevelLabel, Constraints.LEVEL_LABEL_CONSTRAINTS);
		this.add(levelDropdown, Constraints.LEVEL_DROPDOWN_CONSTRAINTS);
		
	}
	
	public Dice getSelectedDice() {
		return diceList.getSelectedValue();
	}
	
	public void fillFields(Dice dice) {
		diceNameTextField.setText(dice.content.name);
		contentTypeDropdown.setSelectedItem(dice.content.contentType);
		attributeDropdown.setSelectedItem(dice.content.attribute);
		monsterTypesDropdown.setSelectedItem(dice.content.type);
		attackSpinner.setValue(dice.content.atk);
		defenceSpinner.setValue(dice.content.def);
		hpSpinner.setValue(dice.content.hp);
		levelDropdown.setSelectedItem(dice.content.level);
	}
	
	public Dice fillDice(Dice dice) {
		dice.content.name = diceNameTextField.getText();
		dice.content.contentType = (ContentTypes)contentTypeDropdown.getSelectedItem();
		dice.content.attribute = (Attributes)attributeDropdown.getSelectedItem();
		dice.content.type = (MonsterTypes)monsterTypesDropdown.getSelectedItem();
		dice.content.atk = (int)attackSpinner.getValue();
		dice.content.def = (int)defenceSpinner.getValue();
		dice.content.hp = (int)hpSpinner.getValue();
		dice.content.level = (int)levelDropdown.getSelectedItem();
		
		return dice;
	}
	
	public void setFirstElementActive() {
		if(diceListModel.size() > 0) {
			diceList.setSelectedIndex(0);
		}
	}

}
