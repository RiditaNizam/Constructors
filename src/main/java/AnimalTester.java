public class AnimalTester {

	public static void main(String[] args) {
		BassetHound JW_Dog = new BassetHound();
		JW_Dog.sleep();

		BassetHound hound = new BassetHound();
		System.out.println(hound.toString());

		BassetHound hound1 = new BassetHound("Beau", 7, 35.4); // Pass it to the BassetHound constructor
		System.out.println("Hound 1");
		System.out.println(hound.toString());

		BassetHound hound2 = new BassetHound();
		System.out.println("Hound 2");
		System.out.println(hound.toString());

		Animal.funFact();
		Hippo.funFact();
		Giraffe.funFact();
	}

}