package se254.a4.t3;

/**
 * This class represents a polishing machine and has methods to give
 * the capability of the polishing machine as well as the machine's
 * cost per unit of electricity
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020
 * 
 * This class extends the Machine class in order to reduce code
 * duplication through the Job class.
 *
 */
public class PolishingMachine extends Machine {

	public int getCapability() {
		// capability defines the efficiency of polisher calculated out of 100
		return 82; 
	}

	public double costPerUnitElectricity() {
		// cost per unit of electricity consumed by the polisher
		return 4.5;
	}
	
}
