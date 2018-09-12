package main;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Constraints {

	public static final GridBagConstraints DICE_LIST_CONSTRAINTS;
	
	public static final GridBagConstraints ADD_NEW_DICE_CONSTRAINTS;
	public static final GridBagConstraints SAVE_DICE_CONSTRAINTS;
	public static final GridBagConstraints DELETE_DICE_CONSTRAINTS;
	
	public static final GridBagConstraints DICE_NAME_LABEL_CONSTRAINTS;
	public static final GridBagConstraints DICE_NAME_CONSTRAINTS;
	
	public static final GridBagConstraints DICE_CONTENT_TYPE_LABEL_CONSTRAINTS;
	public static final GridBagConstraints DICE_CONTENT_TYPE_CONSTRAINTS;
	
	public static final GridBagConstraints CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS;
	public static final GridBagConstraints MONSTER_TYPE_LABEL_CONSTRAINTS;
	
	public static final GridBagConstraints ATTRIBUTE_CONSTRAINTS;
	public static final GridBagConstraints MONSTER_TYPE_CONSTRAINTS;
	
	public static final GridBagConstraints ATTACK_LABEL_CONSTRAINTS;
	public static final GridBagConstraints DEFENCE_LABEL_CONSTRAINTS;
	public static final GridBagConstraints HP_LABEL_CONSTRAINTS;
	
	public static final GridBagConstraints ATTACK_SPINNER_CONSTRAINTS;
	public static final GridBagConstraints DEFENCE_SPINNER_CONSTRAINTS;
	public static final GridBagConstraints HP_SPINNER_CONSTRAINTS;
	
	public static final GridBagConstraints LEVEL_LABEL_CONSTRAINTS;
	public static final GridBagConstraints LEVEL_DROPDOWN_CONSTRAINTS;
	
	public static final Insets INSETS;
	
	static {
		
		INSETS = new Insets(0, 0, 10, 10);
		
		DICE_LIST_CONSTRAINTS = new GridBagConstraints();
			DICE_LIST_CONSTRAINTS.gridx = 0;
			DICE_LIST_CONSTRAINTS.gridy = 0;
			DICE_LIST_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DICE_LIST_CONSTRAINTS.weightx = 0.0;
			DICE_LIST_CONSTRAINTS.weighty = 0.0;
			DICE_LIST_CONSTRAINTS.gridwidth = 1;
			DICE_LIST_CONSTRAINTS.gridheight = 7;
			DICE_LIST_CONSTRAINTS.insets = INSETS;
		
		ADD_NEW_DICE_CONSTRAINTS = new GridBagConstraints();
			ADD_NEW_DICE_CONSTRAINTS.gridx = 1;
			ADD_NEW_DICE_CONSTRAINTS.gridy = 0;
			ADD_NEW_DICE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			ADD_NEW_DICE_CONSTRAINTS.weightx = 0.0;
			ADD_NEW_DICE_CONSTRAINTS.weighty = 0.0;
			ADD_NEW_DICE_CONSTRAINTS.gridwidth = 2;
			ADD_NEW_DICE_CONSTRAINTS.insets = INSETS;
			
		SAVE_DICE_CONSTRAINTS = new GridBagConstraints();
			SAVE_DICE_CONSTRAINTS.gridx = 3;
			SAVE_DICE_CONSTRAINTS.gridy = 0;
			SAVE_DICE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			SAVE_DICE_CONSTRAINTS.weightx = 0.0;
			SAVE_DICE_CONSTRAINTS.weighty = 0.0;
			SAVE_DICE_CONSTRAINTS.gridwidth = 1;
			SAVE_DICE_CONSTRAINTS.insets = INSETS;
			
		DELETE_DICE_CONSTRAINTS = new GridBagConstraints();
			DELETE_DICE_CONSTRAINTS.gridx = 4;
			DELETE_DICE_CONSTRAINTS.gridy = 0;
			DELETE_DICE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DELETE_DICE_CONSTRAINTS.weightx = 0.0;
			DELETE_DICE_CONSTRAINTS.weighty = 0.0;
			DELETE_DICE_CONSTRAINTS.gridwidth = 1;
			DELETE_DICE_CONSTRAINTS.insets = INSETS;
			
		DICE_NAME_LABEL_CONSTRAINTS = new GridBagConstraints();
			DICE_NAME_LABEL_CONSTRAINTS.gridx = 1;
			DICE_NAME_LABEL_CONSTRAINTS.gridy = 1;
			DICE_NAME_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DICE_NAME_LABEL_CONSTRAINTS.weightx = 0.0;
			DICE_NAME_LABEL_CONSTRAINTS.weighty = 0.0;
			DICE_NAME_LABEL_CONSTRAINTS.gridwidth = 2;
			DICE_NAME_LABEL_CONSTRAINTS.insets = INSETS;
			
		DICE_NAME_CONSTRAINTS = new GridBagConstraints();
			DICE_NAME_CONSTRAINTS.gridx = 3;
			DICE_NAME_CONSTRAINTS.gridy = 1;
			DICE_NAME_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DICE_NAME_CONSTRAINTS.weightx = 0.0;
			DICE_NAME_CONSTRAINTS.weighty = 0.0;
			DICE_NAME_CONSTRAINTS.gridwidth = 2;
			DICE_NAME_CONSTRAINTS.insets = INSETS;
			
		DICE_CONTENT_TYPE_LABEL_CONSTRAINTS = new GridBagConstraints();
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.gridx = 1;
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.gridy = 2;
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.weightx = 0.0;
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.weighty = 0.0;
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.gridwidth = 2;
			DICE_CONTENT_TYPE_LABEL_CONSTRAINTS.insets = INSETS;
			
		DICE_CONTENT_TYPE_CONSTRAINTS = new GridBagConstraints();
			DICE_CONTENT_TYPE_CONSTRAINTS.gridx = 3;
			DICE_CONTENT_TYPE_CONSTRAINTS.gridy = 2;
			DICE_CONTENT_TYPE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DICE_CONTENT_TYPE_CONSTRAINTS.weightx = 0.0;
			DICE_CONTENT_TYPE_CONSTRAINTS.weighty = 0.0;
			DICE_CONTENT_TYPE_CONSTRAINTS.gridwidth = 2;
			DICE_CONTENT_TYPE_CONSTRAINTS.insets = INSETS;
			
		ATTRIBUTE_CONSTRAINTS = new GridBagConstraints();
			ATTRIBUTE_CONSTRAINTS.gridx = 3;
			ATTRIBUTE_CONSTRAINTS.gridy = 3;
			ATTRIBUTE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			ATTRIBUTE_CONSTRAINTS.weightx = 0.0;
			ATTRIBUTE_CONSTRAINTS.weighty = 0.0;
			ATTRIBUTE_CONSTRAINTS.gridwidth = 2;
			ATTRIBUTE_CONSTRAINTS.insets = INSETS;
			
		MONSTER_TYPE_CONSTRAINTS = new GridBagConstraints();
			MONSTER_TYPE_CONSTRAINTS.gridx = 3;
			MONSTER_TYPE_CONSTRAINTS.gridy = 4;
			MONSTER_TYPE_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			MONSTER_TYPE_CONSTRAINTS.weightx = 0.0;
			MONSTER_TYPE_CONSTRAINTS.weighty = 0.0;
			MONSTER_TYPE_CONSTRAINTS.gridwidth = 2;
			MONSTER_TYPE_CONSTRAINTS.insets = INSETS;
			
		CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS = new GridBagConstraints();
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.gridx = 1;
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.gridy = 3;
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.weightx = 0.0;
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.weighty = 0.0;
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.gridwidth = 2;
			CONTENT_ATTRIBUTE_LABEL_CONSTRAINTS.insets = INSETS;
			
		MONSTER_TYPE_LABEL_CONSTRAINTS = new GridBagConstraints();
			MONSTER_TYPE_LABEL_CONSTRAINTS.gridx = 1;
			MONSTER_TYPE_LABEL_CONSTRAINTS.gridy = 4;
			MONSTER_TYPE_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			MONSTER_TYPE_LABEL_CONSTRAINTS.weightx = 0.0;
			MONSTER_TYPE_LABEL_CONSTRAINTS.weighty = 0.0;
			MONSTER_TYPE_LABEL_CONSTRAINTS.gridwidth = 2;
			MONSTER_TYPE_LABEL_CONSTRAINTS.insets = INSETS;
			
		ATTACK_LABEL_CONSTRAINTS = new GridBagConstraints();
			ATTACK_LABEL_CONSTRAINTS.gridx = 1;
			ATTACK_LABEL_CONSTRAINTS.gridy = 5;
			ATTACK_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			ATTACK_LABEL_CONSTRAINTS.weightx = 0.0;
			ATTACK_LABEL_CONSTRAINTS.weighty = 0.0;
			ATTACK_LABEL_CONSTRAINTS.gridwidth = 1;
			ATTACK_LABEL_CONSTRAINTS.insets = INSETS;
			
		DEFENCE_LABEL_CONSTRAINTS = new GridBagConstraints();
			DEFENCE_LABEL_CONSTRAINTS.gridx = 3;
			DEFENCE_LABEL_CONSTRAINTS.gridy = 5;
			DEFENCE_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DEFENCE_LABEL_CONSTRAINTS.weightx = 0.0;
			DEFENCE_LABEL_CONSTRAINTS.weighty = 0.0;
			DEFENCE_LABEL_CONSTRAINTS.gridwidth = 1;
			DEFENCE_LABEL_CONSTRAINTS.insets = INSETS;
			
		HP_LABEL_CONSTRAINTS = new GridBagConstraints();
			HP_LABEL_CONSTRAINTS.gridx = 1;
			HP_LABEL_CONSTRAINTS.gridy = 6;
			HP_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			HP_LABEL_CONSTRAINTS.weightx = 0.0;
			HP_LABEL_CONSTRAINTS.weighty = 0.0;
			HP_LABEL_CONSTRAINTS.gridwidth = 1;
			HP_LABEL_CONSTRAINTS.insets = INSETS;
			
		ATTACK_SPINNER_CONSTRAINTS = new GridBagConstraints();
			ATTACK_SPINNER_CONSTRAINTS.gridx = 2;
			ATTACK_SPINNER_CONSTRAINTS.gridy = 5;
			ATTACK_SPINNER_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			ATTACK_SPINNER_CONSTRAINTS.weightx = 0.0;
			ATTACK_SPINNER_CONSTRAINTS.weighty = 0.0;
			ATTACK_SPINNER_CONSTRAINTS.gridwidth = 1;
			ATTACK_SPINNER_CONSTRAINTS.insets = INSETS;
			
		DEFENCE_SPINNER_CONSTRAINTS = new GridBagConstraints();
			DEFENCE_SPINNER_CONSTRAINTS.gridx = 4;
			DEFENCE_SPINNER_CONSTRAINTS.gridy = 5;
			DEFENCE_SPINNER_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			DEFENCE_SPINNER_CONSTRAINTS.weightx = 0.0;
			DEFENCE_SPINNER_CONSTRAINTS.weighty = 0.0;
			DEFENCE_SPINNER_CONSTRAINTS.gridwidth = 1;
			DEFENCE_SPINNER_CONSTRAINTS.insets = INSETS;
			
		HP_SPINNER_CONSTRAINTS = new GridBagConstraints();
			HP_SPINNER_CONSTRAINTS.gridx = 2;
			HP_SPINNER_CONSTRAINTS.gridy = 6;
			HP_SPINNER_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			HP_SPINNER_CONSTRAINTS.weightx = 0.0;
			HP_SPINNER_CONSTRAINTS.weighty = 0.0;
			HP_SPINNER_CONSTRAINTS.gridwidth = 1;
			HP_SPINNER_CONSTRAINTS.insets = INSETS;
			
		LEVEL_LABEL_CONSTRAINTS = new GridBagConstraints();
			LEVEL_LABEL_CONSTRAINTS.gridx = 3;
			LEVEL_LABEL_CONSTRAINTS.gridy = 6;
			LEVEL_LABEL_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			LEVEL_LABEL_CONSTRAINTS.weightx = 0.0;
			LEVEL_LABEL_CONSTRAINTS.weighty = 0.0;
			LEVEL_LABEL_CONSTRAINTS.gridwidth = 1;
			LEVEL_LABEL_CONSTRAINTS.insets = INSETS;
			
		LEVEL_DROPDOWN_CONSTRAINTS = new GridBagConstraints();
			LEVEL_DROPDOWN_CONSTRAINTS.gridx = 4;
			LEVEL_DROPDOWN_CONSTRAINTS.gridy = 6;
			LEVEL_DROPDOWN_CONSTRAINTS.fill = GridBagConstraints.BOTH;
			LEVEL_DROPDOWN_CONSTRAINTS.weightx = 0.0;
			LEVEL_DROPDOWN_CONSTRAINTS.weighty = 0.0;
			LEVEL_DROPDOWN_CONSTRAINTS.gridwidth = 1;
			LEVEL_DROPDOWN_CONSTRAINTS.insets = INSETS;
		
	}
	
}
