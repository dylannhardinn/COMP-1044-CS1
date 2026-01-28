// Dylan Hardin 
// Programming 1 - Professor Dole
// 1/23/26 
// This program will print out name, favorite food, graduation year, 
// as well as message from future 

import java.util.Scanner; 

public class Future {
    public static void main(String[] args) { 

      Scanner input = new Scanner(System.in); 

      // Here is the welcome message 
      System.out.println("Welcome to the Java Time Capsule!"); 

      // Ask for name 
      System.out.println("What is your name? "); 
      String name = input.nextLine(); 

      // Ask for favorite food 
      System.out.println("What is your favorite food? "); 
      String food = input.nextLine(); 

      // Ask for graduation year 
      System.out.println("What year do you expect to graduate? "); 
      int gradYear = input.nextInt(); 

      // This is the output message from the future 
      System.out.println(); 
      System.out.println("Message from the future ") 
      System.out.println(); 
      System.out.println("Hello, " + name + "!"); 
      System.out.println(); 
      System.out.println("It is the year " + gradYear + ", and you are walking across the stage to receive your diploma!"); 
      System.out.println(); 
      System.out.println("Later today, you will be celebrating with a plate of " + food + "! !"); 
      System.out.println(); 
      System.out.println("Keep coding... The future you says Thank You!"); 

      input.close();
