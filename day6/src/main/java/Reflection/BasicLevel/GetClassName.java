package Reflection.BasicLevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// GetClassName definition
public class GetClassName {
    // Main method definition
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // Checker class object declaration
        Checker checker = new Checker();
        // Retrieves the class object
        Class<?> cls = Checker.class;
        // Printing the class details
        System.out.println("Name of the class is: " + cls.getName());

        // Getting the detail of declared field, data
        Field field = cls.getDeclaredField("data");
        // Allowing the access
        field.setAccessible(true);
        // printing by accessing the private member
        System.out.println("Accessing from outside, data is: " + field.get(checker));

        // Getting the details of the method
        Method method = cls.getDeclaredMethod("displayData");
        // Setting the accessibility to true
        method.setAccessible(true);
        // Invoking the method
        method.invoke(checker);

        // Getting the constructor of the declared class
        Constructor<?> constructor = cls.getDeclaredConstructor(int.class);
        // Creating the object of that class using that constructor access
        Checker obj = (Checker) constructor.newInstance(33);
        // Using object calling the method of the class
        obj.displayData();
    }
}

// Checker class definition
class Checker {
    // Field Declaration
    private int data = 45;

    // Default constructor
    Checker() {}

    // Parameterized constructor
    Checker(int data) {
        this.data = data;
    }

    // Displaying method for data
    void displayData() {
        System.out.println("Data is " + data);
    }
}