package se254.a4.t3;

/**
 * This class represents a cleaning machine and has methods to give
 * the capability of the cleaning machine as well as the machine's
 * cost per unit of electricity
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020
 *
 * This class extends the Machine class in order to reduce code
 * duplication through the Job class.
 * 
 */

public class CleaningMachine extends Machine {

	public int getCapability() {
		// capability defines the efficiency of cleaner
		return 65; 
	}

	public double costPerUnitElectricity() {
		// cost per unit of electricity consumed by the cleaner
		return 4.0;
	}
}
