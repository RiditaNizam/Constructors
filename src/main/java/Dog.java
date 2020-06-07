public class Dog extends Domesticated {

	private String name;
	private int age;
	private double weight;

	public Dog() {
		name = "Bingo";
		age = 4;
		weight = 20.5;
	}

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

	public void sleep() {
		System.out.println("ZZZZZ");
	}

	public String toString() {
		String str = "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
		return str;
	}

}