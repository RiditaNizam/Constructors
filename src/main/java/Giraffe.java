public class Giraffe extends Wild {

	double height;
	String gender;

	public double getHeight() {
		return height;
	}

	public String getGender() {
		return gender;
	}

	// Customized version of the Animal class's method
	public static void funFact() {
		System.out.println("Giraffes have 32 teeth which is the same as humans.");
	}

}
