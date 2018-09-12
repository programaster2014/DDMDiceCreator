package database;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.glass.ui.CommonDialogs.Type;

import base.Dice;
import main.DiceListModel;

import java.io.File;

public class DatabaseHandler {
	private static final String filename = "database.json";
	ArrayList<Dice> dice;
	
	public DatabaseHandler() {
		this.dice = new ArrayList<>();
	}
	
	public void modelToArrayList(DiceListModel model) {
		dice.clear();
		for(int index = 0; index < model.size(); index++) {
			dice.add(model.get(index));
		}
	}
	
	public DiceListModel arrayListToModel() {
		if(dice == null) {
			return new DiceListModel();
		}
		else if(dice.isEmpty()) {
			return new DiceListModel();
		}
		
		return new DiceListModel(dice);
	}
	
	@SuppressWarnings("unchecked")
	public void load() {
		try {
			File myFile = new File(filename);
			FileInputStream inputStream = new FileInputStream(myFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuilder builder = new StringBuilder();
			String row = "";
			while((row = reader.readLine()) != null) {
				builder.append(row);
			}
			reader.close();
			dice = (ArrayList<Dice>)(new Gson()).fromJson(builder.toString(), new TypeToken<ArrayList<Dice>>() {}.getType());
			printDice();
		}catch (IOException e) {
			e.printStackTrace();
			dice = new ArrayList<>();
		}
	}
	
	public void save() {
		GsonBuilder builder = new GsonBuilder();		
		Gson gson = builder.setPrettyPrinting().create();
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("database.json", "UTF-8");
			writer.println(gson.toJson(dice, new TypeToken<ArrayList<Dice>>() {}.getType()));
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printDice() {
		for(Dice dice : this.dice) {
			System.out.println(dice.toString());
		}
	}
}
