package com.techgurug.contacts;

/*
Author: Sankareeswaran Alagarsamy
Email: sankarees@gmail.com
Document: Refer README.md file
github: https://github.com/sankarees
 */
public class Student extends Person {
    private final String studentId;
    private final String course;

    public Student(String firstName, String lastName, int age, String phoneNumber, String studentId, String course) {
        super(firstName, lastName, age, phoneNumber);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + firstName + " " + lastName + ", Age: " + age +
                ", Phone: " + phoneNumber + ", Student ID: " + studentId + ", Course: " + course);
    }
}