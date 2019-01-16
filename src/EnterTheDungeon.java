import HClasses.Wizard;
import HClasses.Ranger;

public class EnterTheDungeon {

	public static void main(String[] args) {
		
		Wizard Kevin = new Wizard("Orc", "Forgeron");
		
		System.out.println("For : " + Kevin.getCarac("Strength"));
		System.out.println("Dex : " +Kevin.getCarac("Dexterity"));
		System.out.println("Con : " +Kevin.getCarac("Constitution"));
		System.out.println("Int : " +Kevin.getCarac("Intelligence"));
		System.out.println("Sag : " +Kevin.getCarac("Wisdom"));
		System.out.println("Cha : " +Kevin.getCarac("Charisma"));

		Ranger Bob = new Ranger("Human", "Hunter");

		System.out.println("For : " +Bob.getCarac("Strength"));
		System.out.println("Dex : " +Bob.getCarac("Dexterity"));
		System.out.println("Con : " +Bob.getCarac("Constitution"));
		System.out.println("Int : " +Bob.getCarac("Intelligence"));
		System.out.println("Sag : " +Bob.getCarac("Wisdom"));
		System.out.println("Cha : " +Bob.getCarac("Charisma"));
	}

}
