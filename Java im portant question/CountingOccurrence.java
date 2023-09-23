/*
Counting occurrence:  eg: 1234356 (count digit 3 ).
 */
public class CountingOccurrence
{
    public static void main(String[] args) {
        int number = 12343563;
        int count = 0;
        int temp;
        while(number > 0){
             temp = number % 10;
            if (temp == 3) {
                count++;
            }
            number = number / 10;
        }
            System.out.println(count);
    }
}
