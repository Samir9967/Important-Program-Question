// Write a program to calculate the sum of n natural number(n natural number user input).

number = Number(prompt("Enter the number: "));
num = 1;
total= 0;
while(num <= number){
    total = total + num;
    num++;
}
console.log(total);