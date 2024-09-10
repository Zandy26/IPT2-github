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

	   // Method for Modulus
    public int modulus(int a, int b) {
        return a % b;
    }
	

	  // Main method to test the calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        System.out.println("Modulus: " + calc.modulus(10, 5));
    }







}