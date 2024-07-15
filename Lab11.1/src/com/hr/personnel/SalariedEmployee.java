package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

import static gov.irs.TaxPayer.SALARIED_TAX_RATE;

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

    @Override
    public void pay(){
        System.out.printf(getName() + " is paid salary $%.2f\n", getSalary());
    }

    @Override //interface TaxPayer
    public void payTaxes(){
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + " paid salaried taxes of " + taxes);
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + ", salary = %.2f%n", getSalary());
    }
}