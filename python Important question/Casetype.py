# Write a program to tell that the first letter is uppercase or lowercase.

word = input("Enter the word: ")
word2 = word[0]

if(word2 >= 'A' and word2 <= 'Z'):
    print("Upper Case")
else:
    print("Lower Case")