num = 1234356
count = 0
temp = 0
while num > 0:
    temp = num % 10
    if(temp == 3):
        count = count + 1

    num = num / 10

print(count)