// Write a program to read the numbers until -1 is entered also counts negative, positive, and zeros entered by users

positive_count = 0;
negative_count = 0;
zero_count = 0;
number = true;
while(number){
    num = Number(prompt("Enter the number: "));
    if(num > 0){
        positive_count++;
    }
    else if(num == -1){
        number = false;
    }
    else if(num==0){
        zero_count++;
    }
    else{
        negative_count++;
    }
}
console.log("Positive count: ",positive_count);
console.log("negative count: ",negative_count);
console.log("zero count: ",zero_count);