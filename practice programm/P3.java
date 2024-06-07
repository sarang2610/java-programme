
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("enter number");
        int a =sc.nextInt();
        int tempa = a ;
        int temp , ans = 0 ;
        while(a>0){
            temp = a%10;
            ans = ans * 10 + temp;
            a = a/10; 
        }

        if (ans == tempa){
            System.out.println("number is palindrome");

        }
        else{
            System.out.println("number is not palindrom");
        }
    }
}
