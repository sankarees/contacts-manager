# Contacts-Manager

A **Java project demonstrating polymorphism** through a contacts management system. The project uses a parent class `Person` and child classes `Employee`, `Student`, `Politician` to show dynamic behavior.

## 🧱 Classes

- **Person** (Parent Class)  
  Parameters: firstName, lastName, age, phoneNumber  
  Methods: displayInfo(), displayInfo(boolean showFullDetails)

- **Employee** (Child Class)  
  Parameters: inherits Person + employeeId, department  
  Overrides displayInfo() to show employee-specific details

- **Student** (Child Class)  
  Parameters: inherits Person + studentId, course  
  Overrides displayInfo() to show student-specific details

- **Politician** (Child Class)  
  Parameters: inherits Person + party, position  
  Overrides displayInfo() to show politician-specific details

## ⚡ Polymorphism Used
- **Method Overriding**: Child classes override displayInfo() of Person.  
- **Method Overloading**: displayInfo(boolean) in Person class.  
- **Dynamic Dispatch**: At runtime, Java calls the correct overridden method based on actual object type.

## 🎯 Use Case
A contacts management system where different types of people (employees, students, politicians) are stored in a single array and displayed according to their roles. Demonstrates polymorphism for **real-world object management**.

## 🛠️ How to Run
```bash
javac src/com/example/contactsmanager/*.java
java -cp src com.techgurug.contacts.ContactsManager
```

## 👨‍🏫 Author / Demo Contact
**Sankareeswaran Alagarsamy**  
Email: sankarees@gmail.com  
WhatsApp: +91-9080262550  
GitHub: https://github.com/sankarees  
LinkedIn: www.linkedin.com/in/sankareeswaran-alagarsamy-115574356  

## 🔖 Hashtags
#Java #OOP #Polymorphism #ContactsManager #SoftwareDevelopment #IT #JavaProgramming #CareerProjects #OpenSource #Learning