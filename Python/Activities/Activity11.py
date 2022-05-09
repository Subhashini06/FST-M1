fruits = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

user_input = input("What are you looking for? ").lower()

if(user_input in fruits):
    print("Fruits available")
else:
    print("Fruits not available")