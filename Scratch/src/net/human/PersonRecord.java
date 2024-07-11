package net.human;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {

    public int age(){
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }
}
