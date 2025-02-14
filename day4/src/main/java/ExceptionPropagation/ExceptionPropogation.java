package ExceptionPropagation;

public class ExceptionPropogation {

    //method1(): Throws an ArithmeticException (10 / 0).
    public static void method1() throws ArithmeticException {
        int a = 10 / 0;
    }

    //method2(): Calls method1().
    public static void method2() throws ArithmeticException {
        method1();
    }

    public static void main(String[] args) {

        //  main method Calls method2() and handles the exception.
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled Exception in main.");
        }
    }
}
