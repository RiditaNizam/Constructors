public class BassetHound extends Dog {

	// Have to add a basic default constructor.
	public BassetHound() {
		super(); // Jump to Dog class, look for empty parameters.
	}

	// Looking for a BassetHound constructor with 3 parameters
	public BassetHound(String n, int a, double w) {
		super(n, a, w); // Pass it to Dog class, jump one level up and call the one in the Dog class.
	}

}