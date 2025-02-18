package Reflection.IntermediateLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// RetrieveAnnotationAtRuntime class definition
public class RetrieveAnnotationAtRuntime {
    // Main method definition
    public static void main(String[] args) throws Exception {
        // Test class object declaration
        Test obj = new Test();
        // Getting the Test class reference
        Class<?> cls = obj.getClass();

        // Method reference of the class
        Method method = cls.getMethod("myMethod");

        // Checking the annotation present on method or not
        if(method.isAnnotationPresent(Custom.class)) {
            Custom annotation = method.getAnnotation(Custom.class);
            System.out.println("Annotation value: " + annotation.name());
        }

        // Invoking the reference method
        method.invoke(obj);
    }
}

// Defining the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom {
    String name();
}

// Test class definition
class Test {
    // Custom annotation applied to the method
    @Custom(name = "Custom annotation invoked!")
    public void myMethod() {
        System.out.println("My method invoked...");
    }
}