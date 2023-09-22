num1 = int(input("Enter the number 1: "))
num2 = int(input("Enter the number 2: "))

if(num1 > 0 and num2 > 0):
          # With using third variable
    # swap = num1
    # num1 = num2
    # num2 = swap
    # print("Num1: ",num1)
    # print("Num2: ", num2)
                        # with out third variable
    num1 = num1 + num2
    num2 = num1 - num2
    num1 = num1 - num2
    print("num1: ",num1)
    print("Num2: ",num2)