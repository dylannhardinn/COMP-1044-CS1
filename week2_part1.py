// Dylan Hardin 
// 9/03/2026 

first_name = input("Enter your first name: ")
last_name = input("Enter your last name: ")

first_name = first_name.replace(" ", "").lower()
last_name = last_name.replace(" ", "").lower()

email = first_name + "." + last_name + "@hsutx.edu"

print(email)
