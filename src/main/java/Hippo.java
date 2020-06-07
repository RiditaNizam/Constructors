public class Hippo extends Wild {

	double weight;
	String gender;
	boolean isTagged;

	public Hippo() {
		super();
	}

	public Hippo(String sciName, String comName) {
		this.sciName = sciName;
		this.comName = comName;
	}

	public double getWeight() {
		return weight;
	}

	public String getGender() {
		return gender;
	}

	// Customized version of the Animal class's method
	public static void funFact() {
		System.out.println("The word hippopotamous comes from the Ancient Greek phrase river horse");
	}

}
