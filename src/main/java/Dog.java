public class Dog extends Domesticated {

	private String name;
	private int age;
	private double weight;
	private int treat;

	public Dog() {
		name = "Bingo";
		age = 4;
		weight = 20.5;
		treat = 1;
	}

	// OverLOADED
	public Dog(String n, int a, double w) {
		name = n;
		age = a;
		weight = w;
	}

	public String getName() {
		return name;
	}

	public void breathe() {
		System.out.println("Inhale exhale");
	}

	public void speak() {
		System.out.println("Woof");
	}

	public void sleep() {
		System.out.println("ZZZZZ");
	}

	public int getTreat() {
		return treat;
	}

	// OverLOADED
	public int getTreat(int num) {
		for (int i = 1; i < num; i++) {
			treat++;
		}
		return treat;
	}

	public String toString() {
		String str = "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
		return str;
	}

}