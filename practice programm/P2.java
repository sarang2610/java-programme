
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int a = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < a/2 ; i++){
            if(a%i==0){
                flag = 1;
                break;
            }
            
        }
        if(flag==0){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }

    }
    
}
