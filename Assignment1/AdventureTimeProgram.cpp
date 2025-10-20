// Dylan Hardin 
// 10/20/25 
// Computer Science 1 - Mika Morgan 
// This program will show a short text adventure 

#include <iostream> 
#include <string> 

using namespace std; 

int main(){ 
    char playAgain = 'y'; // variable to control replay 
    string choice;       // variable for user choices 

    cout << "Welcome to the Dungen of Destiny Adventure Game!" << endl; 

    // Outer loop allows the game to be replayed 
    while (playAgain == 'y' || playAgain == 'Y') { 
        
        cout << "\nYou awaken in a cold, dark dungeon. The air is damp and you hear distant whispers..." << endl; 
        cout << "In front of you are two doors: one glowing red and the other glowing blue." << endl; 

        // Input validation loop for first decision 
        cout << "Do you enter the 'red' door or the 'blue' door? ";
        cin >> choice; 
       
        while (choice != "red" && choice != "blue") { 
            cout << "Invalid choice. Please type 'red' or 'blue': "; 
            cin >> choice; 
        } 

        // IF STATEMENTS controlling story outcomes 
        if (choice == "red") { 
            cout << "\nYou open the red door and step into a chamber filled with fire and smoke." << endl; 
            cout << "A dragon emerges from the shadows and asks if you seek 'treasure' or 'freedom'." << endl; 
            cout << "What do you choose?"; 
            cin >> choice; 

            while (choice != "treasure" && choice != "freedom") { 
                cout << "Invalid choice. Please type 'treasure' or 'freedom': "; 
                cin >> choice; 
            } 

            if (choice == "treasure") { 
                cout << "\nThe dragon laughs and gives you mountains of gold-but the door seals forever behind you. You're rich but trapped forever!" << endl; 
            }   else { 
                cout << "\nThe dragon nods in respect and opens a secret passage. You escape the dungeon safely!" << endl; 
            }
        } 
        else if (choice == "blue") { 
            cout << "\nYou push open the blue door and find a glowing crystal on a pedestal." << endl; 
            cout << "A mysterious voice asks: 'Do you touch the crystal or walk away?'" << endl; 
            cout << "Type 'touch' or 'walk': "; 
            cin >> choice; 

            while (choice != "touch" && choice != "walk") { 
                cout << "Invalid choice. Please type 'touch' or 'walk': "; 
                cin >> choice; 
            } 

            if (choice == "touch") { 
                cout << "\nYou touch the crystal and are teleported to a hidden treasure room. You have won!" << endl; 
              } else { 
                cout << "\nYou turn away, and the door vanishes. You remain lost in the dungeon forever..." << endl; 
              }
        }  
        // Ask user if they want to play again 
        cout << "\nWould you like to play again? (y/n): "; 
        cin >> playAgain; 

        // Input validation for replay 
        while (playAgain != 'y' && playAgain != 'Y' && playAgain != 'n' && playAgain != 'N') { 
            cout << "Please enter 'y' or 'n': "; 
            cin >> playAgain;
        }
    } 

    cout << "\nThanks for playing the Dungeon of Destiny Adventure Game!" << endl; 
    return 0;
}

