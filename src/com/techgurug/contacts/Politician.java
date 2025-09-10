package com.techgurug.contacts;

/*
Author: Sankareeswaran Alagarsamy
Email: sankarees@gmail.com
Document: Refer README.md file
github: https://github.com/sankarees
 */
public class Politician extends Person {
    private final String party;
    private final String position;

    public Politician(String firstName, String lastName, int age, String phoneNumber, String party, String position) {
        super(firstName, lastName, age, phoneNumber);
        this.party = party;
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Politician: " + firstName + " " + lastName + ", Age: " + age +
                ", Phone: " + phoneNumber + ", Party: " + party + ", Position: " + position);
    }
}