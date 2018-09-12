package base;

import enums.Crests;

public class Side {
	public Crests crest;
	public int modifier;
	
	public static Side newLevelSide(int level) {
		Side side = new Side();
		side.crest = Crests.Summon;
		side.modifier = level;
		
		return side;
	}
	
	public static Side newTemporarySide() {
		Side side = new Side();
		side.crest = Crests.Null;
		side.modifier = 1;
		
		return side;
	}
}
