year = int(input("Enter the year: "))

if(year > 0):
    if((year % 400 == 0) or (year % 4 == 0 and year % 100 != 0)):
        print("Leap year")
    else:
        print("Not a leap year")