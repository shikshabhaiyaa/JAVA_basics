import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NO.:");
        int n = sc.nextInt();

        if ( n % 400 == 0  || ( n % 4 == 0 && n % 100 != 0 ) ){          // Leap year rule:EXCEPTION
                                                                        // Divisible by 400 → Leap year
                                                                       // Divisible by 100 → Not a leap year
                                                                      // Divisible by 4 → Leap year
                                                                     // Otherwise → Not a leap year
            System.out.println("leap year");
        }
        else {
            System.out.println("not Leap year");
        }

    }
}
