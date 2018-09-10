package main;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

import com.oracle.jrockit.jfr.ContentType;

import enums.Attributes;
import enums.ContentTypes;
import enums.MonsterTypes;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = -7916058331506051141L;
	
	JButton addNewDiceButton;
	
	JTextField diceNameTextField;
	
	JLabel diceNameLabel;
	JLabel contentTypeLabel;
	JLabel attackLabel;
	JLabel defenceLabel;
	JLabel hpLabel;
	JLabel contentAttributeLabel;
	JLabel monsterTypesLabel;
	
	JSpinner attackSpinner;
	JSpinner defenceSpinner;
	JSpinner hpSpinner;
	
	JComboBox<ContentTypes> contentTypeDropdown;
	JComboBox<Attributes> attributeDropdown;
	JComboBox<MonsterTypes> monsterTypesDropdown;
	 
	
	
	
	public void createGui() {
		this.setLayout(new GridBagLayout());
		
		addNewDiceButton = new JButton("+ New Die");
		
		diceNameLabel = new JLabel("Name: ");
		
		diceNameTextField = new JTextField();	
		diceNameTextField.setPreferredSize(new Dimension(200, 20));
		
		contentTypeLabel = new JLabel("Content Type: ");
		contentAttributeLabel = new JLabel("Attribute: ");
		monsterTypesLabel = new JLabel("Type: ");
		
		contentTypeDropdown = new JComboBox<>(ContentTypes.values());
		attributeDropdown = new JComboBox<>(Attributes.values());
		monsterTypesDropdown = new JComboBox<>(MonsterTypes.values());
		
		attackLabel = new JLabel("Atk: ");
		defenceLabel = new JLabel("Def: ");
		hpLabel = new JLabel("HP: ");
		
		attackSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 10));
		defenceSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 10));
		hpSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 10));
		
		this.add(addNewDiceButton, Constraints.ADD_NEW_DICE_CONSTRAINTS);
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
		
	}
	
}
