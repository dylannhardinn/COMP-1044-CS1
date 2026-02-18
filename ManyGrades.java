/*
Name: Dylan Hardin
Date: 02/18/2026
Class: Programming 1 - Professor Dole
Description: This program calculates the average of multiple grades
and determines the corresponding letter grade.
*/

import java.util.Scanner;

public class ManyGrades {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Ask how many grades the user has
        System.out.print("How many grades do you have? ");
        int numberOfGrades = input.nextInt();

        // Step 3: Set up variables
        double total = 0.0;
        int counter = 1;

        // Step 4: Use while loop to collect grades
        while (counter <= numberOfGrades) {
            System.out.print("Please enter grade " + counter + ": ");
            double grade = input.nextDouble();

            total = total + grade;
            counter++;
        }

        // Step 5: Calculate average
        double average = total / numberOfGrades;

        // Step 6: Determine letter grade
        String letterGrade;

        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Step 7: Display results
        System.out.println();
        System.out.println("Your average is: " + average);
        System.out.println("Your grade is a " + letterGrade + "!");

        // Step 8: Close scanner
        input.close();
    }
}
