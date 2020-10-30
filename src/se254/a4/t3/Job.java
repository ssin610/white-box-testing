package se254.a4.t3;

/**
 * This class represents a job and has a method to calculate and return the rent of a machine
 * on a floor
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020
 *
 * This abstract class gets extended by PolishingJob and CleaningJob. There is a single
 * method to calculate the rent of a machine for the floor.
 * 
 * Having a single method to calculate rent fixes the code smell of code duplication, as previously
 * code was being duplicated in CleaningJob and PolishingJob's rent methods, but now only one
 * method is needed for both types of machines
 * 
 * The Floor object now calculates the floor area within its own class, rather than job classes
 * calling length and width in order to calculate area. This eliminates the previously present
 * feature envy
 * 
 */
public abstract class Job {

    public double getRent(Floor floor, Machine machine) {
		double electricityPerUnitArea = floor.getCondition() * machine.getCapability();
		double energyConsumption = electricityPerUnitArea * floor.getArea();
		return energyConsumption * machine.costPerUnitElectricity();
    }
    
}
