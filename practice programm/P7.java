
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        for (int i = 150; i < 445; i++) {
            if(i%7==0){
                if(i%3!=0){
                    System.out.print(i + " " );
                }
            }
        }
    }
}
