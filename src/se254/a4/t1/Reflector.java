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

    /**
     * Creates a Reflector instance with a class for reflection
     * @param inputClass the class for reflection
     */
    public Reflector(Class<?> inputClass) {
        _inputClass = inputClass;
    }

    /**
     * Does reflection on the input class by accessing methods/fields and also takes
     * user input for which method to execute
     */
    public void reflect() {
        int num = -1; // variable to track the user input
        Map<Integer, Method> map = new HashMap<Integer, Method>(); // map each method to a number for the
                                                                   // user to select

        try {
            // create an instance of the input class
            Object object = _inputClass.getDeclaredConstructor().newInstance();
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            // check if user has pressed 0 to quit
            while (num != 0) {
                int count = 1;

                // list the fields and methods of the class, where each method has a number
                // corresponding to it
                for (Field f : _inputClass.getFields()) {
                    System.out.println("Field name = " + f.getName() + ", Field value = " + f.get(object));
                }
                
                // assuming only methods declared in the class are listed
                for (Method m : _inputClass.getDeclaredMethods()) {
                    if (m.getParameterTypes().length == 0) {
                        map.put(count, m);
                        System.out.println(count + ". Method = " + m);
                        count++;
                    }
                }
            
                Scanner sc = new Scanner(System.in);
                // get user input
                System.out.print("Enter the number corresponding to the method you want to execute. Enter 0 to quit: ");
                num = sc.nextInt();
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                // invoke the method on the object
                if (num == 0) {
                    break;
                }
                map.get(num).invoke(object);
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException
                | NoSuchMethodException e1) {
            e1.printStackTrace();
        }
    }
}