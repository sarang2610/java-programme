
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length of series");
        int a = sc.nextInt();
        int temp = 1 , ans = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(temp + ",");
            ans ++ ; 
            temp = temp + ans ;
        }

    }
    
}
