// Dylan Hardin  
// 02/11/2026  
// Program 1 - Professor Dole  
// This program asks the user to enter scores for homework, two exams, and a final,
// then calculates and displays the weighted final grade based on the syllabus.

import java.util.Scanner;

public class GradeCalculator {
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

        // Calculate weighted grade
        double finalGrade = (homework * 0.40) +
                            (exam1 * 0.20) +
                            (exam2 * 0.20) +
                            (finalExam * 0.20);

        System.out.printf("Final Grade is: %.2f%n", finalGrade);

        input.close();
    }
}
