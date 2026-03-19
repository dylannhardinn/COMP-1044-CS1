// Name: Dylan Hardin
// Professor: Dole
// Date: March 18, 2026

import java.util.Scanner;

public class MethodLab {

    // Method to print greeting
    public static void PrintGreeting() {
        System.out.println("Hello, and welcome to my program!");
    }

    // Method to print encouragement
    public static void PrintEncouragement() {
        System.out.println("You can do it! Keep pushing forward and never give up!");
    }

    // Method to print Bible verse
    public static void PrintBibleVerse() {
        System.out.println("Jeremiah 29:11 \"For I know the plans I have for you,\" declares the Lord,");
        System.out.println("\"plans to prosper you and not to harm you, plans to give you hope and a future.\"");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        // Loop until user chooses to quit
        while (choice != 4) {

            System.out.println("\nHello, please select from the following options:");
            System.out.println("1. Greeting Message");
            System.out.println("2. Encouragement Message");
            System.out.println("3. Bible Verse");
            System.out.println("4. Quit");
            System.out.print("Which do you choose? ");

            choice = input.nextInt();

            if (choice == 1) {
                PrintGreeting();
            } 
            else if (choice == 2) {
                PrintEncouragement();
            } 
            else if (choice == 3) {
                PrintBibleVerse();
            } 
            else if (choice == 4) {
                System.out.println("Goodbye!");
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}
