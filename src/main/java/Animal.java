public class Animal {
	String sciName;
	String comName;

	public Animal() {
		sciName = "Animalus Genericus";
		comName = "Generic Animal";
	}

	public Animal(String s, String c) {
		sciName = s;
		comName = c;
	}

	public static void funFact() {
		System.out.println("The overridden funFact method displays a unique fact about the animal.");
	}

}