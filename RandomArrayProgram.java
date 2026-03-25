// Name: Dylan Hardin
// Date: March 24, 2026
// Program: Random Array Program
// Description:
// This program asks the user how many random numbers to generate (between 1 and 100).
// It then creates an array of double values and fills it with random numbers using a formula.
// The program displays all the generated numbers, calculates their sum,
// and then calculates and displays the average of those numbers.

import java.util.Scanner;

public class RandomArrayProgram {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Ask user for how many numbers (1-100)
        System.out.print("How many random numbers do you want to generate (1-100)? ");
        int count = input.nextInt();
        
        // Validate input
        while (count < 1 || count > 100) {
            System.out.print("Invalid input. Enter a number between 1 and 100: ");
            count = input.nextInt();
        }
        
        // Create array
        double[] numbers = new double[count];
        
        // Generate random numbers and store in array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 1000.0 + 17.5;
        }
        
        // Display all numbers
        System.out.println("\nGenerated Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // Calculate sum
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        
        // Calculate average
        double average = sum / numbers.length;
        
        // Display results
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        
        input.close();
    }
}
