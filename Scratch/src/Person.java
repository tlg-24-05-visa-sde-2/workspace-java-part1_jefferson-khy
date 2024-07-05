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

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString(){
        return String.format("Person: name = %s, birthDate: %s", getName(), getBirthDate());
    }
}