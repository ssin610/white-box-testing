package se254.a4.t3;

/**
 * This class represents a machine and has methods to give the capability of the
 * machine as well as the machine's cost per unit of electricity
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020
 *
 * This abstract class gets extended by PolishingMachine and
 * CleaningMachine. This allows the Job class to take Machine as a parameter
 * when calculating the rent of a machine, meaning only a single method is 
 * needed for calculating rent for both types of machines. This reduces code duplication,
 * as code was previously being duplicated in PolishingJob and CleaningJob's rent methods 
 * 
 */
public abstract class Machine {

    /**
	 * This method gets the capability of a machine
	 * @return the capability
	 */
    public abstract int getCapability();

    /**
	 * This method gets the cost per unit of electricity
     * of the machine
	 * @return the cost
	 */
    public abstract double costPerUnitElectricity();

}
