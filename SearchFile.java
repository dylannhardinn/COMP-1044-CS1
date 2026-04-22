/*
Name: Dylan Hardin
Professor: Dole
Date: April 22, 2026
Program: SearchFile.java

Description:
This program asks the user for a file name and a search string.
It reads the file line by line and prints all lines that contain
the search string. The search is case-insensitive.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchFile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Ask user for file name
        System.out.print("Please enter a file to search: ");
        String fileName = input.nextLine();
        
        // Ask user for search text
        System.out.print("Please enter the text to search for: ");
        String searchText = input.nextLine();
        
        System.out.println("Results:");
        
        try {
            // Open file
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            
            // Convert search text to lowercase for case-insensitive search
            searchText = searchText.toLowerCase();
            
            // Read file line by line
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                // Convert line to lowercase
                String lowerLine = line.toLowerCase();
                
                // Check if line contains search text
                if (lowerLine.contains(searchText)) {
                    System.out.println(line);
                }
            }
            
            fileScanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        
        input.close();
    }
}
