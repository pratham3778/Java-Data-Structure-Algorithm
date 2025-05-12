// Exception is an unwanted , unexcpeted event that occurs when a program is executing disrupting the normal flow of intructions
// Exception is a subclass of Throwable class

// Exception are of two types : Checked E, Unchecked E
// Checked exception are also called as compile time exception - handled by compiler - IOException, ClassNotFoundException, SQLException, Error
// Unchecked exception are also called as runtime exception handled by user - ArithematicException, NullPointerException, ArrayIndexOutOfBoundException

// In Java, we use Try-Catch Block to handle handle Exceptions
// TRY - Code that might throw an exception is written here
// CATCH - Catches and handles specific exceptions(we can have mutiple catch block)
// FINALLY - Optional block that always runs, whether or not an exception occurred (used for clean up actions)


// try + catch	- can
// try + finally - can
// try + catch + finally - can
// try alone - cannot

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }

        // CUSTOM EXCEPTION - creates User defined excpetion to handle specific errors
        try {
            CustomException.checkEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

// Custom exception class (Checked Exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class with method that throws custom exception
class CustomException {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}
