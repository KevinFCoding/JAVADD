import HClasses.Wizard;
import BASE.Characters;
import HClasses.Ranger;

public class EnterTheDungeon {

	public static void main(String[] args) {
		
		Wizard kevin = new Wizard("Orc", "Forgeron");
		
		Ranger bob = new Ranger("Humain", "Hunter");
		
		for(String key : Characters.stats){
			System.out.println(key + " : " + bob.getAllCarac().get(key));
		}
		for(String key : Characters.stats){
			System.out.println(key + " : " + kevin.getAllCarac().get(key));
		}
	}

}
