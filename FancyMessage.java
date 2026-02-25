// Name: Dylan Hardin
// Date: February 25, 2026
// Professor: Professor Dole
// Program Description:
// This program asks the user to enter a sentence.
// It converts the sentence to all capital letters and displays it diagonally.
// Each character is printed on its own line with increasing spaces in front
// of it for positioning. This program uses loops and only System.out.print
// and System.out.println as required.

import java.util.Scanner;

public class FancyMessage {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask user to enter a message
        System.out.print("Please Enter a Message: ");
        String message = input.nextLine();

        // Convert message to uppercase
        message = message.toUpperCase();

        // Loop through each character in the message
        for (int i = 0; i < message.length(); i++) {

            // Print spaces for diagonal positioning
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }

            // Print the current character
            System.out.println(message.charAt(i));
        }

        // Close the scanner
        input.close();
    }
}
