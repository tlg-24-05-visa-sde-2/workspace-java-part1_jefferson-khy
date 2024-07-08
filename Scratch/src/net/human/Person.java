package net.human;

import java.time.LocalDate;

/*
 * An immutable class.
 *
 * class definition written in such a way that instance of it (person objects)
 * once created cannot have their properties changed
 * there are simply no public methods to do so, ie getters, but NO setters.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * This is the period of time between the birthdate and todays date
     * this is a derived property it is calculated from existing data not a new field
     */
    public int age() {
       int currentAge = LocalDate.now().getYear() - birthDate.getYear();
       return currentAge;
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString(){
        return String.format("Person: name = %s, birthDate: %s", name(), birthDate());
    }
}