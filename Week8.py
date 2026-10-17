import math

while True:
    # Get a valid base
    while True:
        try:
            base = float(input("Please enter the triangle base: "))
            if base <= 0:
                print("Please enter a number greater than zero.")
                continue
            break
        except ValueError:
            print("That is not a valid number. Please try again!")

    # Get a valid height
    while True:
        try:
            height = float(input("Please enter the triangle height: "))
            if height <= 0:
                print("Please enter a number greater than zero.")
                continue
            break
        except ValueError:
            print("That is not a valid number. Please try again!")

    # Calculate the hypotenuse and area
    hypotenuse = math.sqrt(base**2 + height**2)
    area = (base * height) / 2

    print(f"The hypotenuse is {hypotenuse:.2f}, and the area is {area:g}")

    # Ask whether the user wants to calculate another triangle
    while True:
        again = input("Would you like to do another triangle? Y/N: ").strip().lower()

        if again == "y":
            break
        elif again == "n":
            print("Goodbye!")
            break
        else:
            print("Please enter Y or N.")

    if again == "n":
        break
