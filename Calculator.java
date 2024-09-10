public class Calculator {

	 // Method for Addition
    public int add(int a, int b) {
        return a + b;
    }

	 // Method for Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

	  // Method for Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }	


    // Method for Division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }












}