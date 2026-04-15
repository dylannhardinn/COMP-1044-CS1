/*
Name: Dylan Hardin
Professor: Dole
Date: April 15, 2026

Program Description:
This program creates an array of 100 random double values between 0 and 1000.
It then sorts the numbers from smallest to largest using the selection sort method.
Finally, it prints each number on a new line with only two decimal places.
*/

public class RandomSortProgram {
    public static void main(String[] args) {

        // Create array
        double[] randomNumbers = new double[100];

        // Fill array with random numbers between 0 and 1000
        for (int i = 0; i < 100; i++) {
            randomNumbers[i] = Math.random() * 1000;
        }

        // Selection Sort (smallest to largest)
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < randomNumbers.length; j++) {
                if (randomNumbers[j] < randomNumbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap values
            double temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[minIndex];
            randomNumbers[minIndex] = temp;
        }

        // Print results (2 decimal places)
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.printf("%.2f\n", randomNumbers[i]);
        }
    }
}
