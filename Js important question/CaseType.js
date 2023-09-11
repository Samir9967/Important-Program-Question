// Write a program to tell that the first letter is uppercase or lowercase.
Word = prompt("Enter the word!! ")
word2 = String(Word).charAt(0).trim();

if(word2 >= 'A' && word2 <= 'Z'){
    console.log("Upper Case");
}
else{
    console.log("Lower Case");
}