// Dylan Hardin  
// 02/11/2026  
// Program 1 - Professor Dole  
// This program asks the user to enter scores for homework, two exams, and a final,
// calculates the weighted final grade, and then displays both the numeric grade
// and the corresponding letter grade.

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Homework  : ");
        double homework = input.nextDouble();

        System.out.print("Enter Exam 1    : ");
        double exam1 = input.nextDouble();

        System.out.print("Enter Exam 2    : ");
        double exam2 = input.nextDouble();

        System.out.print("Enter Final     : ");
        double finalExam = input.nextDouble();

        // Calculate weighted final grade
        double finalGrade = (homework * 0.40) +
                            (exam1 * 0.20) +
                            (exam2 * 0.20) +
                            (finalExam * 0.20);

        System.out.printf("Final Grade is: %.2f%n", finalGrade);

        // Determine letter grade
        if (finalGrade >= 90) {
            System.out.println("Your grade is an A!");
        } 
        else if (finalGrade >= 80) {
            System.out.println("Your grade is a B!");
        } 
        else if (finalGrade >= 70) {
            System.out.println("Your grade is a C!");
        } 
        else if (finalGrade >= 60) {
            System.out.println("Your grade is a D!");
        } 
        else {
            System.out.println("Your grade is an F!");
        }

        input.close();
    }
}
