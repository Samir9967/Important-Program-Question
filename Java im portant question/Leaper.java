//write a program to check a year is a leap or not
import java.util.Scanner;

public class Leaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }
}
