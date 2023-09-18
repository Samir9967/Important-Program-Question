import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        boolean num = true;

        while (num){
            System.out.println("Enter the number: ");
            int number = sc.nextInt();

            if (number > 0){
                positive_count++;
            }
            else if (number == 0) {
                zero_count++;
            }
            else if (number == -1) {
                num = false;
            }
            else {
                negative_count++;
            }
        }
        System.out.println("Positive count: "+ positive_count);
        System.out.println("Negative count: "+ negative_count);
        System.out.println("Zero count: "+ zero_count);
    }
}
