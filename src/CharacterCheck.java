import java.util.Scanner;

   public class CharacterCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER No: ");
        char ch = sc.next().charAt(0);          // taking input in character

        if ( ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        }
            else if (ch >= 'a' && ch <= 'z'){
            System.out.println("LOWERCASE");
        }
            else if (ch >= '0' && ch <= '9'){
            System.out.println("DIGIT");
        }
            else{
            System.out.println("SPECIAL CHARACTER");
        }
    }
}
