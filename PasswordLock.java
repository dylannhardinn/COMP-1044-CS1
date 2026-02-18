/*
Name: Dylan Hardin
Date: 02/18/2026
Class: Programming 1 - Professor Dole
Description: This program simulates a safe with a random 4-digit pin.
The user has five attempts to guess the pin correctly.
The program tells the user if the guess is too high or too low.
*/

import java.util.Scanner;

public class PasswordLock {

    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Generate a random 4-digit pin (1000–9999)
        int pin = (int)(Math.random() * 9000) + 1000;

        int guess;          // Stores the user's guess
        boolean unlocked = false;  // Tracks whether the safe is unlocked

        // Loop gives the user 5 attempts
        for (int attemptsRemaining = 5; attemptsRemaining > 0; attemptsRemaining--) {

            System.out.print("You have " + attemptsRemaining +
                             " attempt(s) remaining. Please enter your pin: ");
            guess = input.nextInt();

            // Check if the guess matches the pin
            if (guess == pin) {
                System.out.println("Congratulations! The safe is unlocked!");
                unlocked = true;
                break;  // Exit loop immediately
            }
            else if (guess < pin) {
                System.out.println("Your pin is lower than that.");
            }
            else {
                System.out.println("Your pin is higher than that.");
            }

            System.out.println();  // Blank line for readability
        }

        // If the user did not unlock the safe
        if (!unlocked) {
            System.out.println("You have run out of attempts.");
            System.out.println("The safe remains locked.");
        }

        // Close Scanner
        input.close();
    }
}
