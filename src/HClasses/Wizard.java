package HClasses;

import java.util.HashMap;
import java.util.Map;

import BASE.Heroes;


public class Wizard extends Heroes{

	protected final static Map<String, Integer> bonusMap = new HashMap<String, Integer>();

		public Wizard(String race, String background) {
			super(race, background);
			for(String key : bonusMap.keySet()) {
				carac.put(key, carac.getOrDefault(key, 10) + bonusMap.getOrDefault(key, 0));
			}
		
		}

}

	
