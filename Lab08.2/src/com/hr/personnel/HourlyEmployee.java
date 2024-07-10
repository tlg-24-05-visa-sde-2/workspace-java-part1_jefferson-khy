package com.hr.personnel;

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

    public String toString(){
        return String.format("Hourly employee: name = %s, hireDate = %s, rate = %.2f, hours = %.2f", getName(), getHireDate(), getRate(), getHours());
    }
}