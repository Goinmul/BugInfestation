
import java.util.Scanner; // importing scanner to use it.

public class Fkiller { // The class name

	public void countBug() { // Public method countBug.

		Scanner keyboard2 = new Scanner(System.in); // Instantiating scanner.

		final double GROWTH_RATE = 0.95; // final makes this variable "Unchangable".
		final double ONE_BUG_VOLUME = 0.002; // immortal variable! hahaha.

		double population= 0; // a double variable.
		double totalBugVolume = 0; // a double variable.
		int count = 0; // // an int variable.

		totalBugVolume = population*ONE_BUG_VOLUME; // literally, totalBugVolume is population times ONE_BUG_VOLUME.

		System.out.println("Enter the total volumes of your house"); // showing a sentence.
		System.out.print("in cubic feet : "); // showing a sentence.
		double houseVolume = keyboard2.nextDouble(); // getting a double number from keyboard(user)

		System.out.print("roaches in your house : "); // showing a sentence.
		double firstRoachNum = keyboard2.nextDouble(); // getting a double number from keyboard(user)

		population = firstRoachNum; // giving the value to 'population' from user('firstRoachNum')

		while(totalBugVolume < houseVolume) // execute while the statement inside is true
		{
			double newBugs = population*GROWTH_RATE; // gives a new value
			double newBugsVolume = newBugs*ONE_BUG_VOLUME; // also, assigning a new value
			population = population + newBugs; // same as upper line. giving new value.
			totalBugVolume = totalBugVolume + newBugs; //  ... this is same too.
			count++; // count means the weeks taken, since every week is parallel to the while loop's one revolution.

		}
		System.out.println("Starting with a roach population of : " + (int)firstRoachNum); // showing the results. (int) means type cast. make 'firstRoachNum' purposefully to an int type.
		System.out.println("and a house with a volume of " + (int)houseVolume+ " feet.");// showing the results.
		System.out.println("after " + count + " weeks,");// showing the results.
		System.out.println("the house will be filled with " + (int)population+" roaches.");// showing the results.
		System.out.println("They will fill a volume of " + (int)totalBugVolume+" cubic feet.");// showing the results.
		System.out.println("Better call Debugging Experts Inc."); // showing the results.


	} // after finishing coding, ctrl + i for indentation.

} // done! Yeah!