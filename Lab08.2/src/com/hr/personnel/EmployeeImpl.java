package com.hr.personnel;

import java.time.LocalDate;

class EmployeeImpl extends Employee {

    public EmployeeImpl() {
    }

    public EmployeeImpl(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
}