package net.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Jeff", LocalDate.of(1993,06,15));

        System.out.printf("%s is %s years old%n", p1.name(), p1.age());
        System.out.println(p1);
        System.out.println();

        PersonRecord p2 = new PersonRecord("Martina", LocalDate.of(1993,06,15));
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());
        System.out.println(p2);
    }
}