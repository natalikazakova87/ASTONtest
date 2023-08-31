import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numbers = new int[] {8, 15, 13, 25, 17, 20, 19, 30, 7, 14, 3, 18};
        for (int i=0; i<numbers.length;i++){
            numbers[i] = numbers[i] % 3;
            System.out.println(numbers[i] %3==0);
        }

    }
 // К сожалению мы кратность не проходили, смогла реализовать только так (на TRUE/FALSE)

}
