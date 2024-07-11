package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee{
    //constructors
    public Executive() {
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    //business methdos
    @Override
    public void work(){
        System.out.printf("%s is enjoying a nice round of golf%n", getName());
    }
}