import java.util.Scanner;

public class Calculator {

    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();


        System.out.println("\nSelect operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

    
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calc.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calc.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calc.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calc.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}