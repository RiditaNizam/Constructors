public class Animal {
	private String sciName;
	private String comName;

	public Animal() {
		sciName = "Animalus Genericus";
		comName = "Generic Animal";
	}

	public Animal(String sN, String cN) {
		sciName = sN;
		comName = cN;
	}

	public String getSciName() {
		return sciName;
	}

	public String getComName() {
		return comName;
	}

	public String toString() {
		return " " + sciName + " " + comName;
	}

	public static void funFact() {
		System.out.println("The overridden funFact method displays a unique fact about the animal.");
	}

}