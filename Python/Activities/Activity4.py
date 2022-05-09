
player1 = input("First Player enters as: ")
player2 = input("Second player enters as:")


while True:

    user1_choice = input(player1 + ", do you want Rock, Scissors or Paper ? ").lower()
    user2_choice = input(player2 + ", do you want Rock, Scissors or Paper ? ").lower()

    if user1_choice == user2_choice:
        print("Its a tie")
    elif user1_choice == "rock":
        if user2_choice == "scissors": 
            print("Rock Wins!") 
        else:
            print("paper wins!")
    elif user1_choice == "scissors":
        if user2_choice == "paper":
            print("scissors Wins")
        else:
            print("paper Wins!")
    elif user1_choice == "paper":
        if user2_choice == "rock":
            print("paper Wins")
        else:
            print("scissors wins")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round ").lower()
    if(repeat == "yes"):
        print("pass")
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered invalid option")        
        raise SystemExit