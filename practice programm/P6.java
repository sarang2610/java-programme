
import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length of array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter " + i + " element");
            int element = sc.nextInt();
            arr[i] = element;

        }
        int odd = 0, even = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                even = even + arr[i];
            } else {
                odd = odd + arr[i];

            }

        }
        System.out.println("odd number sum =" + odd);

        System.out.println("even number sum =" + even);
    }
}
