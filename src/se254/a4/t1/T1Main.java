package se254.a4.t1;

/**
 * SE254 Assignment 4 Task 1 Main - Instructions
 * 
 * This class should be implemented to accept the user input through args[] and
 * delegate the reflection functionality to class Reflector.
 * 
 * You may implement additional classes if you wish, but this class should be
 * the main program entry point.
 * 
 * You must STAGE, COMMIT and PUSH your changes everytime you are "done" (see
 * the "definition of done" in Agile/Scrum/XP) with writing/changing this class,
 * i.e. after successfully completing Task 1, Task 2 and Task 3, respectively
 * You may COMMIT and PUSH prematurely too i.e. before each task is completed,
 * but you "must" COMMIT and PUSH to the remote repo after finishing each of the
 * A4 tasks.
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 24/10/2020
 */

public class T1Main {

	/**
	 * Main program method to pass the input class to the reflector
	 * @param args the input class
	 */
	public static void main(String[] args) {
		String inputString = args[0];

		try {
			// find the class corresponding to the string and pass
			// it to the reflector, then call reflect
			Class<?> inputClass = Class.forName(inputString);
			Reflector reflector = new Reflector(inputClass);
			reflector.reflect();
		} catch (ClassNotFoundException e) {
			System.out.println("Error: invalid class entered");
			e.printStackTrace();
		}
	}
}
