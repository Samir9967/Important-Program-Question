user_number = Number(prompt("Enter the number: "));
num1 = 0;
num2 = 1;

for(fibo = 2;fibo <= user_number;fibo++){
    swap = num1 + num2;
    num1 = num2;
    num2 = swap;
}
console.log(swap);