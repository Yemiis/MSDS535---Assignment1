// Import Scanner to read user input
import java.util.Scanner;

// Import Random to generate random numbers
import java.util.Random;

// Import InputMismatchException to handle invalid input errors
import java.util.InputMismatchException;

// Define the Calculator class
class Calculator {

    // Main method where program execution begins
    public static void main(String[] args) {

        // Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // String variable to store user's menu option
        String option;

        // Variables to store user input numbers and result
        double number1, number2, result = 0.0;

        try {
            // Display calculator menu
            System.out.println("1. Addition.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.println("5. Maximum.");
            System.out.println("6. Minimum.");
            System.out.println("7. Random.");

            // Ask user to choose an option
            System.out.print("Choose an option from above: ");
            option = sc.next();

            // Ask user to enter the first number
            System.out.print("Enter first number: ");
            number1 = sc.nextDouble();

            // Ask user to enter the second number
            System.out.print("Enter second number: ");
            number2 = sc.nextDouble();

            // Switch-case to perform operation based on user option
            switch (option) {

                // Perform addition
                case "1":
                    result = number1 + number2;
                    System.out.println("Addition: " + number1 + " + " + number2 + " = " + result);
                    break;

                // Perform subtraction
                case "2":
                    result = number1 - number2;
                    System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + result);
                    break;

                // Perform multiplication
                case "3":
                    result = number1 * number2;
                    System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + result);
                    break;

                // Perform division
                case "4":
                    if (number2 == 0) {
                        // Handle division by zero
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = number1 / number2;
                        System.out.println("Division: " + number1 + " / " + number2 + " = " + result);
                    }
                    break;

                // Compute maximum
                case "5":
                    result = Math.max(number1, number2);
                    System.out.println("Maximum Number is: " + result);
                    break;

                // Compute minimum
                case "6":
                    result = Math.min(number1, number2);
                    System.out.println("Minimum Number is: " + result);
                    break;

                // Generate random number between two numbers
                case "7":
                    int low = (int) Math.min(number1, number2);
                    int high = (int) Math.max(number1, number2);
                    Random rand = new Random();
                    int randomNum = rand.nextInt(high - low + 1) + low;
                    System.out.println("Random Number between " + number1 + " and " + number2 + " is: " + randomNum);
                    break;

                // Handle invalid menu option
                default:
                    System.out.println("Invalid option. Please choose between 1 and 7.");
            }

        }
        // Catch block for invalid (non-numeric) input
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }
        // Finally block to close Scanner
        finally {
            sc.close();
        }
    }
}

