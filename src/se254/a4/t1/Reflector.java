package se254.a4.t1;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * SE254 Assignment 4 Task 1 Reflector - Instructions
 * 
 * This class should be implemented to contain the reflection functionality
 * described in the assignment hand-out. This class must be called by T1Main for
 * executing the desired reflection for a given class e.g. class Counter. * All
 * changes required for Task 1 must be performed on a new branch named
 * "T1Branch". You can create this new branch from our IDE.
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 24/10/2020
 */

public class Reflector {

    private Class<?> _inputClass;
    private Object _object;
    private Map<Integer, Method> map = new HashMap<Integer, Method>(); // map each method to a number for the
                                                                       // user to select

    /**
     * Creates a Reflector instance with a class for reflection and creates an
     * instance of the input class
     * 
     * @param inputClass the class for reflection
     */
    public Reflector(Class<?> inputClass) {
        _inputClass = inputClass;
        // create an instance of the input class
        try {
            _object = _inputClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            System.out.println("Error: Could not instantiate the class");
        } catch (IllegalAccessException e) {
            System.out.println("Error: Could not access the class");
        } catch (InvocationTargetException e) {
            System.out.println("Error: Could not construct object");
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Could not construct object");
        }
    }

    /**
     * Does reflection on the input class by calling methods to print the fields and
     * methods of the class. Also takes in user input for which method to invoke on
     * the object
     */
    public void reflect() {
        int num = -1; // variable to track the user input

        System.out.println(
                "==============================================================================================================");
        // check if user has pressed 0 to quit
        while (num != 0) {

            // call method to print fields
            try {
                printFields();
            } catch (IllegalAccessException e) {
                System.out.println("Error: Could not access the fields");
            }

            // call method to print methods of the class
            printMethods();

            // get user input for which method to invoke
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number corresponding to the method you want to execute. Enter 0 to quit: ");
            num = sc.nextInt();
            System.out.println(
                    "==============================================================================================================");

            // check if user has pressed 0 to quit
            if (num == 0) {
                break;
            }

            // invoke the method specified by the user
            try {
                invokeMethod(num);
            } catch (IllegalAccessException e) {
                System.out.println("Error: Could not access the method");
            } catch (InvocationTargetException e) {
                System.out.println("Error: Could not invoke the method");
            }
        }
    }

    /**
     * This method prints the public fields and their corresponding values for the
     * input class
     */
    public void printFields() throws IllegalArgumentException, IllegalAccessException {

        for (Field f : _inputClass.getFields()) {
            System.out.println("Field name = " + f.getName() + ", Field value = " + f.get(_object));
        }
    }

    /**
     * This method prints the public methods which take no parameters for the input
     * class
     */
    public void printMethods() {
        int count = 1;

        for (Method m : _inputClass.getDeclaredMethods()) {
            if (m.getParameterTypes().length == 0 && m.getModifiers() == Modifier.PUBLIC) {
                map.put(count, m);
                System.out.println(count + ". Method = " + m);
                count++;
            }
        }
    }

    /**
     * This method invokes a method specified by the user on the object of the input
     * class
     * @param num the number corresponding to the method
     */
    public void invokeMethod(int num)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        map.get(num).invoke(_object);
    }
}