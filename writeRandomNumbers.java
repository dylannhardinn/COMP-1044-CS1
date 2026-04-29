/*
Name: Dylan Hardin
Professor: Dole
Date: April 29, 2026
Assignment: Write Random Numbers to File
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Prompt user for file name
            System.out.print("Please enter the name of the file you want to create: ");
            String fileName = input.nextLine();

            // Prompt user for number of random numbers
            System.out.print("How many random numbers do you want? ");
            int count = input.nextInt();

            // Create FileWriter
            FileWriter writer = new FileWriter(fileName);

            // Generate and write random numbers
            for (int i = 0; i < count; i++) {
                double randomNumber = Math.random() * 1000.0;
                writer.write(randomNumber + "\n");
            }

            // Close the file
            writer.close();

            // Confirmation message
            System.out.println("File " + fileName + " created");

        } catch (IOException e) {
            System.out.println("Error: Unable to create or write to the file.");
        }

        input.close();
    }
}
