import requests

# Official Joke API
url = "https://official-joke-api.appspot.com/random_joke"

# Send a request to the API
response = requests.get(url)

# Check if the API request worked
if response.status_code == 200:

    # Convert the JSON response into a Python dictionary
    data = response.json()

    # Get information from the JSON data
    joke_type = data["type"]
    joke_setup = data["setup"]
    joke_punchline = data["punchline"]

    # Display the information in a readable format
    print("--------------------------------")
    print("       RANDOM JOKE GENERATOR")
    print("--------------------------------")
    print("Joke Category:", joke_type)
    print()
    print("Here is your joke:")
    print(joke_setup)
    print(joke_punchline)
    print("--------------------------------")

else:
    print("Error: Could not retrieve joke from the API.")
