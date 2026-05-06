/*
 * Name: Dylan Hardin
 * Professor: Dole
 * Program: Reads double values from an input file, sorts them,
 *          and writes the sorted values to an output file.
 */

import java.io.*;
import java.util.*;

public class FileSorter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for file names
        System.out.print("Please enter the input file: ");
        String inputFileName = keyboard.nextLine();

        System.out.print("Please enter the output file: ");
        String outputFileName = keyboard.nextLine();

        try {
            // First pass: count how many numbers are in the file
            File inputFile = new File(inputFileName);
            Scanner fileScanner = new Scanner(inputFile);

            int count = 0;
            while (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
                count++;
            }
            fileScanner.close();

            // Create array of correct size
            double[] numbers = new double[count];

            // Second pass: read numbers into array
            fileScanner = new Scanner(inputFile);
            int index = 0;
            while (fileScanner.hasNextLine()) {
                numbers[index] = Double.parseDouble(fileScanner.nextLine());
                index++;
            }
            fileScanner.close();

            // Sort the array
            Arrays.sort(numbers);

            // Write sorted numbers to output file
            PrintWriter writer = new PrintWriter(outputFileName);
            for (double num : numbers) {
                writer.println(num);
            }
            writer.close();

            System.out.println(outputFileName + " created successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in file.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

        keyboard.close();
    }
}
