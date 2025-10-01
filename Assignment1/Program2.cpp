#include <iostream> 
#include <cmath> // for pow() 

using namespace std; 

int main() 
{ 
    // Constant for PI 
    const double PI = 3.14; 

    // Variables for cone 
    double coneRadius, coneHeight, coneVolume; 

    // Variable for cylinder 
    double cylRadius, cylHeight, cylVolume; 

    // Variables for sphere 
    double sphereRadius, sphereVolume; 

    // Prompt user for cone input 
    cout << "Enter the radius of the cone: "; 
    cin >> coneRadius; 
    cout << "Enter the height of the cone: "; 
    cin >> coneHeight; 

    // Calculate cone volume 
    coneVolume = (1.0 / 3.0) * PI * pow(coneRadius, 2) * coneHeight; 
    
    // Prmopt user for cylinder input 
    cout << "Enter the raidus of the cylinder: "; 
    cin >> cylRadius; 
    cout << "Enter the height of the cylinder: "; 
    cin >> cylHeight; 

    // Calculate cylinder volume 
    cylVolume = PI * pow(cylRadius, 2) * cylHeight; 

    // Prompt user for sphere input 
    cout << "Enter the radius of the sphere: "; 
    cin >> sphereRadius; 

    // Calculate sphere volume 
    sphereVolume = (4.0 / 3.0) * PI * pow(sphereRadius, 3); 

    // Calculate total volume 
    double totalVolume = coneVolume + cylVolume + sphereVolume; 

    // Output results 
    cout << "\nDylan Hardin" << endl; 
    cout << "Program Two: Volumes\n" << endl; 

    cout << "The volume of a cone with radius" << coneRadius;
    cout << " and height " << coneHeight << " is " << coneVolume << "." << endl;  

    cout << "The volume of a cylinder with radius" << cylRadius;
    cout << " and height " << cylHeight << " is " << cylVolume << "." << endl; 

    
    cout << "The volume of a sphere with radius " << sphereRadius;
    cout << " is " << sphereVolume << "." << endl; 

    cout << "The total volume of the above objects is " << totalVolume << "." << endl; 

    return 0;


}

