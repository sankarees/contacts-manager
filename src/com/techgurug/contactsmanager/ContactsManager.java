package com.techgurug.contacts;

/*
Author: Sankareeswaran Alagarsamy
Email: sankarees@gmail.com
Document: Refer README.md file
github: https://github.com/sankarees
 */
public class ContactsManager {
    public static void main(String[] args) {
        // Create multiple contacts
        Person employee = new Employee("Alice", "Smith", 30, "+91-9000000001", "EMP001", "Engineering");
        Person employee1 = new Employee("David", "Miller", 40, "+91-9000000004", "EMP002", "Marketing");
        Person student = new Student("Bob", "Johnson", 22, "+91-9000000002", "STU123", "Computer Science");
        Person student1 = new Student("Eva", "Green", 21, "+91-9000000005", "STU456", "Biology");
        Person politician = new Politician("Charlie", "Brown", 55, "+91-9000000003", "Democratic Party", "Senator");
        Person politician1 = new Politician("Frank", "White", 60, "+91-9000000006", "Republic Party", "Governor");

        // Dynamic method dispatch - polymorphism in action
        Person[] contacts = {employee, student, politician, employee1, student1, politician1};
        System.out.println("=== Displaying Contact Details ===");
        for (Person p : contacts) {
            p.displayInfo();
        }

        System.out.println("\n=== Displaying Full Details for Base Person ===");
        Person demo = new Person("Diana", "Prince", 28, "+91-9000000000");
        demo.displayInfo(true);
    }
}