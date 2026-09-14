
  import java.util.Scanner;

      public class LoopsPrintNo {
      public static void main(String[] args) {           // printing no. for 1 to  n.

          Scanner sc =new Scanner(System.in);

          System.out.println("ENTER NO.: ");
          int n  = sc.nextInt();

        for(int i = 1; i <= n ; i++){
            System.out.println(i);
        }

    }
}
