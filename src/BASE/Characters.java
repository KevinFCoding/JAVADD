package BASE;
import java.util.*;


public class Characters {

	protected String name;
	int lvl;
	int exp;
	int life;
	boolean caster;
	Map<String, Integer> carac = new HashMap<String, Integer>();
	
	
	public Characters () {
		
		carac.put("Strengh", 10);
		carac.put("Dexterity", 10);
		carac.put("Constitution",10);
		carac.put("Intelligence",10);
		carac.put("Wisdom",10);
		carac.put("Charisma",10);
		
	}
	



}
