# Contacts-Manager Documentation

## 📚 Project Overview
Contacts-Manager is a Java project that demonstrates **Polymorphism** in a contacts management context. The system manages Employees, Students, and Politicians, all inheriting from a common Person class.

## 🧱 Classes Structure

### Person (Parent Class)
- Attributes: firstName, lastName, age, phoneNumber
- Methods: displayInfo(), displayInfo(boolean showFullDetails)

### Employee (Child Class)
- Attributes: employeeId, department
- Inherits from Person
- Overrides displayInfo() to show Employee-specific info

### Student (Child Class)
- Attributes: studentId, course
- Inherits from Person
- Overrides displayInfo() to show Student-specific info

### Politician (Child Class)
- Attributes: party, position
- Inherits from Person
- Overrides displayInfo() to show Politician-specific info

## 🔍 What is Polymorphism?
Polymorphism allows objects of different types to be accessed through a common interface. In this project:
- **Method Overriding** allows Employee, Student, Politician to define their own displayInfo().
- **Method Overloading** allows Person to have displayInfo(boolean) to show full details.

### Runtime Behavior
When iterating over Person[] contacts, each object's displayInfo() executes its **own version** based on the actual object type. This is **dynamic dispatch**.

## 🎯 Use Case
A contacts manager system that displays contacts according to roles without conditional checks. Demonstrates real-world usage of OOP and polymorphism.

## ⚡ Demo / Author
**Sankareeswaran Alagarsamy**  
Email: sankarees@gmail.com  
WhatsApp: +91-9080262550  
GitHub: https://github.com/sankarees  
LinkedIn: www.linkedin.com/in/sankareeswaran-alagarsamy-115574356  

## 📝 License
MIT License