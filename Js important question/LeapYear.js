year = Number(prompt("Enter the year: "));

if(year > 0){
    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
        console.log("Leap year");
    }
    else{
        console.log("Not a leap year");
    }
}