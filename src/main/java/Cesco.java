import java.util.Scanner; // importing scanner class

public class Cesco { // This class' name

	public static void main (String args[]) { // main function where the program starts

		// Scanner keyboard1 = new Scanner(System.in); no need to use scanner in main function, so ...
		Fkiller myKiller = new Fkiller(); // instantiating scanner class to use it

		myKiller.countBug(); // in 'Fkiller' class, there is method 'countBug'. I instantiated it to use it.
	}// end of main

} // end of class
