// Dylan Hardin 
// 11/15/25 
// Computer Science - Mika Morgan 
// This program will show how to program arrays 

#include <iostream> 
#include <fstream>
#include<cstdlib>

using namespace std;

int main() {
// ASSIGNMENT

	srand(5); // initialize a random number seed to 5
	const int size = 100; // index
	int Arr[size]; // array with 100 ints
	int greatest = Arr[0]; // will be used later
	double avg = 0.0;  // double because it might not be an int
	int sum = 0;  // sum will make remain an int

	ofstream outfile("output.txt"); // send to output.txt



	// Loading values into the arrau
	for (int i = 0; i < size; i++)
	{
		Arr[i] = rand() % RAND_MAX;
	}

	// Search the array for the great number
	for (int i = 0; i < size; i++)
	{
		if (Arr[i] > greatest)
		{
			greatest = Arr[i];
		}
	}
	outfile << "The greatest number is: " << greatest << endl;
		
	// Find the avg of nums in the array
	for (int i = 0; i < size; i++)
	{
		sum += Arr[i];
	}
	avg = sum / 100.0;
	outfile << "The average of all numbers is : " << avg << endl;

	// FInd the sum of nums in the array
	for (int i = 0; i < size; i++)
	{
		sum += Arr[i];
	}
	outfile << "The sum of all number is; " << sum << endl;

	system("pause");
	return 0;
}

