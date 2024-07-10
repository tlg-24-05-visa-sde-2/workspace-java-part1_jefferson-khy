/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1250.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 50.0, 40.0));
        dept.addEmployee(new SalariedEmployee("Logan", LocalDate.of(2000, 8, 24), 30000.00));
        dept.addEmployee(new HourlyEmployee("Amilia", LocalDate.of(2000, 2, 2), 15.0, 30.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all employees
        System.out.println("\npay all employees:");
        dept.payEmployees();

        //forced holidary break
        System.out.println("\nHoliday break:");
        dept.holidayBreak();
    }
}