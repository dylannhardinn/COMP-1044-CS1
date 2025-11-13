// Dylan Hardin 
// 11/12/25 
// Computer Science - Mika Morgan 
// This program will show a judges score 



#include <iostream>
#include <iomanip>
using namespace std;

// Function Prototypes
void getJudgeData(double &score);
double calcScore(double s1, double s2, double s3, double s4, double s5);
double findLowest(double s1, double s2, double s3, double s4, double s5);
double findHighest(double s1, double s2, double s3, double s4, double s5);

int main()
{
    double s1, s2, s3, s4, s5;
    
    // Get scores from judges
    cout << "Enter each judge's score (0 - 10):\n";
    getJudgeData(s1);
    getJudgeData(s2);
    getJudgeData(s3);
    getJudgeData(s4);
    getJudgeData(s5);

    // Calculate final score
    double finalScore = calcScore(s1, s2, s3, s4, s5);

    // Display the result
    cout << fixed << setprecision(2);
    cout << "\nFinal Score: " << finalScore << endl;

    return 0;
}


// getJudgeData
// Prompts for and validates a single judge's score.
void getJudgeData(double &score)
{
    do {
        cout << "Enter score: ";
        cin >> score;

        if (cin.fail() || score < 0.0 || score > 10.0) {
            cout << "Invalid score! Please enter a value between 0 and 10.\n";
            cin.clear();
            cin.ignore(1000, '\n');
        }
        else {
            break;
        }
    } while (true);
}

// calcScore
// Calculates the average after dropping highest & lowest.
double calcScore(double s1, double s2, double s3, double s4, double s5)
{
    double lowest = findLowest(s1, s2, s3, s4, s5);
    double highest = findHighest(s1, s2, s3, s4, s5);

    double total = s1 + s2 + s3 + s4 + s5;
    total -= (lowest + highest);

    return total / 3.0;
}


// findLowest
// Returns the lowest of five scores.
double findLowest(double s1, double s2, double s3, double s4, double s5)
{
    double lowest = s1;

    if (s2 < lowest) lowest = s2;
    if (s3 < lowest) lowest = s3;
    if (s4 < lowest) lowest = s4;
    if (s5 < lowest) lowest = s5;

    return lowest;
}


// findHighest
// Returns the highest of five scores.
double findHighest(double s1, double s2, double s3, double s4, double s5)
{
    double highest = s1;

    if (s2 > highest) highest = s2;
    if (s3 > highest) highest = s3;
    if (s4 > highest) highest = s4;
    if (s5 > highest) highest = s5;

    return highest;
}
