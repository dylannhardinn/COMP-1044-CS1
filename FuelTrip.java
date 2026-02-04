// Dylan Hardin  
// February 4, 2026  
// Programming 1  
// This program estimates how much gas a user will need for a road trip
// and calculates the total fuel cost.

import java.util.Scanner;

public class FuelTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the distance of your trip (miles): ");
        double distance = input.nextDouble();

        System.out.print("Enter your car's fuel efficiency (miles per gallon): ");
        double mpg = input.nextDouble();

        System.out.print("Enter the cost of gas per gallon: ");
        double costPerGallon = input.nextDouble();

        // Calculate gallons needed and total cost
        double gallonsNeeded = distance / mpg;
        double totalCost = gallonsNeeded * costPerGallon;

        // Display results
        System.out.println();
        System.out.printf("You will need approximately %.1f gallons of gas.%n", gallonsNeeded);
        System.out.printf("Your estimated fuel cost is $%.2f%n", totalCost);

        input.close();
    }
}
