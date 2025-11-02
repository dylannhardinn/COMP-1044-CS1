// Dylan Hardin 
// 11/1/25 
// CMPS 1044 Computer Science 1 - Mika Morgan 
// Demonstrate defining and calling functions, 
// prototypes, and outputting to a file 

#include <iostream>
#include <fstream>      // For file output
using namespace std;

int FindMax(int, int, int);

void PrintVal(int, ofstream &);

int main()
{
    ofstream outfile;               // Create file output stream
    outfile.open("output.txt");     // Open file named "output.txt"

    int A, B, C, Biggest;

    cout << "Please enter 3 integers: ";
    cin >> A >> B >> C;

    // Call FindMax to determine the largest value
    Biggest = FindMax(A, B, C);

    // Call PrintVal to print the largest value to the file
    PrintVal(Biggest, outfile);

    cout << "The largest number has been written to output.txt\n";

    outfile.close();   // Close the file
    return 0;
}

int FindMax(int N1, int N2, int N3)
{
    int Big;

    if (N1 >= N2 && N1 >= N3)
        Big = N1;
    else if (N2 >= N1 && N2 >= N3)
        Big = N2;
    else
        Big = N3;

    return Big;
}

void PrintVal(int X, ofstream &out)
{
    out << "The answer is " << X << '\n';
}

