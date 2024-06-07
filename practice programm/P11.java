
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter unit");
        float unit = sc.nextInt();
        float charge = 0;

        if (unit <= 200 ) {
            charge = (float) (unit * 0.80);
        }
        else if (unit <= 300 && unit > 200){
            charge = (float) ((200 * 0.80) + ((unit - 200)*0.90));
        }

        else if ( unit > 200){
            charge = (float) ((200 * 0.80) + ((unit - 200)*0.90));
        }

        if(charge > 300){
            charge = (float) ((charge * 12.36) / 100) ;
        }

        System.out.println("total charge = " + charge);
    }
}
