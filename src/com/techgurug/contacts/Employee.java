package com.techgurug.contacts;

/*
Author: Sankareeswaran Alagarsamy
Email: sankarees@gmail.com
Document: Refer README.md file
github: https://github.com/sankarees
 */
public class Employee extends Person {
    private final String employeeId;
    private final String department;

    public Employee(String firstName, String lastName, int age, String phoneNumber, String employeeId, String department) {
        super(firstName, lastName, age, phoneNumber);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: " + firstName + " " + lastName + ", Age: " + age +
                ", Phone: " + phoneNumber + ", Employee ID: " + employeeId + ", Department: " + department);
    }
}