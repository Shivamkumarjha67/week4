package Reflection.BasicLevel;

import java.lang.reflect.Field;

public class AccessPrivateFields {
    public static void main(String[] args) throws Exception {
        // Creating the object of a person class
        Person yuvi = new Person(33);
        // getting the reference of the person class
        Class<?> cls = Person.class;

        // Getting the field of the Person class named age
        Field field = cls.getDeclaredField("age");
        // Allowing the access to the field for modification
        field.setAccessible(true);
        // Printing the field value by passing the created object
        System.out.println("Age of person before is: " + field.get(yuvi));
        // Modifying the field value
        field.set(yuvi, 45);
        // Printing the result after modification
        System.out.println("Age of person after modification is: " + field.get(yuvi));
    }
}

// Person class definition
class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }
}
