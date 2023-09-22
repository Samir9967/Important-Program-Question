import java.util.Scanner;

public class SwapNumber_With {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = sc.nextInt();
//        int swap;
//        if (num1 > 0 && num2 > 0){
//            swap = num1;
//            num1 = num2;
//            num2 = swap;
//
//            System.out.println("number 1 = "+ num1);
//            System.out.println("number 2 = "+ num2);

//                                 Without using third variable
        if (num1 > 0 && num2 > 0){
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
            System.out.println("number 1 = "+ num1);
            System.out.println("number 2 = "+ num2);
        }
    }
}
