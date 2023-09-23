# Write a program to find Nth number of fibonacci.

targetNumber = int(input("Enter the Nth fibnonacci: "))
number1 = 0
number2 = 1

for i in range(2,targetNumber+1,1):
    fibo = number1 + number2
    number1 = number2
    number2 = fibo

print(fibo)