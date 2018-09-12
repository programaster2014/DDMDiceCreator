package base;

import javax.swing.JList;

public class Dlist extends JList<Dice>{
	private static final long serialVersionUID = 3624869658017264115L;

	public Dlist() {
		super();
	}
	
	public Dice getDiceFromString(String name) {
	
		for(int index = 0; index < this.getModel().getSize(); index++) {
			if(this.getModel().getElementAt(index).content.name.equals(name)) {
				return this.getModel().getElementAt(index);
			}
		}
		
		return null;
	}
}
