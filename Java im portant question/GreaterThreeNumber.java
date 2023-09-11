/*
Write a program to find the greatest number among three number.
 */
import java.util.Scanner;
public class GreaterThreeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter number3: ");
        int number3 = sc.nextInt();
        int max = number1;

        if (number2 >= max){
            max = number2;
        }
        if (number3 >= max) {
            max = number3;
        }
        System.out.println("Greater number is "+ max);
    }
}
