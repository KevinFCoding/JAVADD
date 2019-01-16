import HClasses.Wizard;

public class EnterTheDungeon {

	public static void main(String[] args) {
		
		Wizard Kevin = new Wizard("Orc", "Forgeron");
		
		System.out.println(Kevin.getCarac("Strength"));
		System.out.println(Kevin.getCarac("Dexterity"));
		System.out.println(Kevin.getCarac("Constitution"));
		System.out.println(Kevin.getCarac("Intelligence"));
		System.out.println(Kevin.getCarac("Wisdom"));
		System.out.println(Kevin.getCarac("Charisma"));

		Ranger Bob = new Ranger("Human", "Hunter");

		System.out.println(Bob.getCarac("Strength"));
		System.out.println(Bob.getCarac("Dexterity"));
		System.out.println(Bob.getCarac("Constitution"));
		System.out.println(Bob.getCarac("Intelligence"));
		System.out.println(Bob.getCarac("Wisdom"));
		System.out.println(Bob.getCarac("Charisma"));
	}

}
