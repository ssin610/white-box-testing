package se254.a4.t3;

/**
 * This class represents a floor and has methods to return different
 * properties of the floor i.e its length, width, condition, and area
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020 
 *
 * The method getArea has been added to fix the code smell of feature envy. Previously,
 * Cleaningjob and PolishingJob were using the length and width of a Floor object when
 * calculating the floor area, rather than having the Floor object calculate and return
 * the area. These other classes using the length and width methods of the Floor class 
 * to perform calculations is feature envy, and now allowing the Floor object to perform
 * the area calculation means this feature envy is no longer present.
 * 
 */

public class Floor {

	public int length() {
		// length of the floor
		return 21;
	}

	public int width() {
		// width of the floor
		return 45;
	}

	public int getCondition() {
		// Current condition of the floor rated on the scale of 1 (worst) to 10 (best)
		return 5;
	}

	public int getArea() {
		// calculate and return the area of the floor
		return length() * width();
	}
}
