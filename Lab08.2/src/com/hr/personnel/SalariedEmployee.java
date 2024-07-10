package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
         setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return String.format("Salary employee: name = %s, hireDate = %s, salary = %.2f", getName(), getHireDate(), getSalary());
    }
}