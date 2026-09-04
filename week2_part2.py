// Dylan Hardin 
// 9/03/2026 

# Week 2 Part 2
# This program calculates the hypotenuse and area of a right triangle.

# Ask the user for the triangle base.
base = input("Enter the base of the triangle: ")

# Make sure the base contains only numbers.
assert base.isnumeric(), "Error: The base must be a number."

# Ask the user for the triangle height.
height = input("Enter the height of the triangle: ")

# Make sure the height contains only numbers.
assert height.isnumeric(), "Error: The height must be a number."

# Convert the base and height from strings to floats.
base = float(base)
height = float(height)

# Calculate the hypotenuse using the Pythagorean theorem:
# c^2 = a^2 + b^2
hypotenuse = (base ** 2 + height ** 2) ** 0.5

# Calculate the area using the formula:
# Area = 1/2 * base * height
area = 0.5 * base * height

# Print the results.
print("The hypotenuse is:", hypotenuse)
print("The area of the triangle is:", area)
