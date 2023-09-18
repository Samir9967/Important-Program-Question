# Write a program to read the numbers until -1 is entered also counts negative, positive, and zeros entered by users

positive_count = 0
negative_count = 0
zero_count = 0
number = True

while(number):
    num = int(input("Enter the number: "))
    if (num > 0 ):
        positive_count = positive_count + 1
    # elif(num < 0):
    #     negative_count = negative_count + 1
    elif (num == 0):
        zero_count = zero_count + 1
    elif(num == -1):
        number = False
    else:
        negative_count = negative_count + 1

print("positive count: ",positive_count)
print("negative count: ",negative_count)
print("zero count: ",zero_count)