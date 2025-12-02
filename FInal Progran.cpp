    // Dylan Hardin
    // CMPS 1044 - Mika Moegan 
	// 11/24/25
    // Program 5 - Array Manipulation
    // Description: This program reads 20 integers from a file named "nums.dat" into
    // a 4x5 array. It then prints the array, finds the sum, minimum, and
    // maximum values, doubles the array values, and prints the array again.


#include <iostream>
#include <fstream>
using namespace std;

// CONSTANTS
const int ROW = 4;
const int COL = 5;

// FUNCTION PROTOTYPES 
void heading();
void fillArray(int myA[ROW][COL]);
void printArray(int myA[ROW][COL]);
int sumArray(int myA[ROW][COL]);
int minArray(int myA[ROW][COL]);
int maxArray(int myA[ROW][COL]);
void doubleArray(int myA[ROW][COL]);

int main() {
    int myArray[ROW][COL];

    heading();

    fillArray(myArray);

    cout << "\nOriginal Array:\n";
    printArray(myArray);

    cout << "\nSum of array = " << sumArray(myArray) << endl;
    cout << "Minimum value = " << minArray(myArray) << endl;
    cout << "Maximum value = " << maxArray(myArray) << endl;

    // Double the array values
    doubleArray(myArray);

    cout << "\nArray After Doubling:\n";
    printArray(myArray);

    return 0;
}

/*
    heading
    Prints program heading information to the screen.
*/
void heading() {
    cout << "-------------------------------------\n";
    cout << "        Dylan Hardin - Program 5\n";
    cout << "        Array Manipulation Program\n";
    cout << "-------------------------------------\n\n";
}

/*
    fillArray
    Opens nums.dat, fills the 4x5 array with integers,
    then closes the file.
*/
void fillArray(int myA[ROW][COL]) {
    ifstream fin;
    fin.open("nums.dat");

    if (!fin) {
        cout << "Error: Could not open nums.dat\n";
        exit(1);
    }

    for (int r = 0; r < ROW; r++) {
        for (int c = 0; c < COL; c++) {
            fin >> myA[r][c];
        }
    }

    fin.close();
}

/*
    printArray
    Prints the array values in table format.
*/
void printArray(int myA[ROW][COL]) {
    for (int r = 0; r < ROW; r++) {
        for (int c = 0; c < COL; c++) {
            cout << myA[r][c] << "\t";
        }
        cout << endl;
    }
}

/*
    sumArray
    Returns the sum of all integers in the array.
*/
int sumArray(int myA[ROW][COL]) {
    int sum = 0;

    for (int r = 0; r < ROW; r++) {
        for (int c = 0; c < COL; c++) {
            sum += myA[r][c];
        }
    }

    return sum;
}

/*
    minArray
    Returns the minimum value in the array.
*/
int minArray(int myA[ROW][COL]) {
    int min = myA[0][0];

    for (int r = 0; r < ROW; r++) {
        for (int c = 0; c < COL; c++) {
            if (myA[r][c] < min) {
                min = myA[r][c];
            }
        }
    }

    return min;
}

/*
    maxArray
    Returns the maximum value in the array.
*/
int maxArray(int myA[ROW][COL]) {
    int max = myA[0][0];

    for (int r = 0; r < ROW; r++) {
        for (int c = 0; c < COL; c++) {
            if (myA[r][c] > max) {
                max = myA[r][c];
            }
        }
    }

    return max;
}

/*
    doubleArray
    Doubles every value inside the array.
*/
void doubleArray(int myA[ROW][COL]) {
    for (int r = 0; r < ROW; r++) {
        for (int c = 0; c < COL; c++) {
            myA[r][c] *= 2;
        }
    }
}

