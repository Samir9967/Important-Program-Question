//  Write a program to find greatest number among three number.
number1 = prompt("Enter the number1 : ");
number2 = prompt("Enter the number2 : ");
number3 = prompt("Enter the number3 : ");

if(number1 > 0 && number2 > 0 && number3 > 0){
 if(number1 > number2 && number1 > number3){
    console.log("Number 1 is greater");  
 }
 else if(number2 > number1 && number2 > number3){
    console.log("Number 2 is greater");
 }
 else if(number3 > number2 && number3 > number1){
    console.log("Number 3 is greater");
 }
 else{
    console.log("All are equal!!!!");
 }
}