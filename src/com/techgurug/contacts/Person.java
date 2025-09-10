package com.techgurug.contacts;

/*
Author: Sankareeswaran Alagarsamy
Email: sankarees@gmail.com
Document: Refer README.md file
github: https://github.com/sankarees
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String phoneNumber;

    public Person(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Person: " + firstName + " " + lastName + ", Age: " + age + ", Phone: " + phoneNumber);
    }

    public void displayInfo(boolean showFullDetails) {
        if (showFullDetails) {
            System.out.println("Person Details [Full]: Name: " + firstName + " " + lastName + ", Age: " + age + ", Phone: " + phoneNumber);
        } else {
            displayInfo();
        }
    }
}