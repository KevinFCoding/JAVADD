package BASE;
import java.util.*;


public abstract class Characters {

	protected String name;
	int lvl;
	int exp;
	int life;
	boolean caster;
	protected Map<String, Integer> carac = new HashMap<String, Integer>();
	public static final String stats[] = {"Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma"};
	
	public Characters () {
		for (String key : stats) {
			carac.put(key, 10);
		}
	}
}
