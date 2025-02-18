package Reflection.IntermediateLevel;

import java.lang.reflect.Method;
import java.util.Scanner;

// DynamicMethodInvocation class definition
public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char operation;

        while(true) {
            try {
                System.out.println("Enter the type of operation you want: (+, -, *) ");
                operation = input.next().charAt(0);
                break;
            } catch (RuntimeException e) {
                System.out.println("Enter in character format only!");
            }
        }

        MathOperation obj = new MathOperation();
        Class<?> cls = MathOperation.class;
        Method method;
        int result;

        switch (operation) {
            case '+' :
                method = cls.getMethod("add", int.class, int.class);
                method.setAccessible(true);
                result = (int)method.invoke(obj, num1, num2);
                System.out.println("Result of the addition is: " + result);
                break;
            case '-' :
                method = cls.getMethod("subtract", int.class, int.class);
                method.setAccessible(true);
                result = (int)method.invoke(obj, num1, num2);
                System.out.println("Result of the addition is: " + result);
                break;
            case '*':
                method = cls.getMethod("multiply", int.class, int.class);
                method.setAccessible(true);
                result = (int)method.invoke(obj, num1, num2);
                System.out.println("Result of the addition is: " + result);
                break;
            default :
                System.out.println("Invalid operation. Try Again!");
        }
    }
}

// MathOperation class definition
class MathOperation {
    // Add method declaration
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract method declaration
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiple method declaration
    public int multiply(int a, int b) {
        return a * b;
    }
}