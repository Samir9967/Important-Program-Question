# Write a program to find the greatest number among three number.
number1 = int(input("Enter the number 1: "))
number2 = int(input("Enter the number 2: "))
number3 = int(input("Enter the number 3: "))

if(number1>0 and number2>0 and number3>0):
 if(number1 > number2 and number1 > number3):
    print("Number 1 is greater")
 elif(number2 > number1 and number2 > number1):
    print("Number 2 is greater")
 elif(number3 > number1 and number3 > number2):
    print("Number 3 is greater")
 else:
    print("All are equal")