package HClasses;

import BASE.Heroes;

public class Bard extends Heroes
{


    private final static int bonusCarac[] = {-2,4,0,3,1,5};

    private static final Map<String, Integer> bonusMap = new HashMap<>();{
    for(int i = 0; i < Characters.stats.length; ++i) {
        bonusMap.put(Characters.stats[i], bonusCarac[i]);
    }
};
    public Bard(String race, String background) {
        super(race, background);
        for(String key : bonusMap.keySet()) {
            carac.put(key, carac.getOrDefault(key, 10) + bonusMap.getOrDefault(key, 0));
        }
    }
    public int getCarac(String keyString) {
        return carac.get(keyString);

    }

}
