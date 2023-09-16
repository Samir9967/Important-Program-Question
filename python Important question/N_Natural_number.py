# Write a program to calculate the sum of n natural number(n natural number user input).

naturalNumber = int(input("Enter the number: "))
num = 1
total = 0
while(num <= naturalNumber):
    total = total + num
    num = num + 1

print(total)