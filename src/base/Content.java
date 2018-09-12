package base;

import enums.Attributes;
import enums.ContentTypes;
import enums.MonsterTypes;

public class Content {
	
	public String name;
	
	public ContentTypes contentType; 
	public Attributes attribute;
	public MonsterTypes type;
	
	public int hp;
	public int atk;
	public int def;
	public int level;
	
	public static Content newInstance() {
		Content content = new Content();
		content.name = "New Dice";
		content.contentType = ContentTypes.Null;
		content.attribute = Attributes.Null;
		content.type = MonsterTypes.Null;
		content.level = 1;
		
		content.hp =  0;
		content.atk = 0;
		content.def = 0;
		
		return content;
	}
}
