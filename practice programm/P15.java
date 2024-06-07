
import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string");
        String str = sc.next();

        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
            
            
        }
    }
}
