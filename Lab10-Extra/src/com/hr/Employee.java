package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * OPTION 4: try catch throw differnet one back at my client
     * we nest or wrap the low level transportation oriented exception
     * into a high-level, business-oriented, workException, part of my HR packages
     */
    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Audi", "A4 Quattro");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);//include nested cause
        }
        finally {
            c.stop();
        }
    }

    /*
     * OPTION 3: try catch, react / respond in some way,
     * then rethrow the exception back to my client.
     */
   /* public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "Audi", "A4 Quattro");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // use the java mail api to send an email to lisa Herbold, complaining
            throw e;
        }
        finally {
            c.stop();
        }
    }*/

    /*
     * OPTION 2: "punt, " i.e., ignore the exception, we are not dealing with it
     *
     */
   /* public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "Audi", "A4 Quattro");
        try {
            c.start();
            c.moveTo("West Seattle");
        }
       finally {
            c.stop();
        }
    }*/

    /*
     * OPTION 1 try - catch and handle
     * NOTE: it is critical that stop() get called, no matter what
     */
    /*public void goToWork() {
        Car c = new Car("ABC123", "Audi", "A4 Quattro");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println(e);   //toString() automatically called
        }
        finally {
            c.stop();
        }
    }*/

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}