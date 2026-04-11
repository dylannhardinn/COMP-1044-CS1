/*
Name: Dylan Hardin
Professor: Dole
Date: April 8

Program Description:
This program creates a class called ClassExperiment.
It models a VideoGameCharacter with attributes such as name, health, and level.
The program asks the user to input information for two characters.
It then demonstrates methods like attack and heal, and displays updated stats.
*/

import java.util.Scanner;

public class ClassExperiment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create two VideoGameCharacter objects
        VideoGameCharacter character1 = new VideoGameCharacter();
        VideoGameCharacter character2 = new VideoGameCharacter();

        // ===== INPUT FOR CHARACTER 1 =====
        System.out.println("Enter name for character 1:");
        character1.name = input.nextLine();

        System.out.println("Enter health for character 1:");
        character1.health = input.nextInt();

        System.out.println("Enter level for character 1:");
        character1.level = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== INPUT FOR CHARACTER 2 =====
        System.out.println("\nEnter name for character 2:");
        character2.name = input.nextLine();

        System.out.println("Enter health for character 2:");
        character2.health = input.nextInt();

        System.out.println("Enter level for character 2:");
        character2.level = input.nextInt();

        // ===== OUTPUT BEFORE ACTIONS =====
        System.out.println("\n--- CHARACTER STATS BEFORE ACTIONS ---");
        character1.displayStats();
        System.out.println();
        character2.displayStats();

        // ===== PERFORM ACTIONS =====
        System.out.println("\n--- ACTIONS ---");
        character1.attack();
        character1.heal(10);

        character2.attack();
        character2.heal(15);

        // ===== OUTPUT AFTER ACTIONS =====
        System.out.println("\n--- CHARACTER STATS AFTER ACTIONS ---");
        character1.displayStats();
        System.out.println();
        character2.displayStats();

        input.close();
    }
}

// Class for VideoGameCharacter
class VideoGameCharacter {

    // Attributes
    String name;
    int health;
    int level;

    // Method: attack (reduces health slightly)
    void attack() {
        System.out.println(name + " attacks!");
        health -= 5;
    }

    // Method: heal (increases health)
    void heal(int amount) {
        health += amount;
        System.out.println(name + " heals for " + amount + " health.");
    }

    // Method: display character stats
    void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}
