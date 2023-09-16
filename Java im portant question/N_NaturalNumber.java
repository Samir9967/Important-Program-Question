import java.util.Scanner;

public class N_NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int natural_number = sc.nextInt();
        int num = 1;
        int total = 0;
        while(num <= natural_number){
            total = total + num;
            num++;
        }
        System.out.println(total);
    }
}
