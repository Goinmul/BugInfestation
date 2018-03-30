
import java.util.Scanner; // importing scanner to use it.

public class Fkiller { // The class name

	public void countBug() { // Public method countBug.

		Scanner keyboard2 = new Scanner(System.in); // Instantiating scanner.
		
		final double GROWTH_RATE = 0.95;
		final double ONE_BUG_VOLUME = 0.002; // immortal variable! hahaha.

		double population= 0; // a double variable.
		double totalBugVolume = 0; // a double variable.
		int count = 0; // // an int variable.

		totalBugVolume = population*ONE_BUG_VOLUME;

		System.out.println("Enter the total volumes of your house");
		System.out.print("in cubic feet : ");
		double houseVolume = keyboard2.nextDouble();
	
		System.out.print("roaches in your house : ");
		double firstRoachNum = keyboard2.nextDouble();

		population = firstRoachNum;

		while(totalBugVolume < houseVolume)
		{
			double newBugs = population*GROWTH_RATE;
			double newBugsVolume = newBugs*ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = totalBugVolume + newBugs;
			count++;
			
		}
		System.out.println("Starting with a roach population of : " + (int)firstRoachNum);
		System.out.println("and a house with a volume of " + (int)houseVolume+ " feet.");
		System.out.println("after " + count + " weeks,");
		System.out.println("the house will be filled with " + (int)population+" roaches.");
		System.out.println("They will fill a volume of " + (int)totalBugVolume+" cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
		

	}

}
