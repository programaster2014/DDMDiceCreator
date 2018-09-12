package base;

import java.util.ArrayList;

public class Dice {
	public ArrayList<Side> sides;
	public Content content;
	
	@Override
	public String toString() {
		return content.name;
	}
	
	public static Dice newInstance() {
		Dice dice = new Dice();
		dice.sides = new ArrayList<>();
			dice.sides.add(Side.newLevelSide(1));
			dice.sides.add(Side.newLevelSide(1));
			dice.sides.add(Side.newLevelSide(1));
			dice.sides.add(Side.newLevelSide(1));
			dice.sides.add(Side.newTemporarySide());
			dice.sides.add(Side.newTemporarySide());		
		dice.content = Content.newInstance();
		
		return dice;
	}
		
	
}
