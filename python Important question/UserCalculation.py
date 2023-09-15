# Write a program input 2 number calculation based on user input (Add,mul,div,sub).

number_1 = int(input("Enter the number 1: "))
number_2 = int(input("Enter the number 2: "))
user_choice = int(input("Enter the number from 1 t0 4: "))

if(user_choice == 1):
    print("Addition of two number: ",number_1 + number_2)
elif(user_choice == 2):
    print("Subtraction of two number: ",number_1 - number_2)
elif(user_choice == 3):
     print("Multiplicatin of two number: ",number_1 * number_2)
elif(user_choice == 4):
    print("Division of two number is: ",number_1 / number_2)
else:
    print("Enter the number between 1 to 4")