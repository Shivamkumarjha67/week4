package ThrowVsThrows;

public class ThrowVsThrowsHandling {
    //Create a method calculateInterest(double amount, double rate, int years)

    public static double calculateInterest(double amount, double rate, int years) {
        //Throws IllegalArgumentException if amount or rate is negative.
        // Validate inputs
        if (amount < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive.");
        }

        // Calculate and return the interest
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        // example amount rate and years
        int amount = -923;
        int rate = 20;
        int years = 200;

        // try block to handle exception
        try {
            System.out.println(calculateInterest(amount, rate, years));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
