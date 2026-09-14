import java.util.Scanner;

public class SelfDividingNoLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int temp = i;
            while (temp > 0) {

                int digit = temp % 10 ;
                temp = temp / 10;

                System.out.println("Divisible by they");

            }

        }
    }
}