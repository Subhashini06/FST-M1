from re import S
from this import s


def fibonacci(number):
    if number <= 1:
        return number
    else:
        return (fibonacci(number-1))  + (fibonacci(number-2))  

userinput = int(input("Enter the number  "))       

if userinput <= 0:
    print("Enter positive number")
else:
    print("Fibonacci series")   

for s in range(userinput):    
 print(fibonacci(s))