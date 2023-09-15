number_1 = Number(prompt("Enter the number 1: "));
number_2 = Number(prompt("Enter the number 2: "));
user_input = Number(prompt("Enter the number from 1 t 4: "));

if(user_input == 1){
    console.log("Addition of two number: ", number_1 + number_2);
}
else if(user_input == 2){
    console.log("Subtraction of two number: ", number_1 - number_2);
}
else if(user_input == 3){
    console.log("Multiplicatin of two number: ",number_1 * number_2);
}
else if(user_input == 4){
    console.log("Division of two number is: ",number_1 / number_2);
}
else{
    console.log("please enter between number from 1 to 4");
}