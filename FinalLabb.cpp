// Dylan Hardin 
// Computer Science 1 - Mika Morgan 
// 12/6/25 
// This file wil demonstrate 2D Arrays 

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    char board[3][3];
    char token[] = { 'X', 'O' };
    // Variable for storing winning token
    char winner;
    bool winnerFound;
    ifstream infile;
    infile.open("ticLab12.txt");
    ofstream outfile;
    outfile.open("output.txt");
    int numGames = 0;
    if (infile)
    {
        // Read in number of game boards
        infile >> numGames;
        for (int x = 0; x < numGames; x++)
        {
            // Read in values for a single board
            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                    infile >> board[row][col];
            }
            // Display the game board
            for (int row = 0; row < 3; row++)
            {
                for (int col = 0; col < 3; col++)
                    outfile << board[row][col] << " ";
                // Go to next line for next row
                outfile << endl;
            }
            outfile << endl;
            // Reset the winnerFound variable to false
            // for each new game
            winnerFound = false;
            winner = NULL;

            // Step 6
            // Insert a loop to traverse the token array
            // and check for X first and then O
            // Go back and replace every occurrence of 'X'
            // with token[index]
            // Make sure your } is placed correctly
            //

            // Step 2
            // Insert a loop here that will check each row for a winner
            for (int r = 0; r < 3; r++) {
                if ((board[r][0] == 'X') && (board[r][1] == 'X') && (board[r][2] == 'X'))
                {
                    winnerFound = true;
                    winner = 'X';
                }
            }
            for (int r = 0; r < 3; r++) {
                if ((board[r][0] == 'O') && (board[r][1] == 'O') && (board[r][2] == 'O'))
                {
                    winnerFound = true;
                    winner = 'O';
                }
            }
            // Step 3
            // Insert a loop to check each column for a winner
            for (int c = 0; c < 3; c++) {
                if ((board[0][c] == 'X') && (board[1][c] == 'X') && (board[2][c] == 'X'))
                {
                    winnerFound = true;
                    winner = 'X';
                }
            }
            for (int c = 0; c < 3; c++) {
                if ((board[0][c] == 'O') && (board[1][c] == 'O') && (board[2][c] == 'O'))
                {
                    winnerFound = true;
                    winner = 'O';
                }
            }
            // Step 4
            // Insert an if statement to check the major diagonal (top left -> bottom right)
            if ((board[0][0] == 'X') && (board[1][1] == 'X') && (board[2][2] == 'X'))
            {
                winnerFound = true;
                winner = 'X';
            }
            if ((board[0][0] == 'O') && (board[1][1] == 'O') && (board[2][2] == 'O'))
            {
                winnerFound = true;
                winner = 'O';
            }
           
            // Step 5
            // Insert an if statement to check the minor diagonal (top right -> bottom left)
            if ((board[0][2] == 'X') && (board[1][1] == 'X') && (board[2][0] == 'X'))
            {
                winnerFound = true;
                winner = 'X';
            }
            if ((board[0][2] == 'O') && (board[1][1] == 'O') && (board[2][0] == 'O'))
            {
                winnerFound = true;
                winner = 'O';
            }

            // Check for winners
            if (winnerFound) {
                outfile << "Game won by " << winner << " ^^^ " << endl;
            }
            // Step 7
            // Add an if statement here to check for no winner
            else {
                outfile << "No winner" << endl;
            }

        } // end of loop that reads in a new card
    }   // end of if(infile)
    else
        outfile << "Could not open input file.\n";

    outfile.close();
    system("pause");
    return 0;
} // end of main 
