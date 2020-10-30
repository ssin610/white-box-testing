package se254.a4.t3;

/**
 * This class represents a cleaning job
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020 
 * 
 * The cleaningRent method now calls the parent getRent method.
 * This fixes the previous code duplication present in this class and
 * in PolishingJob, as now the duplicated code is in a single method
 * getRent in the parent class Job
 *
 */

public class CleaningJob extends Job {
	
	// The method inputs the floor and cleaner objects and
    // calculates the energy consumption cost for cleaning the floor area
	double cleaningRent(Floor floor, CleaningMachine cleaner) {
		return getRent(floor, cleaner);
	}	
}
