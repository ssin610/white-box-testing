package se254.a4.t3;

/**
 * This class is the entry point for Task 3. 
 * 
 * The refactorings performed must not change the output of the main method. 
 * This can happen due to incorrect refactorings.
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020
 * 
 * You MUST NOT change this code.
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */

public class T3Main {

	public static void main(String[] args) {
		// define a floor
		Floor floor = new Floor();
		
		//Calculate the cleaning rent
		CleaningMachine cleaner = new CleaningMachine();
		CleaningJob cJob = new CleaningJob();
		System.out.println(cJob.cleaningRent(floor, cleaner));		
		
		//Calculate polishing rent
		PolishingMachine polisher = new PolishingMachine();
		PolishingJob pJob = new PolishingJob();
		System.out.println(pJob.polishingRent(floor, polisher));		
		
	}
}
