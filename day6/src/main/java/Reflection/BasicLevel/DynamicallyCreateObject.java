package Reflection.BasicLevel;

import java.lang.reflect.Constructor;

// DynamicallyCreateObject class definition
public class DynamicallyCreateObject {
    // Main method
    public static void main(String[] args) throws Exception {
        // Getting the reference of the student class
        Class<?> cls = Student.class;
        // Getting the constructor of class
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
        // Using the constructor, creating the object dynamically
        Student student = (Student) constructor.newInstance("Shivam");
        // Displaying the details of the created object
        student.displayDetails();
    }
}


//Student class definition
class Student {
    // Attribute
    private String name;

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }

    // Method for displaying the details
    public void displayDetails() {
        System.out.println("Name of the student is: " + name);
    }
}
