import java.util.Scanner;

public class DivisibleByNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER No.: ");
        int n = sc.nextInt();


        if ( n % 3 == 0 && n % 5 == 0){
            System.out.println(" Divisible by both 3 & 5");
        }
        else if ( n % 3 == 0 ){
            System.out.println("Divisible by only 3");
        }
        else {
            System.out.println("Divisible by only 5");
        }
    }
}
