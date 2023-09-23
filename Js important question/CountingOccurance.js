                            //    Count no 3
num = Number(1234356);
count = 0;
temp = 0;
while(num > 0){
    temp = num % 10;
    if(temp == 3){
        count++;
        num = num / 10;
    }
}
console.log(count);