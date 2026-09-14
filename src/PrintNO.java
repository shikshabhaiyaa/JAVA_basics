import java.util.Scanner;

public class PrintNO {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER NO.: ");
        int n  = sc.nextInt();

        for(int i = n; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}

