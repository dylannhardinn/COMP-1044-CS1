/*
Name: Dylan Hardin
Date: April 2, 2026
Teacher: Todd Dole
Program: This program creates a standard deck of 52 playing cards
         and randomly selects one card to display to the user.
*/

public class CardGame {

    // Card class to represent each playing card
    public static class Card {
        String faceValue;
        String suit;

        // Constructor to create a card
        public Card(String faceValue, String suit) {
            this.faceValue = faceValue;
            this.suit = suit;
        }
    }

    public static void main(String[] args) {

        // Create an array to hold 52 cards
        Card[] deck = new Card[52];

        // Arrays for face values and suits
        String[] faceValues = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        String[] suits = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        int index = 0;

        // Fill the deck using nested loops
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < faceValues.length; j++) {
                deck[index] = new Card(faceValues[j], suits[i]);
                index++;
            }
        }

        // Generate a random number between 0 and 51
        int randomCard = (int)(Math.random() * 52);

        // Display the result
        System.out.println("==================================");
        System.out.println("Choosing a random card from the deck...");
        System.out.println();

        System.out.println("You drew a " 
            + deck[randomCard].faceValue + " of " 
            + deck[randomCard].suit + "!");

        System.out.println("==================================");
    }
}
