// Import Scanner class to take input from the user
import java.util.Scanner;

// Import InputMismatchException to handle invalid input errors
import java.util.InputMismatchException;

// Define the Fibonacci class
class Fibonacci {

    // Recursive method to calculate Fibonacci number at position n
    static int fib(int n) {

        // Base case: if n is 0, return 0
        if (n == 0)
            return 0;

        // Base case: if n is 1, return 1
        else if (n == 1)
            return 1;

        // Recursive case: sum of previous two Fibonacci numbers
        else
            return fib(n - 1) + fib(n - 2);
    }

    // Main method where program execution starts
    public static void main(String args[]) {

        // Boolean variable to control the infinite loop
        boolean yes = true;

        // Integer flag used to decide whether to continue or exit
        int flag = 0;

        // Create Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Loop continues as long as user wants to continue
        while (yes) {

            try {
                // Prompt user to enter the number of Fibonacci terms
                System.out.print("Enter the number: ");

                // Read integer input from user
                int n = sc.nextInt();

                // Check if the entered number is invalid
                if (n <= 0) {

                    // Display message for invalid (non-positive) input
                    System.out.println("Please enter a positive integer.");

                } else {

                    // Print heading for Fibonacci series output
                    System.out.print("Fibonacci Series for the first " + n + " numbers:");

                    // Loop through numbers from 0 to n-1
                    for (int i = 0; i < n; i++) {

                        // Call recursive fib() method and print result
                        System.out.print(" " + fib(i));
                    }

                    // Move to the next line after printing series
                    System.out.println();
                }

                // Ask user whether they want to continue
                System.out.print("Type 1 to continue: ");

                // Read user's choice
                flag = sc.nextInt();

                // If user does not enter 1, exit the loop
                if (flag != 1) {
                    yes = false;
                }

            }
            // Catch block to handle invalid (non-integer) input
            catch (InputMismatchException e) {

                // Display error message
                System.out.println("Invalid input. Please enter integers only.");

                // Clear invalid input from scanner buffer
                sc.nextLine();
            }
        }

        // Close the Scanner object to free resources
        sc.close();
    }
}

