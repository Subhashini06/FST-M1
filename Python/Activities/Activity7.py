numbers = list(input("Enter the number to calculate the sum  ").split(", "))
sum = 0

for number in numbers:
    sum += int(number)
    print(sum)