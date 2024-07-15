package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;
    private double hours;
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public void pay(){
        System.out.printf(getName() + " is paid hourly $%.2f\n", (getRate() * getHours()));
    }

    @Override
    public void payTaxes(){
        double taxes = getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " paid hourly taxes of " + taxes);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + ", rate = %.2f, hours = %.2f%n", getRate(), getHours());
    }
}