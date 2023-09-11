
/*
Write a program to tell that the first letter is uppercase or lowercase.
 */
import java.util.Scanner;
public class CaseType
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        char word = sc.next().charAt(0);

        if (word >= 'A' && word <= 'Z'){
            System.out.println("Upper case");
        }
        else {
            System.out.println("Lower case");
        }
    }
}
