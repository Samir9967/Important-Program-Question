import java.util.Scanner;
/*
Write a program input 2 number calculation based on user input (Add,mul,div,sub).
 */
public class User_Based_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int number_1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int number_2 = sc.nextInt();
        System.out.println("Enter the number to '+', '-','*','/': ");
        int user_input = sc.nextInt();
//        float total:

        if (user_input == 1){
            System.out.println("Addition of two number is: "+ (number_1 + number_2));
        }
        else if (user_input == 2){
            System.out.println("Subtraction of two number is: "+ (number_1 - number_2));
        }
        else if (user_input == 3) {
            System.out.println("Multiplication of two number is: "+ number_1 * number_2);
        }
        else if (user_input == 4) {
            System.out.println("Division of two number is: "+ number_1 / number_2);
        }
        else {
            System.out.println("Enter number between 1 to 4");
        }
    }
}